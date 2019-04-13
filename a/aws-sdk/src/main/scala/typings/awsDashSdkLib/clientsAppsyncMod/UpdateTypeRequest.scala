package typings
package awsDashSdkLib.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateTypeRequest extends js.Object {
  /**
    * The API ID.
    */
  var apiId: String
  /**
    * The new definition.
    */
  var definition: js.UndefOr[String] = js.undefined
  /**
    * The new type format: SDL or JSON.
    */
  var format: TypeDefinitionFormat
  /**
    * The new type name.
    */
  var typeName: ResourceName
}

object UpdateTypeRequest {
  @scala.inline
  def apply(apiId: String, format: TypeDefinitionFormat, typeName: ResourceName, definition: String = null): UpdateTypeRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId, format = format.asInstanceOf[js.Any], typeName = typeName)
    if (definition != null) __obj.updateDynamic("definition")(definition)
    __obj.asInstanceOf[UpdateTypeRequest]
  }
}

