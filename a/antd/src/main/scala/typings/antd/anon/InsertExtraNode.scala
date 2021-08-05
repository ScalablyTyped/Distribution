package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsertExtraNode extends StObject {
  
  var insertExtraNode: js.UndefOr[Boolean] = js.undefined
}
object InsertExtraNode {
  
  inline def apply(): InsertExtraNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsertExtraNode]
  }
  
  extension [Self <: InsertExtraNode](x: Self) {
    
    inline def setInsertExtraNode(value: Boolean): Self = StObject.set(x, "insertExtraNode", value.asInstanceOf[js.Any])
    
    inline def setInsertExtraNodeUndefined: Self = StObject.set(x, "insertExtraNode", js.undefined)
  }
}
