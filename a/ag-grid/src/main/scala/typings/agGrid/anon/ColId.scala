package typings.agGrid.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColId extends StObject {
  
  var colId: String = js.native
  
  var sort: String = js.native
}
object ColId {
  
  @scala.inline
  def apply(colId: String, sort: String): ColId = {
    val __obj = js.Dynamic.literal(colId = colId.asInstanceOf[js.Any], sort = sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColId]
  }
  
  @scala.inline
  implicit class ColIdMutableBuilder[Self <: ColId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColId(value: String): Self = StObject.set(x, "colId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSort(value: String): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
  }
}
