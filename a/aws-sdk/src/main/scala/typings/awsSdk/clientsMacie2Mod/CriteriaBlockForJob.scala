package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CriteriaBlockForJob extends StObject {
  
  /**
    * An array of conditions, one for each condition that determines which buckets to include or exclude from the job. If you specify more than one condition, Amazon Macie uses AND logic to join the conditions.
    */
  var and: js.UndefOr[listOfCriteriaForJob] = js.undefined
}
object CriteriaBlockForJob {
  
  inline def apply(): CriteriaBlockForJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CriteriaBlockForJob]
  }
  
  extension [Self <: CriteriaBlockForJob](x: Self) {
    
    inline def setAnd(value: listOfCriteriaForJob): Self = StObject.set(x, "and", value.asInstanceOf[js.Any])
    
    inline def setAndUndefined: Self = StObject.set(x, "and", js.undefined)
    
    inline def setAndVarargs(value: CriteriaForJob*): Self = StObject.set(x, "and", js.Array(value*))
  }
}
