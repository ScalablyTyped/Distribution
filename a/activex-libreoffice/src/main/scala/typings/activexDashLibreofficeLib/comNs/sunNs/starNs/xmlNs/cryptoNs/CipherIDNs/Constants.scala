package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.CipherIDNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.xml.crypto.CipherID.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait AES_CBC_W3C_PADDING
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.CipherIDNs.Constants
  
  @js.native
  sealed trait BLOWFISH_CFB_8
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.CipherIDNs.Constants
  
  /* 1 */ val AES_CBC_W3C_PADDING: AES_CBC_W3C_PADDING with scala.Double = js.native
  /* 2 */ val BLOWFISH_CFB_8: BLOWFISH_CFB_8 with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.CipherIDNs.Constants with scala.Double
  ] = js.native
}

