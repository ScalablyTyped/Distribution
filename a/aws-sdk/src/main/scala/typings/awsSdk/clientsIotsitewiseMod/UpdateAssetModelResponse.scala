package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAssetModelResponse extends StObject {
  
  /**
    * The status of the asset model, which contains a state (UPDATING after successfully calling this operation) and any error message.
    */
  var assetModelStatus: AssetModelStatus
}
object UpdateAssetModelResponse {
  
  inline def apply(assetModelStatus: AssetModelStatus): UpdateAssetModelResponse = {
    val __obj = js.Dynamic.literal(assetModelStatus = assetModelStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAssetModelResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateAssetModelResponse] (val x: Self) extends AnyVal {
    
    inline def setAssetModelStatus(value: AssetModelStatus): Self = StObject.set(x, "assetModelStatus", value.asInstanceOf[js.Any])
  }
}
