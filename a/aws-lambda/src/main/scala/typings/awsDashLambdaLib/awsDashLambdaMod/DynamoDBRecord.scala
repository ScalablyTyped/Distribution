package typings
package awsDashLambdaLib.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynamoDBRecord extends js.Object {
  var awsRegion: js.UndefOr[java.lang.String] = js.undefined
  var dynamodb: js.UndefOr[StreamRecord] = js.undefined
  var eventID: js.UndefOr[java.lang.String] = js.undefined
  var eventName: js.UndefOr[
    awsDashLambdaLib.awsDashLambdaLibStrings.INSERT | awsDashLambdaLib.awsDashLambdaLibStrings.MODIFY | awsDashLambdaLib.awsDashLambdaLibStrings.REMOVE
  ] = js.undefined
  var eventSource: js.UndefOr[java.lang.String] = js.undefined
  var eventSourceARN: js.UndefOr[java.lang.String] = js.undefined
  var eventVersion: js.UndefOr[java.lang.String] = js.undefined
  var userIdentity: js.UndefOr[js.Any] = js.undefined
}

object DynamoDBRecord {
  @scala.inline
  def apply(
    awsRegion: java.lang.String = null,
    dynamodb: StreamRecord = null,
    eventID: java.lang.String = null,
    eventName: awsDashLambdaLib.awsDashLambdaLibStrings.INSERT | awsDashLambdaLib.awsDashLambdaLibStrings.MODIFY | awsDashLambdaLib.awsDashLambdaLibStrings.REMOVE = null,
    eventSource: java.lang.String = null,
    eventSourceARN: java.lang.String = null,
    eventVersion: java.lang.String = null,
    userIdentity: js.Any = null
  ): DynamoDBRecord = {
    val __obj = js.Dynamic.literal()
    if (awsRegion != null) __obj.updateDynamic("awsRegion")(awsRegion)
    if (dynamodb != null) __obj.updateDynamic("dynamodb")(dynamodb)
    if (eventID != null) __obj.updateDynamic("eventID")(eventID)
    if (eventName != null) __obj.updateDynamic("eventName")(eventName.asInstanceOf[js.Any])
    if (eventSource != null) __obj.updateDynamic("eventSource")(eventSource)
    if (eventSourceARN != null) __obj.updateDynamic("eventSourceARN")(eventSourceARN)
    if (eventVersion != null) __obj.updateDynamic("eventVersion")(eventVersion)
    if (userIdentity != null) __obj.updateDynamic("userIdentity")(userIdentity)
    __obj.asInstanceOf[DynamoDBRecord]
  }
}

