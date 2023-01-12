package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Destination extends StObject {
  
  /**
    * The unique ID of the publishing destination.
    */
  var DestinationId: String
  
  /**
    * The type of resource used for the publishing destination. Currently, only Amazon S3 buckets are supported.
    */
  var DestinationType: typings.awsSdk.clientsGuarddutyMod.DestinationType
  
  /**
    * The status of the publishing destination.
    */
  var Status: PublishingStatus
}
object Destination {
  
  inline def apply(DestinationId: String, DestinationType: DestinationType, Status: PublishingStatus): Destination = {
    val __obj = js.Dynamic.literal(DestinationId = DestinationId.asInstanceOf[js.Any], DestinationType = DestinationType.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Destination]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Destination] (val x: Self) extends AnyVal {
    
    inline def setDestinationId(value: String): Self = StObject.set(x, "DestinationId", value.asInstanceOf[js.Any])
    
    inline def setDestinationType(value: DestinationType): Self = StObject.set(x, "DestinationType", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: PublishingStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
