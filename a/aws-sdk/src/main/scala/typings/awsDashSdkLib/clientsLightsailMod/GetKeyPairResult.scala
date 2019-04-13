package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetKeyPairResult extends js.Object {
  /**
    * An array of key-value pairs containing information about the key pair.
    */
  var keyPair: js.UndefOr[KeyPair] = js.undefined
}

object GetKeyPairResult {
  @scala.inline
  def apply(keyPair: KeyPair = null): GetKeyPairResult = {
    val __obj = js.Dynamic.literal()
    if (keyPair != null) __obj.updateDynamic("keyPair")(keyPair)
    __obj.asInstanceOf[GetKeyPairResult]
  }
}

