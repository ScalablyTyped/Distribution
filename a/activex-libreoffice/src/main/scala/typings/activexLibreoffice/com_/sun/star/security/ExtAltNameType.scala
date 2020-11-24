package typings.activexLibreoffice.com_.sun.star.security

import typings.activexLibreoffice.activexLibreofficeNumbers.`0`
import typings.activexLibreoffice.activexLibreofficeNumbers.`1`
import typings.activexLibreoffice.activexLibreofficeNumbers.`2`
import typings.activexLibreoffice.activexLibreofficeNumbers.`3`
import typings.activexLibreoffice.activexLibreofficeNumbers.`4`
import typings.activexLibreoffice.activexLibreofficeNumbers.`5`
import typings.activexLibreoffice.activexLibreofficeNumbers.`6`
import typings.activexLibreoffice.activexLibreofficeNumbers.`7`
import typings.activexLibreoffice.activexLibreofficeNumbers.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Constant definition of a certificate container status. */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeNumbers.`3`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`2`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`7`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`5`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`0`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`6`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`1`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`4`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`8`
*/
trait ExtAltNameType extends js.Object
object ExtAltNameType {
  
  /** Currently unsupported. */
  @scala.inline
  def DIRECTORY_NAME: `3` = 3.asInstanceOf[`3`]
  
  /**
    * The entry contains a dns name. The value of {@link CertAltNameEntry} contains a OUString.
    * @see com.sun.star.security.CertAltNameEntry
    */
  @scala.inline
  def DNS_NAME: `2` = 2.asInstanceOf[`2`]
  
  /** Currently unsupported. */
  @scala.inline
  def EDI_PARTY_NAME: `7` = 7.asInstanceOf[`7`]
  
  /**
    * The entry contains a ip address. The value of {@link CertAltNameEntry} contains a Sequence of sal_Int8.
    * @see com.sun.star.security.CertAltNameEntry
    */
  @scala.inline
  def IP_ADDRESS: `5` = 5.asInstanceOf[`5`]
  
  /**
    * Cutomize name/value pair The value of {@link CertAltNameEntry} contains a NamedValue.
    * @see com.sun.star.security.CertAltNameEntry
    */
  @scala.inline
  def OTHER_NAME: `0` = 0.asInstanceOf[`0`]
  
  /**
    * The entry contains a registered id. The value of {@link CertAltNameEntry} contains a OUString.
    * @see com.sun.star.security.CertAltNameEntry
    */
  @scala.inline
  def REGISTERED_ID: `6` = 6.asInstanceOf[`6`]
  
  /**
    * The entry contains rfc822 name. The value of {@link CertAltNameEntry} contains a OUString.
    * @see com.sun.star.security.CertAltNameEntry
    */
  @scala.inline
  def RFC822_NAME: `1` = 1.asInstanceOf[`1`]
  
  /**
    * The entry contains an url. The value of {@link CertAltNameEntry} contains a OUString.
    * @see com.sun.star.security.CertAltNameEntry
    */
  @scala.inline
  def URL: `4` = 4.asInstanceOf[`4`]
  
  /** Currently unsupported. */
  @scala.inline
  def X400_ADDRESS: `8` = 8.asInstanceOf[`8`]
}
