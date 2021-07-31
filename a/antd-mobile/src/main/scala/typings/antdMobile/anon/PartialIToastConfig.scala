package typings.antdMobile.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<antd-mobile.antd-mobile/lib/toast.IToastConfig> */
trait PartialIToastConfig extends StObject {
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var mask: js.UndefOr[Boolean] = js.undefined
}
object PartialIToastConfig {
  
  @scala.inline
  def apply(): PartialIToastConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIToastConfig]
  }
  
  @scala.inline
  implicit class PartialIToastConfigMutableBuilder[Self <: PartialIToastConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setMask(value: Boolean): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
  }
}
