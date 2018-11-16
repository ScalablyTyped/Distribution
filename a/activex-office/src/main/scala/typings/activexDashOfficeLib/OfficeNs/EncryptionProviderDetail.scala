package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EncryptionProviderDetail extends js.Object

@JSGlobal("Office.EncryptionProviderDetail")
@js.native
object EncryptionProviderDetail extends js.Object {
  @js.native
  sealed trait encprovdetAlgorithm
    extends activexDashOfficeLib.OfficeNs.EncryptionProviderDetail
  
  @js.native
  sealed trait encprovdetBlockCipher
    extends activexDashOfficeLib.OfficeNs.EncryptionProviderDetail
  
  @js.native
  sealed trait encprovdetCipherBlockSize
    extends activexDashOfficeLib.OfficeNs.EncryptionProviderDetail
  
  @js.native
  sealed trait encprovdetCipherMode
    extends activexDashOfficeLib.OfficeNs.EncryptionProviderDetail
  
  @js.native
  sealed trait encprovdetUrl
    extends activexDashOfficeLib.OfficeNs.EncryptionProviderDetail
  
  /* 1 */ val encprovdetAlgorithm: encprovdetAlgorithm with scala.Double = js.native
  /* 2 */ val encprovdetBlockCipher: encprovdetBlockCipher with scala.Double = js.native
  /* 3 */ val encprovdetCipherBlockSize: encprovdetCipherBlockSize with scala.Double = js.native
  /* 4 */ val encprovdetCipherMode: encprovdetCipherMode with scala.Double = js.native
  /* 0 */ val encprovdetUrl: encprovdetUrl with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.EncryptionProviderDetail with scala.Double] = js.native
}

