package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectedCount extends StObject {
  
  var selectedCount: Double = js.native
  
  var totalCount: Double = js.native
}
object SelectedCount {
  
  @scala.inline
  def apply(selectedCount: Double, totalCount: Double): SelectedCount = {
    val __obj = js.Dynamic.literal(selectedCount = selectedCount.asInstanceOf[js.Any], totalCount = totalCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectedCount]
  }
  
  @scala.inline
  implicit class SelectedCountMutableBuilder[Self <: SelectedCount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSelectedCount(value: Double): Self = StObject.set(x, "selectedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalCount(value: Double): Self = StObject.set(x, "totalCount", value.asInstanceOf[js.Any])
  }
}
