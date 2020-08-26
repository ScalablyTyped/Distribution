package typings.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateResolverRequest extends js.Object {
  /**
    * The ID for the GraphQL API for which the resolver is being created.
    */
  var apiId: String = js.native
  /**
    * The caching configuration for the resolver.
    */
  var cachingConfig: js.UndefOr[CachingConfig] = js.native
  /**
    * The name of the data source for which the resolver is being created.
    */
  var dataSourceName: js.UndefOr[ResourceName] = js.native
  /**
    * The name of the field to attach the resolver to.
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
    * The mapping template to be used for requests. A resolver uses a request mapping template to convert a GraphQL expression into a format that a data source can understand. Mapping templates are written in Apache Velocity Template Language (VTL).
    */
  var requestMappingTemplate: MappingTemplate = js.native
  /**
    * The mapping template to be used for responses from the data source.
    */
  var responseMappingTemplate: js.UndefOr[MappingTemplate] = js.native
  /**
    * The SyncConfig for a resolver attached to a versioned datasource.
    */
  var syncConfig: js.UndefOr[SyncConfig] = js.native
  /**
    * The name of the Type.
    */
  var typeName: ResourceName = js.native
}

object CreateResolverRequest {
  @scala.inline
  def apply(
    apiId: String,
    fieldName: ResourceName,
    requestMappingTemplate: MappingTemplate,
    typeName: ResourceName
  ): CreateResolverRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], fieldName = fieldName.asInstanceOf[js.Any], requestMappingTemplate = requestMappingTemplate.asInstanceOf[js.Any], typeName = typeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateResolverRequest]
  }
  @scala.inline
  implicit class CreateResolverRequestOps[Self <: CreateResolverRequest] (val x: Self) extends AnyVal {
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
    def setApiId(value: String): Self = this.set("apiId", value.asInstanceOf[js.Any])
    @scala.inline
    def setFieldName(value: ResourceName): Self = this.set("fieldName", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestMappingTemplate(value: MappingTemplate): Self = this.set("requestMappingTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeName(value: ResourceName): Self = this.set("typeName", value.asInstanceOf[js.Any])
    @scala.inline
    def setCachingConfig(value: CachingConfig): Self = this.set("cachingConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCachingConfig: Self = this.set("cachingConfig", js.undefined)
    @scala.inline
    def setDataSourceName(value: ResourceName): Self = this.set("dataSourceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSourceName: Self = this.set("dataSourceName", js.undefined)
    @scala.inline
    def setKind(value: ResolverKind): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setPipelineConfig(value: PipelineConfig): Self = this.set("pipelineConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePipelineConfig: Self = this.set("pipelineConfig", js.undefined)
    @scala.inline
    def setResponseMappingTemplate(value: MappingTemplate): Self = this.set("responseMappingTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseMappingTemplate: Self = this.set("responseMappingTemplate", js.undefined)
    @scala.inline
    def setSyncConfig(value: SyncConfig): Self = this.set("syncConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSyncConfig: Self = this.set("syncConfig", js.undefined)
  }
  
}

