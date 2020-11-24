package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to move a text range (e.g. a paragraph by itself) within this text.
  *
  * The movement is specified by the number of paragraphs within the order of paragraphs.
  * @see Text
  */
@js.native
trait XTextRangeMover extends XInterface {
  
  /** moves the contents to which **xRange** refers forward or backward. */
  def moveTextRange(xRange: XTextRange, nParagraphs: Double): Unit = js.native
}
object XTextRangeMover {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    moveTextRange: (XTextRange, Double) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XTextRangeMover = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), moveTextRange = js.Any.fromFunction2(moveTextRange), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XTextRangeMover]
  }
  
  @scala.inline
  implicit class XTextRangeMoverOps[Self <: XTextRangeMover] (val x: Self) extends AnyVal {
    
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
    def setMoveTextRange(value: (XTextRange, Double) => Unit): Self = this.set("moveTextRange", js.Any.fromFunction2(value))
  }
}
