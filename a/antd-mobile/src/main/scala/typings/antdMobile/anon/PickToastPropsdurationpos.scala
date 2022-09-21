package typings.antdMobile.anon

import typings.antdMobile.antdMobileStrings.bottom
import typings.antdMobile.antdMobileStrings.center
import typings.antdMobile.antdMobileStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<antd-mobile.antd-mobile/es/components/toast/toast.ToastProps, 'duration' | 'position' | 'maskClickable'> */
trait PickToastPropsdurationpos extends StObject {
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var maskClickable: js.UndefOr[Boolean] = js.undefined
  
  var position: js.UndefOr[top | bottom | center] = js.undefined
}
object PickToastPropsdurationpos {
  
  inline def apply(): PickToastPropsdurationpos = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickToastPropsdurationpos]
  }
  
  extension [Self <: PickToastPropsdurationpos](x: Self) {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setMaskClickable(value: Boolean): Self = StObject.set(x, "maskClickable", value.asInstanceOf[js.Any])
    
    inline def setMaskClickableUndefined: Self = StObject.set(x, "maskClickable", js.undefined)
    
    inline def setPosition(value: top | bottom | center): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
