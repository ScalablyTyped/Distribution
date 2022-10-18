package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeConfigurationRecorderStatusResponse extends StObject {
  
  /**
    * A list that contains status of the specified recorders.
    */
  var ConfigurationRecordersStatus: js.UndefOr[ConfigurationRecorderStatusList] = js.undefined
}
object DescribeConfigurationRecorderStatusResponse {
  
  inline def apply(): DescribeConfigurationRecorderStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConfigurationRecorderStatusResponse]
  }
  
  extension [Self <: DescribeConfigurationRecorderStatusResponse](x: Self) {
    
    inline def setConfigurationRecordersStatus(value: ConfigurationRecorderStatusList): Self = StObject.set(x, "ConfigurationRecordersStatus", value.asInstanceOf[js.Any])
    
    inline def setConfigurationRecordersStatusUndefined: Self = StObject.set(x, "ConfigurationRecordersStatus", js.undefined)
    
    inline def setConfigurationRecordersStatusVarargs(value: ConfigurationRecorderStatus*): Self = StObject.set(x, "ConfigurationRecordersStatus", js.Array(value*))
  }
}
