package typings.awsSdk.clientsIotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFleetRequest extends StObject {
  
  /**
    *  A brief description of the fleet to create. 
    */
  var description: js.UndefOr[typings.awsSdk.clientsIotfleetwiseMod.description] = js.undefined
  
  /**
    *  The unique ID of the fleet to create. 
    */
  var fleetId: typings.awsSdk.clientsIotfleetwiseMod.fleetId
  
  /**
    *  The Amazon Resource Name (ARN) of a signal catalog. 
    */
  var signalCatalogArn: arn
  
  /**
    * Metadata that can be used to manage the fleet.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}
object CreateFleetRequest {
  
  inline def apply(fleetId: fleetId, signalCatalogArn: arn): CreateFleetRequest = {
    val __obj = js.Dynamic.literal(fleetId = fleetId.asInstanceOf[js.Any], signalCatalogArn = signalCatalogArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFleetRequest]
  }
  
  extension [Self <: CreateFleetRequest](x: Self) {
    
    inline def setDescription(value: description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFleetId(value: fleetId): Self = StObject.set(x, "fleetId", value.asInstanceOf[js.Any])
    
    inline def setSignalCatalogArn(value: arn): Self = StObject.set(x, "signalCatalogArn", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
