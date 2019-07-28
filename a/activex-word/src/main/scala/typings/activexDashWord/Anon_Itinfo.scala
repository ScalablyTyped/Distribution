package typings.activexDashWord

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
    val __obj = js.Dynamic.literal(itinfo = itinfo, lcid = lcid)
    if (!js.isUndefined(pptinfo)) __obj.updateDynamic("pptinfo")(pptinfo)
    __obj.asInstanceOf[Anon_Itinfo]
  }
}

