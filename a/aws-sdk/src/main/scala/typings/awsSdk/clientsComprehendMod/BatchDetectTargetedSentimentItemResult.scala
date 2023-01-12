package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDetectTargetedSentimentItemResult extends StObject {
  
  /**
    * An array of targeted sentiment entities.
    */
  var Entities: js.UndefOr[ListOfTargetedSentimentEntities] = js.undefined
  
  /**
    * The zero-based index of this result in the input list.
    */
  var Index: js.UndefOr[Integer] = js.undefined
}
object BatchDetectTargetedSentimentItemResult {
  
  inline def apply(): BatchDetectTargetedSentimentItemResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDetectTargetedSentimentItemResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchDetectTargetedSentimentItemResult] (val x: Self) extends AnyVal {
    
    inline def setEntities(value: ListOfTargetedSentimentEntities): Self = StObject.set(x, "Entities", value.asInstanceOf[js.Any])
    
    inline def setEntitiesUndefined: Self = StObject.set(x, "Entities", js.undefined)
    
    inline def setEntitiesVarargs(value: TargetedSentimentEntity*): Self = StObject.set(x, "Entities", js.Array(value*))
    
    inline def setIndex(value: Integer): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "Index", js.undefined)
  }
}
