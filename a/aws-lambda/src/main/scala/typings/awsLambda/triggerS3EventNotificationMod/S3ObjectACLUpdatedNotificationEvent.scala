package typings.awsLambda.triggerS3EventNotificationMod

import typings.awsLambda.awsLambdaStrings.`Object ACL Updated`
import typings.awsLambda.awsLambdaStrings.awsDots3
import typings.awsLambda.triggerEventbridgeMod.EventBridgeEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3ObjectACLUpdatedNotificationEvent
  extends StObject
     with EventBridgeEvent[`Object ACL Updated`, S3ObjectACLUpdatedNotificationEventDetail]
     with S3NotificationEvent {
  
  @JSName("source")
  var source_S3ObjectACLUpdatedNotificationEvent: awsDots3
}
object S3ObjectACLUpdatedNotificationEvent {
  
  inline def apply(
    account: String,
    detail: S3ObjectACLUpdatedNotificationEventDetail,
    id: String,
    region: String,
    resources: js.Array[String],
    time: String,
    version: String
  ): S3ObjectACLUpdatedNotificationEvent = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], source = "aws.s3", time = time.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("detail-type")("Object ACL Updated")
    __obj.asInstanceOf[S3ObjectACLUpdatedNotificationEvent]
  }
  
  extension [Self <: S3ObjectACLUpdatedNotificationEvent](x: Self) {
    
    inline def setSource(value: awsDots3): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
