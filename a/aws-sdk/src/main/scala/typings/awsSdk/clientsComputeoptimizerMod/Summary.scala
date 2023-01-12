package typings.awsSdk.clientsComputeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Summary extends StObject {
  
  /**
    * The finding classification of the recommendation.
    */
  var name: js.UndefOr[Finding] = js.undefined
  
  /**
    * An array of objects that summarize a finding reason code.
    */
  var reasonCodeSummaries: js.UndefOr[ReasonCodeSummaries] = js.undefined
  
  /**
    * The value of the recommendation summary.
    */
  var value: js.UndefOr[SummaryValue] = js.undefined
}
object Summary {
  
  inline def apply(): Summary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Summary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Summary] (val x: Self) extends AnyVal {
    
    inline def setName(value: Finding): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReasonCodeSummaries(value: ReasonCodeSummaries): Self = StObject.set(x, "reasonCodeSummaries", value.asInstanceOf[js.Any])
    
    inline def setReasonCodeSummariesUndefined: Self = StObject.set(x, "reasonCodeSummaries", js.undefined)
    
    inline def setReasonCodeSummariesVarargs(value: ReasonCodeSummary*): Self = StObject.set(x, "reasonCodeSummaries", js.Array(value*))
    
    inline def setValue(value: SummaryValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
