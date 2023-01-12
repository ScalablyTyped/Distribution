package typings.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecommenderUpdateSummary extends StObject {
  
  /**
    * The date and time (in Unix format) that the recommender update was created.
    */
  var creationDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * If a recommender update fails, the reason behind the failure.
    */
  var failureReason: js.UndefOr[FailureReason] = js.undefined
  
  /**
    * The date and time (in Unix time) that the recommender update was last updated.
    */
  var lastUpdatedDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The configuration details of the recommender update.
    */
  var recommenderConfig: js.UndefOr[RecommenderConfig] = js.undefined
  
  /**
    * The status of the recommender update. A recommender can be in one of the following states:   CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED   STOP PENDING &gt; STOP IN_PROGRESS &gt; INACTIVE &gt; START PENDING &gt; START IN_PROGRESS &gt; ACTIVE   DELETE PENDING &gt; DELETE IN_PROGRESS  
    */
  var status: js.UndefOr[Status] = js.undefined
}
object RecommenderUpdateSummary {
  
  inline def apply(): RecommenderUpdateSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecommenderUpdateSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecommenderUpdateSummary] (val x: Self) extends AnyVal {
    
    inline def setCreationDateTime(value: js.Date): Self = StObject.set(x, "creationDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreationDateTimeUndefined: Self = StObject.set(x, "creationDateTime", js.undefined)
    
    inline def setFailureReason(value: FailureReason): Self = StObject.set(x, "failureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "failureReason", js.undefined)
    
    inline def setLastUpdatedDateTime(value: js.Date): Self = StObject.set(x, "lastUpdatedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedDateTimeUndefined: Self = StObject.set(x, "lastUpdatedDateTime", js.undefined)
    
    inline def setRecommenderConfig(value: RecommenderConfig): Self = StObject.set(x, "recommenderConfig", value.asInstanceOf[js.Any])
    
    inline def setRecommenderConfigUndefined: Self = StObject.set(x, "recommenderConfig", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
