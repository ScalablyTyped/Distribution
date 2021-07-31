package typings.angularCore

import typings.typescript.mod.Identifier
import typings.typescript.mod.NamedImports
import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object moveImportMod {
  
  @JSImport("@angular/core/schematics/migrations/move-document/move-import", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def addToImport(importNode: NamedImports, sourceFile: SourceFile, name: Identifier): String = (^.asInstanceOf[js.Dynamic].applyDynamic("addToImport")(importNode.asInstanceOf[js.Any], sourceFile.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def addToImport(importNode: NamedImports, sourceFile: SourceFile, name: Identifier, propertyName: Identifier): String = (^.asInstanceOf[js.Dynamic].applyDynamic("addToImport")(importNode.asInstanceOf[js.Any], sourceFile.asInstanceOf[js.Any], name.asInstanceOf[js.Any], propertyName.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def createImport(importSource: String, sourceFile: SourceFile, name: Identifier): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createImport")(importSource.asInstanceOf[js.Any], sourceFile.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def createImport(importSource: String, sourceFile: SourceFile, name: Identifier, propertyName: Identifier): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createImport")(importSource.asInstanceOf[js.Any], sourceFile.asInstanceOf[js.Any], name.asInstanceOf[js.Any], propertyName.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def removeFromImport(importNode: NamedImports, sourceFile: SourceFile, importName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("removeFromImport")(importNode.asInstanceOf[js.Any], sourceFile.asInstanceOf[js.Any], importName.asInstanceOf[js.Any])).asInstanceOf[String]
}
