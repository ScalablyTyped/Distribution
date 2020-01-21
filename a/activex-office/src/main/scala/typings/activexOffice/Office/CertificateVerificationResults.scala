package typings.activexOffice.Office

import typings.activexOffice.activexOfficeNumbers.`0`
import typings.activexOffice.activexOfficeNumbers.`1`
import typings.activexOffice.activexOfficeNumbers.`2`
import typings.activexOffice.activexOfficeNumbers.`3`
import typings.activexOffice.activexOfficeNumbers.`4`
import typings.activexOffice.activexOfficeNumbers.`5`
import typings.activexOffice.activexOfficeNumbers.`6`
import typings.activexOffice.activexOfficeNumbers.`7`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.activexOffice.activexOfficeNumbers.`0`
  - typings.activexOffice.activexOfficeNumbers.`5`
  - typings.activexOffice.activexOfficeNumbers.`4`
  - typings.activexOffice.activexOfficeNumbers.`6`
  - typings.activexOffice.activexOfficeNumbers.`7`
  - typings.activexOffice.activexOfficeNumbers.`2`
  - typings.activexOffice.activexOfficeNumbers.`3`
  - typings.activexOffice.activexOfficeNumbers.`1`
*/
trait CertificateVerificationResults extends js.Object

object CertificateVerificationResults {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def certverresError: `0` = this.cast(0)
  @scala.inline
  def certverresExpired: `5` = this.cast(5)
  @scala.inline
  def certverresInvalid: `4` = this.cast(4)
  @scala.inline
  def certverresRevoked: `6` = this.cast(6)
  @scala.inline
  def certverresUntrusted: `7` = this.cast(7)
  @scala.inline
  def certverresUnverified: `2` = this.cast(2)
  @scala.inline
  def certverresValid: `3` = this.cast(3)
  @scala.inline
  def certverresVerifying: `1` = this.cast(1)
}

