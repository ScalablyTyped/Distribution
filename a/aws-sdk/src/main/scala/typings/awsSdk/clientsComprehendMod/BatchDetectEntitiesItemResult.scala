package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDetectEntitiesItemResult extends StObject {
  
  /**
    * One or more Entity objects, one for each entity detected in the document.
    */
  var Entities: js.UndefOr[ListOfEntities] = js.undefined
  
  /**
    * The zero-based index of the document in the input list.
    */
  var Index: js.UndefOr[Integer] = js.undefined
}
object BatchDetectEntitiesItemResult {
  
  inline def apply(): BatchDetectEntitiesItemResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDetectEntitiesItemResult]
  }
  
  extension [Self <: BatchDetectEntitiesItemResult](x: Self) {
    
    inline def setEntities(value: ListOfEntities): Self = StObject.set(x, "Entities", value.asInstanceOf[js.Any])
    
    inline def setEntitiesUndefined: Self = StObject.set(x, "Entities", js.undefined)
    
    inline def setEntitiesVarargs(value: Entity*): Self = StObject.set(x, "Entities", js.Array(value*))
    
    inline def setIndex(value: Integer): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "Index", js.undefined)
  }
}
