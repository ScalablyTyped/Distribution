package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetConfigurationResponse extends StObject {
  
  /**
    * Specifies how the ECR automated re-scan duration is currently configured for your environment.
    */
  var ecrConfiguration: js.UndefOr[EcrConfigurationState] = js.undefined
}
object GetConfigurationResponse {
  
  inline def apply(): GetConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetConfigurationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetConfigurationResponse] (val x: Self) extends AnyVal {
    
    inline def setEcrConfiguration(value: EcrConfigurationState): Self = StObject.set(x, "ecrConfiguration", value.asInstanceOf[js.Any])
    
    inline def setEcrConfigurationUndefined: Self = StObject.set(x, "ecrConfiguration", js.undefined)
  }
}
