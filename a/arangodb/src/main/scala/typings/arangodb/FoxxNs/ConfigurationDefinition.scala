package typings.arangodb.FoxxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigurationDefinition extends js.Object {
  var default: js.UndefOr[js.Any] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var required: Boolean
  var `type`: js.UndefOr[ConfigurationType] = js.undefined
}

object ConfigurationDefinition {
  @scala.inline
  def apply(
    required: Boolean,
    default: js.Any = null,
    description: String = null,
    `type`: ConfigurationType = null
  ): ConfigurationDefinition = {
    val __obj = js.Dynamic.literal(required = required)
    if (default != null) __obj.updateDynamic("default")(default)
    if (description != null) __obj.updateDynamic("description")(description)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ConfigurationDefinition]
  }
}

