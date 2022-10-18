package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagScopeTerm extends StObject {
  
  /**
    * The operator to use in the condition. Valid values are EQ (equals) or NE (not equals).
    */
  var comparator: js.UndefOr[JobComparator] = js.undefined
  
  /**
    * The object property to use in the condition. The only valid value is TAG.
    */
  var key: js.UndefOr[string] = js.undefined
  
  /**
    * The tag keys or tag key and value pairs to use in the condition. To specify only tag keys in a condition, specify the keys in this array and set the value for each associated tag value to an empty string.
    */
  var tagValues: js.UndefOr[listOfTagValuePair] = js.undefined
  
  /**
    * The type of object to apply the condition to.
    */
  var target: js.UndefOr[TagTarget] = js.undefined
}
object TagScopeTerm {
  
  inline def apply(): TagScopeTerm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagScopeTerm]
  }
  
  extension [Self <: TagScopeTerm](x: Self) {
    
    inline def setComparator(value: JobComparator): Self = StObject.set(x, "comparator", value.asInstanceOf[js.Any])
    
    inline def setComparatorUndefined: Self = StObject.set(x, "comparator", js.undefined)
    
    inline def setKey(value: string): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setTagValues(value: listOfTagValuePair): Self = StObject.set(x, "tagValues", value.asInstanceOf[js.Any])
    
    inline def setTagValuesUndefined: Self = StObject.set(x, "tagValues", js.undefined)
    
    inline def setTagValuesVarargs(value: TagValuePair*): Self = StObject.set(x, "tagValues", js.Array(value*))
    
    inline def setTarget(value: TagTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
