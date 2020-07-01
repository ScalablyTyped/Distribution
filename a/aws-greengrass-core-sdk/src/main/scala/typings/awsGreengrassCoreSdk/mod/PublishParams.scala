package typings.awsGreengrassCoreSdk.mod

import typings.awsGreengrassCoreSdk.awsGreengrassCoreSdkStrings.AllOrError
import typings.awsGreengrassCoreSdk.awsGreengrassCoreSdkStrings.BestEffort
import typings.node.Buffer
import typings.std.ArrayLike
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublishParams extends js.Object {
  var payload: Buffer | Blob | String | ArrayLike[_]
  var queueFullPolicy: js.UndefOr[AllOrError | BestEffort] = js.undefined
  var topic: String
}

object PublishParams {
  @scala.inline
  def apply(
    payload: Buffer | Blob | String | ArrayLike[_],
    topic: String,
    queueFullPolicy: AllOrError | BestEffort = null
  ): PublishParams = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    if (queueFullPolicy != null) __obj.updateDynamic("queueFullPolicy")(queueFullPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishParams]
  }
}

