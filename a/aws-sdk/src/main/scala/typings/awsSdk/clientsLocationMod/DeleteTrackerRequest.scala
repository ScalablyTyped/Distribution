package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTrackerRequest extends StObject {
  
  /**
    * The name of the tracker resource to be deleted.
    */
  var TrackerName: ResourceName
}
object DeleteTrackerRequest {
  
  inline def apply(TrackerName: ResourceName): DeleteTrackerRequest = {
    val __obj = js.Dynamic.literal(TrackerName = TrackerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTrackerRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteTrackerRequest] (val x: Self) extends AnyVal {
    
    inline def setTrackerName(value: ResourceName): Self = StObject.set(x, "TrackerName", value.asInstanceOf[js.Any])
  }
}
