package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableLoggingMessage extends StObject {
  
  /**
    * The name of an existing S3 bucket where the log files are to be stored. Constraints:   Must be in the same region as the cluster   The cluster must have read bucket and put object permissions  
    */
  var BucketName: js.UndefOr[String] = js.undefined
  
  /**
    * The identifier of the cluster on which logging is to be started. Example: examplecluster 
    */
  var ClusterIdentifier: String
  
  /**
    * The log destination type. An enum with possible values of s3 and cloudwatch.
    */
  var LogDestinationType: js.UndefOr[typings.awsSdk.clientsRedshiftMod.LogDestinationType] = js.undefined
  
  /**
    * The collection of exported log types. Log types include the connection log, user log and user activity log.
    */
  var LogExports: js.UndefOr[LogTypeList] = js.undefined
  
  /**
    * The prefix applied to the log file names. Constraints:   Cannot exceed 512 characters   Cannot contain spaces( ), double quotes ("), single quotes ('), a backslash (\), or control characters. The hexadecimal codes for invalid characters are:    x00 to x20   x22   x27   x5c   x7f or larger    
    */
  var S3KeyPrefix: js.UndefOr[String] = js.undefined
}
object EnableLoggingMessage {
  
  inline def apply(ClusterIdentifier: String): EnableLoggingMessage = {
    val __obj = js.Dynamic.literal(ClusterIdentifier = ClusterIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableLoggingMessage]
  }
  
  extension [Self <: EnableLoggingMessage](x: Self) {
    
    inline def setBucketName(value: String): Self = StObject.set(x, "BucketName", value.asInstanceOf[js.Any])
    
    inline def setBucketNameUndefined: Self = StObject.set(x, "BucketName", js.undefined)
    
    inline def setClusterIdentifier(value: String): Self = StObject.set(x, "ClusterIdentifier", value.asInstanceOf[js.Any])
    
    inline def setLogDestinationType(value: LogDestinationType): Self = StObject.set(x, "LogDestinationType", value.asInstanceOf[js.Any])
    
    inline def setLogDestinationTypeUndefined: Self = StObject.set(x, "LogDestinationType", js.undefined)
    
    inline def setLogExports(value: LogTypeList): Self = StObject.set(x, "LogExports", value.asInstanceOf[js.Any])
    
    inline def setLogExportsUndefined: Self = StObject.set(x, "LogExports", js.undefined)
    
    inline def setLogExportsVarargs(value: String*): Self = StObject.set(x, "LogExports", js.Array(value*))
    
    inline def setS3KeyPrefix(value: String): Self = StObject.set(x, "S3KeyPrefix", value.asInstanceOf[js.Any])
    
    inline def setS3KeyPrefixUndefined: Self = StObject.set(x, "S3KeyPrefix", js.undefined)
  }
}
