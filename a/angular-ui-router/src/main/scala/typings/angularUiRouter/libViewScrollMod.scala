package typings.angularUiRouter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libViewScrollMod {
  
  trait UIViewScrollProvider extends StObject {
    
    /**
      * Uses standard anchorScroll behavior
      *
      * Reverts [[$uiViewScroll]] back to using the core [`$anchorScroll`](http://docs.angularjs.org/api/ng.$anchorScroll)
      * service for scrolling based on the url anchor.
      */
    def useAnchorScroll(): Unit
  }
  object UIViewScrollProvider {
    
    inline def apply(useAnchorScroll: () => Unit): UIViewScrollProvider = {
      val __obj = js.Dynamic.literal(useAnchorScroll = js.Any.fromFunction0(useAnchorScroll))
      __obj.asInstanceOf[UIViewScrollProvider]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UIViewScrollProvider] (val x: Self) extends AnyVal {
      
      inline def setUseAnchorScroll(value: () => Unit): Self = StObject.set(x, "useAnchorScroll", js.Any.fromFunction0(value))
    }
  }
}
