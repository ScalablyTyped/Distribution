package typings.arangodb.Foxx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DependencyDefinition extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var multiple: Boolean
  var name: String
  var required: Boolean
  var version: String
}

object DependencyDefinition {
  @scala.inline
  def apply(multiple: Boolean, name: String, required: Boolean, version: String, description: String = null): DependencyDefinition = {
    val __obj = js.Dynamic.literal(multiple = multiple.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[DependencyDefinition]
  }
}

