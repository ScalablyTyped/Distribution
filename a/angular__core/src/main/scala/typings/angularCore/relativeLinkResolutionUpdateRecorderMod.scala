package typings.angularCore

import typings.typescript.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relativeLinkResolutionUpdateRecorderMod {
  
  trait UpdateRecorder extends StObject {
    
    def commitUpdate(): Unit
    
    def updateNode(node: Node, newText: String): Unit
  }
  object UpdateRecorder {
    
    @scala.inline
    def apply(commitUpdate: () => Unit, updateNode: (Node, String) => Unit): UpdateRecorder = {
      val __obj = js.Dynamic.literal(commitUpdate = js.Any.fromFunction0(commitUpdate), updateNode = js.Any.fromFunction2(updateNode))
      __obj.asInstanceOf[UpdateRecorder]
    }
    
    @scala.inline
    implicit class UpdateRecorderMutableBuilder[Self <: UpdateRecorder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCommitUpdate(value: () => Unit): Self = StObject.set(x, "commitUpdate", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUpdateNode(value: (Node, String) => Unit): Self = StObject.set(x, "updateNode", js.Any.fromFunction2(value))
    }
  }
}
