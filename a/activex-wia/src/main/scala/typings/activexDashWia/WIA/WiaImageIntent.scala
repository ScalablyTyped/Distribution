package typings.activexDashWia.WIA

import typings.activexDashWia.activexDashWiaNumbers.`0`
import typings.activexDashWia.activexDashWiaNumbers.`1`
import typings.activexDashWia.activexDashWiaNumbers.`2`
import typings.activexDashWia.activexDashWiaNumbers.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The WiaImageIntent enumeration helps specify what type of data the image is intended to represent. */
/* Rewritten from type alias, can be one of: 
  - typings.activexDashWia.activexDashWiaNumbers.`1`
  - typings.activexDashWia.activexDashWiaNumbers.`2`
  - typings.activexDashWia.activexDashWiaNumbers.`4`
  - typings.activexDashWia.activexDashWiaNumbers.`0`
*/
trait WiaImageIntent extends js.Object

object WiaImageIntent {
  @scala.inline
  def ColorIntent: `1` = this.cast(1)
  @scala.inline
  def GrayscaleIntent: `2` = this.cast(2)
  @scala.inline
  def TextIntent: `4` = this.cast(4)
  @scala.inline
  def UnspecifiedIntent: `0` = this.cast(0)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

