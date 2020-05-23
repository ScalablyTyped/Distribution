package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHTMLEventObj extends js.Object {
  @JSName("MSHTML.IHTMLEventObj_typekey")
  var MSHTMLDotIHTMLEventObj_typekey: IHTMLEventObj
  val altKey: Boolean
  val button: Double
  var cancelBubble: Boolean
  val clientX: Double
  val clientY: Double
  val ctrlKey: Boolean
  val fromElement: IHTMLElement
  var keyCode: Double
  val offsetX: Double
  val offsetY: Double
  val qualifier: String
  val reason: Double
  var returnValue: js.Any
  val screenX: Double
  val screenY: Double
  val shiftKey: Boolean
  val srcElement: IHTMLElement
  val srcFilter: js.Any
  val toElement: IHTMLElement
  val `type`: String
  val x: Double
  val y: Double
}

object IHTMLEventObj {
  @scala.inline
  def apply(
    MSHTMLDotIHTMLEventObj_typekey: IHTMLEventObj,
    altKey: Boolean,
    button: Double,
    cancelBubble: Boolean,
    clientX: Double,
    clientY: Double,
    ctrlKey: Boolean,
    fromElement: IHTMLElement,
    keyCode: Double,
    offsetX: Double,
    offsetY: Double,
    qualifier: String,
    reason: Double,
    returnValue: js.Any,
    screenX: Double,
    screenY: Double,
    shiftKey: Boolean,
    srcElement: IHTMLElement,
    srcFilter: js.Any,
    toElement: IHTMLElement,
    `type`: String,
    x: Double,
    y: Double
  ): IHTMLEventObj = {
    val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], cancelBubble = cancelBubble.asInstanceOf[js.Any], clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], fromElement = fromElement.asInstanceOf[js.Any], keyCode = keyCode.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], qualifier = qualifier.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any], screenX = screenX.asInstanceOf[js.Any], screenY = screenY.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any], srcElement = srcElement.asInstanceOf[js.Any], srcFilter = srcFilter.asInstanceOf[js.Any], toElement = toElement.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.IHTMLEventObj_typekey")(MSHTMLDotIHTMLEventObj_typekey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLEventObj]
  }
}

