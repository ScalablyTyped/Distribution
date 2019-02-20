package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ExtAltNameType extends js.Object

/** Constant definition of a certificate container status. */
@JSGlobal("com.sun.star.security.ExtAltNameType")
@js.native
object ExtAltNameType extends js.Object {
  /** Currently unsupported. */
  @js.native
  sealed trait DIRECTORY_NAME
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs.ExtAltNameType
  
  /**
    * The entry contains a dns name. The value of {@link CertAltNameEntry} contains a OUString.
    * @see com.sun.star.security.CertAltNameEntry
    */
  @js.native
  sealed trait DNS_NAME
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs.ExtAltNameType
  
  /** Currently unsupported. */
  @js.native
  sealed trait EDI_PARTY_NAME
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs.ExtAltNameType
  
  /**
    * The entry contains a ip address. The value of {@link CertAltNameEntry} contains a Sequence of sal_Int8.
    * @see com.sun.star.security.CertAltNameEntry
    */
  @js.native
  sealed trait IP_ADDRESS
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs.ExtAltNameType
  
  /**
    * Cutomize name/value pair The value of {@link CertAltNameEntry} contains a NamedValue.
    * @see com.sun.star.security.CertAltNameEntry
    */
  @js.native
  sealed trait OTHER_NAME
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs.ExtAltNameType
  
  /**
    * The entry contains a registered id. The value of {@link CertAltNameEntry} contains a OUString.
    * @see com.sun.star.security.CertAltNameEntry
    */
  @js.native
  sealed trait REGISTERED_ID
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs.ExtAltNameType
  
  /**
    * The entry contains rfc822 name. The value of {@link CertAltNameEntry} contains a OUString.
    * @see com.sun.star.security.CertAltNameEntry
    */
  @js.native
  sealed trait RFC822_NAME
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs.ExtAltNameType
  
  /**
    * The entry contains an url. The value of {@link CertAltNameEntry} contains a OUString.
    * @see com.sun.star.security.CertAltNameEntry
    */
  @js.native
  sealed trait URL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs.ExtAltNameType
  
  /** Currently unsupported. */
  @js.native
  sealed trait X400_ADDRESS
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs.ExtAltNameType
  
  /* 3 */ val DIRECTORY_NAME: DIRECTORY_NAME with scala.Double = js.native
  /* 2 */ val DNS_NAME: DNS_NAME with scala.Double = js.native
  /* 7 */ val EDI_PARTY_NAME: EDI_PARTY_NAME with scala.Double = js.native
  /* 5 */ val IP_ADDRESS: IP_ADDRESS with scala.Double = js.native
  /* 0 */ val OTHER_NAME: OTHER_NAME with scala.Double = js.native
  /* 6 */ val REGISTERED_ID: REGISTERED_ID with scala.Double = js.native
  /* 1 */ val RFC822_NAME: RFC822_NAME with scala.Double = js.native
  /* 4 */ val URL: URL with scala.Double = js.native
  /* 8 */ val X400_ADDRESS: X400_ADDRESS with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs.ExtAltNameType with scala.Double
  ] = js.native
}

