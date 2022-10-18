package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelCounters extends StObject {
  
  /**
    * The total number of objects that could not be labeled due to an error.
    */
  var FailedNonRetryableError: js.UndefOr[LabelCounter] = js.undefined
  
  /**
    * The total number of objects labeled by a human worker.
    */
  var HumanLabeled: js.UndefOr[LabelCounter] = js.undefined
  
  /**
    * The total number of objects labeled by automated data labeling.
    */
  var MachineLabeled: js.UndefOr[LabelCounter] = js.undefined
  
  /**
    * The total number of objects labeled.
    */
  var TotalLabeled: js.UndefOr[LabelCounter] = js.undefined
  
  /**
    * The total number of objects not yet labeled.
    */
  var Unlabeled: js.UndefOr[LabelCounter] = js.undefined
}
object LabelCounters {
  
  inline def apply(): LabelCounters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelCounters]
  }
  
  extension [Self <: LabelCounters](x: Self) {
    
    inline def setFailedNonRetryableError(value: LabelCounter): Self = StObject.set(x, "FailedNonRetryableError", value.asInstanceOf[js.Any])
    
    inline def setFailedNonRetryableErrorUndefined: Self = StObject.set(x, "FailedNonRetryableError", js.undefined)
    
    inline def setHumanLabeled(value: LabelCounter): Self = StObject.set(x, "HumanLabeled", value.asInstanceOf[js.Any])
    
    inline def setHumanLabeledUndefined: Self = StObject.set(x, "HumanLabeled", js.undefined)
    
    inline def setMachineLabeled(value: LabelCounter): Self = StObject.set(x, "MachineLabeled", value.asInstanceOf[js.Any])
    
    inline def setMachineLabeledUndefined: Self = StObject.set(x, "MachineLabeled", js.undefined)
    
    inline def setTotalLabeled(value: LabelCounter): Self = StObject.set(x, "TotalLabeled", value.asInstanceOf[js.Any])
    
    inline def setTotalLabeledUndefined: Self = StObject.set(x, "TotalLabeled", js.undefined)
    
    inline def setUnlabeled(value: LabelCounter): Self = StObject.set(x, "Unlabeled", value.asInstanceOf[js.Any])
    
    inline def setUnlabeledUndefined: Self = StObject.set(x, "Unlabeled", js.undefined)
  }
}
