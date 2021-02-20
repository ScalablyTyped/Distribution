package typings.androiduix

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PageStack {
  
  @js.native
  trait StateSaved extends StObject {
    
    var extra: js.UndefOr[js.Any] = js.native
    
    var pageId: String = js.native
  }
  object StateSaved {
    
    @scala.inline
    def apply(pageId: String): StateSaved = {
      val __obj = js.Dynamic.literal(pageId = pageId.asInstanceOf[js.Any])
      __obj.asInstanceOf[StateSaved]
    }
    
    @scala.inline
    implicit class StateSavedMutableBuilder[Self <: StateSaved] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtra(value: js.Any): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      @scala.inline
      def setPageId(value: String): Self = StObject.set(x, "pageId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StateStack extends StObject {
    
    var isRoot: js.UndefOr[Boolean] = js.native
    
    var pageId: String = js.native
    
    var stack: js.Array[StateSaved] = js.native
  }
  object StateStack {
    
    @scala.inline
    def apply(pageId: String, stack: js.Array[StateSaved]): StateStack = {
      val __obj = js.Dynamic.literal(pageId = pageId.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
      __obj.asInstanceOf[StateStack]
    }
    
    @scala.inline
    implicit class StateStackMutableBuilder[Self <: StateStack] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsRoot(value: Boolean): Self = StObject.set(x, "isRoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsRootUndefined: Self = StObject.set(x, "isRoot", js.undefined)
      
      @scala.inline
      def setPageId(value: String): Self = StObject.set(x, "pageId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStack(value: js.Array[StateSaved]): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackVarargs(value: StateSaved*): Self = StObject.set(x, "stack", js.Array(value :_*))
    }
  }
}
