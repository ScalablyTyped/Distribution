package typings.awsSdk.accessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SortCriteria extends StObject {
  
  /**
    * The name of the attribute to sort on.
    */
  var attributeName: js.UndefOr[String] = js.undefined
  
  /**
    * The sort order, ascending or descending.
    */
  var orderBy: js.UndefOr[OrderBy] = js.undefined
}
object SortCriteria {
  
  inline def apply(): SortCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SortCriteria]
  }
  
  extension [Self <: SortCriteria](x: Self) {
    
    inline def setAttributeName(value: String): Self = StObject.set(x, "attributeName", value.asInstanceOf[js.Any])
    
    inline def setAttributeNameUndefined: Self = StObject.set(x, "attributeName", js.undefined)
    
    inline def setOrderBy(value: OrderBy): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    inline def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
  }
}
