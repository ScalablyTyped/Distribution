package typings.awsSdk.clientsDevopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecommendationRelatedEventResource extends StObject {
  
  /**
    *  The name of the resource that emitted the event. This corresponds to the Name field in an EventResource object. 
    */
  var Name: js.UndefOr[RecommendationRelatedEventResourceName] = js.undefined
  
  /**
    *  The type of the resource that emitted the event. This corresponds to the Type field in an EventResource object. 
    */
  var Type: js.UndefOr[RecommendationRelatedEventResourceType] = js.undefined
}
object RecommendationRelatedEventResource {
  
  inline def apply(): RecommendationRelatedEventResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecommendationRelatedEventResource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecommendationRelatedEventResource] (val x: Self) extends AnyVal {
    
    inline def setName(value: RecommendationRelatedEventResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setType(value: RecommendationRelatedEventResourceType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
