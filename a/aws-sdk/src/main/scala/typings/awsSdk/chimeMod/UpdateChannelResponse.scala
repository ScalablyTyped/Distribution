package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateChannelResponse extends StObject {
  
  /**
    * The ARN of the channel.
    */
  var ChannelArn: js.UndefOr[ChimeArn] = js.undefined
}
object UpdateChannelResponse {
  
  @scala.inline
  def apply(): UpdateChannelResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateChannelResponse]
  }
  
  @scala.inline
  implicit class UpdateChannelResponseMutableBuilder[Self <: UpdateChannelResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelArn(value: ChimeArn): Self = StObject.set(x, "ChannelArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelArnUndefined: Self = StObject.set(x, "ChannelArn", js.undefined)
  }
}
