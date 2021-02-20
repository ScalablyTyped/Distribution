package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateChannelReadMarkerResponse extends StObject {
  
  /**
    * The ARN of the channel.
    */
  var ChannelArn: js.UndefOr[ChimeArn] = js.native
}
object UpdateChannelReadMarkerResponse {
  
  @scala.inline
  def apply(): UpdateChannelReadMarkerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateChannelReadMarkerResponse]
  }
  
  @scala.inline
  implicit class UpdateChannelReadMarkerResponseMutableBuilder[Self <: UpdateChannelReadMarkerResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelArn(value: ChimeArn): Self = StObject.set(x, "ChannelArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelArnUndefined: Self = StObject.set(x, "ChannelArn", js.undefined)
  }
}
