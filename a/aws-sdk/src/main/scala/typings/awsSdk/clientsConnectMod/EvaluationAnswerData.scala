package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvaluationAnswerData extends StObject {
  
  /**
    * The flag to mark the question as not applicable.
    */
  var NotApplicable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The numeric value for an answer in a contact evaluation.
    */
  var NumericValue: js.UndefOr[EvaluationAnswerDataNumericValue] = js.undefined
  
  /**
    * The string value for an answer in a contact evaluation.
    */
  var StringValue: js.UndefOr[EvaluationAnswerDataStringValue] = js.undefined
}
object EvaluationAnswerData {
  
  inline def apply(): EvaluationAnswerData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EvaluationAnswerData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EvaluationAnswerData] (val x: Self) extends AnyVal {
    
    inline def setNotApplicable(value: Boolean): Self = StObject.set(x, "NotApplicable", value.asInstanceOf[js.Any])
    
    inline def setNotApplicableUndefined: Self = StObject.set(x, "NotApplicable", js.undefined)
    
    inline def setNumericValue(value: EvaluationAnswerDataNumericValue): Self = StObject.set(x, "NumericValue", value.asInstanceOf[js.Any])
    
    inline def setNumericValueUndefined: Self = StObject.set(x, "NumericValue", js.undefined)
    
    inline def setStringValue(value: EvaluationAnswerDataStringValue): Self = StObject.set(x, "StringValue", value.asInstanceOf[js.Any])
    
    inline def setStringValueUndefined: Self = StObject.set(x, "StringValue", js.undefined)
  }
}
