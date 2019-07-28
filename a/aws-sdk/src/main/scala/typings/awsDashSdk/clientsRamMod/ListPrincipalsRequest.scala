package typings.awsDashSdk.clientsRamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPrincipalsRequest extends js.Object {
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * The token for the next page of results.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  /**
    * The principals.
    */
  var principals: js.UndefOr[PrincipalArnOrIdList] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var resourceArn: js.UndefOr[String] = js.undefined
  /**
    * The type of owner.
    */
  var resourceOwner: ResourceOwner
  /**
    * The Amazon Resource Names (ARN) of the resource shares.
    */
  var resourceShareArns: js.UndefOr[ResourceShareArnList] = js.undefined
  /**
    * The resource type.
    */
  var resourceType: js.UndefOr[String] = js.undefined
}

object ListPrincipalsRequest {
  @scala.inline
  def apply(
    resourceOwner: ResourceOwner,
    maxResults: js.UndefOr[MaxResults] = js.undefined,
    nextToken: String = null,
    principals: PrincipalArnOrIdList = null,
    resourceArn: String = null,
    resourceShareArns: ResourceShareArnList = null,
    resourceType: String = null
  ): ListPrincipalsRequest = {
    val __obj = js.Dynamic.literal(resourceOwner = resourceOwner.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (principals != null) __obj.updateDynamic("principals")(principals)
    if (resourceArn != null) __obj.updateDynamic("resourceArn")(resourceArn)
    if (resourceShareArns != null) __obj.updateDynamic("resourceShareArns")(resourceShareArns)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    __obj.asInstanceOf[ListPrincipalsRequest]
  }
}

