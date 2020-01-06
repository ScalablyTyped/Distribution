package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContentTypeProfiles extends js.Object {
  /**
    * Items in a field-level encryption content type-profile mapping. 
    */
  var Items: js.UndefOr[ContentTypeProfileList] = js.native
  /**
    * The number of field-level encryption content type-profile mappings. 
    */
  var Quantity: integer = js.native
}

object ContentTypeProfiles {
  @scala.inline
  def apply(Quantity: integer, Items: ContentTypeProfileList = null): ContentTypeProfiles = {
    val __obj = js.Dynamic.literal(Quantity = Quantity.asInstanceOf[js.Any])
    if (Items != null) __obj.updateDynamic("Items")(Items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentTypeProfiles]
  }
}

