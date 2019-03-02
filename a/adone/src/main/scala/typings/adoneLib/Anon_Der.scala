package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Der extends js.Object {
  def `__promisify__`(
    `type`: adoneLib.adoneLibStrings.dsa,
    options: nodeLib.cryptoMod.DSAKeyPairOptions[
      adoneLib.adoneLibStrings.der | adoneLib.adoneLibStrings.pem, 
      adoneLib.adoneLibStrings.der | adoneLib.adoneLibStrings.pem
    ]
  ): js.Promise[nodeLib.Anon_PrivateKey] = js.native
  def `__promisify__`(
    `type`: adoneLib.adoneLibStrings.ec,
    options: nodeLib.cryptoMod.ECKeyPairOptions[
      adoneLib.adoneLibStrings.der | adoneLib.adoneLibStrings.pem, 
      adoneLib.adoneLibStrings.der | adoneLib.adoneLibStrings.pem
    ]
  ): js.Promise[nodeLib.Anon_PrivateKey] = js.native
  def `__promisify__`(
    `type`: adoneLib.adoneLibStrings.rsa,
    options: nodeLib.cryptoMod.RSAKeyPairOptions[
      adoneLib.adoneLibStrings.der | adoneLib.adoneLibStrings.pem, 
      adoneLib.adoneLibStrings.der | adoneLib.adoneLibStrings.pem
    ]
  ): js.Promise[nodeLib.Anon_PrivateKey] = js.native
  @JSName("__promisify__")
  def __promisify___dsa(`type`: adoneLib.adoneLibStrings.dsa, options: nodeLib.cryptoMod.DSAKeyPairKeyObjectOptions): js.Promise[nodeLib.cryptoMod.KeyPairKeyObjectResult] = js.native
  @JSName("__promisify__")
  def __promisify___ec(`type`: adoneLib.adoneLibStrings.ec, options: nodeLib.cryptoMod.ECKeyPairKeyObjectOptions): js.Promise[nodeLib.cryptoMod.KeyPairKeyObjectResult] = js.native
  @JSName("__promisify__")
  def __promisify___rsa(`type`: adoneLib.adoneLibStrings.rsa, options: nodeLib.cryptoMod.RSAKeyPairKeyObjectOptions): js.Promise[nodeLib.cryptoMod.KeyPairKeyObjectResult] = js.native
}

