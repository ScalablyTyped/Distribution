package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.smarttagsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies the which type of text is passed to {@link XSmartTagRecognizer.recognize()}
  * @since OOo 2.3
  */
/* Rewritten from type alias, can be one of: 
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1`
*/
trait SmartTagRecognizerMode extends js.Object

object SmartTagRecognizerMode {
  @scala.inline
  def CELL: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3` = this.cast(3)
  @scala.inline
  def CHAR: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0` = this.cast(0)
  @scala.inline
  def PARAGRAPH: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2` = this.cast(2)
  @scala.inline
  def SINGLE_WORD: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

