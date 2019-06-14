package typings
package activexDashWiaLib.WIANs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The WiaImageBias enumeration helps specify what type of data the image is intended to represent. */
/* Rewritten from type alias, can be one of: 
  - activexDashWiaLib.activexDashWiaLibNumbers.`131072`
  - activexDashWiaLib.activexDashWiaLibNumbers.`65536`
*/
trait WiaImageBias extends js.Object

object WiaImageBias {
  @scala.inline
  def MaximizeQuality: activexDashWiaLib.activexDashWiaLibNumbers.`131072` = this.cast(131072)
  @scala.inline
  def MinimizeSize: activexDashWiaLib.activexDashWiaLibNumbers.`65536` = this.cast(65536)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

