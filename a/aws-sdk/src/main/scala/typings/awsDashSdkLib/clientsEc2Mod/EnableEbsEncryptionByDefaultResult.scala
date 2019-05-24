package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnableEbsEncryptionByDefaultResult extends js.Object {
  /**
    * Account-level encryption status after performing the action.
    */
  var EbsEncryptionByDefault: js.UndefOr[Boolean] = js.undefined
}

object EnableEbsEncryptionByDefaultResult {
  @scala.inline
  def apply(EbsEncryptionByDefault: js.UndefOr[Boolean] = js.undefined): EnableEbsEncryptionByDefaultResult = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(EbsEncryptionByDefault)) __obj.updateDynamic("EbsEncryptionByDefault")(EbsEncryptionByDefault)
    __obj.asInstanceOf[EnableEbsEncryptionByDefaultResult]
  }
}

