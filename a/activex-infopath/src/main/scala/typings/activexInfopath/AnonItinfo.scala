package typings.activexInfopath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItinfo extends js.Object {
  val itinfo: Double
  val lcid: Double
  var pptinfo: js.UndefOr[scala.Nothing] = js.undefined
}

object AnonItinfo {
  @scala.inline
  def apply(itinfo: Double, lcid: Double, pptinfo: js.UndefOr[scala.Nothing] = js.undefined): AnonItinfo = {
    val __obj = js.Dynamic.literal(itinfo = itinfo.asInstanceOf[js.Any], lcid = lcid.asInstanceOf[js.Any])
    if (!js.isUndefined(pptinfo)) __obj.updateDynamic("pptinfo")(pptinfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItinfo]
  }
}

