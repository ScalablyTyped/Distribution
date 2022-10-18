package typings.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEventTrackerResponse extends StObject {
  
  /**
    * An object that describes the event tracker.
    */
  var eventTracker: js.UndefOr[EventTracker] = js.undefined
}
object DescribeEventTrackerResponse {
  
  inline def apply(): DescribeEventTrackerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEventTrackerResponse]
  }
  
  extension [Self <: DescribeEventTrackerResponse](x: Self) {
    
    inline def setEventTracker(value: EventTracker): Self = StObject.set(x, "eventTracker", value.asInstanceOf[js.Any])
    
    inline def setEventTrackerUndefined: Self = StObject.set(x, "eventTracker", js.undefined)
  }
}
