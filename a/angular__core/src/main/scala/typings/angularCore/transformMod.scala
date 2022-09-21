package typings.angularCore

import typings.angularCore.updateRecorderMod.UpdateRecorder
import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transformMod {
  
  @JSImport("@angular/core/schematics/migrations/path-match-type/transform", "PathMatchTypeTransform")
  @js.native
  open class PathMatchTypeTransform protected () extends StObject {
    def this(getUpdateRecorder: js.Function1[/* sf */ SourceFile, UpdateRecorder]) = this()
    
    /* private */ var getUpdateRecorder: Any = js.native
    
    /* private */ var importManager: Any = js.native
    
    def migrate(sourceFiles: js.Array[SourceFile]): Unit = js.native
    
    /* private */ var printer: Any = js.native
    
    /** Records all changes that were made in the import manager. */
    def recordChanges(): Unit = js.native
  }
}
