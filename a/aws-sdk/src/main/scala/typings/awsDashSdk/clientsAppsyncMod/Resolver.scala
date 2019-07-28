package typings.awsDashSdk.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resolver extends js.Object {
  /**
    * The resolver data source name.
    */
  var dataSourceName: js.UndefOr[ResourceName] = js.undefined
  /**
    * The resolver field name.
    */
  var fieldName: js.UndefOr[ResourceName] = js.undefined
  /**
    * The resolver type.    UNIT: A UNIT resolver type. A UNIT resolver is the default resolver type. A UNIT resolver enables you to execute a GraphQL query against a single data source.    PIPELINE: A PIPELINE resolver type. A PIPELINE resolver enables you to execute a series of Function in a serial manner. You can use a pipeline resolver to execute a GraphQL query against multiple data sources.  
    */
  var kind: js.UndefOr[ResolverKind] = js.undefined
  /**
    * The PipelineConfig.
    */
  var pipelineConfig: js.UndefOr[PipelineConfig] = js.undefined
  /**
    * The request mapping template.
    */
  var requestMappingTemplate: js.UndefOr[MappingTemplate] = js.undefined
  /**
    * The resolver ARN.
    */
  var resolverArn: js.UndefOr[String] = js.undefined
  /**
    * The response mapping template.
    */
  var responseMappingTemplate: js.UndefOr[MappingTemplate] = js.undefined
  /**
    * The resolver type name.
    */
  var typeName: js.UndefOr[ResourceName] = js.undefined
}

object Resolver {
  @scala.inline
  def apply(
    dataSourceName: ResourceName = null,
    fieldName: ResourceName = null,
    kind: ResolverKind = null,
    pipelineConfig: PipelineConfig = null,
    requestMappingTemplate: MappingTemplate = null,
    resolverArn: String = null,
    responseMappingTemplate: MappingTemplate = null,
    typeName: ResourceName = null
  ): Resolver = {
    val __obj = js.Dynamic.literal()
    if (dataSourceName != null) __obj.updateDynamic("dataSourceName")(dataSourceName)
    if (fieldName != null) __obj.updateDynamic("fieldName")(fieldName)
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (pipelineConfig != null) __obj.updateDynamic("pipelineConfig")(pipelineConfig)
    if (requestMappingTemplate != null) __obj.updateDynamic("requestMappingTemplate")(requestMappingTemplate)
    if (resolverArn != null) __obj.updateDynamic("resolverArn")(resolverArn)
    if (responseMappingTemplate != null) __obj.updateDynamic("responseMappingTemplate")(responseMappingTemplate)
    if (typeName != null) __obj.updateDynamic("typeName")(typeName)
    __obj.asInstanceOf[Resolver]
  }
}

