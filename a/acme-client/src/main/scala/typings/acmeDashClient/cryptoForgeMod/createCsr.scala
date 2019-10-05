package typings.acmeDashClient.cryptoForgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("acme-client/crypto/forge", "createCsr")
@js.native
object createCsr extends js.Object {
  def apply(data: CsrOptions): js.Promise[js.Tuple2[PrivateKey, Csr]] = js.native
  def apply(data: CsrOptions, key: PrivateKey): js.Promise[js.Tuple2[PrivateKey, Csr]] = js.native
}

