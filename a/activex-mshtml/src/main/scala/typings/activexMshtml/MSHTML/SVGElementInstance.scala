package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGElementInstance extends js.Object {
  @JSName("MSHTML.SVGElementInstance_typekey")
  var MSHTMLDotSVGElementInstance_typekey: SVGElementInstance
  val childNodes: ISVGElementInstanceList
  val correspondingElement: ISVGElement
  val correspondingUseElement: ISVGUseElement
  val firstChild: ISVGElementInstance
  val lastChild: ISVGElementInstance
  val nextSibling: ISVGElementInstance
  val parentNode: ISVGElementInstance
  val previousSibling: ISVGElementInstance
  def addEventListener(`type`: String, listener: js.Any, useCapture: Boolean): Unit
  def dispatchEvent(evt: IDOMEvent): Boolean
  def removeEventListener(`type`: String, listener: js.Any, useCapture: Boolean): Unit
}

object SVGElementInstance {
  @scala.inline
  def apply(
    MSHTMLDotSVGElementInstance_typekey: SVGElementInstance,
    addEventListener: (String, js.Any, Boolean) => Unit,
    childNodes: ISVGElementInstanceList,
    correspondingElement: ISVGElement,
    correspondingUseElement: ISVGUseElement,
    dispatchEvent: IDOMEvent => Boolean,
    firstChild: ISVGElementInstance,
    lastChild: ISVGElementInstance,
    nextSibling: ISVGElementInstance,
    parentNode: ISVGElementInstance,
    previousSibling: ISVGElementInstance,
    removeEventListener: (String, js.Any, Boolean) => Unit
  ): SVGElementInstance = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction3(addEventListener), childNodes = childNodes.asInstanceOf[js.Any], correspondingElement = correspondingElement.asInstanceOf[js.Any], correspondingUseElement = correspondingUseElement.asInstanceOf[js.Any], dispatchEvent = js.Any.fromFunction1(dispatchEvent), firstChild = firstChild.asInstanceOf[js.Any], lastChild = lastChild.asInstanceOf[js.Any], nextSibling = nextSibling.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any], previousSibling = previousSibling.asInstanceOf[js.Any], removeEventListener = js.Any.fromFunction3(removeEventListener))
    __obj.updateDynamic("MSHTML.SVGElementInstance_typekey")(MSHTMLDotSVGElementInstance_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGElementInstance]
  }
}

