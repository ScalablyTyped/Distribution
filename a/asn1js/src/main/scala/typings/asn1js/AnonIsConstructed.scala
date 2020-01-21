package typings.asn1js

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIsConstructed extends js.Object {
  var isConstructed: js.UndefOr[Boolean] = js.undefined
  var tagClass: js.UndefOr[Double] = js.undefined
  var tagNumber: js.UndefOr[Double] = js.undefined
}

object AnonIsConstructed {
  @scala.inline
  def apply(
    isConstructed: js.UndefOr[Boolean] = js.undefined,
    tagClass: Int | Double = null,
    tagNumber: Int | Double = null
  ): AnonIsConstructed = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isConstructed)) __obj.updateDynamic("isConstructed")(isConstructed.asInstanceOf[js.Any])
    if (tagClass != null) __obj.updateDynamic("tagClass")(tagClass.asInstanceOf[js.Any])
    if (tagNumber != null) __obj.updateDynamic("tagNumber")(tagNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIsConstructed]
  }
}

