package typings.activexMshtml

import typings.activexMshtml.MSHTML.IHTMLEventObj
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPEvtObj extends js.Object {
  val pEvtObj: IHTMLEventObj
}

object AnonPEvtObj {
  @scala.inline
  def apply(pEvtObj: IHTMLEventObj): AnonPEvtObj = {
    val __obj = js.Dynamic.literal(pEvtObj = pEvtObj.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPEvtObj]
  }
}

