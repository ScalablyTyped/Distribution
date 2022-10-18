package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTrackerResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the updated tracker resource. Used to specify a resource across AWS.   Format example: arn:aws:geo:region:account-id:tracker/ExampleTracker   
    */
  var TrackerArn: Arn
  
  /**
    * The name of the updated tracker resource.
    */
  var TrackerName: ResourceName
  
  /**
    * The timestamp for when the tracker resource was last updated in  ISO 8601 format: YYYY-MM-DDThh:mm:ss.sssZ. 
    */
  var UpdateTime: js.Date
}
object UpdateTrackerResponse {
  
  inline def apply(TrackerArn: Arn, TrackerName: ResourceName, UpdateTime: js.Date): UpdateTrackerResponse = {
    val __obj = js.Dynamic.literal(TrackerArn = TrackerArn.asInstanceOf[js.Any], TrackerName = TrackerName.asInstanceOf[js.Any], UpdateTime = UpdateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTrackerResponse]
  }
  
  extension [Self <: UpdateTrackerResponse](x: Self) {
    
    inline def setTrackerArn(value: Arn): Self = StObject.set(x, "TrackerArn", value.asInstanceOf[js.Any])
    
    inline def setTrackerName(value: ResourceName): Self = StObject.set(x, "TrackerName", value.asInstanceOf[js.Any])
    
    inline def setUpdateTime(value: js.Date): Self = StObject.set(x, "UpdateTime", value.asInstanceOf[js.Any])
  }
}
