package typings.awsSdk.clientsRedshiftserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigParameter extends StObject {
  
  /**
    * The key of the parameter. The options are auto_mv, datestyle, enable_case_sensitivity_identifier, enable_user_activity_logging, query_group, search_path, and query monitoring metrics that let you define performance boundaries. For more information about query monitoring rules and available metrics, see Query monitoring metrics for Amazon Redshift Serverless.
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConfigParameter] (val x: Self) extends AnyVal {
    
    inline def setParameterKey(value: ParameterKey): Self = StObject.set(x, "parameterKey", value.asInstanceOf[js.Any])
    
    inline def setParameterKeyUndefined: Self = StObject.set(x, "parameterKey", js.undefined)
    
    inline def setParameterValue(value: ParameterValue): Self = StObject.set(x, "parameterValue", value.asInstanceOf[js.Any])
    
    inline def setParameterValueUndefined: Self = StObject.set(x, "parameterValue", js.undefined)
  }
}
