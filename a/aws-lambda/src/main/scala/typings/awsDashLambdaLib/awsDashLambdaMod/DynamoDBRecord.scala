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

