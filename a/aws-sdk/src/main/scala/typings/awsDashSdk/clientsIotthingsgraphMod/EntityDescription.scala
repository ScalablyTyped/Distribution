package typings.awsDashSdk.clientsIotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntityDescription extends js.Object {
  /**
    * The entity ARN.
    */
  var arn: js.UndefOr[Arn] = js.native
  /**
    * The time at which the entity was created.
    */
  var createdAt: js.UndefOr[Timestamp] = js.native
  /**
    * The definition document of the entity.
    */
  var definition: js.UndefOr[DefinitionDocument] = js.native
  /**
    * The entity ID.
    */
  var id: js.UndefOr[Urn] = js.native
  /**
    * The entity type.
    */
  var `type`: js.UndefOr[EntityType] = js.native
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
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt.asInstanceOf[js.Any])
    if (definition != null) __obj.updateDynamic("definition")(definition.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityDescription]
  }
}

