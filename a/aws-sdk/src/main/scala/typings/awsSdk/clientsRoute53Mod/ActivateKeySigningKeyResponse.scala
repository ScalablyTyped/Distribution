package typings.awsSdk.clientsRoute53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivateKeySigningKeyResponse extends StObject {
  
  var ChangeInfo: typings.awsSdk.clientsRoute53Mod.ChangeInfo
}
object ActivateKeySigningKeyResponse {
  
  inline def apply(ChangeInfo: ChangeInfo): ActivateKeySigningKeyResponse = {
    val __obj = js.Dynamic.literal(ChangeInfo = ChangeInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivateKeySigningKeyResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActivateKeySigningKeyResponse] (val x: Self) extends AnyVal {
    
    inline def setChangeInfo(value: ChangeInfo): Self = StObject.set(x, "ChangeInfo", value.asInstanceOf[js.Any])
  }
}
