package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAccessControlConfigurationResponse extends StObject {
  
  /**
    * The identifier of the access control configuration for your documents in an index.
    */
  var Id: AccessControlConfigurationId
}
object CreateAccessControlConfigurationResponse {
  
  inline def apply(Id: AccessControlConfigurationId): CreateAccessControlConfigurationResponse = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAccessControlConfigurationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateAccessControlConfigurationResponse] (val x: Self) extends AnyVal {
    
    inline def setId(value: AccessControlConfigurationId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
