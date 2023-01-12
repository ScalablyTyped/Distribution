package typings.awsSdk.clientsNimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComputeFarmConfiguration extends StObject {
  
  /**
    * The name of an Active Directory user that is used on ComputeFarm worker instances.
    */
  var activeDirectoryUser: js.UndefOr[String] = js.undefined
  
  /**
    * The endpoint of the ComputeFarm that is accessed by the studio component resource.
    */
  var endpoint: js.UndefOr[SensitiveString] = js.undefined
}
object ComputeFarmConfiguration {
  
  inline def apply(): ComputeFarmConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComputeFarmConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComputeFarmConfiguration] (val x: Self) extends AnyVal {
    
    inline def setActiveDirectoryUser(value: String): Self = StObject.set(x, "activeDirectoryUser", value.asInstanceOf[js.Any])
    
    inline def setActiveDirectoryUserUndefined: Self = StObject.set(x, "activeDirectoryUser", js.undefined)
    
    inline def setEndpoint(value: SensitiveString): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
  }
}
