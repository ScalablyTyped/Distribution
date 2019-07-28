package typings.acmeDashClient.acmeDashClientMod

import typings.acmeDashClient.cryptoForgeMod.Csr
import typings.acmeDashClient.cryptoForgeMod.CsrOptions
import typings.acmeDashClient.cryptoForgeMod.PrivateKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("acme-client", "forge")
@js.native
object forgeNs extends js.Object {
  def createCsr(data: CsrOptions): js.Promise[js.Tuple2[PrivateKey, Csr]] = js.native
  def createCsr(data: CsrOptions, key: PrivateKey): js.Promise[js.Tuple2[PrivateKey, Csr]] = js.native
  def createPrivateKey(): js.Promise[PrivateKey] = js.native
  def createPrivateKey(size: Double): js.Promise[PrivateKey] = js.native
}

