package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutConfigurationRecorderRequest extends StObject {
  
  /**
    * The configuration recorder object that records each configuration change made to the resources.
    */
  var ConfigurationRecorder: typings.awsSdk.clientsConfigserviceMod.ConfigurationRecorder
}
object PutConfigurationRecorderRequest {
  
  inline def apply(ConfigurationRecorder: ConfigurationRecorder): PutConfigurationRecorderRequest = {
    val __obj = js.Dynamic.literal(ConfigurationRecorder = ConfigurationRecorder.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutConfigurationRecorderRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutConfigurationRecorderRequest] (val x: Self) extends AnyVal {
    
    inline def setConfigurationRecorder(value: ConfigurationRecorder): Self = StObject.set(x, "ConfigurationRecorder", value.asInstanceOf[js.Any])
  }
}
