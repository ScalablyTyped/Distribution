package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddInstanceFleetInput extends StObject {
  
  /**
    * The unique identifier of the cluster.
    */
  var ClusterId: XmlStringMaxLen256
  
  /**
    * Specifies the configuration of the instance fleet.
    */
  var InstanceFleet: InstanceFleetConfig
}
object AddInstanceFleetInput {
  
  inline def apply(ClusterId: XmlStringMaxLen256, InstanceFleet: InstanceFleetConfig): AddInstanceFleetInput = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId.asInstanceOf[js.Any], InstanceFleet = InstanceFleet.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddInstanceFleetInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddInstanceFleetInput] (val x: Self) extends AnyVal {
    
    inline def setClusterId(value: XmlStringMaxLen256): Self = StObject.set(x, "ClusterId", value.asInstanceOf[js.Any])
    
    inline def setInstanceFleet(value: InstanceFleetConfig): Self = StObject.set(x, "InstanceFleet", value.asInstanceOf[js.Any])
  }
}
