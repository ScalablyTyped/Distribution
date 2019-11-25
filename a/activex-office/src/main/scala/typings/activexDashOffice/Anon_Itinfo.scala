package typings.activexDashOffice

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Itinfo extends js.Object {
  val itinfo: Double
  val lcid: Double
  var pptinfo: js.UndefOr[scala.Nothing] = js.undefined
}

object Anon_Itinfo {
  @scala.inline
  def apply(itinfo: Double, lcid: Double, pptinfo: js.UndefOr[scala.Nothing] = js.undefined): Anon_Itinfo = {
    val __obj = js.Dynamic.literal(itinfo = itinfo.asInstanceOf[js.Any], lcid = lcid.asInstanceOf[js.Any])
    if (!js.isUndefined(pptinfo)) __obj.updateDynamic("pptinfo")(pptinfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Itinfo]
  }
}

