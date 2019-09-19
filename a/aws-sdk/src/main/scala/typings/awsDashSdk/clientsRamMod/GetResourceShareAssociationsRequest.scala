package typings.awsDashSdk.clientsRamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetResourceShareAssociationsRequest extends js.Object {
  /**
    * The association status.
    */
  var associationStatus: js.UndefOr[ResourceShareAssociationStatus] = js.undefined
  /**
    * The association type.
    */
  var associationType: ResourceShareAssociationType
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * The token for the next page of results.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  /**
    * The principal. You cannot specify this parameter if the association type is RESOURCE.
    */
  var principal: js.UndefOr[String] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the resource. You cannot specify this parameter if the association type is PRINCIPAL.
    */
  var resourceArn: js.UndefOr[String] = js.undefined
  /**
    * The Amazon Resource Names (ARN) of the resource shares.
    */
  var resourceShareArns: js.UndefOr[ResourceShareArnList] = js.undefined
}

object GetResourceShareAssociationsRequest {
  @scala.inline
  def apply(
    associationType: ResourceShareAssociationType,
    associationStatus: ResourceShareAssociationStatus = null,
    maxResults: js.UndefOr[MaxResults] = js.undefined,
    nextToken: String = null,
    principal: String = null,
    resourceArn: String = null,
    resourceShareArns: ResourceShareArnList = null
  ): GetResourceShareAssociationsRequest = {
    val __obj = js.Dynamic.literal(associationType = associationType.asInstanceOf[js.Any])
    if (associationStatus != null) __obj.updateDynamic("associationStatus")(associationStatus.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (principal != null) __obj.updateDynamic("principal")(principal)
    if (resourceArn != null) __obj.updateDynamic("resourceArn")(resourceArn)
    if (resourceShareArns != null) __obj.updateDynamic("resourceShareArns")(resourceShareArns)
    __obj.asInstanceOf[GetResourceShareAssociationsRequest]
  }
}

