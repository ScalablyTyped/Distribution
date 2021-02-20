package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateRequireCheckIn extends StObject {
  
  /**
    * Whether require check in is enabled or not.
    */
  var Enabled: Boolean = js.native
  
  /**
    * Duration between 5 and 20 minutes to determine when to release the room if it's not checked into.
    */
  var ReleaseAfterMinutes: Minutes = js.native
}
object CreateRequireCheckIn {
  
  @scala.inline
  def apply(Enabled: Boolean, ReleaseAfterMinutes: Minutes): CreateRequireCheckIn = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any], ReleaseAfterMinutes = ReleaseAfterMinutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRequireCheckIn]
  }
  
  @scala.inline
  implicit class CreateRequireCheckInMutableBuilder[Self <: CreateRequireCheckIn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseAfterMinutes(value: Minutes): Self = StObject.set(x, "ReleaseAfterMinutes", value.asInstanceOf[js.Any])
  }
}
