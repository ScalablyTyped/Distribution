package typings.awsSdk.clientsComputeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EBSFilter extends StObject {
  
  /**
    * The name of the filter. Specify Finding to return recommendations with a specific finding classification (for example, NotOptimized). You can filter your Amazon EBS volume recommendations by tag:key and tag-key tags. A tag:key is a key and value combination of a tag assigned to your Amazon EBS volume recommendations. Use the tag key in the filter name and the tag value as the filter value. For example, to find all Amazon EBS volume recommendations that have a tag with the key of Owner and the value of TeamA, specify tag:Owner for the filter name and TeamA for the filter value. A tag-key is the key of a tag assigned to your Amazon EBS volume recommendations. Use this filter to find all of your Amazon EBS volume recommendations that have a tag with a specific key. This doesn’t consider the tag value. For example, you can find your Amazon EBS volume recommendations with a tag key value of Owner or without any tag keys assigned.
    */
  var name: js.UndefOr[EBSFilterName] = js.undefined
  
  /**
    * The value of the filter. The valid values are Optimized, or NotOptimized.
    */
  var values: js.UndefOr[FilterValues] = js.undefined
}
object EBSFilter {
  
  inline def apply(): EBSFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EBSFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EBSFilter] (val x: Self) extends AnyVal {
    
    inline def setName(value: EBSFilterName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValues(value: FilterValues): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: FilterValue*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
