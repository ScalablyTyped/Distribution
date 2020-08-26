package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISVGElementInstance extends js.Object {
  @JSName("MSHTML.ISVGElementInstance_typekey")
  var MSHTMLDotISVGElementInstance_typekey: ISVGElementInstance = js.native
  val childNodes: ISVGElementInstanceList = js.native
  val correspondingElement: ISVGElement = js.native
  val correspondingUseElement: ISVGUseElement = js.native
  val firstChild: ISVGElementInstance = js.native
  val lastChild: ISVGElementInstance = js.native
  val nextSibling: ISVGElementInstance = js.native
  val parentNode: ISVGElementInstance = js.native
  val previousSibling: ISVGElementInstance = js.native
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
  @scala.inline
  implicit class ISVGElementInstanceOps[Self <: ISVGElementInstance] (val x: Self) extends AnyVal {
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
    def setMSHTMLDotISVGElementInstance_typekey(value: ISVGElementInstance): Self = this.set("MSHTML.ISVGElementInstance_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildNodes(value: ISVGElementInstanceList): Self = this.set("childNodes", value.asInstanceOf[js.Any])
    @scala.inline
    def setCorrespondingElement(value: ISVGElement): Self = this.set("correspondingElement", value.asInstanceOf[js.Any])
    @scala.inline
    def setCorrespondingUseElement(value: ISVGUseElement): Self = this.set("correspondingUseElement", value.asInstanceOf[js.Any])
    @scala.inline
    def setFirstChild(value: ISVGElementInstance): Self = this.set("firstChild", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastChild(value: ISVGElementInstance): Self = this.set("lastChild", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextSibling(value: ISVGElementInstance): Self = this.set("nextSibling", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentNode(value: ISVGElementInstance): Self = this.set("parentNode", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreviousSibling(value: ISVGElementInstance): Self = this.set("previousSibling", value.asInstanceOf[js.Any])
  }
  
}

