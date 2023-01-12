package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsCloudFrontDistributionOriginItem extends StObject {
  
  /**
    * An origin that is not an Amazon S3 bucket, with one exception. If the Amazon S3 bucket is configured with static website hosting, use this attribute. If the Amazon S3 bucket is not configured with static website hosting, use the S3OriginConfig type instead. 
    */
  var CustomOriginConfig: js.UndefOr[AwsCloudFrontDistributionOriginCustomOriginConfig] = js.undefined
  
  /**
    * Amazon S3 origins: The DNS name of the S3 bucket from which you want CloudFront to get objects for this origin.
    */
  var DomainName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * A unique identifier for the origin or origin group.
    */
  var Id: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * An optional element that causes CloudFront to request your content from a directory in your Amazon S3 bucket or your custom origin.
    */
  var OriginPath: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * An origin that is an S3 bucket that is not configured with static website hosting.
    */
  var S3OriginConfig: js.UndefOr[AwsCloudFrontDistributionOriginS3OriginConfig] = js.undefined
}
object AwsCloudFrontDistributionOriginItem {
  
  inline def apply(): AwsCloudFrontDistributionOriginItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsCloudFrontDistributionOriginItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsCloudFrontDistributionOriginItem] (val x: Self) extends AnyVal {
    
    inline def setCustomOriginConfig(value: AwsCloudFrontDistributionOriginCustomOriginConfig): Self = StObject.set(x, "CustomOriginConfig", value.asInstanceOf[js.Any])
    
    inline def setCustomOriginConfigUndefined: Self = StObject.set(x, "CustomOriginConfig", js.undefined)
    
    inline def setDomainName(value: NonEmptyString): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setDomainNameUndefined: Self = StObject.set(x, "DomainName", js.undefined)
    
    inline def setId(value: NonEmptyString): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setOriginPath(value: NonEmptyString): Self = StObject.set(x, "OriginPath", value.asInstanceOf[js.Any])
    
    inline def setOriginPathUndefined: Self = StObject.set(x, "OriginPath", js.undefined)
    
    inline def setS3OriginConfig(value: AwsCloudFrontDistributionOriginS3OriginConfig): Self = StObject.set(x, "S3OriginConfig", value.asInstanceOf[js.Any])
    
    inline def setS3OriginConfigUndefined: Self = StObject.set(x, "S3OriginConfig", js.undefined)
  }
}
