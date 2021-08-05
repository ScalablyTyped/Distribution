package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateInstantBooking extends StObject {
  
  /**
    * Duration between 15 and 240 minutes at increments of 15 that determines how long to book an available room when a meeting is started with Alexa.
    */
  var DurationInMinutes: Minutes
  
  /**
    * Whether instant booking is enabled or not.
    */
  var Enabled: Boolean
}
object CreateInstantBooking {
  
  inline def apply(DurationInMinutes: Minutes, Enabled: Boolean): CreateInstantBooking = {
    val __obj = js.Dynamic.literal(DurationInMinutes = DurationInMinutes.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateInstantBooking]
  }
  
  extension [Self <: CreateInstantBooking](x: Self) {
    
    inline def setDurationInMinutes(value: Minutes): Self = StObject.set(x, "DurationInMinutes", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
  }
}
