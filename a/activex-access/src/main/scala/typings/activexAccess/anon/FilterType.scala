package typings.activexAccess.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterType extends StObject {
  
  var Cancel: Double
  
  var FilterType: Double
}
object FilterType {
  
  @scala.inline
  def apply(Cancel: Double, FilterType: Double): FilterType = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], FilterType = FilterType.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterType]
  }
  
  @scala.inline
  implicit class FilterTypeMutableBuilder[Self <: FilterType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: Double): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterType(value: Double): Self = StObject.set(x, "FilterType", value.asInstanceOf[js.Any])
  }
}
