package typings.aliApp.my

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeRefOffset extends StObject {
  
  /** 节点的dataset */
  var dataset: js.Any = js.native
  
  /** 节点的ID */
  var id: String = js.native
  
  /** 节点的水平滚动位置 */
  var scrollLeft: Double = js.native
  
  /** 节点的竖直滚动位置 */
  var scrollTop: Double = js.native
}
object NodeRefOffset {
  
  @scala.inline
  def apply(dataset: js.Any, id: String, scrollLeft: Double, scrollTop: Double): NodeRefOffset = {
    val __obj = js.Dynamic.literal(dataset = dataset.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], scrollLeft = scrollLeft.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeRefOffset]
  }
  
  @scala.inline
  implicit class NodeRefOffsetMutableBuilder[Self <: NodeRefOffset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataset(value: js.Any): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollLeft(value: Double): Self = StObject.set(x, "scrollLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
  }
}
