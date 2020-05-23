package typings.awsKcl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitializeInput extends js.Object {
  var sequenceNumber: js.UndefOr[String] = js.undefined
  var shardId: String
  var subSequenceNumber: js.UndefOr[Double] = js.undefined
}

object InitializeInput {
  @scala.inline
  def apply(
    shardId: String,
    sequenceNumber: String = null,
    subSequenceNumber: js.UndefOr[Double] = js.undefined
  ): InitializeInput = {
    val __obj = js.Dynamic.literal(shardId = shardId.asInstanceOf[js.Any])
    if (sequenceNumber != null) __obj.updateDynamic("sequenceNumber")(sequenceNumber.asInstanceOf[js.Any])
    if (!js.isUndefined(subSequenceNumber)) __obj.updateDynamic("subSequenceNumber")(subSequenceNumber.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitializeInput]
  }
}

