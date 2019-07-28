package typings.awsDashSdk.clientsIotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntityDescription extends js.Object {
  /**
    * The entity ARN.
    */
  var arn: js.UndefOr[Arn] = js.undefined
  /**
    * The time at which the entity was created.
    */
  var createdAt: js.UndefOr[Timestamp] = js.undefined
  /**
    * The definition document of the entity.
    */
  var definition: js.UndefOr[DefinitionDocument] = js.undefined
  /**
    * The entity ID.
    */
  var id: js.UndefOr[Urn] = js.undefined
  /**
    * The entity type.
    */
  var `type`: js.UndefOr[EntityType] = js.undefined
}

object EntityDescription {
  @scala.inline
  def apply(
    arn: Arn = null,
    createdAt: Timestamp = null,
    definition: DefinitionDocument = null,
    id: Urn = null,
    `type`: EntityType = null
  ): EntityDescription = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn)
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt)
    if (definition != null) __obj.updateDynamic("definition")(definition)
    if (id != null) __obj.updateDynamic("id")(id)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityDescription]
  }
}

