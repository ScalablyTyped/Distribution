package typings.awsDashSdk.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Resolver extends js.Object {
  /**
    * The caching configuration for the resolver.
    */
  var cachingConfig: js.UndefOr[CachingConfig] = js.native
  /**
    * The resolver data source name.
    */
  var dataSourceName: js.UndefOr[ResourceName] = js.native
  /**
    * The resolver field name.
    */
  var fieldName: js.UndefOr[ResourceName] = js.native
  /**
    * The resolver type.    UNIT: A UNIT resolver type. A UNIT resolver is the default resolver type. A UNIT resolver enables you to execute a GraphQL query against a single data source.    PIPELINE: A PIPELINE resolver type. A PIPELINE resolver enables you to execute a series of Function in a serial manner. You can use a pipeline resolver to execute a GraphQL query against multiple data sources.  
    */
  var kind: js.UndefOr[ResolverKind] = js.native
  /**
    * The PipelineConfig.
    */
  var pipelineConfig: js.UndefOr[PipelineConfig] = js.native
  /**
    * The request mapping template.
    */
  var requestMappingTemplate: js.UndefOr[MappingTemplate] = js.native
  /**
    * The resolver ARN.
    */
  var resolverArn: js.UndefOr[String] = js.native
  /**
    * The response mapping template.
    */
  var responseMappingTemplate: js.UndefOr[MappingTemplate] = js.native
  /**
    * The SyncConfig for a resolver attached to a versioned datasource.
    */
  var syncConfig: js.UndefOr[SyncConfig] = js.native
  /**
    * The resolver type name.
    */
  var typeName: js.UndefOr[ResourceName] = js.native
}

object Resolver {
  @scala.inline
  def apply(
    cachingConfig: CachingConfig = null,
    dataSourceName: ResourceName = null,
    fieldName: ResourceName = null,
    kind: ResolverKind = null,
    pipelineConfig: PipelineConfig = null,
    requestMappingTemplate: MappingTemplate = null,
    resolverArn: String = null,
    responseMappingTemplate: MappingTemplate = null,
    syncConfig: SyncConfig = null,
    typeName: ResourceName = null
  ): Resolver = {
    val __obj = js.Dynamic.literal()
    if (cachingConfig != null) __obj.updateDynamic("cachingConfig")(cachingConfig.asInstanceOf[js.Any])
    if (dataSourceName != null) __obj.updateDynamic("dataSourceName")(dataSourceName.asInstanceOf[js.Any])
    if (fieldName != null) __obj.updateDynamic("fieldName")(fieldName.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (pipelineConfig != null) __obj.updateDynamic("pipelineConfig")(pipelineConfig.asInstanceOf[js.Any])
    if (requestMappingTemplate != null) __obj.updateDynamic("requestMappingTemplate")(requestMappingTemplate.asInstanceOf[js.Any])
    if (resolverArn != null) __obj.updateDynamic("resolverArn")(resolverArn.asInstanceOf[js.Any])
    if (responseMappingTemplate != null) __obj.updateDynamic("responseMappingTemplate")(responseMappingTemplate.asInstanceOf[js.Any])
    if (syncConfig != null) __obj.updateDynamic("syncConfig")(syncConfig.asInstanceOf[js.Any])
    if (typeName != null) __obj.updateDynamic("typeName")(typeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resolver]
  }
}

