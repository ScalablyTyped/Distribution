package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelSchema extends StObject {
  
  /**
    * The label mapper maps the Amazon Fraud Detector supported model classification labels (FRAUD, LEGIT) to the appropriate event type labels. For example, if "FRAUD" and "LEGIT" are Amazon Fraud Detector supported labels, this mapper could be: {"FRAUD" =&gt; ["0"], "LEGIT" =&gt; ["1"]} or {"FRAUD" =&gt; ["false"], "LEGIT" =&gt; ["true"]} or {"FRAUD" =&gt; ["fraud", "abuse"], "LEGIT" =&gt; ["legit", "safe"]}. The value part of the mapper is a list, because you may have multiple label variants from your event type for a single Amazon Fraud Detector label. 
    */
  var labelMapper: js.UndefOr[typings.awsSdk.clientsFrauddetectorMod.labelMapper] = js.undefined
  
  /**
    * The action to take for unlabeled events.
    */
  var unlabeledEventsTreatment: js.UndefOr[UnlabeledEventsTreatment] = js.undefined
}
object LabelSchema {
  
  inline def apply(): LabelSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelSchema]
  }
  
  extension [Self <: LabelSchema](x: Self) {
    
    inline def setLabelMapper(value: labelMapper): Self = StObject.set(x, "labelMapper", value.asInstanceOf[js.Any])
    
    inline def setLabelMapperUndefined: Self = StObject.set(x, "labelMapper", js.undefined)
    
    inline def setUnlabeledEventsTreatment(value: UnlabeledEventsTreatment): Self = StObject.set(x, "unlabeledEventsTreatment", value.asInstanceOf[js.Any])
    
    inline def setUnlabeledEventsTreatmentUndefined: Self = StObject.set(x, "unlabeledEventsTreatment", js.undefined)
  }
}
