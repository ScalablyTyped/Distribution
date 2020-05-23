package typings.activexMshtml.anon

import typings.activexMshtml.MSHTML.IHTMLEventObj
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PEvtObj extends js.Object {
  val pEvtObj: IHTMLEventObj
}

object PEvtObj {
  @scala.inline
  def apply(pEvtObj: IHTMLEventObj): PEvtObj = {
    val __obj = js.Dynamic.literal(pEvtObj = pEvtObj.asInstanceOf[js.Any])
    __obj.asInstanceOf[PEvtObj]
  }
}

