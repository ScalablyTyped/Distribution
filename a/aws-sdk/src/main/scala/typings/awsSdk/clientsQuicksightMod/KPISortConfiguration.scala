package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KPISortConfiguration extends StObject {
  
  /**
    * The sort configuration of the trend group fields.
    */
  var TrendGroupSort: js.UndefOr[FieldSortOptionsList] = js.undefined
}
object KPISortConfiguration {
  
  inline def apply(): KPISortConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KPISortConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KPISortConfiguration] (val x: Self) extends AnyVal {
    
    inline def setTrendGroupSort(value: FieldSortOptionsList): Self = StObject.set(x, "TrendGroupSort", value.asInstanceOf[js.Any])
    
    inline def setTrendGroupSortUndefined: Self = StObject.set(x, "TrendGroupSort", js.undefined)
    
    inline def setTrendGroupSortVarargs(value: FieldSortOptions*): Self = StObject.set(x, "TrendGroupSort", js.Array(value*))
  }
}
