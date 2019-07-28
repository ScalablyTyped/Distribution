package typings.awsDashSdk.clientsRamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateResourceShareRequest extends js.Object {
  /**
    * Indicates whether principals outside your organization can be associated with a resource share.
    */
  var allowExternalPrincipals: js.UndefOr[Boolean] = js.undefined
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientToken: js.UndefOr[String] = js.undefined
  /**
    * The name of the resource share.
    */
  var name: String
  /**
    * The principals to associate with the resource share. The possible values are IDs of AWS accounts, the ARN of an OU or organization from AWS Organizations.
    */
  var principals: js.UndefOr[PrincipalArnOrIdList] = js.undefined
  /**
    * The Amazon Resource Names (ARN) of the resources to associate with the resource share.
    */
  var resourceArns: js.UndefOr[ResourceArnList] = js.undefined
  /**
    * One or more tags.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}

object CreateResourceShareRequest {
  @scala.inline
  def apply(
    name: String,
    allowExternalPrincipals: js.UndefOr[Boolean] = js.undefined,
    clientToken: String = null,
    principals: PrincipalArnOrIdList = null,
    resourceArns: ResourceArnList = null,
    tags: TagList = null
  ): CreateResourceShareRequest = {
    val __obj = js.Dynamic.literal(name = name)
    if (!js.isUndefined(allowExternalPrincipals)) __obj.updateDynamic("allowExternalPrincipals")(allowExternalPrincipals)
    if (clientToken != null) __obj.updateDynamic("clientToken")(clientToken)
    if (principals != null) __obj.updateDynamic("principals")(principals)
    if (resourceArns != null) __obj.updateDynamic("resourceArns")(resourceArns)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[CreateResourceShareRequest]
  }
}

