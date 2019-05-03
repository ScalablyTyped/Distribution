package typings
package awsDashSdkLib.clientsKmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeCustomKeyStoresResponse extends js.Object {
  /**
    * Contains metadata about each custom key store.
    */
  var CustomKeyStores: js.UndefOr[CustomKeyStoresList] = js.undefined
  /**
    * When Truncated is true, this element is present and contains the value to use for the Marker parameter in a subsequent request.
    */
  var NextMarker: js.UndefOr[MarkerType] = js.undefined
  /**
    * A flag that indicates whether there are more items in the list. When this value is true, the list in this response is truncated. To get more items, pass the value of the NextMarker element in thisresponse to the Marker parameter in a subsequent request.
    */
  var Truncated: js.UndefOr[BooleanType] = js.undefined
}

object DescribeCustomKeyStoresResponse {
  @scala.inline
  def apply(
    CustomKeyStores: CustomKeyStoresList = null,
    NextMarker: MarkerType = null,
    Truncated: js.UndefOr[BooleanType] = js.undefined
  ): DescribeCustomKeyStoresResponse = {
    val __obj = js.Dynamic.literal()
    if (CustomKeyStores != null) __obj.updateDynamic("CustomKeyStores")(CustomKeyStores)
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker)
    if (!js.isUndefined(Truncated)) __obj.updateDynamic("Truncated")(Truncated)
    __obj.asInstanceOf[DescribeCustomKeyStoresResponse]
  }
}

