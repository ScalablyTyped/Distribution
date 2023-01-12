package typings.awsSdk.clientsRoute53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivateKeySigningKeyRequest extends StObject {
  
  /**
    * A unique string used to identify a hosted zone.
    */
  var HostedZoneId: ResourceId
  
  /**
    * A string used to identify a key-signing key (KSK). Name can include numbers, letters, and underscores (_). Name must be unique for each key-signing key in the same hosted zone.
    */
  var Name: SigningKeyName
}
object ActivateKeySigningKeyRequest {
  
  inline def apply(HostedZoneId: ResourceId, Name: SigningKeyName): ActivateKeySigningKeyRequest = {
    val __obj = js.Dynamic.literal(HostedZoneId = HostedZoneId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivateKeySigningKeyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActivateKeySigningKeyRequest] (val x: Self) extends AnyVal {
    
    inline def setHostedZoneId(value: ResourceId): Self = StObject.set(x, "HostedZoneId", value.asInstanceOf[js.Any])
    
    inline def setName(value: SigningKeyName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
