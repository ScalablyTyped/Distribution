package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeConfigurationRecordersResponse extends StObject {
  
  /**
    * A list that contains the descriptions of the specified configuration recorders.
    */
  var ConfigurationRecorders: js.UndefOr[ConfigurationRecorderList] = js.undefined
}
object DescribeConfigurationRecordersResponse {
  
  inline def apply(): DescribeConfigurationRecordersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConfigurationRecordersResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeConfigurationRecordersResponse] (val x: Self) extends AnyVal {
    
    inline def setConfigurationRecorders(value: ConfigurationRecorderList): Self = StObject.set(x, "ConfigurationRecorders", value.asInstanceOf[js.Any])
    
    inline def setConfigurationRecordersUndefined: Self = StObject.set(x, "ConfigurationRecorders", js.undefined)
    
    inline def setConfigurationRecordersVarargs(value: ConfigurationRecorder*): Self = StObject.set(x, "ConfigurationRecorders", js.Array(value*))
  }
}
