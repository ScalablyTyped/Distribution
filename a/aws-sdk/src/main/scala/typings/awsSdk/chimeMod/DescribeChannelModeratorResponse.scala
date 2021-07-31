package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeChannelModeratorResponse extends StObject {
  
  /**
    * The details of the channel moderator.
    */
  var ChannelModerator: js.UndefOr[typings.awsSdk.chimeMod.ChannelModerator] = js.undefined
}
object DescribeChannelModeratorResponse {
  
  @scala.inline
  def apply(): DescribeChannelModeratorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeChannelModeratorResponse]
  }
  
  @scala.inline
  implicit class DescribeChannelModeratorResponseMutableBuilder[Self <: DescribeChannelModeratorResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelModerator(value: ChannelModerator): Self = StObject.set(x, "ChannelModerator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelModeratorUndefined: Self = StObject.set(x, "ChannelModerator", js.undefined)
  }
}
