package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISVGElementInstance extends js.Object {
  @JSName("MSHTML.ISVGElementInstance_typekey")
  var MSHTMLDotISVGElementInstance_typekey: ISVGElementInstance
  val childNodes: ISVGElementInstanceList
  val correspondingElement: ISVGElement
  val correspondingUseElement: ISVGUseElement
  val firstChild: ISVGElementInstance
  val lastChild: ISVGElementInstance
  val nextSibling: ISVGElementInstance
  val parentNode: ISVGElementInstance
  val previousSibling: ISVGElementInstance
}

object ISVGElementInstance {
  @scala.inline
  def apply(
    MSHTMLDotISVGElementInstance_typekey: ISVGElementInstance,
    childNodes: ISVGElementInstanceList,
    correspondingElement: ISVGElement,
    correspondingUseElement: ISVGUseElement,
    firstChild: ISVGElementInstance,
    lastChild: ISVGElementInstance,
    nextSibling: ISVGElementInstance,
    parentNode: ISVGElementInstance,
    previousSibling: ISVGElementInstance
  ): ISVGElementInstance = {
    val __obj = js.Dynamic.literal(childNodes = childNodes.asInstanceOf[js.Any], correspondingElement = correspondingElement.asInstanceOf[js.Any], correspondingUseElement = correspondingUseElement.asInstanceOf[js.Any], firstChild = firstChild.asInstanceOf[js.Any], lastChild = lastChild.asInstanceOf[js.Any], nextSibling = nextSibling.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any], previousSibling = previousSibling.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.ISVGElementInstance_typekey")(MSHTMLDotISVGElementInstance_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISVGElementInstance]
  }
}

