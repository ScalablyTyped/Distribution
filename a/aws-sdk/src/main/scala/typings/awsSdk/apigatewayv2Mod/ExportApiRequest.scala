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
  def apply(
    ApiId: string,
    OutputType: string,
    Specification: string,
    ExportVersion: string = null,
    IncludeExtensions: js.UndefOr[boolean] = js.undefined,
    StageName: string = null
  ): ExportApiRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any], OutputType = OutputType.asInstanceOf[js.Any], Specification = Specification.asInstanceOf[js.Any])
    if (ExportVersion != null) __obj.updateDynamic("ExportVersion")(ExportVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(IncludeExtensions)) __obj.updateDynamic("IncludeExtensions")(IncludeExtensions.get.asInstanceOf[js.Any])
    if (StageName != null) __obj.updateDynamic("StageName")(StageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportApiRequest]
  }
}

