package typings.awsSdk.clientsDaxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateParameterGroupResponse extends StObject {
  
  /**
    * The parameter group that has been modified.
    */
  var ParameterGroup: js.UndefOr[typings.awsSdk.clientsDaxMod.ParameterGroup] = js.undefined
}
object UpdateParameterGroupResponse {
  
  inline def apply(): UpdateParameterGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateParameterGroupResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateParameterGroupResponse] (val x: Self) extends AnyVal {
    
    inline def setParameterGroup(value: ParameterGroup): Self = StObject.set(x, "ParameterGroup", value.asInstanceOf[js.Any])
    
    inline def setParameterGroupUndefined: Self = StObject.set(x, "ParameterGroup", js.undefined)
  }
}
