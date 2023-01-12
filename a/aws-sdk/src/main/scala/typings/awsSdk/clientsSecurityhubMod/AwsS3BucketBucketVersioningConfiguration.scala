package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsS3BucketBucketVersioningConfiguration extends StObject {
  
  /**
    * Specifies whether MFA delete is currently enabled in the S3 bucket versioning configuration. If the S3 bucket was never configured with MFA delete, then this attribute is not included.
    */
  var IsMfaDeleteEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The versioning status of the S3 bucket. Valid values are Enabled or Suspended.
    */
  var Status: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsS3BucketBucketVersioningConfiguration {
  
  inline def apply(): AwsS3BucketBucketVersioningConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsS3BucketBucketVersioningConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsS3BucketBucketVersioningConfiguration] (val x: Self) extends AnyVal {
    
    inline def setIsMfaDeleteEnabled(value: Boolean): Self = StObject.set(x, "IsMfaDeleteEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsMfaDeleteEnabledUndefined: Self = StObject.set(x, "IsMfaDeleteEnabled", js.undefined)
    
    inline def setStatus(value: NonEmptyString): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
