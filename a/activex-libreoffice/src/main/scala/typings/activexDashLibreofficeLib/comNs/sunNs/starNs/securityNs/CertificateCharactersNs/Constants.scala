package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs.CertificateCharactersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.security.CertificateCharacters.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait HAS_PRIVATE_KEY
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs.CertificateCharactersNs.Constants
  
  @js.native
  sealed trait SELF_SIGNED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs.CertificateCharactersNs.Constants
  
  /* 4 */ val HAS_PRIVATE_KEY: HAS_PRIVATE_KEY with scala.Double = js.native
  /* 1 */ val SELF_SIGNED: SELF_SIGNED with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs.CertificateCharactersNs.Constants with scala.Double
  ] = js.native
}

