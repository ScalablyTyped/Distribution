package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTrackerRequest extends StObject {
  
  /**
    * The name of the tracker resource.
    */
  var TrackerName: ResourceName
}
object DescribeTrackerRequest {
  
  inline def apply(TrackerName: ResourceName): DescribeTrackerRequest = {
    val __obj = js.Dynamic.literal(TrackerName = TrackerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTrackerRequest]
  }
  
  extension [Self <: DescribeTrackerRequest](x: Self) {
    
    inline def setTrackerName(value: ResourceName): Self = StObject.set(x, "TrackerName", value.asInstanceOf[js.Any])
  }
}
