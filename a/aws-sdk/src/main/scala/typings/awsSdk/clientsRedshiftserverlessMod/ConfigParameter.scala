package typings.awsSdk.clientsRedshiftserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigParameter extends StObject {
  
  /**
    * The key of the parameter. The options are datestyle, enable_user_activity_logging, query_group, search_path, and max_query_execution_time.
    */
  var parameterKey: js.UndefOr[ParameterKey] = js.undefined
  
  /**
    * The value of the parameter to set.
    */
  var parameterValue: js.UndefOr[ParameterValue] = js.undefined
}
object ConfigParameter {
  
  inline def apply(): ConfigParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigParameter]
  }
  
  extension [Self <: ConfigParameter](x: Self) {
    
    inline def setParameterKey(value: ParameterKey): Self = StObject.set(x, "parameterKey", value.asInstanceOf[js.Any])
    
    inline def setParameterKeyUndefined: Self = StObject.set(x, "parameterKey", js.undefined)
    
    inline def setParameterValue(value: ParameterValue): Self = StObject.set(x, "parameterValue", value.asInstanceOf[js.Any])
    
    inline def setParameterValueUndefined: Self = StObject.set(x, "parameterValue", js.undefined)
  }
}
