package typings.awsDashSdk.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionConfiguration extends js.Object {
  /**
    * The name of the DataSource.
    */
  var dataSourceName: js.UndefOr[ResourceName] = js.undefined
  /**
    * The Function description.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * The ARN of the Function object.
    */
  var functionArn: js.UndefOr[String] = js.undefined
  /**
    * A unique ID representing the Function object.
    */
  var functionId: js.UndefOr[String] = js.undefined
  /**
    * The version of the request mapping template. Currently only the 2018-05-29 version of the template is supported.
    */
  var functionVersion: js.UndefOr[String] = js.undefined
  /**
    * The name of the Function object.
    */
  var name: js.UndefOr[ResourceName] = js.undefined
  /**
    * The Function request mapping template. Functions support only the 2018-05-29 version of the request mapping template.
    */
  var requestMappingTemplate: js.UndefOr[MappingTemplate] = js.undefined
  /**
    * The Function response mapping template.
    */
  var responseMappingTemplate: js.UndefOr[MappingTemplate] = js.undefined
}

object FunctionConfiguration {
  @scala.inline
  def apply(
    dataSourceName: ResourceName = null,
    description: String = null,
    functionArn: String = null,
    functionId: String = null,
    functionVersion: String = null,
    name: ResourceName = null,
    requestMappingTemplate: MappingTemplate = null,
    responseMappingTemplate: MappingTemplate = null
  ): FunctionConfiguration = {
    val __obj = js.Dynamic.literal()
    if (dataSourceName != null) __obj.updateDynamic("dataSourceName")(dataSourceName)
    if (description != null) __obj.updateDynamic("description")(description)
    if (functionArn != null) __obj.updateDynamic("functionArn")(functionArn)
    if (functionId != null) __obj.updateDynamic("functionId")(functionId)
    if (functionVersion != null) __obj.updateDynamic("functionVersion")(functionVersion)
    if (name != null) __obj.updateDynamic("name")(name)
    if (requestMappingTemplate != null) __obj.updateDynamic("requestMappingTemplate")(requestMappingTemplate)
    if (responseMappingTemplate != null) __obj.updateDynamic("responseMappingTemplate")(responseMappingTemplate)
    __obj.asInstanceOf[FunctionConfiguration]
  }
}

