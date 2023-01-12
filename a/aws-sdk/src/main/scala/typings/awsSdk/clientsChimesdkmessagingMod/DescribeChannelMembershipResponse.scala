package typings.awsSdk.clientsChimesdkmessagingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeChannelMembershipResponse extends StObject {
  
  /**
    * The details of the membership.
    */
  var ChannelMembership: js.UndefOr[typings.awsSdk.clientsChimesdkmessagingMod.ChannelMembership] = js.undefined
}
object DescribeChannelMembershipResponse {
  
  inline def apply(): DescribeChannelMembershipResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeChannelMembershipResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeChannelMembershipResponse] (val x: Self) extends AnyVal {
    
    inline def setChannelMembership(value: ChannelMembership): Self = StObject.set(x, "ChannelMembership", value.asInstanceOf[js.Any])
    
    inline def setChannelMembershipUndefined: Self = StObject.set(x, "ChannelMembership", js.undefined)
  }
}
