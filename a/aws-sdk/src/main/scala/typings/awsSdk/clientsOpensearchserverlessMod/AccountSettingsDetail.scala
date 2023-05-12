package typings.awsSdk.clientsOpensearchserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountSettingsDetail extends StObject {
  
  var capacityLimits: js.UndefOr[CapacityLimits] = js.undefined
}
object AccountSettingsDetail {
  
  inline def apply(): AccountSettingsDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountSettingsDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccountSettingsDetail] (val x: Self) extends AnyVal {
    
    inline def setCapacityLimits(value: CapacityLimits): Self = StObject.set(x, "capacityLimits", value.asInstanceOf[js.Any])
    
    inline def setCapacityLimitsUndefined: Self = StObject.set(x, "capacityLimits", js.undefined)
  }
}
