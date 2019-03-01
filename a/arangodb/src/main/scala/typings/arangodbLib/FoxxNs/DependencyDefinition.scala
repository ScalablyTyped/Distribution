package typings
package arangodbLib.FoxxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DependencyDefinition extends js.Object {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var multiple: scala.Boolean
  var name: java.lang.String
  var required: scala.Boolean
  var version: java.lang.String
}

object DependencyDefinition {
  @scala.inline
  def apply(
    multiple: scala.Boolean,
    name: java.lang.String,
    required: scala.Boolean,
    version: java.lang.String,
    description: java.lang.String = null
  ): DependencyDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("multiple")(multiple)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("required")(required)
    __obj.updateDynamic("version")(version)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[DependencyDefinition]
  }
}

