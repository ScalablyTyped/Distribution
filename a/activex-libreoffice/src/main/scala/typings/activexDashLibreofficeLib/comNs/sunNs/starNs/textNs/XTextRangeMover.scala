package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to move a text range (e.g. a paragraph by itself) within this text.
  *
  * The movement is specified by the number of paragraphs within the order of paragraphs.
  * @see Text
  */
trait XTextRangeMover
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** moves the contents to which **xRange** refers forward or backward. */
  def moveTextRange(xRange: XTextRange, nParagraphs: scala.Double): scala.Unit
}

object XTextRangeMover {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    moveTextRange: js.Function2[XTextRange, scala.Double, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XTextRangeMover = {
    val __obj = js.Dynamic.literal(acquire = acquire, moveTextRange = moveTextRange, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XTextRangeMover]
  }
}

