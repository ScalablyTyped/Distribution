package typings.awsSdk.clientsEvidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectDataDelivery extends StObject {
  
  /**
    * If the project stores evaluation events in CloudWatch Logs, this structure stores the log group name.
    */
  var cloudWatchLogs: js.UndefOr[CloudWatchLogsDestination] = js.undefined
  
  /**
    * If the project stores evaluation events in an Amazon S3 bucket, this structure stores the bucket name and bucket prefix.
    */
  var s3Destination: js.UndefOr[S3Destination] = js.undefined
}
object ProjectDataDelivery {
  
  inline def apply(): ProjectDataDelivery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectDataDelivery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProjectDataDelivery] (val x: Self) extends AnyVal {
    
    inline def setCloudWatchLogs(value: CloudWatchLogsDestination): Self = StObject.set(x, "cloudWatchLogs", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchLogsUndefined: Self = StObject.set(x, "cloudWatchLogs", js.undefined)
    
    inline def setS3Destination(value: S3Destination): Self = StObject.set(x, "s3Destination", value.asInstanceOf[js.Any])
    
    inline def setS3DestinationUndefined: Self = StObject.set(x, "s3Destination", js.undefined)
  }
}
