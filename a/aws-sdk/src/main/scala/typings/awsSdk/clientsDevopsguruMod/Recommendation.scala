package typings.awsSdk.clientsDevopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Recommendation extends StObject {
  
  /**
    * The category type of the recommendation.
    */
  var Category: js.UndefOr[RecommendationCategory] = js.undefined
  
  /**
    *  A description of the problem. 
    */
  var Description: js.UndefOr[RecommendationDescription] = js.undefined
  
  /**
    *  A hyperlink to information to help you address the problem. 
    */
  var Link: js.UndefOr[RecommendationLink] = js.undefined
  
  /**
    *  The name of the recommendation. 
    */
  var Name: js.UndefOr[RecommendationName] = js.undefined
  
  /**
    *  The reason DevOps Guru flagged the anomalous behavior as a problem. 
    */
  var Reason: js.UndefOr[RecommendationReason] = js.undefined
  
  /**
    *  Anomalies that are related to the problem. Use these Anomalies to learn more about what's happening and to help address the issue. 
    */
  var RelatedAnomalies: js.UndefOr[RecommendationRelatedAnomalies] = js.undefined
  
  /**
    *  Events that are related to the problem. Use these events to learn more about what's happening and to help address the issue. 
    */
  var RelatedEvents: js.UndefOr[RecommendationRelatedEvents] = js.undefined
}
object Recommendation {
  
  inline def apply(): Recommendation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Recommendation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Recommendation] (val x: Self) extends AnyVal {
    
    inline def setCategory(value: RecommendationCategory): Self = StObject.set(x, "Category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "Category", js.undefined)
    
    inline def setDescription(value: RecommendationDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setLink(value: RecommendationLink): Self = StObject.set(x, "Link", value.asInstanceOf[js.Any])
    
    inline def setLinkUndefined: Self = StObject.set(x, "Link", js.undefined)
    
    inline def setName(value: RecommendationName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setReason(value: RecommendationReason): Self = StObject.set(x, "Reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "Reason", js.undefined)
    
    inline def setRelatedAnomalies(value: RecommendationRelatedAnomalies): Self = StObject.set(x, "RelatedAnomalies", value.asInstanceOf[js.Any])
    
    inline def setRelatedAnomaliesUndefined: Self = StObject.set(x, "RelatedAnomalies", js.undefined)
    
    inline def setRelatedAnomaliesVarargs(value: RecommendationRelatedAnomaly*): Self = StObject.set(x, "RelatedAnomalies", js.Array(value*))
    
    inline def setRelatedEvents(value: RecommendationRelatedEvents): Self = StObject.set(x, "RelatedEvents", value.asInstanceOf[js.Any])
    
    inline def setRelatedEventsUndefined: Self = StObject.set(x, "RelatedEvents", js.undefined)
    
    inline def setRelatedEventsVarargs(value: RecommendationRelatedEvent*): Self = StObject.set(x, "RelatedEvents", js.Array(value*))
  }
}
