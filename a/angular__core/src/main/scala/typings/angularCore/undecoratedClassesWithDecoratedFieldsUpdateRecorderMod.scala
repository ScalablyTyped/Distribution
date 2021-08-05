package typings.angularCore

import typings.angularCore.importManagerMod.ImportManagerUpdateRecorder
import typings.typescript.mod.ClassDeclaration
import typings.typescript.mod.NamedImports
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object undecoratedClassesWithDecoratedFieldsUpdateRecorderMod {
  
  trait UpdateRecorder
    extends StObject
       with ImportManagerUpdateRecorder {
    
    def addClassDecorator(node: ClassDeclaration, text: String): Unit
    
    def addClassTodo(node: ClassDeclaration, message: String): Unit
    
    def commitUpdate(): Unit
  }
  object UpdateRecorder {
    
    inline def apply(
      addClassDecorator: (ClassDeclaration, String) => Unit,
      addClassTodo: (ClassDeclaration, String) => Unit,
      addNewImport: (Double, String) => Unit,
      commitUpdate: () => Unit,
      updateExistingImport: (NamedImports, String) => Unit
    ): UpdateRecorder = {
      val __obj = js.Dynamic.literal(addClassDecorator = js.Any.fromFunction2(addClassDecorator), addClassTodo = js.Any.fromFunction2(addClassTodo), addNewImport = js.Any.fromFunction2(addNewImport), commitUpdate = js.Any.fromFunction0(commitUpdate), updateExistingImport = js.Any.fromFunction2(updateExistingImport))
      __obj.asInstanceOf[UpdateRecorder]
    }
    
    extension [Self <: UpdateRecorder](x: Self) {
      
      inline def setAddClassDecorator(value: (ClassDeclaration, String) => Unit): Self = StObject.set(x, "addClassDecorator", js.Any.fromFunction2(value))
      
      inline def setAddClassTodo(value: (ClassDeclaration, String) => Unit): Self = StObject.set(x, "addClassTodo", js.Any.fromFunction2(value))
      
      inline def setCommitUpdate(value: () => Unit): Self = StObject.set(x, "commitUpdate", js.Any.fromFunction0(value))
    }
  }
}
