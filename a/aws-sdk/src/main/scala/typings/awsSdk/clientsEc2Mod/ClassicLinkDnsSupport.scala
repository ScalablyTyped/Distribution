package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassicLinkDnsSupport extends StObject {
  
  /**
    * Indicates whether ClassicLink DNS support is enabled for the VPC.
    */
  var ClassicLinkDnsSupported: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the VPC.
    */
  var VpcId: js.UndefOr[String] = js.undefined
}
object ClassicLinkDnsSupport {
  
  inline def apply(): ClassicLinkDnsSupport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassicLinkDnsSupport]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClassicLinkDnsSupport] (val x: Self) extends AnyVal {
    
    inline def setClassicLinkDnsSupported(value: Boolean): Self = StObject.set(x, "ClassicLinkDnsSupported", value.asInstanceOf[js.Any])
    
    inline def setClassicLinkDnsSupportedUndefined: Self = StObject.set(x, "ClassicLinkDnsSupported", js.undefined)
    
    inline def setVpcId(value: String): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
