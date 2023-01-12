package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLaunchConfigurationRequest extends StObject {
  
  /**
    * Request to get Launch Configuration information by Source Server ID.
    */
  var sourceServerID: SourceServerID
}
object GetLaunchConfigurationRequest {
  
  inline def apply(sourceServerID: SourceServerID): GetLaunchConfigurationRequest = {
    val __obj = js.Dynamic.literal(sourceServerID = sourceServerID.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLaunchConfigurationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetLaunchConfigurationRequest] (val x: Self) extends AnyVal {
    
    inline def setSourceServerID(value: SourceServerID): Self = StObject.set(x, "sourceServerID", value.asInstanceOf[js.Any])
  }
}
