package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoggingStatus extends StObject {
  
  /**
    * The name of the S3 bucket where the log files are stored.
    */
  var BucketName: js.UndefOr[String] = js.undefined
  
  /**
    * The message indicating that logs failed to be delivered.
    */
  var LastFailureMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The last time when logs failed to be delivered.
    */
  var LastFailureTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The last time that logs were delivered.
    */
  var LastSuccessfulDeliveryTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The log destination type. An enum with possible values of s3 and cloudwatch.
    */
  var LogDestinationType: js.UndefOr[typings.awsSdk.clientsRedshiftMod.LogDestinationType] = js.undefined
  
  /**
    * The collection of exported log types. Log types include the connection log, user log and user activity log.
    */
  var LogExports: js.UndefOr[LogTypeList] = js.undefined
  
  /**
    *  true if logging is on, false if logging is off.
    */
  var LoggingEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The prefix applied to the log file names.
    */
  var S3KeyPrefix: js.UndefOr[String] = js.undefined
}
object LoggingStatus {
  
  inline def apply(): LoggingStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoggingStatus]
  }
  
  extension [Self <: LoggingStatus](x: Self) {
    
    inline def setBucketName(value: String): Self = StObject.set(x, "BucketName", value.asInstanceOf[js.Any])
    
    inline def setBucketNameUndefined: Self = StObject.set(x, "BucketName", js.undefined)
    
    inline def setLastFailureMessage(value: String): Self = StObject.set(x, "LastFailureMessage", value.asInstanceOf[js.Any])
    
    inline def setLastFailureMessageUndefined: Self = StObject.set(x, "LastFailureMessage", js.undefined)
    
    inline def setLastFailureTime(value: js.Date): Self = StObject.set(x, "LastFailureTime", value.asInstanceOf[js.Any])
    
    inline def setLastFailureTimeUndefined: Self = StObject.set(x, "LastFailureTime", js.undefined)
    
    inline def setLastSuccessfulDeliveryTime(value: js.Date): Self = StObject.set(x, "LastSuccessfulDeliveryTime", value.asInstanceOf[js.Any])
    
    inline def setLastSuccessfulDeliveryTimeUndefined: Self = StObject.set(x, "LastSuccessfulDeliveryTime", js.undefined)
    
    inline def setLogDestinationType(value: LogDestinationType): Self = StObject.set(x, "LogDestinationType", value.asInstanceOf[js.Any])
    
    inline def setLogDestinationTypeUndefined: Self = StObject.set(x, "LogDestinationType", js.undefined)
    
    inline def setLogExports(value: LogTypeList): Self = StObject.set(x, "LogExports", value.asInstanceOf[js.Any])
    
    inline def setLogExportsUndefined: Self = StObject.set(x, "LogExports", js.undefined)
    
    inline def setLogExportsVarargs(value: String*): Self = StObject.set(x, "LogExports", js.Array(value*))
    
    inline def setLoggingEnabled(value: Boolean): Self = StObject.set(x, "LoggingEnabled", value.asInstanceOf[js.Any])
    
    inline def setLoggingEnabledUndefined: Self = StObject.set(x, "LoggingEnabled", js.undefined)
    
    inline def setS3KeyPrefix(value: String): Self = StObject.set(x, "S3KeyPrefix", value.asInstanceOf[js.Any])
    
    inline def setS3KeyPrefixUndefined: Self = StObject.set(x, "S3KeyPrefix", js.undefined)
  }
}
