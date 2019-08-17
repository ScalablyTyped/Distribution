package typings.atAwsDashCryptoSha256DashUniversal.atAwsDashCryptoSha256DashUniversalMod

import typings.atAwsDashCryptoSha256DashUniversal.atAwsDashCryptoSha256DashUniversalStrings.ascii
import typings.atAwsDashCryptoSha256DashUniversal.atAwsDashCryptoSha256DashUniversalStrings.latin1
import typings.atAwsDashCryptoSha256DashUniversal.atAwsDashCryptoSha256DashUniversalStrings.utf8
import typings.atAwsDashSdkTypes.buildCryptoMod.Hash
import typings.atAwsDashSdkTypes.buildCryptoMod.SourceData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-crypto/sha256-universal", "Sha256")
@js.native
class Sha256 () extends Hash {
  def this(secret: SourceData) = this()
  val hash: js.Any = js.native
  @JSName("update")
  def update_ascii(data: SourceData, encoding: ascii): Unit = js.native
  @JSName("update")
  def update_latin1(data: SourceData, encoding: latin1): Unit = js.native
  @JSName("update")
  def update_utf8(data: SourceData, encoding: utf8): Unit = js.native
}

