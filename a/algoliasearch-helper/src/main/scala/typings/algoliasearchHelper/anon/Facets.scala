package typings.algoliasearchHelper.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Facets extends StObject {
  
  var facets: js.UndefOr[Order] = js.undefined
  
  var values: js.UndefOr[StringDictionary[SortRemainingBy]] = js.undefined
}
object Facets {
  
  inline def apply(): Facets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Facets]
  }
  
  extension [Self <: Facets](x: Self) {
    
    inline def setFacets(value: Order): Self = StObject.set(x, "facets", value.asInstanceOf[js.Any])
    
    inline def setFacetsUndefined: Self = StObject.set(x, "facets", js.undefined)
    
    inline def setValues(value: StringDictionary[SortRemainingBy]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
  }
}
