package typings.awsSdk.clientsIotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FleetSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the fleet.
    */
  var arn: typings.awsSdk.clientsIotfleetwiseMod.arn
  
  /**
    * The time the fleet was created, in seconds since epoch (January 1, 1970 at midnight UTC time).
    */
  var creationTime: js.Date
  
  /**
    * A brief description of the fleet.
    */
  var description: js.UndefOr[typings.awsSdk.clientsIotfleetwiseMod.description] = js.undefined
  
  /**
    * The unique ID of the fleet.
    */
  var id: fleetId
  
  /**
    * The time the fleet was last updated in seconds since epoch (January 1, 1970 at midnight UTC time).
    */
  var lastModificationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ARN of the signal catalog associated with the fleet.
    */
  var signalCatalogArn: arn
}
object FleetSummary {
  
  inline def apply(arn: arn, creationTime: js.Date, id: fleetId, signalCatalogArn: arn): FleetSummary = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], creationTime = creationTime.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], signalCatalogArn = signalCatalogArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[FleetSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FleetSummary] (val x: Self) extends AnyVal {
    
    inline def setArn(value: arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: fleetId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLastModificationTime(value: js.Date): Self = StObject.set(x, "lastModificationTime", value.asInstanceOf[js.Any])
    
    inline def setLastModificationTimeUndefined: Self = StObject.set(x, "lastModificationTime", js.undefined)
    
    inline def setSignalCatalogArn(value: arn): Self = StObject.set(x, "signalCatalogArn", value.asInstanceOf[js.Any])
  }
}
