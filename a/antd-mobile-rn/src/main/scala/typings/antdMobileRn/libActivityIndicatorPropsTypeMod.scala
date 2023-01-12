package typings.antdMobileRn

import typings.antdMobileRn.antdMobileRnStrings.large
import typings.antdMobileRn.antdMobileRnStrings.small
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libActivityIndicatorPropsTypeMod {
  
  trait ActivityIndicatorPropTypes extends StObject {
    
    var animating: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[large | small] = js.undefined
    
    var text: js.UndefOr[String] = js.undefined
    
    var toast: js.UndefOr[Boolean] = js.undefined
  }
  object ActivityIndicatorPropTypes {
    
    inline def apply(): ActivityIndicatorPropTypes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActivityIndicatorPropTypes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ActivityIndicatorPropTypes] (val x: Self) extends AnyVal {
      
      inline def setAnimating(value: Boolean): Self = StObject.set(x, "animating", value.asInstanceOf[js.Any])
      
      inline def setAnimatingUndefined: Self = StObject.set(x, "animating", js.undefined)
      
      inline def setSize(value: large | small): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setToast(value: Boolean): Self = StObject.set(x, "toast", value.asInstanceOf[js.Any])
      
      inline def setToastUndefined: Self = StObject.set(x, "toast", js.undefined)
    }
  }
}
