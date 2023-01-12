package typings.awsSdk.clientsIotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Node extends StObject {
  
  /**
    * Information about a node specified as an actuator.  An actuator is a digital representation of a vehicle device. 
    */
  var actuator: js.UndefOr[Actuator] = js.undefined
  
  /**
    * Information about a node specified as an attribute.  An attribute represents static information about a vehicle. 
    */
  var attribute: js.UndefOr[Attribute] = js.undefined
  
  /**
    * Information about a node specified as a branch.  A group of signals that are defined in a hierarchical structure. 
    */
  var branch: js.UndefOr[Branch] = js.undefined
  
  var sensor: js.UndefOr[Sensor] = js.undefined
}
object Node {
  
  inline def apply(): Node = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Node] (val x: Self) extends AnyVal {
    
    inline def setActuator(value: Actuator): Self = StObject.set(x, "actuator", value.asInstanceOf[js.Any])
    
    inline def setActuatorUndefined: Self = StObject.set(x, "actuator", js.undefined)
    
    inline def setAttribute(value: Attribute): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    inline def setAttributeUndefined: Self = StObject.set(x, "attribute", js.undefined)
    
    inline def setBranch(value: Branch): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
    
    inline def setBranchUndefined: Self = StObject.set(x, "branch", js.undefined)
    
    inline def setSensor(value: Sensor): Self = StObject.set(x, "sensor", value.asInstanceOf[js.Any])
    
    inline def setSensorUndefined: Self = StObject.set(x, "sensor", js.undefined)
  }
}
