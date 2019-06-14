package typings
package activexDashWiaLib.WIANs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The WiaImageIntent enumeration helps specify what type of data the image is intended to represent. */
/* Rewritten from type alias, can be one of: 
  - activexDashWiaLib.activexDashWiaLibNumbers.`1`
  - activexDashWiaLib.activexDashWiaLibNumbers.`2`
  - activexDashWiaLib.activexDashWiaLibNumbers.`4`
  - activexDashWiaLib.activexDashWiaLibNumbers.`0`
*/
trait WiaImageIntent extends js.Object

object WiaImageIntent {
  @scala.inline
  def ColorIntent: activexDashWiaLib.activexDashWiaLibNumbers.`1` = this.cast(1)
  @scala.inline
  def GrayscaleIntent: activexDashWiaLib.activexDashWiaLibNumbers.`2` = this.cast(2)
  @scala.inline
  def TextIntent: activexDashWiaLib.activexDashWiaLibNumbers.`4` = this.cast(4)
  @scala.inline
  def UnspecifiedIntent: activexDashWiaLib.activexDashWiaLibNumbers.`0` = this.cast(0)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

