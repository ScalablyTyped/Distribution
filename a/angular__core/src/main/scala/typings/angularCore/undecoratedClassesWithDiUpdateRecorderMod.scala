package typings.angularCore

import typings.angularCore.importManagerMod.ImportManagerUpdateRecorder
import typings.typescript.mod.ClassDeclaration
import typings.typescript.mod.NamedImports
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object undecoratedClassesWithDiUpdateRecorderMod {
  
  trait UpdateRecorder
    extends StObject
       with ImportManagerUpdateRecorder {
    
    def addClassComment(node: ClassDeclaration, text: String): Unit
    
    def addClassDecorator(node: ClassDeclaration, text: String): Unit
    
    def commitUpdate(): Unit
  }
  object UpdateRecorder {
    
    @scala.inline
    def apply(
      addClassComment: (ClassDeclaration, String) => Unit,
      addClassDecorator: (ClassDeclaration, String) => Unit,
      addNewImport: (Double, String) => Unit,
      commitUpdate: () => Unit,
      updateExistingImport: (NamedImports, String) => Unit
    ): UpdateRecorder = {
      val __obj = js.Dynamic.literal(addClassComment = js.Any.fromFunction2(addClassComment), addClassDecorator = js.Any.fromFunction2(addClassDecorator), addNewImport = js.Any.fromFunction2(addNewImport), commitUpdate = js.Any.fromFunction0(commitUpdate), updateExistingImport = js.Any.fromFunction2(updateExistingImport))
      __obj.asInstanceOf[UpdateRecorder]
    }
    
    @scala.inline
    implicit class UpdateRecorderMutableBuilder[Self <: UpdateRecorder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddClassComment(value: (ClassDeclaration, String) => Unit): Self = StObject.set(x, "addClassComment", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAddClassDecorator(value: (ClassDeclaration, String) => Unit): Self = StObject.set(x, "addClassDecorator", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCommitUpdate(value: () => Unit): Self = StObject.set(x, "commitUpdate", js.Any.fromFunction0(value))
    }
  }
}
