package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EncryptionCipherMode extends js.Object

@JSGlobal("Office.EncryptionCipherMode")
@js.native
object EncryptionCipherMode extends js.Object {
  @js.native
  sealed trait cipherModeCBC
    extends activexDashOfficeLib.OfficeNs.EncryptionCipherMode
  
  @js.native
  sealed trait cipherModeECB
    extends activexDashOfficeLib.OfficeNs.EncryptionCipherMode
  
  /* 1 */ val cipherModeCBC: cipherModeCBC with scala.Double = js.native
  /* 0 */ val cipherModeECB: cipherModeECB with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.EncryptionCipherMode with scala.Double] = js.native
}

