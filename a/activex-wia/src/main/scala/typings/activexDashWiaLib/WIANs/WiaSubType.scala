package typings
package activexDashWiaLib.WIANs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The WiaSubType enumeration specifies more detail about the property value. Use the SubType property on the Property object to obtain these values for
  * the property.
  */
/* Rewritten from type alias, can be one of: 
  - activexDashWiaLib.activexDashWiaLibNumbers.`3`
  - activexDashWiaLib.activexDashWiaLibNumbers.`2`
  - activexDashWiaLib.activexDashWiaLibNumbers.`1`
  - activexDashWiaLib.activexDashWiaLibNumbers.`0`
*/
trait WiaSubType extends js.Object

object WiaSubType {
  @scala.inline
  def FlagSubType: activexDashWiaLib.activexDashWiaLibNumbers.`3` = this.cast(3)
  @scala.inline
  def ListSubType: activexDashWiaLib.activexDashWiaLibNumbers.`2` = this.cast(2)
  @scala.inline
  def RangeSubType: activexDashWiaLib.activexDashWiaLibNumbers.`1` = this.cast(1)
  @scala.inline
  def UnspecifiedSubType: activexDashWiaLib.activexDashWiaLibNumbers.`0` = this.cast(0)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

