package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainDescriptionType extends StObject {
  
  /**
    * The Amazon Web Services ID for the user pool owner.
    */
  var AWSAccountId: js.UndefOr[AWSAccountIdType] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon CloudFront distribution.
    */
  var CloudFrontDistribution: js.UndefOr[StringType] = js.undefined
  
  /**
    * The configuration for a custom domain that hosts the sign-up and sign-in webpages for your application.
    */
  var CustomDomainConfig: js.UndefOr[CustomDomainConfigType] = js.undefined
  
  /**
    * The domain string. For custom domains, this is the fully-qualified domain name, such as auth.example.com. For Amazon Cognito prefix domains, this is the prefix alone, such as auth.
    */
  var Domain: js.UndefOr[DomainType] = js.undefined
  
  /**
    * The Amazon S3 bucket where the static files for this domain are stored.
    */
  var S3Bucket: js.UndefOr[S3BucketType] = js.undefined
  
  /**
    * The domain status.
    */
  var Status: js.UndefOr[DomainStatusType] = js.undefined
  
  /**
    * The user pool ID.
    */
  var UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined
  
  /**
    * The app version.
    */
  var Version: js.UndefOr[DomainVersionType] = js.undefined
}
object DomainDescriptionType {
  
  inline def apply(): DomainDescriptionType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainDescriptionType]
  }
  
  extension [Self <: DomainDescriptionType](x: Self) {
    
    inline def setAWSAccountId(value: AWSAccountIdType): Self = StObject.set(x, "AWSAccountId", value.asInstanceOf[js.Any])
    
    inline def setAWSAccountIdUndefined: Self = StObject.set(x, "AWSAccountId", js.undefined)
    
    inline def setCloudFrontDistribution(value: StringType): Self = StObject.set(x, "CloudFrontDistribution", value.asInstanceOf[js.Any])
    
    inline def setCloudFrontDistributionUndefined: Self = StObject.set(x, "CloudFrontDistribution", js.undefined)
    
    inline def setCustomDomainConfig(value: CustomDomainConfigType): Self = StObject.set(x, "CustomDomainConfig", value.asInstanceOf[js.Any])
    
    inline def setCustomDomainConfigUndefined: Self = StObject.set(x, "CustomDomainConfig", js.undefined)
    
    inline def setDomain(value: DomainType): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "Domain", js.undefined)
    
    inline def setS3Bucket(value: S3BucketType): Self = StObject.set(x, "S3Bucket", value.asInstanceOf[js.Any])
    
    inline def setS3BucketUndefined: Self = StObject.set(x, "S3Bucket", js.undefined)
    
    inline def setStatus(value: DomainStatusType): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setUserPoolId(value: UserPoolIdType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
    
    inline def setUserPoolIdUndefined: Self = StObject.set(x, "UserPoolId", js.undefined)
    
    inline def setVersion(value: DomainVersionType): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
