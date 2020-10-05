package typings.angularCore.importManagerMod

import typings.typescript.mod.Expression
import typings.typescript.mod.Printer
import typings.typescript.mod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core/schematics/utils/import_manager", "ImportManager")
@js.native
class ImportManager protected () extends js.Object {
  def this(
    getUpdateRecorder: js.Function1[/* sf */ SourceFile, ImportManagerUpdateRecorder],
    printer: Printer
  ) = this()
  /**
    * Determines the full end of a given node. By default the end position of a node is
    * before all trailing comments. This could mean that generated imports shift comments.
    */
  var _getEndPositionOfNode: js.Any = js.native
  /** Gets an unique identifier with a base name for the given source file. */
  var _getUniqueIdentifier: js.Any = js.native
  var _recordUsedIdentifier: js.Any = js.native
  var getUpdateRecorder: js.Any = js.native
  /**
    * Array of previously resolved symbol imports. Cache can be re-used to return
    * the same identifier without checking the source-file again.
    */
  var importCache: js.Any = js.native
  /**
    * Checks whether the specified identifier name is used within the given
    * source file.
    */
  var isUniqueIdentifierName: js.Any = js.native
  var printer: js.Any = js.native
  /** Map of import declarations that need to be updated to include the given symbols. */
  var updatedImports: js.Any = js.native
  /** Map of source-files and their previously used identifier names. */
  var usedIdentifierNames: js.Any = js.native
  /**
    * Adds an import to the given source-file and returns the TypeScript
    * identifier that can be used to access the newly imported symbol.
    */
  def addImportToSourceFile(sourceFile: SourceFile, symbolName: String, moduleName: String): Expression = js.native
  def addImportToSourceFile(sourceFile: SourceFile, symbolName: String, moduleName: String, typeImport: Boolean): Expression = js.native
  def addImportToSourceFile(sourceFile: SourceFile, symbolName: Null, moduleName: String): Expression = js.native
  def addImportToSourceFile(sourceFile: SourceFile, symbolName: Null, moduleName: String, typeImport: Boolean): Expression = js.native
  /**
    * Stores the collected import changes within the appropriate update recorders. The
    * updated imports can only be updated *once* per source-file because previous updates
    * could otherwise shift the source-file offsets.
    */
  def recordChanges(): Unit = js.native
}

