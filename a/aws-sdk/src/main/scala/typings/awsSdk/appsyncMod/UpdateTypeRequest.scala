package typings.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateTypeRequest extends js.Object {
  /**
    * The API ID.
    */
  var apiId: String = js.native
  /**
    * The new definition.
    */
  var definition: js.UndefOr[String] = js.native
  /**
    * The new type format: SDL or JSON.
    */
  var format: TypeDefinitionFormat = js.native
  /**
    * The new type name.
    */
  var typeName: ResourceName = js.native
}

object UpdateTypeRequest {
  @scala.inline
  def apply(apiId: String, format: TypeDefinitionFormat, typeName: ResourceName, definition: String = null): UpdateTypeRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], typeName = typeName.asInstanceOf[js.Any])
    if (definition != null) __obj.updateDynamic("definition")(definition.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTypeRequest]
  }
}

