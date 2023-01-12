package typings.awsSdk.clientsDevopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecommendationRelatedEvent extends StObject {
  
  /**
    *  The name of the event. This corresponds to the Name field in an Event object. 
    */
  var Name: js.UndefOr[RecommendationRelatedEventName] = js.undefined
  
  /**
    *  A ResourceCollection object that contains arrays of the names of Amazon Web Services CloudFormation stacks. You can specify up to 500 Amazon Web Services CloudFormation stacks. 
    */
  var Resources: js.UndefOr[RecommendationRelatedEventResources] = js.undefined
}
object RecommendationRelatedEvent {
  
  inline def apply(): RecommendationRelatedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecommendationRelatedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecommendationRelatedEvent] (val x: Self) extends AnyVal {
    
    inline def setName(value: RecommendationRelatedEventName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setResources(value: RecommendationRelatedEventResources): Self = StObject.set(x, "Resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "Resources", js.undefined)
    
    inline def setResourcesVarargs(value: RecommendationRelatedEventResource*): Self = StObject.set(x, "Resources", js.Array(value*))
  }
}
