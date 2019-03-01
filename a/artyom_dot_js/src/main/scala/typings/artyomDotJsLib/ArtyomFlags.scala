package typings
package artyomDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArtyomFlags extends js.Object {
  var restartRecognition: js.UndefOr[scala.Boolean] = js.undefined
}

object ArtyomFlags {
  @scala.inline
  def apply(restartRecognition: js.UndefOr[scala.Boolean] = js.undefined): ArtyomFlags = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(restartRecognition)) __obj.updateDynamic("restartRecognition")(restartRecognition)
    __obj.asInstanceOf[ArtyomFlags]
  }
}

