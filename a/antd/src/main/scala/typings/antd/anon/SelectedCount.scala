package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectedCount extends StObject {
  
  var selectedCount: Double
  
  var totalCount: Double
}
object SelectedCount {
  
  inline def apply(selectedCount: Double, totalCount: Double): SelectedCount = {
    val __obj = js.Dynamic.literal(selectedCount = selectedCount.asInstanceOf[js.Any], totalCount = totalCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectedCount]
  }
  
  extension [Self <: SelectedCount](x: Self) {
    
    inline def setSelectedCount(value: Double): Self = StObject.set(x, "selectedCount", value.asInstanceOf[js.Any])
    
    inline def setTotalCount(value: Double): Self = StObject.set(x, "totalCount", value.asInstanceOf[js.Any])
  }
}
