package typings.awsSdk.clientsPrivatenetworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkResource extends StObject {
  
  /**
    * The attributes of the network resource.
    */
  var attributes: js.UndefOr[NameValuePairs] = js.undefined
  
  /**
    * The creation time of the network resource.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description of the network resource.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The health of the network resource.
    */
  var health: js.UndefOr[HealthStatus] = js.undefined
  
  /**
    * The model of the network resource.
    */
  var model: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the network on which this network resource appears.
    */
  var networkArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the network resource.
    */
  var networkResourceArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the network site on which this network resource appears.
    */
  var networkSiteArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the order used to purchase this network resource.
    */
  var orderArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The position of the network resource.
    */
  var position: js.UndefOr[Position] = js.undefined
  
  /**
    * The serial number of the network resource.
    */
  var serialNumber: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the network resource.
    */
  var status: js.UndefOr[NetworkResourceStatus] = js.undefined
  
  /**
    * The status reason of the network resource.
    */
  var statusReason: js.UndefOr[String] = js.undefined
  
  /**
    * The type of the network resource.
    */
  var `type`: js.UndefOr[NetworkResourceType] = js.undefined
  
  /**
    * The vendor of the network resource.
    */
  var vendor: js.UndefOr[String] = js.undefined
}
object NetworkResource {
  
  inline def apply(): NetworkResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkResource]
  }
  
  extension [Self <: NetworkResource](x: Self) {
    
    inline def setAttributes(value: NameValuePairs): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setAttributesVarargs(value: NameValuePair*): Self = StObject.set(x, "attributes", js.Array(value*))
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setHealth(value: HealthStatus): Self = StObject.set(x, "health", value.asInstanceOf[js.Any])
    
    inline def setHealthUndefined: Self = StObject.set(x, "health", js.undefined)
    
    inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setNetworkArn(value: Arn): Self = StObject.set(x, "networkArn", value.asInstanceOf[js.Any])
    
    inline def setNetworkArnUndefined: Self = StObject.set(x, "networkArn", js.undefined)
    
    inline def setNetworkResourceArn(value: Arn): Self = StObject.set(x, "networkResourceArn", value.asInstanceOf[js.Any])
    
    inline def setNetworkResourceArnUndefined: Self = StObject.set(x, "networkResourceArn", js.undefined)
    
    inline def setNetworkSiteArn(value: Arn): Self = StObject.set(x, "networkSiteArn", value.asInstanceOf[js.Any])
    
    inline def setNetworkSiteArnUndefined: Self = StObject.set(x, "networkSiteArn", js.undefined)
    
    inline def setOrderArn(value: Arn): Self = StObject.set(x, "orderArn", value.asInstanceOf[js.Any])
    
    inline def setOrderArnUndefined: Self = StObject.set(x, "orderArn", js.undefined)
    
    inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setSerialNumber(value: String): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
    
    inline def setSerialNumberUndefined: Self = StObject.set(x, "serialNumber", js.undefined)
    
    inline def setStatus(value: NetworkResourceStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusReason(value: String): Self = StObject.set(x, "statusReason", value.asInstanceOf[js.Any])
    
    inline def setStatusReasonUndefined: Self = StObject.set(x, "statusReason", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setType(value: NetworkResourceType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setVendor(value: String): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
    
    inline def setVendorUndefined: Self = StObject.set(x, "vendor", js.undefined)
  }
}
