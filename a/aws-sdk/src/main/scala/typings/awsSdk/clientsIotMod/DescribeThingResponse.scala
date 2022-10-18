package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeThingResponse extends StObject {
  
  /**
    * The thing attributes.
    */
  var attributes: js.UndefOr[Attributes] = js.undefined
  
  /**
    * The name of the billing group the thing belongs to.
    */
  var billingGroupName: js.UndefOr[BillingGroupName] = js.undefined
  
  /**
    * The default MQTT client ID. For a typical device, the thing name is also used as the default MQTT client ID. Although we don’t require a mapping between a thing's registry name and its use of MQTT client IDs, certificates, or shadow state, we recommend that you choose a thing name and use it as the MQTT client ID for the registry and the Device Shadow service. This lets you better organize your IoT fleet without removing the flexibility of the underlying device certificate model or shadows.
    */
  var defaultClientId: js.UndefOr[ClientId] = js.undefined
  
  /**
    * The ARN of the thing to describe.
    */
  var thingArn: js.UndefOr[ThingArn] = js.undefined
  
  /**
    * The ID of the thing to describe.
    */
  var thingId: js.UndefOr[ThingId] = js.undefined
  
  /**
    * The name of the thing.
    */
  var thingName: js.UndefOr[ThingName] = js.undefined
  
  /**
    * The thing type name.
    */
  var thingTypeName: js.UndefOr[ThingTypeName] = js.undefined
  
  /**
    * The current version of the thing record in the registry.  To avoid unintentional changes to the information in the registry, you can pass the version information in the expectedVersion parameter of the UpdateThing and DeleteThing calls. 
    */
  var version: js.UndefOr[Version] = js.undefined
}
object DescribeThingResponse {
  
  inline def apply(): DescribeThingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeThingResponse]
  }
  
  extension [Self <: DescribeThingResponse](x: Self) {
    
    inline def setAttributes(value: Attributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setBillingGroupName(value: BillingGroupName): Self = StObject.set(x, "billingGroupName", value.asInstanceOf[js.Any])
    
    inline def setBillingGroupNameUndefined: Self = StObject.set(x, "billingGroupName", js.undefined)
    
    inline def setDefaultClientId(value: ClientId): Self = StObject.set(x, "defaultClientId", value.asInstanceOf[js.Any])
    
    inline def setDefaultClientIdUndefined: Self = StObject.set(x, "defaultClientId", js.undefined)
    
    inline def setThingArn(value: ThingArn): Self = StObject.set(x, "thingArn", value.asInstanceOf[js.Any])
    
    inline def setThingArnUndefined: Self = StObject.set(x, "thingArn", js.undefined)
    
    inline def setThingId(value: ThingId): Self = StObject.set(x, "thingId", value.asInstanceOf[js.Any])
    
    inline def setThingIdUndefined: Self = StObject.set(x, "thingId", js.undefined)
    
    inline def setThingName(value: ThingName): Self = StObject.set(x, "thingName", value.asInstanceOf[js.Any])
    
    inline def setThingNameUndefined: Self = StObject.set(x, "thingName", js.undefined)
    
    inline def setThingTypeName(value: ThingTypeName): Self = StObject.set(x, "thingTypeName", value.asInstanceOf[js.Any])
    
    inline def setThingTypeNameUndefined: Self = StObject.set(x, "thingTypeName", js.undefined)
    
    inline def setVersion(value: Version): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
