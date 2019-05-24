package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetEbsEncryptionByDefaultResult extends js.Object {
  /**
    * Indicates whether default encryption for EBS volumes is enabled or disabled.
    */
  var EbsEncryptionByDefault: js.UndefOr[Boolean] = js.undefined
}

object GetEbsEncryptionByDefaultResult {
  @scala.inline
  def apply(EbsEncryptionByDefault: js.UndefOr[Boolean] = js.undefined): GetEbsEncryptionByDefaultResult = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(EbsEncryptionByDefault)) __obj.updateDynamic("EbsEncryptionByDefault")(EbsEncryptionByDefault)
    __obj.asInstanceOf[GetEbsEncryptionByDefaultResult]
  }
}

