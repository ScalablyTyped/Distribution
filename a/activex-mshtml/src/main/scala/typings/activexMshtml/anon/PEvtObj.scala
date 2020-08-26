package typings.activexMshtml.anon

import typings.activexMshtml.MSHTML.IHTMLEventObj
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PEvtObj extends js.Object {
  val pEvtObj: IHTMLEventObj = js.native
}

object PEvtObj {
  @scala.inline
  def apply(pEvtObj: IHTMLEventObj): PEvtObj = {
    val __obj = js.Dynamic.literal(pEvtObj = pEvtObj.asInstanceOf[js.Any])
    __obj.asInstanceOf[PEvtObj]
  }
  @scala.inline
  implicit class PEvtObjOps[Self <: PEvtObj] (val x: Self) extends AnyVal {
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
    def setPEvtObj(value: IHTMLEventObj): Self = this.set("pEvtObj", value.asInstanceOf[js.Any])
  }
  
}

