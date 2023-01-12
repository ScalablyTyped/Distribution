package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTrialRequest extends StObject {
  
  /**
    * The name of the trial as displayed. The name doesn't need to be unique. If DisplayName isn't specified, TrialName is displayed.
    */
  var DisplayName: js.UndefOr[ExperimentEntityName] = js.undefined
  
  /**
    * The name of the experiment to associate the trial with.
    */
  var ExperimentName: ExperimentEntityName
  
  var MetadataProperties: js.UndefOr[typings.awsSdk.clientsSagemakerMod.MetadataProperties] = js.undefined
  
  /**
    * A list of tags to associate with the trial. You can use Search API to search on the tags.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The name of the trial. The name must be unique in your Amazon Web Services account and is not case-sensitive.
    */
  var TrialName: ExperimentEntityName
}
object CreateTrialRequest {
  
  inline def apply(ExperimentName: ExperimentEntityName, TrialName: ExperimentEntityName): CreateTrialRequest = {
    val __obj = js.Dynamic.literal(ExperimentName = ExperimentName.asInstanceOf[js.Any], TrialName = TrialName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTrialRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateTrialRequest] (val x: Self) extends AnyVal {
    
    inline def setDisplayName(value: ExperimentEntityName): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    inline def setExperimentName(value: ExperimentEntityName): Self = StObject.set(x, "ExperimentName", value.asInstanceOf[js.Any])
    
    inline def setMetadataProperties(value: MetadataProperties): Self = StObject.set(x, "MetadataProperties", value.asInstanceOf[js.Any])
    
    inline def setMetadataPropertiesUndefined: Self = StObject.set(x, "MetadataProperties", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTrialName(value: ExperimentEntityName): Self = StObject.set(x, "TrialName", value.asInstanceOf[js.Any])
  }
}
