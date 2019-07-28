package typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to move a text range (e.g. a paragraph by itself) within this text.
  *
  * The movement is specified by the number of paragraphs within the order of paragraphs.
  * @see Text
  */
trait XTextRangeMover extends XInterface {
  /** moves the contents to which **xRange** refers forward or backward. */
  def moveTextRange(xRange: XTextRange, nParagraphs: Double): Unit
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
}

