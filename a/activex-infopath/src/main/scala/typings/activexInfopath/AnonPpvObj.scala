package typings.activexInfopath

import typings.activexStdole.stdole.GUID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPpvObj extends js.Object {
  var ppvObj: js.UndefOr[scala.Nothing] = js.undefined
  val riid: GUID
}

object AnonPpvObj {
  @scala.inline
  def apply(riid: GUID, ppvObj: js.UndefOr[scala.Nothing] = js.undefined): AnonPpvObj = {
    val __obj = js.Dynamic.literal(riid = riid.asInstanceOf[js.Any])
    if (!js.isUndefined(ppvObj)) __obj.updateDynamic("ppvObj")(ppvObj.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPpvObj]
  }
}

