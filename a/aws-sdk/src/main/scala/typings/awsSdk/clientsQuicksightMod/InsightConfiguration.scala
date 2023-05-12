package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsightConfiguration extends StObject {
  
  /**
    * The computations configurations of the insight visual
    */
  var Computations: js.UndefOr[ComputationList] = js.undefined
  
  /**
    * The custom narrative of the insight visual.
    */
  var CustomNarrative: js.UndefOr[CustomNarrativeOptions] = js.undefined
}
object InsightConfiguration {
  
  inline def apply(): InsightConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsightConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InsightConfiguration] (val x: Self) extends AnyVal {
    
    inline def setComputations(value: ComputationList): Self = StObject.set(x, "Computations", value.asInstanceOf[js.Any])
    
    inline def setComputationsUndefined: Self = StObject.set(x, "Computations", js.undefined)
    
    inline def setComputationsVarargs(value: Computation*): Self = StObject.set(x, "Computations", js.Array(value*))
    
    inline def setCustomNarrative(value: CustomNarrativeOptions): Self = StObject.set(x, "CustomNarrative", value.asInstanceOf[js.Any])
    
    inline def setCustomNarrativeUndefined: Self = StObject.set(x, "CustomNarrative", js.undefined)
  }
}
