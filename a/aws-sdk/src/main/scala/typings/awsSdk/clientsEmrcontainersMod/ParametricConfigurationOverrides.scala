package typings.awsSdk.clientsEmrcontainersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametricConfigurationOverrides extends StObject {
  
  /**
    *  The configurations for the application running by the job run.
    */
  var applicationConfiguration: js.UndefOr[ConfigurationList] = js.undefined
  
  /**
    *  The configurations for monitoring. 
    */
  var monitoringConfiguration: js.UndefOr[ParametricMonitoringConfiguration] = js.undefined
}
object ParametricConfigurationOverrides {
  
  inline def apply(): ParametricConfigurationOverrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParametricConfigurationOverrides]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametricConfigurationOverrides] (val x: Self) extends AnyVal {
    
    inline def setApplicationConfiguration(value: ConfigurationList): Self = StObject.set(x, "applicationConfiguration", value.asInstanceOf[js.Any])
    
    inline def setApplicationConfigurationUndefined: Self = StObject.set(x, "applicationConfiguration", js.undefined)
    
    inline def setApplicationConfigurationVarargs(value: Configuration*): Self = StObject.set(x, "applicationConfiguration", js.Array(value*))
    
    inline def setMonitoringConfiguration(value: ParametricMonitoringConfiguration): Self = StObject.set(x, "monitoringConfiguration", value.asInstanceOf[js.Any])
    
    inline def setMonitoringConfigurationUndefined: Self = StObject.set(x, "monitoringConfiguration", js.undefined)
  }
}
