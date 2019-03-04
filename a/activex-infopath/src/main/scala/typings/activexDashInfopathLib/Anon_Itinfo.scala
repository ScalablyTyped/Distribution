package typings
package activexDashInfopathLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Itinfo extends js.Object {
  val itinfo: scala.Double
  val lcid: scala.Double
  var pptinfo: js.UndefOr[scala.Nothing]
}

object Anon_Itinfo {
  @scala.inline
  def apply(itinfo: scala.Double, lcid: scala.Double, pptinfo: js.UndefOr[scala.Nothing] = js.undefined): Anon_Itinfo = {
    val __obj = js.Dynamic.literal(itinfo = itinfo, lcid = lcid)
    if (!js.isUndefined(pptinfo)) __obj.updateDynamic("pptinfo")(pptinfo)
    __obj.asInstanceOf[Anon_Itinfo]
  }
}

