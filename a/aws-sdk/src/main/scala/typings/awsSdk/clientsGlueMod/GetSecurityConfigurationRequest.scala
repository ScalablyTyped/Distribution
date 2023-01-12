package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSecurityConfigurationRequest extends StObject {
  
  /**
    * The name of the security configuration to retrieve.
    */
  var Name: NameString
}
object GetSecurityConfigurationRequest {
  
  inline def apply(Name: NameString): GetSecurityConfigurationRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSecurityConfigurationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSecurityConfigurationRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
