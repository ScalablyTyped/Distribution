package typings.awsDashSdk.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateResolverRequest extends js.Object {
  /**
    * The API ID.
    */
  var apiId: String = js.native
  /**
    * The caching configuration for the resolver.
    */
  var cachingConfig: js.UndefOr[CachingConfig] = js.native
  /**
    * The new data source name.
    */
  var dataSourceName: js.UndefOr[ResourceName] = js.native
  /**
    * The new field name.
    */
  var fieldName: ResourceName = js.native
  /**
    * The resolver type.    UNIT: A UNIT resolver type. A UNIT resolver is the default resolver type. A UNIT resolver enables you to execute a GraphQL query against a single data source.    PIPELINE: A PIPELINE resolver type. A PIPELINE resolver enables you to execute a series of Function in a serial manner. You can use a pipeline resolver to execute a GraphQL query against multiple data sources.  
    */
  var kind: js.UndefOr[ResolverKind] = js.native
  /**
    * The PipelineConfig.
    */
  var pipelineConfig: js.UndefOr[PipelineConfig] = js.native
  /**
    * The new request mapping template.
    */
  var requestMappingTemplate: MappingTemplate = js.native
  /**
    * The new response mapping template.
    */
  var responseMappingTemplate: js.UndefOr[MappingTemplate] = js.native
  /**
    * The SyncConfig for a resolver attached to a versioned datasource.
    */
  var syncConfig: js.UndefOr[SyncConfig] = js.native
  /**
    * The new type name.
    */
  var typeName: ResourceName = js.native
}

object UpdateResolverRequest {
  @scala.inline
  def apply(
    apiId: String,
    fieldName: ResourceName,
    requestMappingTemplate: MappingTemplate,
    typeName: ResourceName,
    cachingConfig: CachingConfig = null,
    dataSourceName: ResourceName = null,
    kind: ResolverKind = null,
    pipelineConfig: PipelineConfig = null,
    responseMappingTemplate: MappingTemplate = null,
    syncConfig: SyncConfig = null
  ): UpdateResolverRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], fieldName = fieldName.asInstanceOf[js.Any], requestMappingTemplate = requestMappingTemplate.asInstanceOf[js.Any], typeName = typeName.asInstanceOf[js.Any])
    if (cachingConfig != null) __obj.updateDynamic("cachingConfig")(cachingConfig.asInstanceOf[js.Any])
    if (dataSourceName != null) __obj.updateDynamic("dataSourceName")(dataSourceName.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (pipelineConfig != null) __obj.updateDynamic("pipelineConfig")(pipelineConfig.asInstanceOf[js.Any])
    if (responseMappingTemplate != null) __obj.updateDynamic("responseMappingTemplate")(responseMappingTemplate.asInstanceOf[js.Any])
    if (syncConfig != null) __obj.updateDynamic("syncConfig")(syncConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateResolverRequest]
  }
}

