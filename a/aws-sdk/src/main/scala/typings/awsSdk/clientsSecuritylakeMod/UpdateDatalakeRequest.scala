package typings.awsSdk.clientsSecuritylakeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDatalakeRequest extends StObject {
  
  /**
    * Specify the Region or Regions that will contribute data to the rollup region.
    */
  var configurations: LakeConfigurationRequestMap
}
object UpdateDatalakeRequest {
  
  inline def apply(configurations: LakeConfigurationRequestMap): UpdateDatalakeRequest = {
    val __obj = js.Dynamic.literal(configurations = configurations.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDatalakeRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateDatalakeRequest] (val x: Self) extends AnyVal {
    
    inline def setConfigurations(value: LakeConfigurationRequestMap): Self = StObject.set(x, "configurations", value.asInstanceOf[js.Any])
  }
}
