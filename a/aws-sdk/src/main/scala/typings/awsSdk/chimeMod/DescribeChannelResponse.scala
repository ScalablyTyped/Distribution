package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeChannelResponse extends StObject {
  
  /**
    * The channel details.
    */
  var Channel: js.UndefOr[typings.awsSdk.chimeMod.Channel] = js.undefined
}
object DescribeChannelResponse {
  
  @scala.inline
  def apply(): DescribeChannelResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeChannelResponse]
  }
  
  @scala.inline
  implicit class DescribeChannelResponseMutableBuilder[Self <: DescribeChannelResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannel(value: Channel): Self = StObject.set(x, "Channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelUndefined: Self = StObject.set(x, "Channel", js.undefined)
  }
}
