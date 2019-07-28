package typings.activexDashLibreoffice.comNs.sunNs.starNs.securityNs

import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`3`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`4`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`5`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`6`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`7`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Constant definition of a certificate container status. */
/* Rewritten from type alias, can be one of: 
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`3`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`7`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`5`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`6`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`4`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`8`
*/
trait ExtAltNameType extends js.Object

object ExtAltNameType {
  /** Currently unsupported. */
  @scala.inline
  def DIRECTORY_NAME: `3` = this.cast(3)
  /**
    * The entry contains a dns name. The value of {@link CertAltNameEntry} contains a OUString.
    * @see com.sun.star.security.CertAltNameEntry
    */
  @scala.inline
  def DNS_NAME: `2` = this.cast(2)
  /** Currently unsupported. */
  @scala.inline
  def EDI_PARTY_NAME: `7` = this.cast(7)
  /**
    * The entry contains a ip address. The value of {@link CertAltNameEntry} contains a Sequence of sal_Int8.
    * @see com.sun.star.security.CertAltNameEntry
    */
  @scala.inline
  def IP_ADDRESS: `5` = this.cast(5)
  /**
    * Cutomize name/value pair The value of {@link CertAltNameEntry} contains a NamedValue.
    * @see com.sun.star.security.CertAltNameEntry
    */
  @scala.inline
  def OTHER_NAME: `0` = this.cast(0)
  /**
    * The entry contains a registered id. The value of {@link CertAltNameEntry} contains a OUString.
    * @see com.sun.star.security.CertAltNameEntry
    */
  @scala.inline
  def REGISTERED_ID: `6` = this.cast(6)
  /**
    * The entry contains rfc822 name. The value of {@link CertAltNameEntry} contains a OUString.
    * @see com.sun.star.security.CertAltNameEntry
    */
  @scala.inline
  def RFC822_NAME: `1` = this.cast(1)
  /**
    * The entry contains an url. The value of {@link CertAltNameEntry} contains a OUString.
    * @see com.sun.star.security.CertAltNameEntry
    */
  @scala.inline
  def URL: `4` = this.cast(4)
  /** Currently unsupported. */
  @scala.inline
  def X400_ADDRESS: `8` = this.cast(8)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

