package typings
package awsDashSdkLib.clientsKmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenerateRandomResponse extends js.Object {
  /**
    * The random byte string. When you use the HTTP API or the AWS CLI, the value is Base64-encoded. Otherwise, it is not encoded.
    */
  var Plaintext: js.UndefOr[PlaintextType] = js.undefined
}

object GenerateRandomResponse {
  @scala.inline
  def apply(Plaintext: PlaintextType = null): GenerateRandomResponse = {
    val __obj = js.Dynamic.literal()
    if (Plaintext != null) __obj.updateDynamic("Plaintext")(Plaintext.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateRandomResponse]
  }
}

