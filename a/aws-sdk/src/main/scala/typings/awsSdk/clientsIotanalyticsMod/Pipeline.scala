package typings.awsSdk.clientsIotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pipeline extends StObject {
  
  /**
    * The activities that perform transformations on the messages.
    */
  var activities: js.UndefOr[PipelineActivities] = js.undefined
  
  /**
    * The ARN of the pipeline.
    */
  var arn: js.UndefOr[PipelineArn] = js.undefined
  
  /**
    * When the pipeline was created.
    */
  var creationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The last time the pipeline was updated.
    */
  var lastUpdateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the pipeline.
    */
  var name: js.UndefOr[PipelineName] = js.undefined
  
  /**
    * A summary of information about the pipeline reprocessing.
    */
  var reprocessingSummaries: js.UndefOr[ReprocessingSummaries] = js.undefined
}
object Pipeline {
  
  inline def apply(): Pipeline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pipeline]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Pipeline] (val x: Self) extends AnyVal {
    
    inline def setActivities(value: PipelineActivities): Self = StObject.set(x, "activities", value.asInstanceOf[js.Any])
    
    inline def setActivitiesUndefined: Self = StObject.set(x, "activities", js.undefined)
    
    inline def setActivitiesVarargs(value: PipelineActivity*): Self = StObject.set(x, "activities", js.Array(value*))
    
    inline def setArn(value: PipelineArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setLastUpdateTime(value: js.Date): Self = StObject.set(x, "lastUpdateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateTimeUndefined: Self = StObject.set(x, "lastUpdateTime", js.undefined)
    
    inline def setName(value: PipelineName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReprocessingSummaries(value: ReprocessingSummaries): Self = StObject.set(x, "reprocessingSummaries", value.asInstanceOf[js.Any])
    
    inline def setReprocessingSummariesUndefined: Self = StObject.set(x, "reprocessingSummaries", js.undefined)
    
    inline def setReprocessingSummariesVarargs(value: ReprocessingSummary*): Self = StObject.set(x, "reprocessingSummaries", js.Array(value*))
  }
}
