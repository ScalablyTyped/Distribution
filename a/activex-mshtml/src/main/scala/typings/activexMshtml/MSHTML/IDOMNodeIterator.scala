package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDOMNodeIterator extends js.Object {
  @JSName("MSHTML.IDOMNodeIterator_typekey")
  var MSHTMLDotIDOMNodeIterator_typekey: IDOMNodeIterator
  val expandEntityReferences: Boolean
  val filter: js.Any
  val root: js.Any
  val whatToShow: Double
  def Detach(): Unit
  def nextNode(): js.Any
  def previousNode(): js.Any
}

object IDOMNodeIterator {
  @scala.inline
  def apply(
    Detach: () => Unit,
    MSHTMLDotIDOMNodeIterator_typekey: IDOMNodeIterator,
    expandEntityReferences: Boolean,
    filter: js.Any,
    nextNode: () => js.Any,
    previousNode: () => js.Any,
    root: js.Any,
    whatToShow: Double
  ): IDOMNodeIterator = {
    val __obj = js.Dynamic.literal(Detach = js.Any.fromFunction0(Detach), expandEntityReferences = expandEntityReferences.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], nextNode = js.Any.fromFunction0(nextNode), previousNode = js.Any.fromFunction0(previousNode), root = root.asInstanceOf[js.Any], whatToShow = whatToShow.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.IDOMNodeIterator_typekey")(MSHTMLDotIDOMNodeIterator_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDOMNodeIterator]
  }
}

