package typings
package awsDashSdkLib.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeFolderContentsRequest extends js.Object {
  /**
    * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in accessing the API using AWS credentials.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
  /**
    * The ID of the folder.
    */
  var FolderId: ResourceIdType
  /**
    * The contents to include. Specify "INITIALIZED" to include initialized documents.
    */
  var Include: js.UndefOr[FieldNamesType] = js.undefined
  /**
    * The maximum number of items to return with this call.
    */
  var Limit: js.UndefOr[LimitType] = js.undefined
  /**
    * The marker for the next set of results. This marker was received from a previous call.
    */
  var Marker: js.UndefOr[PageMarkerType] = js.undefined
  /**
    * The order for the contents of the folder.
    */
  var Order: js.UndefOr[OrderType] = js.undefined
  /**
    * The sorting criteria.
    */
  var Sort: js.UndefOr[ResourceSortType] = js.undefined
  /**
    * The type of items.
    */
  var Type: js.UndefOr[FolderContentType] = js.undefined
}

object DescribeFolderContentsRequest {
  @scala.inline
  def apply(
    FolderId: ResourceIdType,
    AuthenticationToken: AuthenticationHeaderType = null,
    Include: FieldNamesType = null,
    Limit: js.UndefOr[LimitType] = js.undefined,
    Marker: PageMarkerType = null,
    Order: OrderType = null,
    Sort: ResourceSortType = null,
    Type: FolderContentType = null
  ): DescribeFolderContentsRequest = {
    val __obj = js.Dynamic.literal(FolderId = FolderId)
    if (AuthenticationToken != null) __obj.updateDynamic("AuthenticationToken")(AuthenticationToken)
    if (Include != null) __obj.updateDynamic("Include")(Include)
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (Order != null) __obj.updateDynamic("Order")(Order.asInstanceOf[js.Any])
    if (Sort != null) __obj.updateDynamic("Sort")(Sort.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFolderContentsRequest]
  }
}

