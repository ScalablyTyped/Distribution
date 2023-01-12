package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResetServiceSettingResult extends StObject {
  
  /**
    * The current, effective service setting after calling the ResetServiceSetting API operation.
    */
  var ServiceSetting: js.UndefOr[typings.awsSdk.clientsSsmMod.ServiceSetting] = js.undefined
}
object ResetServiceSettingResult {
  
  inline def apply(): ResetServiceSettingResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResetServiceSettingResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResetServiceSettingResult] (val x: Self) extends AnyVal {
    
    inline def setServiceSetting(value: ServiceSetting): Self = StObject.set(x, "ServiceSetting", value.asInstanceOf[js.Any])
    
    inline def setServiceSettingUndefined: Self = StObject.set(x, "ServiceSetting", js.undefined)
  }
}
