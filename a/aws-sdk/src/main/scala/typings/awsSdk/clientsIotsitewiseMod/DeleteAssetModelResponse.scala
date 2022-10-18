package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAssetModelResponse extends StObject {
  
  /**
    * The status of the asset model, which contains a state (DELETING after successfully calling this operation) and any error message.
    */
  var assetModelStatus: AssetModelStatus
}
object DeleteAssetModelResponse {
  
  inline def apply(assetModelStatus: AssetModelStatus): DeleteAssetModelResponse = {
    val __obj = js.Dynamic.literal(assetModelStatus = assetModelStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAssetModelResponse]
  }
  
  extension [Self <: DeleteAssetModelResponse](x: Self) {
    
    inline def setAssetModelStatus(value: AssetModelStatus): Self = StObject.set(x, "assetModelStatus", value.asInstanceOf[js.Any])
  }
}
