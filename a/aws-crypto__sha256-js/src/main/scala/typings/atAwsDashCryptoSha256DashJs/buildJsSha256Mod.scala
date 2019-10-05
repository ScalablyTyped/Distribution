package typings.atAwsDashCryptoSha256DashJs

import typings.atAwsDashSdkTypes.buildCryptoMod.Hash
import typings.atAwsDashSdkTypes.buildCryptoMod.SourceData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-crypto/sha256-js/build/jsSha256", JSImport.Namespace)
@js.native
object buildJsSha256Mod extends js.Object {
  @js.native
  class Sha256 () extends Hash {
    def this(secret: SourceData) = this()
    var error: js.Any = js.native
    val hash: js.Any = js.native
    val outer: js.UndefOr[js.Any] = js.native
  }
  
}

