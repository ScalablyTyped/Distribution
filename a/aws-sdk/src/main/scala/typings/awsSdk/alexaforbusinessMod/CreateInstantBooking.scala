package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateInstantBooking extends StObject {
  
  /**
    * Duration between 15 and 240 minutes at increments of 15 that determines how long to book an available room when a meeting is started with Alexa.
    */
  var DurationInMinutes: Minutes = js.native
  
  /**
    * Whether instant booking is enabled or not.
    */
  var Enabled: Boolean = js.native
}
object CreateInstantBooking {
  
  @scala.inline
  def apply(DurationInMinutes: Minutes, Enabled: Boolean): CreateInstantBooking = {
    val __obj = js.Dynamic.literal(DurationInMinutes = DurationInMinutes.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateInstantBooking]
  }
  
  @scala.inline
  implicit class CreateInstantBookingMutableBuilder[Self <: CreateInstantBooking] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDurationInMinutes(value: Minutes): Self = StObject.set(x, "DurationInMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
  }
}
