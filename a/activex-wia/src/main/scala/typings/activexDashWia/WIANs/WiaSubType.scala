package typings.activexDashWia.WIANs

import typings.activexDashWia.activexDashWiaNumbers.`0`
import typings.activexDashWia.activexDashWiaNumbers.`1`
import typings.activexDashWia.activexDashWiaNumbers.`2`
import typings.activexDashWia.activexDashWiaNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The WiaSubType enumeration specifies more detail about the property value. Use the SubType property on the Property object to obtain these values for
  * the property.
  */
/* Rewritten from type alias, can be one of: 
  - typings.activexDashWia.activexDashWiaNumbers.`3`
  - typings.activexDashWia.activexDashWiaNumbers.`2`
  - typings.activexDashWia.activexDashWiaNumbers.`1`
  - typings.activexDashWia.activexDashWiaNumbers.`0`
*/
trait WiaSubType extends js.Object

object WiaSubType {
  @scala.inline
  def FlagSubType: `3` = this.cast(3)
  @scala.inline
  def ListSubType: `2` = this.cast(2)
  @scala.inline
  def RangeSubType: `1` = this.cast(1)
  @scala.inline
  def UnspecifiedSubType: `0` = this.cast(0)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

