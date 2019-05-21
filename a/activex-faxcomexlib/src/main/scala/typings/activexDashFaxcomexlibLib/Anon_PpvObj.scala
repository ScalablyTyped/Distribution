package typings
package activexDashFaxcomexlibLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PpvObj extends js.Object {
  var ppvObj: js.UndefOr[scala.Nothing] = js.undefined
  val riid: activexDashStdoleLib.stdoleNs.GUID
}

object Anon_PpvObj {
  @scala.inline
  def apply(riid: activexDashStdoleLib.stdoleNs.GUID, ppvObj: js.UndefOr[scala.Nothing] = js.undefined): Anon_PpvObj = {
    val __obj = js.Dynamic.literal(riid = riid)
    if (!js.isUndefined(ppvObj)) __obj.updateDynamic("ppvObj")(ppvObj)
    __obj.asInstanceOf[Anon_PpvObj]
  }
}

