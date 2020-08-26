package typings.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionConfiguration extends js.Object {
  /**
    * The name of the DataSource.
    */
  var dataSourceName: js.UndefOr[ResourceName] = js.native
  /**
    * The Function description.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The ARN of the Function object.
    */
  var functionArn: js.UndefOr[String] = js.native
  /**
    * A unique ID representing the Function object.
    */
  var functionId: js.UndefOr[String] = js.native
  /**
    * The version of the request mapping template. Currently only the 2018-05-29 version of the template is supported.
    */
  var functionVersion: js.UndefOr[String] = js.native
  /**
    * The name of the Function object.
    */
  var name: js.UndefOr[ResourceName] = js.native
  /**
    * The Function request mapping template. Functions support only the 2018-05-29 version of the request mapping template.
    */
  var requestMappingTemplate: js.UndefOr[MappingTemplate] = js.native
  /**
    * The Function response mapping template.
    */
  var responseMappingTemplate: js.UndefOr[MappingTemplate] = js.native
}

object FunctionConfiguration {
  @scala.inline
  def apply(): FunctionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FunctionConfiguration]
  }
  @scala.inline
  implicit class FunctionConfigurationOps[Self <: FunctionConfiguration] (val x: Self) extends AnyVal {
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
    def setDataSourceName(value: ResourceName): Self = this.set("dataSourceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSourceName: Self = this.set("dataSourceName", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setFunctionArn(value: String): Self = this.set("functionArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFunctionArn: Self = this.set("functionArn", js.undefined)
    @scala.inline
    def setFunctionId(value: String): Self = this.set("functionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFunctionId: Self = this.set("functionId", js.undefined)
    @scala.inline
    def setFunctionVersion(value: String): Self = this.set("functionVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFunctionVersion: Self = this.set("functionVersion", js.undefined)
    @scala.inline
    def setName(value: ResourceName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setRequestMappingTemplate(value: MappingTemplate): Self = this.set("requestMappingTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestMappingTemplate: Self = this.set("requestMappingTemplate", js.undefined)
    @scala.inline
    def setResponseMappingTemplate(value: MappingTemplate): Self = this.set("responseMappingTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseMappingTemplate: Self = this.set("responseMappingTemplate", js.undefined)
  }
  
}

