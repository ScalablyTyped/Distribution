package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateTrackerConsumerRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the geofence collection to be disassociated from the tracker resource. Used when you need to specify a resource across all AWS.    Format example: arn:aws:geo:region:account-id:geofence-collection/ExampleGeofenceCollectionConsumer   
    */
  var ConsumerArn: Arn
  
  /**
    * The name of the tracker resource to be dissociated from the consumer.
    */
  var TrackerName: ResourceName
}
object DisassociateTrackerConsumerRequest {
  
  inline def apply(ConsumerArn: Arn, TrackerName: ResourceName): DisassociateTrackerConsumerRequest = {
    val __obj = js.Dynamic.literal(ConsumerArn = ConsumerArn.asInstanceOf[js.Any], TrackerName = TrackerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateTrackerConsumerRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisassociateTrackerConsumerRequest] (val x: Self) extends AnyVal {
    
    inline def setConsumerArn(value: Arn): Self = StObject.set(x, "ConsumerArn", value.asInstanceOf[js.Any])
    
    inline def setTrackerName(value: ResourceName): Self = StObject.set(x, "TrackerName", value.asInstanceOf[js.Any])
  }
}
