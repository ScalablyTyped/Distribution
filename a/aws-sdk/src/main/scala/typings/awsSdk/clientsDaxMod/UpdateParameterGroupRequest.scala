package typings.awsSdk.clientsDaxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateParameterGroupRequest extends StObject {
  
  /**
    * The name of the parameter group.
    */
  var ParameterGroupName: String
  
  /**
    * An array of name-value pairs for the parameters in the group. Each element in the array represents a single parameter.   record-ttl-millis and query-ttl-millis are the only supported parameter names. For more details, see Configuring TTL Settings. 
    */
  var ParameterNameValues: ParameterNameValueList
}
object UpdateParameterGroupRequest {
  
  inline def apply(ParameterGroupName: String, ParameterNameValues: ParameterNameValueList): UpdateParameterGroupRequest = {
    val __obj = js.Dynamic.literal(ParameterGroupName = ParameterGroupName.asInstanceOf[js.Any], ParameterNameValues = ParameterNameValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateParameterGroupRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateParameterGroupRequest] (val x: Self) extends AnyVal {
    
    inline def setParameterGroupName(value: String): Self = StObject.set(x, "ParameterGroupName", value.asInstanceOf[js.Any])
    
    inline def setParameterNameValues(value: ParameterNameValueList): Self = StObject.set(x, "ParameterNameValues", value.asInstanceOf[js.Any])
    
    inline def setParameterNameValuesVarargs(value: ParameterNameValue*): Self = StObject.set(x, "ParameterNameValues", js.Array(value*))
  }
}
