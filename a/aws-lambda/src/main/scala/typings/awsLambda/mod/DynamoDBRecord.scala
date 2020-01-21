package typings.awsLambda.mod

import typings.awsLambda.awsLambdaStrings.INSERT
import typings.awsLambda.awsLambdaStrings.MODIFY
import typings.awsLambda.awsLambdaStrings.REMOVE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynamoDBRecord extends js.Object {
  var awsRegion: js.UndefOr[String] = js.undefined
  var dynamodb: js.UndefOr[StreamRecord] = js.undefined
  var eventID: js.UndefOr[String] = js.undefined
  var eventName: js.UndefOr[INSERT | MODIFY | REMOVE] = js.undefined
  var eventSource: js.UndefOr[String] = js.undefined
  var eventSourceARN: js.UndefOr[String] = js.undefined
  var eventVersion: js.UndefOr[String] = js.undefined
  var userIdentity: js.UndefOr[js.Any] = js.undefined
}

object DynamoDBRecord {
  @scala.inline
  def apply(
    awsRegion: String = null,
    dynamodb: StreamRecord = null,
    eventID: String = null,
    eventName: INSERT | MODIFY | REMOVE = null,
    eventSource: String = null,
    eventSourceARN: String = null,
    eventVersion: String = null,
    userIdentity: js.Any = null
  ): DynamoDBRecord = {
    val __obj = js.Dynamic.literal()
    if (awsRegion != null) __obj.updateDynamic("awsRegion")(awsRegion.asInstanceOf[js.Any])
    if (dynamodb != null) __obj.updateDynamic("dynamodb")(dynamodb.asInstanceOf[js.Any])
    if (eventID != null) __obj.updateDynamic("eventID")(eventID.asInstanceOf[js.Any])
    if (eventName != null) __obj.updateDynamic("eventName")(eventName.asInstanceOf[js.Any])
    if (eventSource != null) __obj.updateDynamic("eventSource")(eventSource.asInstanceOf[js.Any])
    if (eventSourceARN != null) __obj.updateDynamic("eventSourceARN")(eventSourceARN.asInstanceOf[js.Any])
    if (eventVersion != null) __obj.updateDynamic("eventVersion")(eventVersion.asInstanceOf[js.Any])
    if (userIdentity != null) __obj.updateDynamic("userIdentity")(userIdentity.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamoDBRecord]
  }
}

