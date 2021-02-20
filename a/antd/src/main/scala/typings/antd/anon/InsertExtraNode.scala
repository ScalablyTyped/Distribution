package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsertExtraNode extends StObject {
  
  var insertExtraNode: js.UndefOr[Boolean] = js.native
}
object InsertExtraNode {
  
  @scala.inline
  def apply(): InsertExtraNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsertExtraNode]
  }
  
  @scala.inline
  implicit class InsertExtraNodeMutableBuilder[Self <: InsertExtraNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInsertExtraNode(value: Boolean): Self = StObject.set(x, "insertExtraNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertExtraNodeUndefined: Self = StObject.set(x, "insertExtraNode", js.undefined)
  }
}
