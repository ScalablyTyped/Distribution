package typings
package awsDashSdkLib.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldLevelEncryptionList extends js.Object {
  /**
    * An array of field-level encryption items.
    */
  var Items: js.UndefOr[FieldLevelEncryptionSummaryList] = js.undefined
  /**
    * The maximum number of elements you want in the response body. 
    */
  var MaxItems: integer
  /**
    * If there are more elements to be listed, this element is present and contains the value that you can use for the Marker request parameter to continue listing your configurations where you left off.
    */
  var NextMarker: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The number of field-level encryption items.
    */
  var Quantity: integer
}

object FieldLevelEncryptionList {
  @scala.inline
  def apply(
    MaxItems: integer,
    Quantity: integer,
    Items: FieldLevelEncryptionSummaryList = null,
    NextMarker: java.lang.String = null
  ): FieldLevelEncryptionList = {
    val __obj = js.Dynamic.literal(MaxItems = MaxItems, Quantity = Quantity)
    if (Items != null) __obj.updateDynamic("Items")(Items)
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker)
    __obj.asInstanceOf[FieldLevelEncryptionList]
  }
}

