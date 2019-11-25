package typings.activexDashExcel

import typings.activexDashStdole.stdole.GUID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PpvObj extends js.Object {
  var ppvObj: js.UndefOr[scala.Nothing] = js.undefined
  val riid: GUID
}

object Anon_PpvObj {
  @scala.inline
  def apply(riid: GUID, ppvObj: js.UndefOr[scala.Nothing] = js.undefined): Anon_PpvObj = {
    val __obj = js.Dynamic.literal(riid = riid.asInstanceOf[js.Any])
    if (!js.isUndefined(ppvObj)) __obj.updateDynamic("ppvObj")(ppvObj.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_PpvObj]
  }
}

