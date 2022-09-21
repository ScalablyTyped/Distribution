package typings.awsLambda.s3EventNotificationMod

import typings.awsLambda.awsLambdaStrings.`Object Restore Initiated`
import typings.awsLambda.awsLambdaStrings.awsDots3
import typings.awsLambda.eventbridgeMod.EventBridgeEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3ObjectRestoreInitiatedNotificationEvent
  extends StObject
     with EventBridgeEvent[`Object Restore Initiated`, S3ObjectRestoreInitiatedNotificationEventDetail]
     with S3NotificationEvent {
  
  @JSName("source")
  var source_S3ObjectRestoreInitiatedNotificationEvent: awsDots3
}
object S3ObjectRestoreInitiatedNotificationEvent {
  
  inline def apply(
    account: String,
    detail: S3ObjectRestoreInitiatedNotificationEventDetail,
    id: String,
    region: String,
    resources: js.Array[String],
    time: String,
    version: String
  ): S3ObjectRestoreInitiatedNotificationEvent = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], source = "aws.s3", time = time.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("detail-type")("Object Restore Initiated")
    __obj.asInstanceOf[S3ObjectRestoreInitiatedNotificationEvent]
  }
  
  extension [Self <: S3ObjectRestoreInitiatedNotificationEvent](x: Self) {
    
    inline def setSource(value: awsDots3): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
