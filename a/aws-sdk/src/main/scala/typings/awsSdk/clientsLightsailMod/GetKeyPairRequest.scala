package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetKeyPairRequest extends StObject {
  
  /**
    * The name of the key pair for which you are requesting information.
    */
  var keyPairName: ResourceName
}
object GetKeyPairRequest {
  
  inline def apply(keyPairName: ResourceName): GetKeyPairRequest = {
    val __obj = js.Dynamic.literal(keyPairName = keyPairName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetKeyPairRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetKeyPairRequest] (val x: Self) extends AnyVal {
    
    inline def setKeyPairName(value: ResourceName): Self = StObject.set(x, "keyPairName", value.asInstanceOf[js.Any])
  }
}
