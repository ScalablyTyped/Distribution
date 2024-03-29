package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableVpcClassicLinkDnsSupportRequest extends StObject {
  
  /**
    * The ID of the VPC.
    */
  var VpcId: js.UndefOr[typings.awsSdk.clientsEc2Mod.VpcId] = js.undefined
}
object DisableVpcClassicLinkDnsSupportRequest {
  
  inline def apply(): DisableVpcClassicLinkDnsSupportRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisableVpcClassicLinkDnsSupportRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisableVpcClassicLinkDnsSupportRequest] (val x: Self) extends AnyVal {
    
    inline def setVpcId(value: VpcId): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
