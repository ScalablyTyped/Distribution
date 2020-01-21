package typings.activexOffice.Office

import typings.activexOffice.activexOfficeNumbers.`0`
import typings.activexOffice.activexOfficeNumbers.`1`
import typings.activexOffice.activexOfficeNumbers.`2`
import typings.activexOffice.activexOfficeNumbers.`3`
import typings.activexOffice.activexOfficeNumbers.`4`
import typings.activexOffice.activexOfficeNumbers.`5`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.activexOffice.activexOfficeNumbers.`2`
  - typings.activexOffice.activexOfficeNumbers.`4`
  - typings.activexOffice.activexOfficeNumbers.`0`
  - typings.activexOffice.activexOfficeNumbers.`3`
  - typings.activexOffice.activexOfficeNumbers.`5`
  - typings.activexOffice.activexOfficeNumbers.`1`
*/
trait MsoZOrderCmd extends js.Object

object MsoZOrderCmd {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def msoBringForward: `2` = this.cast(2)
  @scala.inline
  def msoBringInFrontOfText: `4` = this.cast(4)
  @scala.inline
  def msoBringToFront: `0` = this.cast(0)
  @scala.inline
  def msoSendBackward: `3` = this.cast(3)
  @scala.inline
  def msoSendBehindText: `5` = this.cast(5)
  @scala.inline
  def msoSendToBack: `1` = this.cast(1)
}

