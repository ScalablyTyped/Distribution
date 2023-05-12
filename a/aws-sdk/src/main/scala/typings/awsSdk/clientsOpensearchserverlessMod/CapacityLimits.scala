package typings.awsSdk.clientsOpensearchserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CapacityLimits extends StObject {
  
  /**
    * The maximum indexing capacity for collections.
    */
  var maxIndexingCapacityInOCU: js.UndefOr[IndexingCapacityValue] = js.undefined
  
  /**
    * The maximum search capacity for collections.
    */
  var maxSearchCapacityInOCU: js.UndefOr[SearchCapacityValue] = js.undefined
}
object CapacityLimits {
  
  inline def apply(): CapacityLimits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CapacityLimits]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CapacityLimits] (val x: Self) extends AnyVal {
    
    inline def setMaxIndexingCapacityInOCU(value: IndexingCapacityValue): Self = StObject.set(x, "maxIndexingCapacityInOCU", value.asInstanceOf[js.Any])
    
    inline def setMaxIndexingCapacityInOCUUndefined: Self = StObject.set(x, "maxIndexingCapacityInOCU", js.undefined)
    
    inline def setMaxSearchCapacityInOCU(value: SearchCapacityValue): Self = StObject.set(x, "maxSearchCapacityInOCU", value.asInstanceOf[js.Any])
    
    inline def setMaxSearchCapacityInOCUUndefined: Self = StObject.set(x, "maxSearchCapacityInOCU", js.undefined)
  }
}
