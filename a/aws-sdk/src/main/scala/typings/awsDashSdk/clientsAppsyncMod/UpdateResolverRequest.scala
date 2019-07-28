package typings.awsDashSdk.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateResolverRequest extends js.Object {
  /**
    * The API ID.
    */
  var apiId: String
  /**
    * The new data source name.
    */
  var dataSourceName: js.UndefOr[ResourceName] = js.undefined
  /**
    * The new field name.
    */
  var fieldName: ResourceName
  /**
    * The resolver type.    UNIT: A UNIT resolver type. A UNIT resolver is the default resolver type. A UNIT resolver enables you to execute a GraphQL query against a single data source.    PIPELINE: A PIPELINE resolver type. A PIPELINE resolver enables you to execute a series of Function in a serial manner. You can use a pipeline resolver to execute a GraphQL query against multiple data sources.  
    */
  var kind: js.UndefOr[ResolverKind] = js.undefined
  /**
    * The PipelineConfig.
    */
  var pipelineConfig: js.UndefOr[PipelineConfig] = js.undefined
  /**
    * The new request mapping template.
    */
  var requestMappingTemplate: MappingTemplate
  /**
    * The new response mapping template.
    */
  var responseMappingTemplate: js.UndefOr[MappingTemplate] = js.undefined
  /**
    * The new type name.
    */
  var typeName: ResourceName
}

object UpdateResolverRequest {
  @scala.inline
  def apply(
    apiId: String,
    fieldName: ResourceName,
    requestMappingTemplate: MappingTemplate,
    typeName: ResourceName,
    dataSourceName: ResourceName = null,
    kind: ResolverKind = null,
    pipelineConfig: PipelineConfig = null,
    responseMappingTemplate: MappingTemplate = null
  ): UpdateResolverRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId, fieldName = fieldName, requestMappingTemplate = requestMappingTemplate, typeName = typeName)
    if (dataSourceName != null) __obj.updateDynamic("dataSourceName")(dataSourceName)
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (pipelineConfig != null) __obj.updateDynamic("pipelineConfig")(pipelineConfig)
    if (responseMappingTemplate != null) __obj.updateDynamic("responseMappingTemplate")(responseMappingTemplate)
    __obj.asInstanceOf[UpdateResolverRequest]
  }
}

