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
    requestMappingTemplate: MappingTemplate,
    description: String = null,
    responseMappingTemplate: MappingTemplate = null
  ): UpdateFunctionRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], dataSourceName = dataSourceName.asInstanceOf[js.Any], functionId = functionId.asInstanceOf[js.Any], functionVersion = functionVersion.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], requestMappingTemplate = requestMappingTemplate.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (responseMappingTemplate != null) __obj.updateDynamic("responseMappingTemplate")(responseMappingTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFunctionRequest]
  }
}

