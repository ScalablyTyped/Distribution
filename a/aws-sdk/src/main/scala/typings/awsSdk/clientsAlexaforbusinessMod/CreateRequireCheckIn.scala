package typings.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRequireCheckIn extends StObject {
  
  /**
    * Whether require check in is enabled or not.
    */
  var Enabled: Boolean
  
  /**
    * Duration between 5 and 20 minutes to determine when to release the room if it's not checked into.
    */
  var ReleaseAfterMinutes: Minutes
}
object CreateRequireCheckIn {
  
  inline def apply(Enabled: Boolean, ReleaseAfterMinutes: Minutes): CreateRequireCheckIn = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any], ReleaseAfterMinutes = ReleaseAfterMinutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRequireCheckIn]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateRequireCheckIn] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setReleaseAfterMinutes(value: Minutes): Self = StObject.set(x, "ReleaseAfterMinutes", value.asInstanceOf[js.Any])
  }
}
