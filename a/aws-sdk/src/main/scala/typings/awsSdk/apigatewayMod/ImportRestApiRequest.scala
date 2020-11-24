package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportRestApiRequest extends js.Object {
  
  /**
    * [Required] The POST request body containing external API definitions. Currently, only OpenAPI definition JSON/YAML files are supported. The maximum size of the API definition file is 6MB.
    */
  var body: _Blob = js.native
  
  /**
    * A query parameter to indicate whether to rollback the API creation (true) or not (false) when a warning is encountered. The default value is false.
    */
  var failOnWarnings: js.UndefOr[Boolean] = js.native
  
  /**
    * A key-value map of context-specific query string parameters specifying the behavior of different API importing operations. The following shows operation-specific parameters and their supported values.  To exclude DocumentationParts from the import, set parameters as ignore=documentation.  To configure the endpoint type, set parameters as endpointConfigurationTypes=EDGE, endpointConfigurationTypes=REGIONAL, or endpointConfigurationTypes=PRIVATE. The default endpoint type is EDGE.  To handle imported basepath, set parameters as basepath=ignore, basepath=prepend or basepath=split. For example, the AWS CLI command to exclude documentation from the imported API is: aws apigateway import-rest-api --parameters ignore=documentation --body 'file:///path/to/imported-api-body.json' The AWS CLI command to set the regional endpoint on the imported API is: aws apigateway import-rest-api --parameters endpointConfigurationTypes=REGIONAL --body 'file:///path/to/imported-api-body.json'
    */
  var parameters: js.UndefOr[MapOfStringToString] = js.native
}
object ImportRestApiRequest {
  
  @scala.inline
  def apply(body: _Blob): ImportRestApiRequest = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportRestApiRequest]
  }
  
  @scala.inline
  implicit class ImportRestApiRequestOps[Self <: ImportRestApiRequest] (val x: Self) extends AnyVal {
    
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
    def setBody(value: _Blob): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailOnWarnings(value: Boolean): Self = this.set("failOnWarnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailOnWarnings: Self = this.set("failOnWarnings", js.undefined)
    
    @scala.inline
    def setParameters(value: MapOfStringToString): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
  }
}
