package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Constant definition of a certificate container status. */
/* Rewritten from type alias, can be one of: 
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`7`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`5`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`6`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`4`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`8`
*/
trait ExtAltNameType extends js.Object

object ExtAltNameType {
  /** Currently unsupported. */
  @scala.inline
  def DIRECTORY_NAME: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3` = this.cast(3)
  /**
    * The entry contains a dns name. The value of {@link CertAltNameEntry} contains a OUString.
    * @see com.sun.star.security.CertAltNameEntry
    */
  @scala.inline
  def DNS_NAME: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2` = this.cast(2)
  /** Currently unsupported. */
  @scala.inline
  def EDI_PARTY_NAME: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`7` = this.cast(7)
  /**
    * The entry contains a ip address. The value of {@link CertAltNameEntry} contains a Sequence of sal_Int8.
    * @see com.sun.star.security.CertAltNameEntry
    */
  @scala.inline
  def IP_ADDRESS: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`5` = this.cast(5)
  /**
    * Cutomize name/value pair The value of {@link CertAltNameEntry} contains a NamedValue.
    * @see com.sun.star.security.CertAltNameEntry
    */
  @scala.inline
  def OTHER_NAME: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0` = this.cast(0)
  /**
    * The entry contains a registered id. The value of {@link CertAltNameEntry} contains a OUString.
    * @see com.sun.star.security.CertAltNameEntry
    */
  @scala.inline
  def REGISTERED_ID: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`6` = this.cast(6)
  /**
    * The entry contains rfc822 name. The value of {@link CertAltNameEntry} contains a OUString.
    * @see com.sun.star.security.CertAltNameEntry
    */
  @scala.inline
  def RFC822_NAME: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1` = this.cast(1)
  /**
    * The entry contains an url. The value of {@link CertAltNameEntry} contains a OUString.
    * @see com.sun.star.security.CertAltNameEntry
    */
  @scala.inline
  def URL: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`4` = this.cast(4)
  /** Currently unsupported. */
  @scala.inline
  def X400_ADDRESS: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`8` = this.cast(8)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

