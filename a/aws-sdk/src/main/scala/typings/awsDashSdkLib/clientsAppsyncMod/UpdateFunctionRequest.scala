package typings
package awsDashSdkLib.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateFunctionRequest extends js.Object {
  /**
    * The GraphQL API ID.
    */
  var apiId: String
  /**
    * The Function DataSource name.
    */
  var dataSourceName: ResourceName
  /**
    * The Function description.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * The function ID.
    */
  var functionId: ResourceName
  /**
    * The version of the request mapping template. Currently the supported value is 2018-05-29. 
    */
  var functionVersion: String
  /**
    * The Function name.
    */
  var name: ResourceName
  /**
    * The Function request mapping template. Functions support only the 2018-05-29 version of the request mapping template.
    */
  var requestMappingTemplate: MappingTemplate
  /**
    * The Function request mapping template. 
    */
  var responseMappingTemplate: js.UndefOr[MappingTemplate] = js.undefined
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
    val __obj = js.Dynamic.literal(apiId = apiId, dataSourceName = dataSourceName, functionId = functionId, functionVersion = functionVersion, name = name, requestMappingTemplate = requestMappingTemplate)
    if (description != null) __obj.updateDynamic("description")(description)
    if (responseMappingTemplate != null) __obj.updateDynamic("responseMappingTemplate")(responseMappingTemplate)
    __obj.asInstanceOf[UpdateFunctionRequest]
  }
}

