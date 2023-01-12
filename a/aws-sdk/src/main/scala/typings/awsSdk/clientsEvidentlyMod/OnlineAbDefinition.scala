package typings.awsSdk.clientsEvidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnlineAbDefinition extends StObject {
  
  /**
    * The name of the variation that is the default variation that the other variations are compared to.
    */
  var controlTreatmentName: js.UndefOr[TreatmentName] = js.undefined
  
  /**
    * A set of key-value pairs. The keys are variation names, and the values are the portion of experiment traffic to be assigned to that variation. The traffic portion is specified in thousandths of a percent, so 20,000 for a variation would allocate 20% of the experiment traffic to that variation.
    */
  var treatmentWeights: js.UndefOr[TreatmentToWeightMap] = js.undefined
}
object OnlineAbDefinition {
  
  inline def apply(): OnlineAbDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnlineAbDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnlineAbDefinition] (val x: Self) extends AnyVal {
    
    inline def setControlTreatmentName(value: TreatmentName): Self = StObject.set(x, "controlTreatmentName", value.asInstanceOf[js.Any])
    
    inline def setControlTreatmentNameUndefined: Self = StObject.set(x, "controlTreatmentName", js.undefined)
    
    inline def setTreatmentWeights(value: TreatmentToWeightMap): Self = StObject.set(x, "treatmentWeights", value.asInstanceOf[js.Any])
    
    inline def setTreatmentWeightsUndefined: Self = StObject.set(x, "treatmentWeights", js.undefined)
  }
}
