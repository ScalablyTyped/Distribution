package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyInstanceGroupsInput extends StObject {
  
  /**
    * The ID of the cluster to which the instance group belongs.
    */
  var ClusterId: js.UndefOr[typings.awsSdk.clientsEmrMod.ClusterId] = js.undefined
  
  /**
    * Instance groups to change.
    */
  var InstanceGroups: js.UndefOr[InstanceGroupModifyConfigList] = js.undefined
}
object ModifyInstanceGroupsInput {
  
  inline def apply(): ModifyInstanceGroupsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyInstanceGroupsInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModifyInstanceGroupsInput] (val x: Self) extends AnyVal {
    
    inline def setClusterId(value: ClusterId): Self = StObject.set(x, "ClusterId", value.asInstanceOf[js.Any])
    
    inline def setClusterIdUndefined: Self = StObject.set(x, "ClusterId", js.undefined)
    
    inline def setInstanceGroups(value: InstanceGroupModifyConfigList): Self = StObject.set(x, "InstanceGroups", value.asInstanceOf[js.Any])
    
    inline def setInstanceGroupsUndefined: Self = StObject.set(x, "InstanceGroups", js.undefined)
    
    inline def setInstanceGroupsVarargs(value: InstanceGroupModifyConfig*): Self = StObject.set(x, "InstanceGroups", js.Array(value*))
  }
}
