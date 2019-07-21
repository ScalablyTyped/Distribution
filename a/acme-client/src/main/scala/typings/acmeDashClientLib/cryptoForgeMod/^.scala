package typings
package acmeDashClientLib.cryptoForgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("acme-client/crypto/forge", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createCsr(data: CsrOptions): js.Promise[js.Tuple2[PrivateKey, Csr]] = js.native
  def createCsr(data: CsrOptions, key: PrivateKey): js.Promise[js.Tuple2[PrivateKey, Csr]] = js.native
  def createPrivateKey(): js.Promise[PrivateKey] = js.native
  def createPrivateKey(size: scala.Double): js.Promise[PrivateKey] = js.native
}

