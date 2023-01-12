package typings.angularCore

import typings.angularCore.schematicsUtilsImportManagerMod.ImportManagerUpdateRecorder
import typings.typescript.mod.NamedImports
import typings.typescript.mod.SourceFile
import typings.typescript.mod.VariableDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object schematicsMigrationsPathMatchTypeUpdateRecorderMod {
  
  trait UpdateRecorder
    extends StObject
       with ImportManagerUpdateRecorder {
    
    def commitUpdate(): Unit
    
    def updateNode(oldNode: VariableDeclaration, newNode: VariableDeclaration, sourceFile: SourceFile): Unit
  }
  object UpdateRecorder {
    
    inline def apply(
      addNewImport: (Double, String) => Unit,
      commitUpdate: () => Unit,
      updateExistingImport: (NamedImports, String) => Unit,
      updateNode: (VariableDeclaration, VariableDeclaration, SourceFile) => Unit
    ): UpdateRecorder = {
      val __obj = js.Dynamic.literal(addNewImport = js.Any.fromFunction2(addNewImport), commitUpdate = js.Any.fromFunction0(commitUpdate), updateExistingImport = js.Any.fromFunction2(updateExistingImport), updateNode = js.Any.fromFunction3(updateNode))
      __obj.asInstanceOf[UpdateRecorder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UpdateRecorder] (val x: Self) extends AnyVal {
      
      inline def setCommitUpdate(value: () => Unit): Self = StObject.set(x, "commitUpdate", js.Any.fromFunction0(value))
      
      inline def setUpdateNode(value: (VariableDeclaration, VariableDeclaration, SourceFile) => Unit): Self = StObject.set(x, "updateNode", js.Any.fromFunction3(value))
    }
  }
}
