package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs.KeyUsageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.security.KeyUsage.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait CRL_SIGN
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs.KeyUsageNs.Constants
  
  @js.native
  sealed trait DATA_ENCIPHERMENT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs.KeyUsageNs.Constants
  
  @js.native
  sealed trait DIGITAL_SIGNATURE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs.KeyUsageNs.Constants
  
  @js.native
  sealed trait KEY_AGREEMENT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs.KeyUsageNs.Constants
  
  @js.native
  sealed trait KEY_CERT_SIGN
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs.KeyUsageNs.Constants
  
  @js.native
  sealed trait KEY_ENCIPHERMENT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs.KeyUsageNs.Constants
  
  @js.native
  sealed trait NON_REPUDIATION
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs.KeyUsageNs.Constants
  
  /* 2 */ val CRL_SIGN: CRL_SIGN with scala.Double = js.native
  /* 16 */ val DATA_ENCIPHERMENT: DATA_ENCIPHERMENT with scala.Double = js.native
  /* 128 */ val DIGITAL_SIGNATURE: DIGITAL_SIGNATURE with scala.Double = js.native
  /* 8 */ val KEY_AGREEMENT: KEY_AGREEMENT with scala.Double = js.native
  /* 4 */ val KEY_CERT_SIGN: KEY_CERT_SIGN with scala.Double = js.native
  /* 32 */ val KEY_ENCIPHERMENT: KEY_ENCIPHERMENT with scala.Double = js.native
  /* 64 */ val NON_REPUDIATION: NON_REPUDIATION with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs.KeyUsageNs.Constants with scala.Double
  ] = js.native
}

