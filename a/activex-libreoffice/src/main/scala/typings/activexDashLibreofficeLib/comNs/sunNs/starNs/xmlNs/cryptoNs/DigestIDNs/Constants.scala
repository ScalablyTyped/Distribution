package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.DigestIDNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.xml.crypto.DigestID.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait SHA1
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.DigestIDNs.Constants
  
  @js.native
  sealed trait SHA1_1K
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.DigestIDNs.Constants
  
  @js.native
  sealed trait SHA256
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.DigestIDNs.Constants
  
  @js.native
  sealed trait SHA256_1K
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.DigestIDNs.Constants
  
  /* 1 */ val SHA1: SHA1 with scala.Double = js.native
  /* 3 */ val SHA1_1K: SHA1_1K with scala.Double = js.native
  /* 2 */ val SHA256: SHA256 with scala.Double = js.native
  /* 4 */ val SHA256_1K: SHA256_1K with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.DigestIDNs.Constants with scala.Double
  ] = js.native
}

