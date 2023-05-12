package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Origination extends StObject {
  
  /**
    * When origination settings are disabled, inbound calls are not enabled for your Amazon Chime SDK Voice Connector. This parameter is not required, but you must specify this parameter or Routes.
    */
  var Disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The call distribution properties defined for your SIP hosts. Valid range: Minimum value of 1. Maximum value of 20. This parameter is not required, but you must specify this parameter or Disabled.
    */
  var Routes: js.UndefOr[OriginationRouteList] = js.undefined
}
object Origination {
  
  inline def apply(): Origination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Origination]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Origination] (val x: Self) extends AnyVal {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "Disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "Disabled", js.undefined)
    
    inline def setRoutes(value: OriginationRouteList): Self = StObject.set(x, "Routes", value.asInstanceOf[js.Any])
    
    inline def setRoutesUndefined: Self = StObject.set(x, "Routes", js.undefined)
    
    inline def setRoutesVarargs(value: OriginationRoute*): Self = StObject.set(x, "Routes", js.Array(value*))
  }
}
