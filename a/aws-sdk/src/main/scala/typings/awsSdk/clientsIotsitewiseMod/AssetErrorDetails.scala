package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssetErrorDetails extends StObject {
  
  /**
    * The ID of the asset.
    */
  var assetId: ID
  
  /**
    * The error code.
    */
  var code: AssetErrorCode
  
  /**
    * The error message.
    */
  var message: AssetErrorMessage
}
object AssetErrorDetails {
  
  inline def apply(assetId: ID, code: AssetErrorCode, message: AssetErrorMessage): AssetErrorDetails = {
    val __obj = js.Dynamic.literal(assetId = assetId.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetErrorDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssetErrorDetails] (val x: Self) extends AnyVal {
    
    inline def setAssetId(value: ID): Self = StObject.set(x, "assetId", value.asInstanceOf[js.Any])
    
    inline def setCode(value: AssetErrorCode): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: AssetErrorMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
