package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeWalker extends js.Object {
  @JSName("MSHTML.TreeWalker_typekey")
  var MSHTMLDotTreeWalker_typekey: TreeWalker = js.native
  var currentNode: js.Any = js.native
  val expandEntityReferences: Boolean = js.native
  val filter: js.Any = js.native
  val root: js.Any = js.native
  val whatToShow: Double = js.native
  def firstChild(): js.Any = js.native
  def lastChild(): js.Any = js.native
  def nextNode(): js.Any = js.native
  def nextSibling(): js.Any = js.native
  def parentNode(): js.Any = js.native
  def previousNode(): js.Any = js.native
  def previousSibling(): js.Any = js.native
}

object TreeWalker {
  @scala.inline
  def apply(
    MSHTMLDotTreeWalker_typekey: TreeWalker,
    currentNode: js.Any,
    expandEntityReferences: Boolean,
    filter: js.Any,
    firstChild: () => js.Any,
    lastChild: () => js.Any,
    nextNode: () => js.Any,
    nextSibling: () => js.Any,
    parentNode: () => js.Any,
    previousNode: () => js.Any,
    previousSibling: () => js.Any,
    root: js.Any,
    whatToShow: Double
  ): TreeWalker = {
    val __obj = js.Dynamic.literal(currentNode = currentNode.asInstanceOf[js.Any], expandEntityReferences = expandEntityReferences.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], firstChild = js.Any.fromFunction0(firstChild), lastChild = js.Any.fromFunction0(lastChild), nextNode = js.Any.fromFunction0(nextNode), nextSibling = js.Any.fromFunction0(nextSibling), parentNode = js.Any.fromFunction0(parentNode), previousNode = js.Any.fromFunction0(previousNode), previousSibling = js.Any.fromFunction0(previousSibling), root = root.asInstanceOf[js.Any], whatToShow = whatToShow.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.TreeWalker_typekey")(MSHTMLDotTreeWalker_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeWalker]
  }
  @scala.inline
  implicit class TreeWalkerOps[Self <: TreeWalker] (val x: Self) extends AnyVal {
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
    def setMSHTMLDotTreeWalker_typekey(value: TreeWalker): Self = this.set("MSHTML.TreeWalker_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentNode(value: js.Any): Self = this.set("currentNode", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpandEntityReferences(value: Boolean): Self = this.set("expandEntityReferences", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilter(value: js.Any): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def setFirstChild(value: () => js.Any): Self = this.set("firstChild", js.Any.fromFunction0(value))
    @scala.inline
    def setLastChild(value: () => js.Any): Self = this.set("lastChild", js.Any.fromFunction0(value))
    @scala.inline
    def setNextNode(value: () => js.Any): Self = this.set("nextNode", js.Any.fromFunction0(value))
    @scala.inline
    def setNextSibling(value: () => js.Any): Self = this.set("nextSibling", js.Any.fromFunction0(value))
    @scala.inline
    def setParentNode(value: () => js.Any): Self = this.set("parentNode", js.Any.fromFunction0(value))
    @scala.inline
    def setPreviousNode(value: () => js.Any): Self = this.set("previousNode", js.Any.fromFunction0(value))
    @scala.inline
    def setPreviousSibling(value: () => js.Any): Self = this.set("previousSibling", js.Any.fromFunction0(value))
    @scala.inline
    def setRoot(value: js.Any): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def setWhatToShow(value: Double): Self = this.set("whatToShow", value.asInstanceOf[js.Any])
  }
  
}

