package typings.awsDashSdk.clientsKafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncryptionInfo extends js.Object {
  /**
    * 
    The data-volume encryption details.
    
    */
  var EncryptionAtRest: js.UndefOr[typings.awsDashSdk.clientsKafkaMod.EncryptionAtRest] = js.undefined
  /**
    * 
    The details for encryption in transit.
    
    */
  var EncryptionInTransit: js.UndefOr[typings.awsDashSdk.clientsKafkaMod.EncryptionInTransit] = js.undefined
}

object EncryptionInfo {
  @scala.inline
  def apply(EncryptionAtRest: EncryptionAtRest = null, EncryptionInTransit: EncryptionInTransit = null): EncryptionInfo = {
    val __obj = js.Dynamic.literal()
    if (EncryptionAtRest != null) __obj.updateDynamic("EncryptionAtRest")(EncryptionAtRest)
    if (EncryptionInTransit != null) __obj.updateDynamic("EncryptionInTransit")(EncryptionInTransit)
    __obj.asInstanceOf[EncryptionInfo]
  }
}

