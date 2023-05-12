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
    * The action to take for unlabeled events.   Use IGNORE if you want the unlabeled events to be ignored. This is recommended when the majority of the events in the dataset are labeled.   Use FRAUD if you want to categorize all unlabeled events as “Fraud”. This is recommended when most of the events in your dataset are fraudulent.   Use LEGIT f you want to categorize all unlabeled events as “Legit”. This is recommended when most of the events in your dataset are legitimate.   Use AUTO if you want Amazon Fraud Detector to decide how to use the unlabeled data. This is recommended when there is significant unlabeled events in the dataset.   By default, Amazon Fraud Detector ignores the unlabeled data.
    */
  var unlabeledEventsTreatment: js.UndefOr[UnlabeledEventsTreatment] = js.undefined
}
object LabelSchema {
  
  inline def apply(): LabelSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelSchema]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LabelSchema] (val x: Self) extends AnyVal {
    
    inline def setLabelMapper(value: labelMapper): Self = StObject.set(x, "labelMapper", value.asInstanceOf[js.Any])
    
    inline def setLabelMapperUndefined: Self = StObject.set(x, "labelMapper", js.undefined)
    
    inline def setUnlabeledEventsTreatment(value: UnlabeledEventsTreatment): Self = StObject.set(x, "unlabeledEventsTreatment", value.asInstanceOf[js.Any])
    
    inline def setUnlabeledEventsTreatmentUndefined: Self = StObject.set(x, "unlabeledEventsTreatment", js.undefined)
  }
}
