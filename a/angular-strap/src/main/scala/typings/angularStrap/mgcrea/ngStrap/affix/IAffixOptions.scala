package typings.angularStrap.mgcrea.ngStrap.affix

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAffixOptions extends js.Object {
  var offsetBottom: js.UndefOr[Double] = js.undefined
  var offsetParent: js.UndefOr[Double] = js.undefined
  var offsetTop: js.UndefOr[Double] = js.undefined
  var offsetUnpin: js.UndefOr[Double] = js.undefined
}

object IAffixOptions {
  @scala.inline
  def apply(
    offsetBottom: js.UndefOr[Double] = js.undefined,
    offsetParent: js.UndefOr[Double] = js.undefined,
    offsetTop: js.UndefOr[Double] = js.undefined,
    offsetUnpin: js.UndefOr[Double] = js.undefined
  ): IAffixOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(offsetBottom)) __obj.updateDynamic("offsetBottom")(offsetBottom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetParent)) __obj.updateDynamic("offsetParent")(offsetParent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetTop)) __obj.updateDynamic("offsetTop")(offsetTop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetUnpin)) __obj.updateDynamic("offsetUnpin")(offsetUnpin.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAffixOptions]
  }
}

