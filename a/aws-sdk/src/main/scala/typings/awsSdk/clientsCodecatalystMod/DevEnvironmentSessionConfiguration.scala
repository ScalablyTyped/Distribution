package typings.awsSdk.clientsCodecatalystMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DevEnvironmentSessionConfiguration extends StObject {
  
  /**
    * Information about optional commands that will be run on the Dev Environment when the SSH session begins.
    */
  var executeCommandSessionConfiguration: js.UndefOr[ExecuteCommandSessionConfiguration] = js.undefined
  
  /**
    * The type of the session.
    */
  var sessionType: DevEnvironmentSessionType
}
object DevEnvironmentSessionConfiguration {
  
  inline def apply(sessionType: DevEnvironmentSessionType): DevEnvironmentSessionConfiguration = {
    val __obj = js.Dynamic.literal(sessionType = sessionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DevEnvironmentSessionConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DevEnvironmentSessionConfiguration] (val x: Self) extends AnyVal {
    
    inline def setExecuteCommandSessionConfiguration(value: ExecuteCommandSessionConfiguration): Self = StObject.set(x, "executeCommandSessionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setExecuteCommandSessionConfigurationUndefined: Self = StObject.set(x, "executeCommandSessionConfiguration", js.undefined)
    
    inline def setSessionType(value: DevEnvironmentSessionType): Self = StObject.set(x, "sessionType", value.asInstanceOf[js.Any])
  }
}
