package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequireCheckIn extends StObject {
  
  /**
    * Whether require check in is enabled or not.
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Duration between 5 and 20 minutes to determine when to release the room if it's not checked into. 
    */
  var ReleaseAfterMinutes: js.UndefOr[Minutes] = js.undefined
}
object RequireCheckIn {
  
  @scala.inline
  def apply(): RequireCheckIn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequireCheckIn]
  }
  
  @scala.inline
  implicit class RequireCheckInMutableBuilder[Self <: RequireCheckIn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    @scala.inline
    def setReleaseAfterMinutes(value: Minutes): Self = StObject.set(x, "ReleaseAfterMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseAfterMinutesUndefined: Self = StObject.set(x, "ReleaseAfterMinutes", js.undefined)
  }
}
