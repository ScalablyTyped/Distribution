package typings.awsSdk.clientsMemorydbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResetParameterGroupResponse extends StObject {
  
  /**
    * The parameter group being reset.
    */
  var ParameterGroup: js.UndefOr[typings.awsSdk.clientsMemorydbMod.ParameterGroup] = js.undefined
}
object ResetParameterGroupResponse {
  
  inline def apply(): ResetParameterGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResetParameterGroupResponse]
  }
  
  extension [Self <: ResetParameterGroupResponse](x: Self) {
    
    inline def setParameterGroup(value: ParameterGroup): Self = StObject.set(x, "ParameterGroup", value.asInstanceOf[js.Any])
    
    inline def setParameterGroupUndefined: Self = StObject.set(x, "ParameterGroup", js.undefined)
  }
}
