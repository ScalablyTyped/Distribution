package typings.awsLambda.triggerS3EventNotificationMod

import typings.awsLambda.awsLambdaStrings.`Object Access Tier Changed`
import typings.awsLambda.awsLambdaStrings.awsDots3
import typings.awsLambda.triggerEventbridgeMod.EventBridgeEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3ObjectAccessTierChangedNotificationEvent
  extends StObject
     with EventBridgeEvent[`Object Access Tier Changed`, S3ObjectAccessTierChangedNotificationEventDetail]
     with S3NotificationEvent {
  
  @JSName("source")
  var source_S3ObjectAccessTierChangedNotificationEvent: awsDots3
}
object S3ObjectAccessTierChangedNotificationEvent {
  
  inline def apply(
    account: String,
    detail: S3ObjectAccessTierChangedNotificationEventDetail,
    id: String,
    region: String,
    resources: js.Array[String],
    time: String,
    version: String
  ): S3ObjectAccessTierChangedNotificationEvent = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], source = "aws.s3", time = time.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("detail-type")("Object Access Tier Changed")
    __obj.asInstanceOf[S3ObjectAccessTierChangedNotificationEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: S3ObjectAccessTierChangedNotificationEvent] (val x: Self) extends AnyVal {
    
    inline def setSource(value: awsDots3): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
