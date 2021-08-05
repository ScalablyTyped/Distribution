package typings.activexAccess.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterType extends StObject {
  
  var Cancel: Double
  
  var FilterType: Double
}
object FilterType {
  
  inline def apply(Cancel: Double, FilterType: Double): FilterType = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], FilterType = FilterType.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterType]
  }
  
  extension [Self <: FilterType](x: Self) {
    
    inline def setCancel(value: Double): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
    
    inline def setFilterType(value: Double): Self = StObject.set(x, "FilterType", value.asInstanceOf[js.Any])
  }
}
