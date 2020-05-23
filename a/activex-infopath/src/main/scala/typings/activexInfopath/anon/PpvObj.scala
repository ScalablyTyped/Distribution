package typings.activexInfopath.anon

import typings.activexStdole.stdole.GUID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PpvObj extends js.Object {
  var ppvObj: js.UndefOr[scala.Nothing] = js.undefined
  val riid: GUID
}

object PpvObj {
  @scala.inline
  def apply(riid: GUID): PpvObj = {
    val __obj = js.Dynamic.literal(riid = riid.asInstanceOf[js.Any])
    __obj.asInstanceOf[PpvObj]
  }
}

