package typings
package awsDashSdkLib.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateResolverRequest extends js.Object {
  /**
    * The ID for the GraphQL API for which the resolver is being created.
    */
  var apiId: String
  /**
    * The name of the data source for which the resolver is being created.
    */
  var dataSourceName: js.UndefOr[ResourceName] = js.undefined
  /**
    * The name of the field to attach the resolver to.
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
    * The mapping template to be used for requests. A resolver uses a request mapping template to convert a GraphQL expression into a format that a data source can understand. Mapping templates are written in Apache Velocity Template Language (VTL).
    */
  var requestMappingTemplate: MappingTemplate
  /**
    * The mapping template to be used for responses from the data source.
    */
  var responseMappingTemplate: js.UndefOr[MappingTemplate] = js.undefined
  /**
    * The name of the Type.
    */
  var typeName: ResourceName
}

object CreateResolverRequest {
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
  ): CreateResolverRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId, fieldName = fieldName, requestMappingTemplate = requestMappingTemplate, typeName = typeName)
    if (dataSourceName != null) __obj.updateDynamic("dataSourceName")(dataSourceName)
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (pipelineConfig != null) __obj.updateDynamic("pipelineConfig")(pipelineConfig)
    if (responseMappingTemplate != null) __obj.updateDynamic("responseMappingTemplate")(responseMappingTemplate)
    __obj.asInstanceOf[CreateResolverRequest]
  }
}

