package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateTrackerConsumerRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the geofence collection to be associated to tracker resource. Used when you need to specify a resource across all Amazon Web Services.   Format example: arn:aws:geo:region:account-id:geofence-collection/ExampleGeofenceCollectionConsumer   
    */
  var ConsumerArn: Arn
  
  /**
    * The name of the tracker resource to be associated with a geofence collection.
    */
  var TrackerName: ResourceName
}
object AssociateTrackerConsumerRequest {
  
  inline def apply(ConsumerArn: Arn, TrackerName: ResourceName): AssociateTrackerConsumerRequest = {
    val __obj = js.Dynamic.literal(ConsumerArn = ConsumerArn.asInstanceOf[js.Any], TrackerName = TrackerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateTrackerConsumerRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssociateTrackerConsumerRequest] (val x: Self) extends AnyVal {
    
    inline def setConsumerArn(value: Arn): Self = StObject.set(x, "ConsumerArn", value.asInstanceOf[js.Any])
    
    inline def setTrackerName(value: ResourceName): Self = StObject.set(x, "TrackerName", value.asInstanceOf[js.Any])
  }
}
