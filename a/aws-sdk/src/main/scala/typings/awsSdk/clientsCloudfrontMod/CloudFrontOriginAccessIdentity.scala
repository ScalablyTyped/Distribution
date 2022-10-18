package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudFrontOriginAccessIdentity extends StObject {
  
  /**
    * The current configuration information for the identity. 
    */
  var CloudFrontOriginAccessIdentityConfig: js.UndefOr[typings.awsSdk.clientsCloudfrontMod.CloudFrontOriginAccessIdentityConfig] = js.undefined
  
  /**
    * The ID for the origin access identity, for example, E74FTE3AJFJ256A. 
    */
  var Id: String
  
  /**
    * The Amazon S3 canonical user ID for the origin access identity, used when giving the origin access identity read permission to an object in Amazon S3. 
    */
  var S3CanonicalUserId: String
}
object CloudFrontOriginAccessIdentity {
  
  inline def apply(Id: String, S3CanonicalUserId: String): CloudFrontOriginAccessIdentity = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], S3CanonicalUserId = S3CanonicalUserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudFrontOriginAccessIdentity]
  }
  
  extension [Self <: CloudFrontOriginAccessIdentity](x: Self) {
    
    inline def setCloudFrontOriginAccessIdentityConfig(value: CloudFrontOriginAccessIdentityConfig): Self = StObject.set(x, "CloudFrontOriginAccessIdentityConfig", value.asInstanceOf[js.Any])
    
    inline def setCloudFrontOriginAccessIdentityConfigUndefined: Self = StObject.set(x, "CloudFrontOriginAccessIdentityConfig", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setS3CanonicalUserId(value: String): Self = StObject.set(x, "S3CanonicalUserId", value.asInstanceOf[js.Any])
  }
}
