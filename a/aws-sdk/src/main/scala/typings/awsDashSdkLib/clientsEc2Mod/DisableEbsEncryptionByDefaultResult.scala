package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisableEbsEncryptionByDefaultResult extends js.Object {
  /**
    * Account-level encryption status after performing the action.
    */
  var EbsEncryptionByDefault: js.UndefOr[Boolean] = js.undefined
}

object DisableEbsEncryptionByDefaultResult {
  @scala.inline
  def apply(EbsEncryptionByDefault: js.UndefOr[Boolean] = js.undefined): DisableEbsEncryptionByDefaultResult = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(EbsEncryptionByDefault)) __obj.updateDynamic("EbsEncryptionByDefault")(EbsEncryptionByDefault)
    __obj.asInstanceOf[DisableEbsEncryptionByDefaultResult]
  }
}

