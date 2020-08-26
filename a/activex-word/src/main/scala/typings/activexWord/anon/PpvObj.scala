package typings.activexWord.anon

import typings.activexStdole.stdole.GUID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PpvObj extends js.Object {
  var ppvObj: js.UndefOr[scala.Nothing] = js.native
  val riid: GUID = js.native
}

object PpvObj {
  @scala.inline
  def apply(riid: GUID): PpvObj = {
    val __obj = js.Dynamic.literal(riid = riid.asInstanceOf[js.Any])
    __obj.asInstanceOf[PpvObj]
  }
  @scala.inline
  implicit class PpvObjOps[Self <: PpvObj] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRiid(value: GUID): Self = this.set("riid", value.asInstanceOf[js.Any])
  }
  
}

