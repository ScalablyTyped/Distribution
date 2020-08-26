package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to remove text contents before or after existing text contents.
  * @deprecated Deprecated
  */
@js.native
trait XRelativeTextContentRemove extends XInterface {
  /**
    * removes the text content that follows the argument.
    *
    * This is helpful to remove empty paragraphs following text tables especially in headers, footers or text frames.
    */
  def removeTextContentAfter(xPredecessor: XTextContent): Unit = js.native
  /**
    * removes the text content that precedes the argument.
    *
    * This is helpful to remove empty paragraphs before text tables.
    */
  def removeTextContentBefore(xSuccessor: XTextContent): Unit = js.native
}

object XRelativeTextContentRemove {
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeTextContentAfter: XTextContent => Unit,
    removeTextContentBefore: XTextContent => Unit
  ): XRelativeTextContentRemove = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeTextContentAfter = js.Any.fromFunction1(removeTextContentAfter), removeTextContentBefore = js.Any.fromFunction1(removeTextContentBefore))
    __obj.asInstanceOf[XRelativeTextContentRemove]
  }
  @scala.inline
  implicit class XRelativeTextContentRemoveOps[Self <: XRelativeTextContentRemove] (val x: Self) extends AnyVal {
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
    def setRemoveTextContentAfter(value: XTextContent => Unit): Self = this.set("removeTextContentAfter", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveTextContentBefore(value: XTextContent => Unit): Self = this.set("removeTextContentBefore", js.Any.fromFunction1(value))
  }
  
}

