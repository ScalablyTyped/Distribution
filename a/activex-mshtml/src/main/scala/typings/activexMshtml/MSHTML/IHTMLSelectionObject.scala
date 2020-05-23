package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHTMLSelectionObject extends js.Object {
  @JSName("MSHTML.IHTMLSelectionObject_typekey")
  var MSHTMLDotIHTMLSelectionObject_typekey: IHTMLSelectionObject
  val `type`: String
  def clear(): Unit
  def createRange(): js.Any
  def empty(): Unit
}

object IHTMLSelectionObject {
  @scala.inline
  def apply(
    MSHTMLDotIHTMLSelectionObject_typekey: IHTMLSelectionObject,
    clear: () => Unit,
    createRange: () => js.Any,
    empty: () => Unit,
    `type`: String
  ): IHTMLSelectionObject = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), createRange = js.Any.fromFunction0(createRange), empty = js.Any.fromFunction0(empty))
    __obj.updateDynamic("MSHTML.IHTMLSelectionObject_typekey")(MSHTMLDotIHTMLSelectionObject_typekey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLSelectionObject]
  }
}

