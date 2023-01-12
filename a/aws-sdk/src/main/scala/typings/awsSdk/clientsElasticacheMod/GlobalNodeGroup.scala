package typings.awsSdk.clientsElasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlobalNodeGroup extends StObject {
  
  /**
    * The name of the global node group
    */
  var GlobalNodeGroupId: js.UndefOr[String] = js.undefined
  
  /**
    * The keyspace for this node group
    */
  var Slots: js.UndefOr[String] = js.undefined
}
object GlobalNodeGroup {
  
  inline def apply(): GlobalNodeGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalNodeGroup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GlobalNodeGroup] (val x: Self) extends AnyVal {
    
    inline def setGlobalNodeGroupId(value: String): Self = StObject.set(x, "GlobalNodeGroupId", value.asInstanceOf[js.Any])
    
    inline def setGlobalNodeGroupIdUndefined: Self = StObject.set(x, "GlobalNodeGroupId", js.undefined)
    
    inline def setSlots(value: String): Self = StObject.set(x, "Slots", value.asInstanceOf[js.Any])
    
    inline def setSlotsUndefined: Self = StObject.set(x, "Slots", js.undefined)
  }
}
