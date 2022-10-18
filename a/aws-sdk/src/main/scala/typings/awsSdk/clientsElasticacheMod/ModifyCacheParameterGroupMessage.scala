package typings.awsSdk.clientsElasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyCacheParameterGroupMessage extends StObject {
  
  /**
    * The name of the cache parameter group to modify.
    */
  var CacheParameterGroupName: String
  
  /**
    * An array of parameter names and values for the parameter update. You must supply at least one parameter name and value; subsequent arguments are optional. A maximum of 20 parameters may be modified per request.
    */
  var ParameterNameValues: ParameterNameValueList
}
object ModifyCacheParameterGroupMessage {
  
  inline def apply(CacheParameterGroupName: String, ParameterNameValues: ParameterNameValueList): ModifyCacheParameterGroupMessage = {
    val __obj = js.Dynamic.literal(CacheParameterGroupName = CacheParameterGroupName.asInstanceOf[js.Any], ParameterNameValues = ParameterNameValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyCacheParameterGroupMessage]
  }
  
  extension [Self <: ModifyCacheParameterGroupMessage](x: Self) {
    
    inline def setCacheParameterGroupName(value: String): Self = StObject.set(x, "CacheParameterGroupName", value.asInstanceOf[js.Any])
    
    inline def setParameterNameValues(value: ParameterNameValueList): Self = StObject.set(x, "ParameterNameValues", value.asInstanceOf[js.Any])
    
    inline def setParameterNameValuesVarargs(value: ParameterNameValue*): Self = StObject.set(x, "ParameterNameValues", js.Array(value*))
  }
}
