package typings.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSMBFileShareVisibilityInput extends StObject {
  
  /**
    * The shares on this gateway appear when listing shares.
    */
  var FileSharesVisible: Boolean
  
  var GatewayARN: typings.awsSdk.clientsStoragegatewayMod.GatewayARN
}
object UpdateSMBFileShareVisibilityInput {
  
  inline def apply(FileSharesVisible: Boolean, GatewayARN: GatewayARN): UpdateSMBFileShareVisibilityInput = {
    val __obj = js.Dynamic.literal(FileSharesVisible = FileSharesVisible.asInstanceOf[js.Any], GatewayARN = GatewayARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSMBFileShareVisibilityInput]
  }
  
  extension [Self <: UpdateSMBFileShareVisibilityInput](x: Self) {
    
    inline def setFileSharesVisible(value: Boolean): Self = StObject.set(x, "FileSharesVisible", value.asInstanceOf[js.Any])
    
    inline def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
  }
}
