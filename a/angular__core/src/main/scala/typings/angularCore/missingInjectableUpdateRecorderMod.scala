package typings.angularCore

import typings.angularCore.importManagerMod.ImportManagerUpdateRecorder
import typings.typescript.mod.ClassDeclaration
import typings.typescript.mod.Decorator
import typings.typescript.mod.NamedImports
import typings.typescript.mod.ObjectLiteralExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object missingInjectableUpdateRecorderMod {
  
  @js.native
  trait UpdateRecorder extends ImportManagerUpdateRecorder {
    
    def addClassDecorator(node: ClassDeclaration, text: String, className: String): Unit = js.native
    
    def commitUpdate(): Unit = js.native
    
    def replaceDecorator(node: Decorator, newText: String, className: String): Unit = js.native
    
    def updateObjectLiteral(node: ObjectLiteralExpression, newText: String): Unit = js.native
  }
  object UpdateRecorder {
    
    @scala.inline
    def apply(
      addClassDecorator: (ClassDeclaration, String, String) => Unit,
      addNewImport: (Double, String) => Unit,
      commitUpdate: () => Unit,
      replaceDecorator: (Decorator, String, String) => Unit,
      updateExistingImport: (NamedImports, String) => Unit,
      updateObjectLiteral: (ObjectLiteralExpression, String) => Unit
    ): UpdateRecorder = {
      val __obj = js.Dynamic.literal(addClassDecorator = js.Any.fromFunction3(addClassDecorator), addNewImport = js.Any.fromFunction2(addNewImport), commitUpdate = js.Any.fromFunction0(commitUpdate), replaceDecorator = js.Any.fromFunction3(replaceDecorator), updateExistingImport = js.Any.fromFunction2(updateExistingImport), updateObjectLiteral = js.Any.fromFunction2(updateObjectLiteral))
      __obj.asInstanceOf[UpdateRecorder]
    }
    
    @scala.inline
    implicit class UpdateRecorderMutableBuilder[Self <: UpdateRecorder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddClassDecorator(value: (ClassDeclaration, String, String) => Unit): Self = StObject.set(x, "addClassDecorator", js.Any.fromFunction3(value))
      
      @scala.inline
      def setCommitUpdate(value: () => Unit): Self = StObject.set(x, "commitUpdate", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReplaceDecorator(value: (Decorator, String, String) => Unit): Self = StObject.set(x, "replaceDecorator", js.Any.fromFunction3(value))
      
      @scala.inline
      def setUpdateObjectLiteral(value: (ObjectLiteralExpression, String) => Unit): Self = StObject.set(x, "updateObjectLiteral", js.Any.fromFunction2(value))
    }
  }
}
