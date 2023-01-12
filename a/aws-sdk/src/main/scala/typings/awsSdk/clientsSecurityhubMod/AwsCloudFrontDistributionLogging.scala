package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsCloudFrontDistributionLogging extends StObject {
  
  /**
    * The S3 bucket to store the access logs in.
    */
  var Bucket: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * With this field, you can enable or disable the selected distribution.
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether you want CloudFront to include cookies in access logs.
    */
  var IncludeCookies: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An optional string that you want CloudFront to use as a prefix to the access log filenames for this distribution.
    */
  var Prefix: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsCloudFrontDistributionLogging {
  
  inline def apply(): AwsCloudFrontDistributionLogging = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsCloudFrontDistributionLogging]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsCloudFrontDistributionLogging] (val x: Self) extends AnyVal {
    
    inline def setBucket(value: NonEmptyString): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    inline def setBucketUndefined: Self = StObject.set(x, "Bucket", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    inline def setIncludeCookies(value: Boolean): Self = StObject.set(x, "IncludeCookies", value.asInstanceOf[js.Any])
    
    inline def setIncludeCookiesUndefined: Self = StObject.set(x, "IncludeCookies", js.undefined)
    
    inline def setPrefix(value: NonEmptyString): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
  }
}
