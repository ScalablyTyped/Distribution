package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyPair extends js.Object {
  /**
    * The private key.
    */
  var PrivateKey: js.UndefOr[PrivateKey] = js.undefined
  /**
    * The public key.
    */
  var PublicKey: js.UndefOr[PublicKey] = js.undefined
}

object KeyPair {
  @scala.inline
  def apply(PrivateKey: PrivateKey = null, PublicKey: PublicKey = null): KeyPair = {
    val __obj = js.Dynamic.literal()
    if (PrivateKey != null) __obj.updateDynamic("PrivateKey")(PrivateKey)
    if (PublicKey != null) __obj.updateDynamic("PublicKey")(PublicKey)
    __obj.asInstanceOf[KeyPair]
  }
}

