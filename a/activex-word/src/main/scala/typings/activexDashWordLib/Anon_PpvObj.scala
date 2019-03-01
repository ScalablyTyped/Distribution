package typings
package activexDashWordLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PpvObj extends js.Object {
  var ppvObj: js.UndefOr[scala.Nothing]
  val riid: activexDashStdoleLib.stdoleNs.GUID
}

object Anon_PpvObj {
  @scala.inline
  def apply(riid: activexDashStdoleLib.stdoleNs.GUID, ppvObj: js.UndefOr[scala.Nothing] = js.undefined): Anon_PpvObj = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("riid")(riid)
    if (!js.isUndefined(ppvObj)) __obj.updateDynamic("ppvObj")(ppvObj)
    __obj.asInstanceOf[Anon_PpvObj]
  }
}

