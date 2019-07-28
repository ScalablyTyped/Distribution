package typings.angularDashStrap.mgcreaNs.ngStrapNs.affixNs

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
    offsetBottom: Int | Double = null,
    offsetParent: Int | Double = null,
    offsetTop: Int | Double = null,
    offsetUnpin: Int | Double = null
  ): IAffixOptions = {
    val __obj = js.Dynamic.literal()
    if (offsetBottom != null) __obj.updateDynamic("offsetBottom")(offsetBottom.asInstanceOf[js.Any])
    if (offsetParent != null) __obj.updateDynamic("offsetParent")(offsetParent.asInstanceOf[js.Any])
    if (offsetTop != null) __obj.updateDynamic("offsetTop")(offsetTop.asInstanceOf[js.Any])
    if (offsetUnpin != null) __obj.updateDynamic("offsetUnpin")(offsetUnpin.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAffixOptions]
  }
}

