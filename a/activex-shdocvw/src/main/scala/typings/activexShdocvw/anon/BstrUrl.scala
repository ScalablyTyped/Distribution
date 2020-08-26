package typings.activexShdocvw.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BstrUrl extends js.Object {
  var Cancel: Boolean = js.native
  val bstrUrl: String = js.native
  val bstrUrlContext: String = js.native
  val dwFlags: Double = js.native
  var ppDisp: js.Any = js.native
}

object BstrUrl {
  @scala.inline
  def apply(Cancel: Boolean, bstrUrl: String, bstrUrlContext: String, dwFlags: Double, ppDisp: js.Any): BstrUrl = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], bstrUrl = bstrUrl.asInstanceOf[js.Any], bstrUrlContext = bstrUrlContext.asInstanceOf[js.Any], dwFlags = dwFlags.asInstanceOf[js.Any], ppDisp = ppDisp.asInstanceOf[js.Any])
    __obj.asInstanceOf[BstrUrl]
  }
  @scala.inline
  implicit class BstrUrlOps[Self <: BstrUrl] (val x: Self) extends AnyVal {
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
    def setCancel(value: Boolean): Self = this.set("Cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def setBstrUrl(value: String): Self = this.set("bstrUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setBstrUrlContext(value: String): Self = this.set("bstrUrlContext", value.asInstanceOf[js.Any])
    @scala.inline
    def setDwFlags(value: Double): Self = this.set("dwFlags", value.asInstanceOf[js.Any])
    @scala.inline
    def setPpDisp(value: js.Any): Self = this.set("ppDisp", value.asInstanceOf[js.Any])
  }
  
}

