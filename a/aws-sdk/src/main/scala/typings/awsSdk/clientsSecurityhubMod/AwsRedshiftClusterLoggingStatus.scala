package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsRedshiftClusterLoggingStatus extends StObject {
  
  /**
    * The name of the S3 bucket where the log files are stored.
    */
  var BucketName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The message indicating that the logs failed to be delivered.
    */
  var LastFailureMessage: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The last time when logs failed to be delivered. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var LastFailureTime: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The last time that logs were delivered successfully. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var LastSuccessfulDeliveryTime: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Indicates whether logging is enabled.
    */
  var LoggingEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Provides the prefix applied to the log file names.
    */
  var S3KeyPrefix: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsRedshiftClusterLoggingStatus {
  
  inline def apply(): AwsRedshiftClusterLoggingStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsRedshiftClusterLoggingStatus]
  }
  
  extension [Self <: AwsRedshiftClusterLoggingStatus](x: Self) {
    
    inline def setBucketName(value: NonEmptyString): Self = StObject.set(x, "BucketName", value.asInstanceOf[js.Any])
    
    inline def setBucketNameUndefined: Self = StObject.set(x, "BucketName", js.undefined)
    
    inline def setLastFailureMessage(value: NonEmptyString): Self = StObject.set(x, "LastFailureMessage", value.asInstanceOf[js.Any])
    
    inline def setLastFailureMessageUndefined: Self = StObject.set(x, "LastFailureMessage", js.undefined)
    
    inline def setLastFailureTime(value: NonEmptyString): Self = StObject.set(x, "LastFailureTime", value.asInstanceOf[js.Any])
    
    inline def setLastFailureTimeUndefined: Self = StObject.set(x, "LastFailureTime", js.undefined)
    
    inline def setLastSuccessfulDeliveryTime(value: NonEmptyString): Self = StObject.set(x, "LastSuccessfulDeliveryTime", value.asInstanceOf[js.Any])
    
    inline def setLastSuccessfulDeliveryTimeUndefined: Self = StObject.set(x, "LastSuccessfulDeliveryTime", js.undefined)
    
    inline def setLoggingEnabled(value: Boolean): Self = StObject.set(x, "LoggingEnabled", value.asInstanceOf[js.Any])
    
    inline def setLoggingEnabledUndefined: Self = StObject.set(x, "LoggingEnabled", js.undefined)
    
    inline def setS3KeyPrefix(value: NonEmptyString): Self = StObject.set(x, "S3KeyPrefix", value.asInstanceOf[js.Any])
    
    inline def setS3KeyPrefixUndefined: Self = StObject.set(x, "S3KeyPrefix", js.undefined)
  }
}
