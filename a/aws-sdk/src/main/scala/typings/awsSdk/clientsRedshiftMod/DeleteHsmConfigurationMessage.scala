package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteHsmConfigurationMessage extends StObject {
  
  /**
    * The identifier of the Amazon Redshift HSM configuration to be deleted.
    */
  var HsmConfigurationIdentifier: String
}
object DeleteHsmConfigurationMessage {
  
  inline def apply(HsmConfigurationIdentifier: String): DeleteHsmConfigurationMessage = {
    val __obj = js.Dynamic.literal(HsmConfigurationIdentifier = HsmConfigurationIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteHsmConfigurationMessage]
  }
  
  extension [Self <: DeleteHsmConfigurationMessage](x: Self) {
    
    inline def setHsmConfigurationIdentifier(value: String): Self = StObject.set(x, "HsmConfigurationIdentifier", value.asInstanceOf[js.Any])
  }
}
