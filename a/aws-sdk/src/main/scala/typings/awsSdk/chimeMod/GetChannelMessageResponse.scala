package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetChannelMessageResponse extends StObject {
  
  /**
    * The details of and content in the message.
    */
  var ChannelMessage: js.UndefOr[typings.awsSdk.chimeMod.ChannelMessage] = js.native
}
object GetChannelMessageResponse {
  
  @scala.inline
  def apply(): GetChannelMessageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetChannelMessageResponse]
  }
  
  @scala.inline
  implicit class GetChannelMessageResponseMutableBuilder[Self <: GetChannelMessageResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelMessage(value: ChannelMessage): Self = StObject.set(x, "ChannelMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelMessageUndefined: Self = StObject.set(x, "ChannelMessage", js.undefined)
  }
}
