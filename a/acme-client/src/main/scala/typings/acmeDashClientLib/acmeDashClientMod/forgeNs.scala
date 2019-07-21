package typings
package acmeDashClientLib.acmeDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("acme-client", "forge")
@js.native
object forgeNs extends js.Object {
  def createCsr(data: acmeDashClientLib.cryptoForgeMod.CsrOptions): js.Promise[
    js.Tuple2[acmeDashClientLib.cryptoForgeMod.PrivateKey, acmeDashClientLib.cryptoForgeMod.Csr]
  ] = js.native
  def createCsr(
    data: acmeDashClientLib.cryptoForgeMod.CsrOptions,
    key: acmeDashClientLib.cryptoForgeMod.PrivateKey
  ): js.Promise[
    js.Tuple2[acmeDashClientLib.cryptoForgeMod.PrivateKey, acmeDashClientLib.cryptoForgeMod.Csr]
  ] = js.native
  def createPrivateKey(): js.Promise[acmeDashClientLib.cryptoForgeMod.PrivateKey] = js.native
  def createPrivateKey(size: scala.Double): js.Promise[acmeDashClientLib.cryptoForgeMod.PrivateKey] = js.native
}

