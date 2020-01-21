package typings.activexOffice.Office

import typings.activexOffice.activexOfficeNumbers.`-1`
import typings.activexOffice.activexOfficeNumbers.`-2`
import typings.activexOffice.activexOfficeNumbers.`-3`
import typings.activexOffice.activexOfficeNumbers.`0`
import typings.activexOffice.activexOfficeNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.activexOffice.activexOfficeNumbers.`1`
  - typings.activexOffice.activexOfficeNumbers.`0`
  - typings.activexOffice.activexOfficeNumbers.`-2`
  - typings.activexOffice.activexOfficeNumbers.`-3`
  - typings.activexOffice.activexOfficeNumbers.`-1`
*/
trait MsoTriState extends js.Object

object MsoTriState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def msoCTrue: `1` = this.cast(1)
  @scala.inline
  def msoFalse: `0` = this.cast(0)
  @scala.inline
  def msoTriStateMixed: `-2` = this.cast(-2)
  @scala.inline
  def msoTriStateToggle: `-3` = this.cast(-3)
  @scala.inline
  def msoTrue: `-1` = this.cast(-1)
}

