package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeChannelMembershipResponse extends StObject {
  
  /**
    * The details of the membership.
    */
  var ChannelMembership: js.UndefOr[typings.awsSdk.chimeMod.ChannelMembership] = js.native
}
object DescribeChannelMembershipResponse {
  
  @scala.inline
  def apply(): DescribeChannelMembershipResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeChannelMembershipResponse]
  }
  
  @scala.inline
  implicit class DescribeChannelMembershipResponseMutableBuilder[Self <: DescribeChannelMembershipResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelMembership(value: ChannelMembership): Self = StObject.set(x, "ChannelMembership", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelMembershipUndefined: Self = StObject.set(x, "ChannelMembership", js.undefined)
  }
}
