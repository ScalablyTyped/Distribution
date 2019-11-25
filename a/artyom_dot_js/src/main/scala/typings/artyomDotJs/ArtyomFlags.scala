package typings.artyomDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArtyomFlags extends js.Object {
  var restartRecognition: js.UndefOr[Boolean] = js.undefined
}

object ArtyomFlags {
  @scala.inline
  def apply(restartRecognition: js.UndefOr[Boolean] = js.undefined): ArtyomFlags = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(restartRecognition)) __obj.updateDynamic("restartRecognition")(restartRecognition.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtyomFlags]
  }
}

