package typings.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportApiRequest extends js.Object {
  /**
    * The API identifier.
    */
  var ApiId: string = js.native
  /**
    * The version of the API Gateway export algorithm. API Gateway uses the latest version by default. Currently, the only supported version is 1.0.
    */
  var ExportVersion: js.UndefOr[string] = js.native
  /**
    * Specifies whether to include API Gateway extensions in the exported API definition. API Gateway extensions are included by default.
    */
  var IncludeExtensions: js.UndefOr[boolean] = js.native
  /**
    * The output type of the exported definition file. Valid values are JSON and YAML.
    */
  var OutputType: string = js.native
  /**
    * The version of the API specification to use. OAS30, for OpenAPI 3.0, is the only supported value.
    */
  var Specification: string = js.native
  /**
    * The name of the API stage to export. If you don't specify this property, a representation of the latest API configuration is exported.
    */
  var StageName: js.UndefOr[string] = js.native
}

object ExportApiRequest {
  @scala.inline
  def apply(ApiId: string, OutputType: string, Specification: string): ExportApiRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any], OutputType = OutputType.asInstanceOf[js.Any], Specification = Specification.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportApiRequest]
  }
  @scala.inline
  implicit class ExportApiRequestOps[Self <: ExportApiRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApiId(value: string): Self = this.set("ApiId", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutputType(value: string): Self = this.set("OutputType", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpecification(value: string): Self = this.set("Specification", value.asInstanceOf[js.Any])
    @scala.inline
    def setExportVersion(value: string): Self = this.set("ExportVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExportVersion: Self = this.set("ExportVersion", js.undefined)
    @scala.inline
    def setIncludeExtensions(value: boolean): Self = this.set("IncludeExtensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeExtensions: Self = this.set("IncludeExtensions", js.undefined)
    @scala.inline
    def setStageName(value: string): Self = this.set("StageName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStageName: Self = this.set("StageName", js.undefined)
  }
  
}

