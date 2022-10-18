package typings.awsSdk.clientsRoute53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeactivateKeySigningKeyResponse extends StObject {
  
  var ChangeInfo: typings.awsSdk.clientsRoute53Mod.ChangeInfo
}
object DeactivateKeySigningKeyResponse {
  
  inline def apply(ChangeInfo: ChangeInfo): DeactivateKeySigningKeyResponse = {
    val __obj = js.Dynamic.literal(ChangeInfo = ChangeInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeactivateKeySigningKeyResponse]
  }
  
  extension [Self <: DeactivateKeySigningKeyResponse](x: Self) {
    
    inline def setChangeInfo(value: ChangeInfo): Self = StObject.set(x, "ChangeInfo", value.asInstanceOf[js.Any])
  }
}
