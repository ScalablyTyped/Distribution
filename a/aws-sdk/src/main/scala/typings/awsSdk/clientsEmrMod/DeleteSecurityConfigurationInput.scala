package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSecurityConfigurationInput extends StObject {
  
  /**
    * The name of the security configuration.
    */
  var Name: XmlString
}
object DeleteSecurityConfigurationInput {
  
  inline def apply(Name: XmlString): DeleteSecurityConfigurationInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSecurityConfigurationInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteSecurityConfigurationInput] (val x: Self) extends AnyVal {
    
    inline def setName(value: XmlString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
