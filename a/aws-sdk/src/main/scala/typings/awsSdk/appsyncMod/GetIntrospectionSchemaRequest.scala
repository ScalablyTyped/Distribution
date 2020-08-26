package typings.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetIntrospectionSchemaRequest extends js.Object {
  /**
    * The API ID.
    */
  var apiId: String = js.native
  /**
    * The schema format: SDL or JSON.
    */
  var format: OutputType = js.native
  /**
    * A flag that specifies whether the schema introspection should contain directives.
    */
  var includeDirectives: js.UndefOr[BooleanValue] = js.native
}

object GetIntrospectionSchemaRequest {
  @scala.inline
  def apply(apiId: String, format: OutputType): GetIntrospectionSchemaRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIntrospectionSchemaRequest]
  }
  @scala.inline
  implicit class GetIntrospectionSchemaRequestOps[Self <: GetIntrospectionSchemaRequest] (val x: Self) extends AnyVal {
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
    def setFormat(value: OutputType): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncludeDirectives(value: BooleanValue): Self = this.set("includeDirectives", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeDirectives: Self = this.set("includeDirectives", js.undefined)
  }
  
}

