package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeIterator extends js.Object {
  @JSName("MSHTML.NodeIterator_typekey")
  var MSHTMLDotNodeIterator_typekey: NodeIterator
  val expandEntityReferences: Boolean
  val filter: js.Any
  val root: js.Any
  val whatToShow: Double
  def Detach(): Unit
  def nextNode(): js.Any
  def previousNode(): js.Any
}

object NodeIterator {
  @scala.inline
  def apply(
    Detach: () => Unit,
    MSHTMLDotNodeIterator_typekey: NodeIterator,
    expandEntityReferences: Boolean,
    filter: js.Any,
    nextNode: () => js.Any,
    previousNode: () => js.Any,
    root: js.Any,
    whatToShow: Double
  ): NodeIterator = {
    val __obj = js.Dynamic.literal(Detach = js.Any.fromFunction0(Detach), expandEntityReferences = expandEntityReferences.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], nextNode = js.Any.fromFunction0(nextNode), previousNode = js.Any.fromFunction0(previousNode), root = root.asInstanceOf[js.Any], whatToShow = whatToShow.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.NodeIterator_typekey")(MSHTMLDotNodeIterator_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeIterator]
  }
}

