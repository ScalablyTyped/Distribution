package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelModeratorSummary extends StObject {
  
  /**
    * The data for a moderator.
    */
  var Moderator: js.UndefOr[Identity] = js.native
}
object ChannelModeratorSummary {
  
  @scala.inline
  def apply(): ChannelModeratorSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelModeratorSummary]
  }
  
  @scala.inline
  implicit class ChannelModeratorSummaryMutableBuilder[Self <: ChannelModeratorSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModerator(value: Identity): Self = StObject.set(x, "Moderator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeratorUndefined: Self = StObject.set(x, "Moderator", js.undefined)
  }
}
