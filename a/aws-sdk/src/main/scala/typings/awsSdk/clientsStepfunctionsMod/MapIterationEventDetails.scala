package typings.awsSdk.clientsStepfunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapIterationEventDetails extends StObject {
  
  /**
    * The index of the array belonging to the Map state iteration.
    */
  var index: js.UndefOr[UnsignedInteger] = js.undefined
  
  /**
    * The name of the iteration’s parent Map state.
    */
  var name: js.UndefOr[Name] = js.undefined
}
object MapIterationEventDetails {
  
  inline def apply(): MapIterationEventDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapIterationEventDetails]
  }
  
  extension [Self <: MapIterationEventDetails](x: Self) {
    
    inline def setIndex(value: UnsignedInteger): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
