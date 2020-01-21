package typings.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Type extends js.Object {
  /**
    * The type ARN.
    */
  var arn: js.UndefOr[String] = js.native
  /**
    * The type definition.
    */
  var definition: js.UndefOr[String] = js.native
  /**
    * The type description.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The type format: SDL or JSON.
    */
  var format: js.UndefOr[TypeDefinitionFormat] = js.native
  /**
    * The type name.
    */
  var name: js.UndefOr[ResourceName] = js.native
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
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (definition != null) __obj.updateDynamic("definition")(definition.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
}

