package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListJobsFilterTerm extends StObject {
  
  /**
    * The operator to use to filter the results.
    */
  var comparator: js.UndefOr[JobComparator] = js.undefined
  
  /**
    * The property to use to filter the results.
    */
  var key: js.UndefOr[ListJobsFilterKey] = js.undefined
  
  /**
    * An array that lists one or more values to use to filter the results.
    */
  var values: js.UndefOr[listOfString] = js.undefined
}
object ListJobsFilterTerm {
  
  inline def apply(): ListJobsFilterTerm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListJobsFilterTerm]
  }
  
  extension [Self <: ListJobsFilterTerm](x: Self) {
    
    inline def setComparator(value: JobComparator): Self = StObject.set(x, "comparator", value.asInstanceOf[js.Any])
    
    inline def setComparatorUndefined: Self = StObject.set(x, "comparator", js.undefined)
    
    inline def setKey(value: ListJobsFilterKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setValues(value: listOfString): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: string*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
