package typings
package awsDashSdkLib.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentTypeProfiles extends js.Object {
  /**
    * Items in a field-level encryption content type-profile mapping. 
    */
  var Items: js.UndefOr[ContentTypeProfileList] = js.undefined
  /**
    * The number of field-level encryption content type-profile mappings. 
    */
  var Quantity: integer
}

object ContentTypeProfiles {
  @scala.inline
  def apply(Quantity: integer, Items: ContentTypeProfileList = null): ContentTypeProfiles = {
    val __obj = js.Dynamic.literal(Quantity = Quantity)
    if (Items != null) __obj.updateDynamic("Items")(Items)
    __obj.asInstanceOf[ContentTypeProfiles]
  }
}

