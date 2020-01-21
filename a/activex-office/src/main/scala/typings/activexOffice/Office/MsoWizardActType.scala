package typings.activexOffice.Office

import typings.activexOffice.activexOfficeNumbers.`0`
import typings.activexOffice.activexOfficeNumbers.`1`
import typings.activexOffice.activexOfficeNumbers.`2`
import typings.activexOffice.activexOfficeNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.activexOffice.activexOfficeNumbers.`1`
  - typings.activexOffice.activexOfficeNumbers.`0`
  - typings.activexOffice.activexOfficeNumbers.`3`
  - typings.activexOffice.activexOfficeNumbers.`2`
*/
trait MsoWizardActType extends js.Object

object MsoWizardActType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def msoWizardActActive: `1` = this.cast(1)
  @scala.inline
  def msoWizardActInactive: `0` = this.cast(0)
  @scala.inline
  def msoWizardActResume: `3` = this.cast(3)
  @scala.inline
  def msoWizardActSuspend: `2` = this.cast(2)
}

