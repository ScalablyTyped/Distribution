package typings.awsSdk.clientsDirectconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateLagRequest extends StObject {
  
  /**
    * The LAG MAC Security (MACsec) encryption mode. Amazon Web Services applies the value to all connections which are part of the LAG.
    */
  var encryptionMode: js.UndefOr[EncryptionMode] = js.undefined
  
  /**
    * The ID of the LAG.
    */
  var lagId: LagId
  
  /**
    * The name of the LAG.
    */
  var lagName: js.UndefOr[LagName] = js.undefined
  
  /**
    * The minimum number of physical connections that must be operational for the LAG itself to be operational.
    */
  var minimumLinks: js.UndefOr[Count] = js.undefined
}
object UpdateLagRequest {
  
  inline def apply(lagId: LagId): UpdateLagRequest = {
    val __obj = js.Dynamic.literal(lagId = lagId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateLagRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateLagRequest] (val x: Self) extends AnyVal {
    
    inline def setEncryptionMode(value: EncryptionMode): Self = StObject.set(x, "encryptionMode", value.asInstanceOf[js.Any])
    
    inline def setEncryptionModeUndefined: Self = StObject.set(x, "encryptionMode", js.undefined)
    
    inline def setLagId(value: LagId): Self = StObject.set(x, "lagId", value.asInstanceOf[js.Any])
    
    inline def setLagName(value: LagName): Self = StObject.set(x, "lagName", value.asInstanceOf[js.Any])
    
    inline def setLagNameUndefined: Self = StObject.set(x, "lagName", js.undefined)
    
    inline def setMinimumLinks(value: Count): Self = StObject.set(x, "minimumLinks", value.asInstanceOf[js.Any])
    
    inline def setMinimumLinksUndefined: Self = StObject.set(x, "minimumLinks", js.undefined)
  }
}
