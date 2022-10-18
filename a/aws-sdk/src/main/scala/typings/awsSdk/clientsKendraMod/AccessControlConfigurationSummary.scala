package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessControlConfigurationSummary extends StObject {
  
  /**
    * The identifier of the access control configuration.
    */
  var Id: AccessControlConfigurationId
}
object AccessControlConfigurationSummary {
  
  inline def apply(Id: AccessControlConfigurationId): AccessControlConfigurationSummary = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessControlConfigurationSummary]
  }
  
  extension [Self <: AccessControlConfigurationSummary](x: Self) {
    
    inline def setId(value: AccessControlConfigurationId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
