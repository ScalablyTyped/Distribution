package typings.awsSdk.clientsIotroborunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VendorProperties extends StObject {
  
  var vendorAdditionalFixedProperties: js.UndefOr[VendorAdditionalFixedPropertiesJson] = js.undefined
  
  var vendorAdditionalTransientProperties: js.UndefOr[VendorAdditionalTransientPropertiesJson] = js.undefined
  
  var vendorWorkerId: VendorWorkerId
  
  var vendorWorkerIpAddress: js.UndefOr[VendorWorkerIpAddress] = js.undefined
}
object VendorProperties {
  
  inline def apply(vendorWorkerId: VendorWorkerId): VendorProperties = {
    val __obj = js.Dynamic.literal(vendorWorkerId = vendorWorkerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VendorProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VendorProperties] (val x: Self) extends AnyVal {
    
    inline def setVendorAdditionalFixedProperties(value: VendorAdditionalFixedPropertiesJson): Self = StObject.set(x, "vendorAdditionalFixedProperties", value.asInstanceOf[js.Any])
    
    inline def setVendorAdditionalFixedPropertiesUndefined: Self = StObject.set(x, "vendorAdditionalFixedProperties", js.undefined)
    
    inline def setVendorAdditionalTransientProperties(value: VendorAdditionalTransientPropertiesJson): Self = StObject.set(x, "vendorAdditionalTransientProperties", value.asInstanceOf[js.Any])
    
    inline def setVendorAdditionalTransientPropertiesUndefined: Self = StObject.set(x, "vendorAdditionalTransientProperties", js.undefined)
    
    inline def setVendorWorkerId(value: VendorWorkerId): Self = StObject.set(x, "vendorWorkerId", value.asInstanceOf[js.Any])
    
    inline def setVendorWorkerIpAddress(value: VendorWorkerIpAddress): Self = StObject.set(x, "vendorWorkerIpAddress", value.asInstanceOf[js.Any])
    
    inline def setVendorWorkerIpAddressUndefined: Self = StObject.set(x, "vendorWorkerIpAddress", js.undefined)
  }
}
