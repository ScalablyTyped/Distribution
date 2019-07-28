package typings.adone

import typings.adone.adoneStrings.der
import typings.adone.adoneStrings.dsa
import typings.adone.adoneStrings.ec
import typings.adone.adoneStrings.pem
import typings.adone.adoneStrings.rsa
import typings.node.Anon_PrivateKey
import typings.node.cryptoMod.DSAKeyPairKeyObjectOptions
import typings.node.cryptoMod.DSAKeyPairOptions
import typings.node.cryptoMod.ECKeyPairKeyObjectOptions
import typings.node.cryptoMod.ECKeyPairOptions
import typings.node.cryptoMod.KeyPairKeyObjectResult
import typings.node.cryptoMod.RSAKeyPairKeyObjectOptions
import typings.node.cryptoMod.RSAKeyPairOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofgenerateKeyPair extends js.Object {
  def __promisify__(`type`: dsa, options: DSAKeyPairOptions[der | pem, der | pem]): js.Promise[Anon_PrivateKey] = js.native
  def __promisify__(`type`: ec, options: ECKeyPairOptions[der | pem, der | pem]): js.Promise[Anon_PrivateKey] = js.native
  def __promisify__(`type`: rsa, options: RSAKeyPairOptions[der | pem, der | pem]): js.Promise[Anon_PrivateKey] = js.native
  @JSName("__promisify__")
  def __promisify___dsa(`type`: dsa, options: DSAKeyPairKeyObjectOptions): js.Promise[KeyPairKeyObjectResult] = js.native
  @JSName("__promisify__")
  def __promisify___ec(`type`: ec, options: ECKeyPairKeyObjectOptions): js.Promise[KeyPairKeyObjectResult] = js.native
  @JSName("__promisify__")
  def __promisify___rsa(`type`: rsa, options: RSAKeyPairKeyObjectOptions): js.Promise[KeyPairKeyObjectResult] = js.native
}

