package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagCriterionForJob extends StObject {
  
  /**
    * The operator to use in the condition. Valid values are EQ (equals) and NE (not equals).
    */
  var comparator: js.UndefOr[JobComparator] = js.undefined
  
  /**
    * The tag keys, tag values, or tag key and value pairs to use in the condition.
    */
  var tagValues: js.UndefOr[listOfTagCriterionPairForJob] = js.undefined
}
object TagCriterionForJob {
  
  inline def apply(): TagCriterionForJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagCriterionForJob]
  }
  
  extension [Self <: TagCriterionForJob](x: Self) {
    
    inline def setComparator(value: JobComparator): Self = StObject.set(x, "comparator", value.asInstanceOf[js.Any])
    
    inline def setComparatorUndefined: Self = StObject.set(x, "comparator", js.undefined)
    
    inline def setTagValues(value: listOfTagCriterionPairForJob): Self = StObject.set(x, "tagValues", value.asInstanceOf[js.Any])
    
    inline def setTagValuesUndefined: Self = StObject.set(x, "tagValues", js.undefined)
    
    inline def setTagValuesVarargs(value: TagCriterionPairForJob*): Self = StObject.set(x, "tagValues", js.Array(value*))
  }
}
