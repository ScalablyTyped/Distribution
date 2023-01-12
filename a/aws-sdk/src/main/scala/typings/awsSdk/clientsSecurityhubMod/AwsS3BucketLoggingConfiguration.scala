package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsS3BucketLoggingConfiguration extends StObject {
  
  /**
    * The name of the S3 bucket where log files for the S3 bucket are stored.
    */
  var DestinationBucketName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The prefix added to log files for the S3 bucket.
    */
  var LogFilePrefix: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsS3BucketLoggingConfiguration {
  
  inline def apply(): AwsS3BucketLoggingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsS3BucketLoggingConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsS3BucketLoggingConfiguration] (val x: Self) extends AnyVal {
    
    inline def setDestinationBucketName(value: NonEmptyString): Self = StObject.set(x, "DestinationBucketName", value.asInstanceOf[js.Any])
    
    inline def setDestinationBucketNameUndefined: Self = StObject.set(x, "DestinationBucketName", js.undefined)
    
    inline def setLogFilePrefix(value: NonEmptyString): Self = StObject.set(x, "LogFilePrefix", value.asInstanceOf[js.Any])
    
    inline def setLogFilePrefixUndefined: Self = StObject.set(x, "LogFilePrefix", js.undefined)
  }
}
