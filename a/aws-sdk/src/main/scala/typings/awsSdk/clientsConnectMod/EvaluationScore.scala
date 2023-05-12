package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvaluationScore extends StObject {
  
  /**
    * The flag that marks the item as automatic fail. If the item or a child item gets an automatic fail answer, this flag will be true.
    */
  var AutomaticFail: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The flag to mark the item as not applicable for scoring.
    */
  var NotApplicable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The score percentage for an item in a contact evaluation.
    */
  var Percentage: js.UndefOr[EvaluationScorePercentage] = js.undefined
}
object EvaluationScore {
  
  inline def apply(): EvaluationScore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EvaluationScore]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EvaluationScore] (val x: Self) extends AnyVal {
    
    inline def setAutomaticFail(value: Boolean): Self = StObject.set(x, "AutomaticFail", value.asInstanceOf[js.Any])
    
    inline def setAutomaticFailUndefined: Self = StObject.set(x, "AutomaticFail", js.undefined)
    
    inline def setNotApplicable(value: Boolean): Self = StObject.set(x, "NotApplicable", value.asInstanceOf[js.Any])
    
    inline def setNotApplicableUndefined: Self = StObject.set(x, "NotApplicable", js.undefined)
    
    inline def setPercentage(value: EvaluationScorePercentage): Self = StObject.set(x, "Percentage", value.asInstanceOf[js.Any])
    
    inline def setPercentageUndefined: Self = StObject.set(x, "Percentage", js.undefined)
  }
}
