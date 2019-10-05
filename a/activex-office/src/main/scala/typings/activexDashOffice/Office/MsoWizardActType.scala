package typings.activexDashOffice.Office

import typings.activexDashOffice.activexDashOfficeNumbers.`0`
import typings.activexDashOffice.activexDashOfficeNumbers.`1`
import typings.activexDashOffice.activexDashOfficeNumbers.`2`
import typings.activexDashOffice.activexDashOfficeNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.activexDashOffice.activexDashOfficeNumbers.`1`
  - typings.activexDashOffice.activexDashOfficeNumbers.`0`
  - typings.activexDashOffice.activexDashOfficeNumbers.`3`
  - typings.activexDashOffice.activexDashOfficeNumbers.`2`
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

