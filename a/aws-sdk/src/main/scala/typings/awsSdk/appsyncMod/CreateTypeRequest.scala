package typings.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTypeRequest extends js.Object {
  /**
    * The API ID.
    */
  var apiId: String = js.native
  /**
    * The type definition, in GraphQL Schema Definition Language (SDL) format. For more information, see the GraphQL SDL documentation.
    */
  var definition: String = js.native
  /**
    * The type format: SDL or JSON.
    */
  var format: TypeDefinitionFormat = js.native
}

object CreateTypeRequest {
  @scala.inline
  def apply(apiId: String, definition: String, format: TypeDefinitionFormat): CreateTypeRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], definition = definition.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTypeRequest]
  }
  @scala.inline
  implicit class CreateTypeRequestOps[Self <: CreateTypeRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApiId(value: String): Self = this.set("apiId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefinition(value: String): Self = this.set("definition", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormat(value: TypeDefinitionFormat): Self = this.set("format", value.asInstanceOf[js.Any])
  }
  
}

