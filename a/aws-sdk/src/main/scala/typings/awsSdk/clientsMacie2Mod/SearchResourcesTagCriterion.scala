package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchResourcesTagCriterion extends StObject {
  
  /**
    * The operator to use in the condition. Valid values are EQ (equals) and NE (not equals).
    */
  var comparator: js.UndefOr[SearchResourcesComparator] = js.undefined
  
  /**
    * The tag keys, tag values, or tag key and value pairs to use in the condition.
    */
  var tagValues: js.UndefOr[listOfSearchResourcesTagCriterionPair] = js.undefined
}
object SearchResourcesTagCriterion {
  
  inline def apply(): SearchResourcesTagCriterion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchResourcesTagCriterion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchResourcesTagCriterion] (val x: Self) extends AnyVal {
    
    inline def setComparator(value: SearchResourcesComparator): Self = StObject.set(x, "comparator", value.asInstanceOf[js.Any])
    
    inline def setComparatorUndefined: Self = StObject.set(x, "comparator", js.undefined)
    
    inline def setTagValues(value: listOfSearchResourcesTagCriterionPair): Self = StObject.set(x, "tagValues", value.asInstanceOf[js.Any])
    
    inline def setTagValuesUndefined: Self = StObject.set(x, "tagValues", js.undefined)
    
    inline def setTagValuesVarargs(value: SearchResourcesTagCriterionPair*): Self = StObject.set(x, "tagValues", js.Array(value*))
  }
}
