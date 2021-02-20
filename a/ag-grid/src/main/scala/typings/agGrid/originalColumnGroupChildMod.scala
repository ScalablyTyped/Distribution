package typings.agGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object originalColumnGroupChildMod {
  
  @js.native
  trait OriginalColumnGroupChild extends StObject {
    
    def getColumnGroupShow(): String = js.native
    
    def getId(): String = js.native
    
    def isVisible(): Boolean = js.native
  }
  object OriginalColumnGroupChild {
    
    @scala.inline
    def apply(getColumnGroupShow: () => String, getId: () => String, isVisible: () => Boolean): OriginalColumnGroupChild = {
      val __obj = js.Dynamic.literal(getColumnGroupShow = js.Any.fromFunction0(getColumnGroupShow), getId = js.Any.fromFunction0(getId), isVisible = js.Any.fromFunction0(isVisible))
      __obj.asInstanceOf[OriginalColumnGroupChild]
    }
    
    @scala.inline
    implicit class OriginalColumnGroupChildMutableBuilder[Self <: OriginalColumnGroupChild] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetColumnGroupShow(value: () => String): Self = StObject.set(x, "getColumnGroupShow", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetId(value: () => String): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsVisible(value: () => Boolean): Self = StObject.set(x, "isVisible", js.Any.fromFunction0(value))
    }
  }
}
