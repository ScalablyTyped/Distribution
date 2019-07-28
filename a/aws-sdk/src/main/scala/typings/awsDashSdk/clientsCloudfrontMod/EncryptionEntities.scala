package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncryptionEntities extends js.Object {
  /**
    * An array of field patterns in a field-level encryption content type-profile mapping. 
    */
  var Items: js.UndefOr[EncryptionEntityList] = js.undefined
  /**
    * Number of field pattern items in a field-level encryption content type-profile mapping. 
    */
  var Quantity: integer
}

object EncryptionEntities {
  @scala.inline
  def apply(Quantity: integer, Items: EncryptionEntityList = null): EncryptionEntities = {
    val __obj = js.Dynamic.literal(Quantity = Quantity)
    if (Items != null) __obj.updateDynamic("Items")(Items)
    __obj.asInstanceOf[EncryptionEntities]
  }
}

