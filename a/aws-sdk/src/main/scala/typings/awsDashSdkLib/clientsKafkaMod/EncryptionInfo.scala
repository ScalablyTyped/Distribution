package typings
package awsDashSdkLib.clientsKafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncryptionInfo extends js.Object {
  /**
    * The data volume encryption details.
    */
  var EncryptionAtRest: js.UndefOr[EncryptionAtRest] = js.undefined
}

object EncryptionInfo {
  @scala.inline
  def apply(EncryptionAtRest: EncryptionAtRest = null): EncryptionInfo = {
    val __obj = js.Dynamic.literal()
    if (EncryptionAtRest != null) __obj.updateDynamic("EncryptionAtRest")(EncryptionAtRest)
    __obj.asInstanceOf[EncryptionInfo]
  }
}

