package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceSpecification extends StObject {
  
  /**
    * The amount of outbound bandwidth that is discounted in the offering.
    */
  var ReservedBitrate: js.UndefOr[integer] = js.undefined
  
  /**
    * The type of resource and the unit that is being billed for.
    */
  var ResourceType: typings.awsSdk.clientsMediaconnectMod.ResourceType
}
object ResourceSpecification {
  
  inline def apply(ResourceType: ResourceType): ResourceSpecification = {
    val __obj = js.Dynamic.literal(ResourceType = ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceSpecification]
  }
  
  extension [Self <: ResourceSpecification](x: Self) {
    
    inline def setReservedBitrate(value: integer): Self = StObject.set(x, "ReservedBitrate", value.asInstanceOf[js.Any])
    
    inline def setReservedBitrateUndefined: Self = StObject.set(x, "ReservedBitrate", js.undefined)
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
  }
}
