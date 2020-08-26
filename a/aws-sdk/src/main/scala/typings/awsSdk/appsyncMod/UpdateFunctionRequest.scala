package typings.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateFunctionRequest extends js.Object {
  /**
    * The GraphQL API ID.
    */
  var apiId: String = js.native
  /**
    * The Function DataSource name.
    */
  var dataSourceName: ResourceName = js.native
  /**
    * The Function description.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The function ID.
    */
  var functionId: ResourceName = js.native
  /**
    * The version of the request mapping template. Currently the supported value is 2018-05-29. 
    */
  var functionVersion: String = js.native
  /**
    * The Function name.
    */
  var name: ResourceName = js.native
  /**
    * The Function request mapping template. Functions support only the 2018-05-29 version of the request mapping template.
    */
  var requestMappingTemplate: MappingTemplate = js.native
  /**
    * The Function request mapping template. 
    */
  var responseMappingTemplate: js.UndefOr[MappingTemplate] = js.native
}

object UpdateFunctionRequest {
  @scala.inline
  def apply(
    apiId: String,
    dataSourceName: ResourceName,
    functionId: ResourceName,
    functionVersion: String,
    name: ResourceName,
    requestMappingTemplate: MappingTemplate
  ): UpdateFunctionRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], dataSourceName = dataSourceName.asInstanceOf[js.Any], functionId = functionId.asInstanceOf[js.Any], functionVersion = functionVersion.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], requestMappingTemplate = requestMappingTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFunctionRequest]
  }
  @scala.inline
  implicit class UpdateFunctionRequestOps[Self <: UpdateFunctionRequest] (val x: Self) extends AnyVal {
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
    def setDataSourceName(value: ResourceName): Self = this.set("dataSourceName", value.asInstanceOf[js.Any])
    @scala.inline
    def setFunctionId(value: ResourceName): Self = this.set("functionId", value.asInstanceOf[js.Any])
    @scala.inline
    def setFunctionVersion(value: String): Self = this.set("functionVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: ResourceName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestMappingTemplate(value: MappingTemplate): Self = this.set("requestMappingTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setResponseMappingTemplate(value: MappingTemplate): Self = this.set("responseMappingTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseMappingTemplate: Self = this.set("responseMappingTemplate", js.undefined)
  }
  
}

