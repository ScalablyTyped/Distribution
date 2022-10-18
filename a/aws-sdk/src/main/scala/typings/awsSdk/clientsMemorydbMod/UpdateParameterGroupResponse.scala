package typings.awsSdk.clientsMemorydbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateParameterGroupResponse extends StObject {
  
  /**
    * The updated parameter group
    */
  var ParameterGroup: js.UndefOr[typings.awsSdk.clientsMemorydbMod.ParameterGroup] = js.undefined
}
object UpdateParameterGroupResponse {
  
  inline def apply(): UpdateParameterGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateParameterGroupResponse]
  }
  
  extension [Self <: UpdateParameterGroupResponse](x: Self) {
    
    inline def setParameterGroup(value: ParameterGroup): Self = StObject.set(x, "ParameterGroup", value.asInstanceOf[js.Any])
    
    inline def setParameterGroupUndefined: Self = StObject.set(x, "ParameterGroup", js.undefined)
  }
}
