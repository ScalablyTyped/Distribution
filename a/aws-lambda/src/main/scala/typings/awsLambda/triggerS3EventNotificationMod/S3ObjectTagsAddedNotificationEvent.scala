package typings.awsLambda.triggerS3EventNotificationMod

import typings.awsLambda.awsLambdaStrings.`Object Tags Added`
import typings.awsLambda.awsLambdaStrings.awsDots3
import typings.awsLambda.triggerEventbridgeMod.EventBridgeEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3ObjectTagsAddedNotificationEvent
  extends StObject
     with EventBridgeEvent[`Object Tags Added`, S3ObjectTagsAddedNotificationEventDetail]
     with S3NotificationEvent {
  
  @JSName("source")
  var source_S3ObjectTagsAddedNotificationEvent: awsDots3
}
object S3ObjectTagsAddedNotificationEvent {
  
  inline def apply(
    account: String,
    detail: S3ObjectTagsAddedNotificationEventDetail,
    id: String,
    region: String,
    resources: js.Array[String],
    time: String,
    version: String
  ): S3ObjectTagsAddedNotificationEvent = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], source = "aws.s3", time = time.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("detail-type")("Object Tags Added")
    __obj.asInstanceOf[S3ObjectTagsAddedNotificationEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: S3ObjectTagsAddedNotificationEvent] (val x: Self) extends AnyVal {
    
    inline def setSource(value: awsDots3): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
