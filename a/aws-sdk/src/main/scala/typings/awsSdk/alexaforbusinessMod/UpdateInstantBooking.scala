package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateInstantBooking extends StObject {
  
  /**
    * Duration between 15 and 240 minutes at increments of 15 that determines how long to book an available room when a meeting is started with Alexa.
    */
  var DurationInMinutes: js.UndefOr[Minutes] = js.undefined
  
  /**
    * Whether instant booking is enabled or not.
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
}
object UpdateInstantBooking {
  
  @scala.inline
  def apply(): UpdateInstantBooking = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateInstantBooking]
  }
  
  @scala.inline
  implicit class UpdateInstantBookingMutableBuilder[Self <: UpdateInstantBooking] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDurationInMinutes(value: Minutes): Self = StObject.set(x, "DurationInMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationInMinutesUndefined: Self = StObject.set(x, "DurationInMinutes", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
  }
}
