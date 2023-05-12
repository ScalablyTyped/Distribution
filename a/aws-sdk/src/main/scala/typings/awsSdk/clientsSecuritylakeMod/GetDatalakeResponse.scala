package typings.awsSdk.clientsSecuritylakeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDatalakeResponse extends StObject {
  
  /**
    * Retrieves the Security Lake configuration object. 
    */
  var configurations: LakeConfigurationResponseMap
}
object GetDatalakeResponse {
  
  inline def apply(configurations: LakeConfigurationResponseMap): GetDatalakeResponse = {
    val __obj = js.Dynamic.literal(configurations = configurations.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDatalakeResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDatalakeResponse] (val x: Self) extends AnyVal {
    
    inline def setConfigurations(value: LakeConfigurationResponseMap): Self = StObject.set(x, "configurations", value.asInstanceOf[js.Any])
  }
}
