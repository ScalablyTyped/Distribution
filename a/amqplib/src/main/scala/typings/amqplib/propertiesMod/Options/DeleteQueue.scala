package typings.amqplib.propertiesMod.Options

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteQueue extends js.Object {
  var ifEmpty: js.UndefOr[Boolean] = js.undefined
  var ifUnused: js.UndefOr[Boolean] = js.undefined
}

object DeleteQueue {
  @scala.inline
  def apply(ifEmpty: js.UndefOr[Boolean] = js.undefined, ifUnused: js.UndefOr[Boolean] = js.undefined): DeleteQueue = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ifEmpty)) __obj.updateDynamic("ifEmpty")(ifEmpty)
    if (!js.isUndefined(ifUnused)) __obj.updateDynamic("ifUnused")(ifUnused)
    __obj.asInstanceOf[DeleteQueue]
  }
}

