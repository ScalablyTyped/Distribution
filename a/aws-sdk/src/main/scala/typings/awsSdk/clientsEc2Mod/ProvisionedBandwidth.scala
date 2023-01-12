package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProvisionedBandwidth extends StObject {
  
  /**
    * Reserved. If you need to sustain traffic greater than the documented limits, contact us through the Support Center.
    */
  var ProvisionTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Reserved. If you need to sustain traffic greater than the documented limits, contact us through the Support Center.
    */
  var Provisioned: js.UndefOr[String] = js.undefined
  
  /**
    * Reserved. If you need to sustain traffic greater than the documented limits, contact us through the Support Center.
    */
  var RequestTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Reserved. If you need to sustain traffic greater than the documented limits, contact us through the Support Center.
    */
  var Requested: js.UndefOr[String] = js.undefined
  
  /**
    * Reserved. If you need to sustain traffic greater than the documented limits, contact us through the Support Center.
    */
  var Status: js.UndefOr[String] = js.undefined
}
object ProvisionedBandwidth {
  
  inline def apply(): ProvisionedBandwidth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvisionedBandwidth]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProvisionedBandwidth] (val x: Self) extends AnyVal {
    
    inline def setProvisionTime(value: js.Date): Self = StObject.set(x, "ProvisionTime", value.asInstanceOf[js.Any])
    
    inline def setProvisionTimeUndefined: Self = StObject.set(x, "ProvisionTime", js.undefined)
    
    inline def setProvisioned(value: String): Self = StObject.set(x, "Provisioned", value.asInstanceOf[js.Any])
    
    inline def setProvisionedUndefined: Self = StObject.set(x, "Provisioned", js.undefined)
    
    inline def setRequestTime(value: js.Date): Self = StObject.set(x, "RequestTime", value.asInstanceOf[js.Any])
    
    inline def setRequestTimeUndefined: Self = StObject.set(x, "RequestTime", js.undefined)
    
    inline def setRequested(value: String): Self = StObject.set(x, "Requested", value.asInstanceOf[js.Any])
    
    inline def setRequestedUndefined: Self = StObject.set(x, "Requested", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
