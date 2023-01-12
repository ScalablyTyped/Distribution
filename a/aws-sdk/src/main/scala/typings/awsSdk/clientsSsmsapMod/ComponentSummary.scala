package typings.awsSdk.clientsSsmsapMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentSummary extends StObject {
  
  /**
    * 
    */
  var ApplicationId: js.UndefOr[typings.awsSdk.clientsSsmsapMod.ApplicationId] = js.undefined
  
  /**
    * 
    */
  var ComponentId: js.UndefOr[typings.awsSdk.clientsSsmsapMod.ComponentId] = js.undefined
  
  /**
    * 
    */
  var ComponentType: js.UndefOr[typings.awsSdk.clientsSsmsapMod.ComponentType] = js.undefined
  
  /**
    * 
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object ComponentSummary {
  
  inline def apply(): ComponentSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComponentSummary] (val x: Self) extends AnyVal {
    
    inline def setApplicationId(value: ApplicationId): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    inline def setApplicationIdUndefined: Self = StObject.set(x, "ApplicationId", js.undefined)
    
    inline def setComponentId(value: ComponentId): Self = StObject.set(x, "ComponentId", value.asInstanceOf[js.Any])
    
    inline def setComponentIdUndefined: Self = StObject.set(x, "ComponentId", js.undefined)
    
    inline def setComponentType(value: ComponentType): Self = StObject.set(x, "ComponentType", value.asInstanceOf[js.Any])
    
    inline def setComponentTypeUndefined: Self = StObject.set(x, "ComponentType", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
