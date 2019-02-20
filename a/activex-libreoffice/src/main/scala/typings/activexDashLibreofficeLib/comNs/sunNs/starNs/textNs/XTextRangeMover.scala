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

