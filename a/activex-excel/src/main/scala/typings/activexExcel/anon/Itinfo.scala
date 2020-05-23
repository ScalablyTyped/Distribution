package typings.activexExcel.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Itinfo extends js.Object {
  val itinfo: Double
  val lcid: Double
  var pptinfo: js.UndefOr[scala.Nothing] = js.undefined
}

object Itinfo {
  @scala.inline
  def apply(itinfo: Double, lcid: Double): Itinfo = {
    val __obj = js.Dynamic.literal(itinfo = itinfo.asInstanceOf[js.Any], lcid = lcid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Itinfo]
  }
}

