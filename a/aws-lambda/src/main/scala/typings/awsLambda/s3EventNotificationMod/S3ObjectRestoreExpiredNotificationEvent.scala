package typings.awsLambda.s3EventNotificationMod

import typings.awsLambda.awsLambdaStrings.`Object Restore Expired`
import typings.awsLambda.awsLambdaStrings.awsDots3
import typings.awsLambda.eventbridgeMod.EventBridgeEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3ObjectRestoreExpiredNotificationEvent
  extends StObject
     with EventBridgeEvent[`Object Restore Expired`, S3ObjectRestoreExpiredNotificationEventDetail]
     with S3NotificationEvent {
  
  @JSName("source")
  var source_S3ObjectRestoreExpiredNotificationEvent: awsDots3
}
object S3ObjectRestoreExpiredNotificationEvent {
  
  inline def apply(
    account: String,
    detail: S3ObjectRestoreExpiredNotificationEventDetail,
    id: String,
    region: String,
    resources: js.Array[String],
    time: String,
    version: String
  ): S3ObjectRestoreExpiredNotificationEvent = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], source = "aws.s3", time = time.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("detail-type")("Object Restore Expired")
    __obj.asInstanceOf[S3ObjectRestoreExpiredNotificationEvent]
  }
  
  extension [Self <: S3ObjectRestoreExpiredNotificationEvent](x: Self) {
    
    inline def setSource(value: awsDots3): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
