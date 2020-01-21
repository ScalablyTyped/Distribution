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
    if (dataSourceName != null) __obj.updateDynamic("dataSourceName")(dataSourceName.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (functionArn != null) __obj.updateDynamic("functionArn")(functionArn.asInstanceOf[js.Any])
    if (functionId != null) __obj.updateDynamic("functionId")(functionId.asInstanceOf[js.Any])
    if (functionVersion != null) __obj.updateDynamic("functionVersion")(functionVersion.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (requestMappingTemplate != null) __obj.updateDynamic("requestMappingTemplate")(requestMappingTemplate.asInstanceOf[js.Any])
    if (responseMappingTemplate != null) __obj.updateDynamic("responseMappingTemplate")(responseMappingTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionConfiguration]
  }
}

