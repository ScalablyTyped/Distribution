package typings.awsDashSdk.clientsRamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Principal extends js.Object {
  /**
    * The time when the principal was associated with the resource share.
    */
  var creationTime: js.UndefOr[DateTime] = js.undefined
  /**
    * Indicates whether the principal belongs to the same AWS organization as the AWS account that owns the resource share.
    */
  var external: js.UndefOr[Boolean] = js.undefined
  /**
    * The ID of the principal.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * The time when the association was last updated.
    */
  var lastUpdatedTime: js.UndefOr[DateTime] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the resource share.
    */
  var resourceShareArn: js.UndefOr[String] = js.undefined
}

object Principal {
  @scala.inline
  def apply(
    creationTime: DateTime = null,
    external: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    lastUpdatedTime: DateTime = null,
    resourceShareArn: String = null
  ): Principal = {
    val __obj = js.Dynamic.literal()
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime)
    if (!js.isUndefined(external)) __obj.updateDynamic("external")(external)
    if (id != null) __obj.updateDynamic("id")(id)
    if (lastUpdatedTime != null) __obj.updateDynamic("lastUpdatedTime")(lastUpdatedTime)
    if (resourceShareArn != null) __obj.updateDynamic("resourceShareArn")(resourceShareArn)
    __obj.asInstanceOf[Principal]
  }
}

