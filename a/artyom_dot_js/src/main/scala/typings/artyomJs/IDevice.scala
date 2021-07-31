package typings.artyomJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDevice extends StObject {
  
  var isChrome: js.UndefOr[Boolean] = js.undefined
  
  var isMobile: js.UndefOr[Boolean] = js.undefined
}
object IDevice {
  
  @scala.inline
  def apply(): IDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDevice]
  }
  
  @scala.inline
  implicit class IDeviceMutableBuilder[Self <: IDevice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsChrome(value: Boolean): Self = StObject.set(x, "isChrome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsChromeUndefined: Self = StObject.set(x, "isChrome", js.undefined)
    
    @scala.inline
    def setIsMobile(value: Boolean): Self = StObject.set(x, "isMobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMobileUndefined: Self = StObject.set(x, "isMobile", js.undefined)
  }
}
