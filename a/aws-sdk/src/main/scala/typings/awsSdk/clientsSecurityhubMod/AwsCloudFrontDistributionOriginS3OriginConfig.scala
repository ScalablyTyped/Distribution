package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsCloudFrontDistributionOriginS3OriginConfig extends StObject {
  
  /**
    * The CloudFront origin access identity to associate with the origin.
    */
  var OriginAccessIdentity: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsCloudFrontDistributionOriginS3OriginConfig {
  
  inline def apply(): AwsCloudFrontDistributionOriginS3OriginConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsCloudFrontDistributionOriginS3OriginConfig]
  }
  
  extension [Self <: AwsCloudFrontDistributionOriginS3OriginConfig](x: Self) {
    
    inline def setOriginAccessIdentity(value: NonEmptyString): Self = StObject.set(x, "OriginAccessIdentity", value.asInstanceOf[js.Any])
    
    inline def setOriginAccessIdentityUndefined: Self = StObject.set(x, "OriginAccessIdentity", js.undefined)
  }
}
