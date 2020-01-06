package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldLevelEncryptionProfileList extends js.Object {
  /**
    * The field-level encryption profile items.
    */
  var Items: js.UndefOr[FieldLevelEncryptionProfileSummaryList] = js.native
  /**
    * The maximum number of field-level encryption profiles you want in the response body. 
    */
  var MaxItems: integer = js.native
  /**
    * If there are more elements to be listed, this element is present and contains the value that you can use for the Marker request parameter to continue listing your profiles where you left off.
    */
  var NextMarker: js.UndefOr[String] = js.native
  /**
    * The number of field-level encryption profiles.
    */
  var Quantity: integer = js.native
}

object FieldLevelEncryptionProfileList {
  @scala.inline
  def apply(
    MaxItems: integer,
    Quantity: integer,
    Items: FieldLevelEncryptionProfileSummaryList = null,
    NextMarker: String = null
  ): FieldLevelEncryptionProfileList = {
    val __obj = js.Dynamic.literal(MaxItems = MaxItems.asInstanceOf[js.Any], Quantity = Quantity.asInstanceOf[js.Any])
    if (Items != null) __obj.updateDynamic("Items")(Items.asInstanceOf[js.Any])
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldLevelEncryptionProfileList]
  }
}

