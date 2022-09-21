package typings.awsSdk.accessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3AccessPointConfiguration extends StObject {
  
  /**
    * The access point or multi-region access point policy.
    */
  var accessPointPolicy: js.UndefOr[AccessPointPolicy] = js.undefined
  
  /**
    * The proposed Internet and VpcConfiguration to apply to this Amazon S3 access point. VpcConfiguration does not apply to multi-region access points. If the access preview is for a new resource and neither is specified, the access preview uses Internet for the network origin. If the access preview is for an existing resource and neither is specified, the access preview uses the exiting network origin.
    */
  var networkOrigin: js.UndefOr[NetworkOriginConfiguration] = js.undefined
  
  /**
    * The proposed S3PublicAccessBlock configuration to apply to this Amazon S3 access point or multi-region access point.
    */
  var publicAccessBlock: js.UndefOr[S3PublicAccessBlockConfiguration] = js.undefined
}
object S3AccessPointConfiguration {
  
  inline def apply(): S3AccessPointConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3AccessPointConfiguration]
  }
  
  extension [Self <: S3AccessPointConfiguration](x: Self) {
    
    inline def setAccessPointPolicy(value: AccessPointPolicy): Self = StObject.set(x, "accessPointPolicy", value.asInstanceOf[js.Any])
    
    inline def setAccessPointPolicyUndefined: Self = StObject.set(x, "accessPointPolicy", js.undefined)
    
    inline def setNetworkOrigin(value: NetworkOriginConfiguration): Self = StObject.set(x, "networkOrigin", value.asInstanceOf[js.Any])
    
    inline def setNetworkOriginUndefined: Self = StObject.set(x, "networkOrigin", js.undefined)
    
    inline def setPublicAccessBlock(value: S3PublicAccessBlockConfiguration): Self = StObject.set(x, "publicAccessBlock", value.asInstanceOf[js.Any])
    
    inline def setPublicAccessBlockUndefined: Self = StObject.set(x, "publicAccessBlock", js.undefined)
  }
}
