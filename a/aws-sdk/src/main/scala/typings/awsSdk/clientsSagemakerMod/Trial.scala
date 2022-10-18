package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Trial extends StObject {
  
  /**
    * Who created the trial.
    */
  var CreatedBy: js.UndefOr[UserContext] = js.undefined
  
  /**
    * When the trial was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the trial as displayed. If DisplayName isn't specified, TrialName is displayed.
    */
  var DisplayName: js.UndefOr[ExperimentEntityName] = js.undefined
  
  /**
    * The name of the experiment the trial is part of.
    */
  var ExperimentName: js.UndefOr[ExperimentEntityName] = js.undefined
  
  var LastModifiedBy: js.UndefOr[UserContext] = js.undefined
  
  /**
    * Who last modified the trial.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
  
  var MetadataProperties: js.UndefOr[typings.awsSdk.clientsSagemakerMod.MetadataProperties] = js.undefined
  
  var Source: js.UndefOr[TrialSource] = js.undefined
  
  /**
    * The list of tags that are associated with the trial. You can use Search API to search on the tags.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the trial.
    */
  var TrialArn: js.UndefOr[typings.awsSdk.clientsSagemakerMod.TrialArn] = js.undefined
  
  /**
    * A list of the components associated with the trial. For each component, a summary of the component's properties is included.
    */
  var TrialComponentSummaries: js.UndefOr[TrialComponentSimpleSummaries] = js.undefined
  
  /**
    * The name of the trial.
    */
  var TrialName: js.UndefOr[ExperimentEntityName] = js.undefined
}
object Trial {
  
  inline def apply(): Trial = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Trial]
  }
  
  extension [Self <: Trial](x: Self) {
    
    inline def setCreatedBy(value: UserContext): Self = StObject.set(x, "CreatedBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "CreatedBy", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setDisplayName(value: ExperimentEntityName): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    inline def setExperimentName(value: ExperimentEntityName): Self = StObject.set(x, "ExperimentName", value.asInstanceOf[js.Any])
    
    inline def setExperimentNameUndefined: Self = StObject.set(x, "ExperimentName", js.undefined)
    
    inline def setLastModifiedBy(value: UserContext): Self = StObject.set(x, "LastModifiedBy", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedByUndefined: Self = StObject.set(x, "LastModifiedBy", js.undefined)
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setMetadataProperties(value: MetadataProperties): Self = StObject.set(x, "MetadataProperties", value.asInstanceOf[js.Any])
    
    inline def setMetadataPropertiesUndefined: Self = StObject.set(x, "MetadataProperties", js.undefined)
    
    inline def setSource(value: TrialSource): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "Source", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTrialArn(value: TrialArn): Self = StObject.set(x, "TrialArn", value.asInstanceOf[js.Any])
    
    inline def setTrialArnUndefined: Self = StObject.set(x, "TrialArn", js.undefined)
    
    inline def setTrialComponentSummaries(value: TrialComponentSimpleSummaries): Self = StObject.set(x, "TrialComponentSummaries", value.asInstanceOf[js.Any])
    
    inline def setTrialComponentSummariesUndefined: Self = StObject.set(x, "TrialComponentSummaries", js.undefined)
    
    inline def setTrialComponentSummariesVarargs(value: TrialComponentSimpleSummary*): Self = StObject.set(x, "TrialComponentSummaries", js.Array(value*))
    
    inline def setTrialName(value: ExperimentEntityName): Self = StObject.set(x, "TrialName", value.asInstanceOf[js.Any])
    
    inline def setTrialNameUndefined: Self = StObject.set(x, "TrialName", js.undefined)
  }
}
