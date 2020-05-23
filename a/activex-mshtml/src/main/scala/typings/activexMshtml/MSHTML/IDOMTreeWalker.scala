package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDOMTreeWalker extends js.Object {
  @JSName("MSHTML.IDOMTreeWalker_typekey")
  var MSHTMLDotIDOMTreeWalker_typekey: IDOMTreeWalker
  var currentNode: js.Any
  val expandEntityReferences: Boolean
  val filter: js.Any
  val root: js.Any
  val whatToShow: Double
  def firstChild(): js.Any
  def lastChild(): js.Any
  def nextNode(): js.Any
  def nextSibling(): js.Any
  def parentNode(): js.Any
  def previousNode(): js.Any
  def previousSibling(): js.Any
}

object IDOMTreeWalker {
  @scala.inline
  def apply(
    MSHTMLDotIDOMTreeWalker_typekey: IDOMTreeWalker,
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
  ): IDOMTreeWalker = {
    val __obj = js.Dynamic.literal(currentNode = currentNode.asInstanceOf[js.Any], expandEntityReferences = expandEntityReferences.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], firstChild = js.Any.fromFunction0(firstChild), lastChild = js.Any.fromFunction0(lastChild), nextNode = js.Any.fromFunction0(nextNode), nextSibling = js.Any.fromFunction0(nextSibling), parentNode = js.Any.fromFunction0(parentNode), previousNode = js.Any.fromFunction0(previousNode), previousSibling = js.Any.fromFunction0(previousSibling), root = root.asInstanceOf[js.Any], whatToShow = whatToShow.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.IDOMTreeWalker_typekey")(MSHTMLDotIDOMTreeWalker_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDOMTreeWalker]
  }
}

