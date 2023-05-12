package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemsLimitConfiguration extends StObject {
  
  /**
    * The limit on how many items of a field are showed in the chart. For example, the number of slices that are displayed in a pie chart.
    */
  var ItemsLimit: js.UndefOr[Long] = js.undefined
  
  /**
    * The Show other of an axis in the chart. Choose one of the following options:    INCLUDE     EXCLUDE   
    */
  var OtherCategories: js.UndefOr[typings.awsSdk.clientsQuicksightMod.OtherCategories] = js.undefined
}
object ItemsLimitConfiguration {
  
  inline def apply(): ItemsLimitConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemsLimitConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ItemsLimitConfiguration] (val x: Self) extends AnyVal {
    
    inline def setItemsLimit(value: Long): Self = StObject.set(x, "ItemsLimit", value.asInstanceOf[js.Any])
    
    inline def setItemsLimitUndefined: Self = StObject.set(x, "ItemsLimit", js.undefined)
    
    inline def setOtherCategories(value: OtherCategories): Self = StObject.set(x, "OtherCategories", value.asInstanceOf[js.Any])
    
    inline def setOtherCategoriesUndefined: Self = StObject.set(x, "OtherCategories", js.undefined)
  }
}
