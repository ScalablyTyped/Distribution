package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WeightedTarget extends StObject {
  
  /**
    * The virtual node to associate with the weighted target.
    */
  var virtualNode: ResourceName
  
  /**
    * The relative weight of the weighted target.
    */
  var weight: PercentInt
}
object WeightedTarget {
  
  @scala.inline
  def apply(virtualNode: ResourceName, weight: PercentInt): WeightedTarget = {
    val __obj = js.Dynamic.literal(virtualNode = virtualNode.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeightedTarget]
  }
  
  @scala.inline
  implicit class WeightedTargetMutableBuilder[Self <: WeightedTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVirtualNode(value: ResourceName): Self = StObject.set(x, "virtualNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeight(value: PercentInt): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
  }
}
