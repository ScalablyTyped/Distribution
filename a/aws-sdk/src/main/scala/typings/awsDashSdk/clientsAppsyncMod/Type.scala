package typings.awsDashSdk.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Type extends js.Object {
  /**
    * The type ARN.
    */
  var arn: js.UndefOr[String] = js.undefined
  /**
    * The type definition.
    */
  var definition: js.UndefOr[String] = js.undefined
  /**
    * The type description.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * The type format: SDL or JSON.
    */
  var format: js.UndefOr[TypeDefinitionFormat] = js.undefined
  /**
    * The type name.
    */
  var name: js.UndefOr[ResourceName] = js.undefined
}

object Type {
  @scala.inline
  def apply(
    arn: String = null,
    definition: String = null,
    description: String = null,
    format: TypeDefinitionFormat = null,
    name: ResourceName = null
  ): Type = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn)
    if (definition != null) __obj.updateDynamic("definition")(definition)
    if (description != null) __obj.updateDynamic("description")(description)
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Type]
  }
}

