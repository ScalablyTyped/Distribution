package typings.awsDashSdk.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetResourcesRequest extends js.Object {
  /**
    * The Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in accessing the API operation using AWS credentials.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
  /**
    * The collection type.
    */
  var CollectionType: js.UndefOr[ResourceCollectionType] = js.undefined
  /**
    * The maximum number of resources to return.
    */
  var Limit: js.UndefOr[LimitType] = js.undefined
  /**
    * The marker for the next set of results. This marker was received from a previous call.
    */
  var Marker: js.UndefOr[PageMarkerType] = js.undefined
  /**
    * The user ID for the resource collection. This is a required field for accessing the API operation using IAM credentials.
    */
  var UserId: js.UndefOr[IdType] = js.undefined
}

object GetResourcesRequest {
  @scala.inline
  def apply(
    AuthenticationToken: AuthenticationHeaderType = null,
    CollectionType: ResourceCollectionType = null,
    Limit: Int | Double = null,
    Marker: PageMarkerType = null,
    UserId: IdType = null
  ): GetResourcesRequest = {
    val __obj = js.Dynamic.literal()
    if (AuthenticationToken != null) __obj.updateDynamic("AuthenticationToken")(AuthenticationToken)
    if (CollectionType != null) __obj.updateDynamic("CollectionType")(CollectionType.asInstanceOf[js.Any])
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (UserId != null) __obj.updateDynamic("UserId")(UserId)
    __obj.asInstanceOf[GetResourcesRequest]
  }
}

