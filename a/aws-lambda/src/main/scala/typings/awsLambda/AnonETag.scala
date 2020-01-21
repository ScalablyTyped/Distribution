package typings.awsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonETag extends js.Object {
  var eTag: String
  var key: String
  var sequencer: String
  var size: Double
  var versionId: js.UndefOr[String] = js.undefined
}

object AnonETag {
  @scala.inline
  def apply(eTag: String, key: String, sequencer: String, size: Double, versionId: String = null): AnonETag = {
    val __obj = js.Dynamic.literal(eTag = eTag.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], sequencer = sequencer.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    if (versionId != null) __obj.updateDynamic("versionId")(versionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonETag]
  }
}

