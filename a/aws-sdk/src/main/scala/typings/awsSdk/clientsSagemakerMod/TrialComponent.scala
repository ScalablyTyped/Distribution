package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrialComponent extends StObject {
  
  /**
    * Who created the trial component.
    */
  var CreatedBy: js.UndefOr[UserContext] = js.undefined
  
  /**
    * When the component was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the component as displayed. If DisplayName isn't specified, TrialComponentName is displayed.
    */
  var DisplayName: js.UndefOr[ExperimentEntityName] = js.undefined
  
  /**
    * When the component ended.
    */
  var EndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The input artifacts of the component.
    */
  var InputArtifacts: js.UndefOr[TrialComponentArtifacts] = js.undefined
  
  var LastModifiedBy: js.UndefOr[UserContext] = js.undefined
  
  /**
    * When the component was last modified.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the lineage group resource.
    */
  var LineageGroupArn: js.UndefOr[typings.awsSdk.clientsSagemakerMod.LineageGroupArn] = js.undefined
  
  var MetadataProperties: js.UndefOr[typings.awsSdk.clientsSagemakerMod.MetadataProperties] = js.undefined
  
  /**
    * The metrics for the component.
    */
  var Metrics: js.UndefOr[TrialComponentMetricSummaries] = js.undefined
  
  /**
    * The output artifacts of the component.
    */
  var OutputArtifacts: js.UndefOr[TrialComponentArtifacts] = js.undefined
  
  /**
    * The hyperparameters of the component.
    */
  var Parameters: js.UndefOr[TrialComponentParameters] = js.undefined
  
  /**
    * An array of the parents of the component. A parent is a trial the component is associated with and the experiment the trial is part of. A component might not have any parents.
    */
  var Parents: js.UndefOr[typings.awsSdk.clientsSagemakerMod.Parents] = js.undefined
  
  /**
    * The name of the experiment run.
    */
  var RunName: js.UndefOr[ExperimentEntityName] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) and job type of the source of the component.
    */
  var Source: js.UndefOr[TrialComponentSource] = js.undefined
  
  /**
    * Details of the source of the component.
    */
  var SourceDetail: js.UndefOr[TrialComponentSourceDetail] = js.undefined
  
  /**
    * When the component started.
    */
  var StartTime: js.UndefOr[js.Date] = js.undefined
  
  var Status: js.UndefOr[TrialComponentStatus] = js.undefined
  
  /**
    * The list of tags that are associated with the component. You can use Search API to search on the tags.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the trial component.
    */
  var TrialComponentArn: js.UndefOr[typings.awsSdk.clientsSagemakerMod.TrialComponentArn] = js.undefined
  
  /**
    * The name of the trial component.
    */
  var TrialComponentName: js.UndefOr[ExperimentEntityName] = js.undefined
}
object TrialComponent {
  
  inline def apply(): TrialComponent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrialComponent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TrialComponent] (val x: Self) extends AnyVal {
    
    inline def setCreatedBy(value: UserContext): Self = StObject.set(x, "CreatedBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "CreatedBy", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setDisplayName(value: ExperimentEntityName): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    inline def setInputArtifacts(value: TrialComponentArtifacts): Self = StObject.set(x, "InputArtifacts", value.asInstanceOf[js.Any])
    
    inline def setInputArtifactsUndefined: Self = StObject.set(x, "InputArtifacts", js.undefined)
    
    inline def setLastModifiedBy(value: UserContext): Self = StObject.set(x, "LastModifiedBy", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedByUndefined: Self = StObject.set(x, "LastModifiedBy", js.undefined)
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setLineageGroupArn(value: LineageGroupArn): Self = StObject.set(x, "LineageGroupArn", value.asInstanceOf[js.Any])
    
    inline def setLineageGroupArnUndefined: Self = StObject.set(x, "LineageGroupArn", js.undefined)
    
    inline def setMetadataProperties(value: MetadataProperties): Self = StObject.set(x, "MetadataProperties", value.asInstanceOf[js.Any])
    
    inline def setMetadataPropertiesUndefined: Self = StObject.set(x, "MetadataProperties", js.undefined)
    
    inline def setMetrics(value: TrialComponentMetricSummaries): Self = StObject.set(x, "Metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "Metrics", js.undefined)
    
    inline def setMetricsVarargs(value: TrialComponentMetricSummary*): Self = StObject.set(x, "Metrics", js.Array(value*))
    
    inline def setOutputArtifacts(value: TrialComponentArtifacts): Self = StObject.set(x, "OutputArtifacts", value.asInstanceOf[js.Any])
    
    inline def setOutputArtifactsUndefined: Self = StObject.set(x, "OutputArtifacts", js.undefined)
    
    inline def setParameters(value: TrialComponentParameters): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    inline def setParents(value: Parents): Self = StObject.set(x, "Parents", value.asInstanceOf[js.Any])
    
    inline def setParentsUndefined: Self = StObject.set(x, "Parents", js.undefined)
    
    inline def setParentsVarargs(value: Parent*): Self = StObject.set(x, "Parents", js.Array(value*))
    
    inline def setRunName(value: ExperimentEntityName): Self = StObject.set(x, "RunName", value.asInstanceOf[js.Any])
    
    inline def setRunNameUndefined: Self = StObject.set(x, "RunName", js.undefined)
    
    inline def setSource(value: TrialComponentSource): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    inline def setSourceDetail(value: TrialComponentSourceDetail): Self = StObject.set(x, "SourceDetail", value.asInstanceOf[js.Any])
    
    inline def setSourceDetailUndefined: Self = StObject.set(x, "SourceDetail", js.undefined)
    
    inline def setSourceUndefined: Self = StObject.set(x, "Source", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    inline def setStatus(value: TrialComponentStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTrialComponentArn(value: TrialComponentArn): Self = StObject.set(x, "TrialComponentArn", value.asInstanceOf[js.Any])
    
    inline def setTrialComponentArnUndefined: Self = StObject.set(x, "TrialComponentArn", js.undefined)
    
    inline def setTrialComponentName(value: ExperimentEntityName): Self = StObject.set(x, "TrialComponentName", value.asInstanceOf[js.Any])
    
    inline def setTrialComponentNameUndefined: Self = StObject.set(x, "TrialComponentName", js.undefined)
  }
}
