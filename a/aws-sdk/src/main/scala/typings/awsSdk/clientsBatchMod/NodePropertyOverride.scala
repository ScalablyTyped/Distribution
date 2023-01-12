package typings.awsSdk.clientsBatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodePropertyOverride extends StObject {
  
  /**
    * The overrides that are sent to a node range.
    */
  var containerOverrides: js.UndefOr[ContainerOverrides] = js.undefined
  
  /**
    * The range of nodes, using node index values, that's used to override. A range of 0:3 indicates nodes with index values of 0 through 3. If the starting range value is omitted (:n), then 0 is used to start the range. If the ending range value is omitted (n:), then the highest possible node index is used to end the range.
    */
  var targetNodes: String
}
object NodePropertyOverride {
  
  inline def apply(targetNodes: String): NodePropertyOverride = {
    val __obj = js.Dynamic.literal(targetNodes = targetNodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodePropertyOverride]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodePropertyOverride] (val x: Self) extends AnyVal {
    
    inline def setContainerOverrides(value: ContainerOverrides): Self = StObject.set(x, "containerOverrides", value.asInstanceOf[js.Any])
    
    inline def setContainerOverridesUndefined: Self = StObject.set(x, "containerOverrides", js.undefined)
    
    inline def setTargetNodes(value: String): Self = StObject.set(x, "targetNodes", value.asInstanceOf[js.Any])
  }
}
