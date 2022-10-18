package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAssetResponse extends StObject {
  
  /**
    * The status of the asset, which contains a state (DELETING after successfully calling this operation) and any error message.
    */
  var assetStatus: AssetStatus
}
object DeleteAssetResponse {
  
  inline def apply(assetStatus: AssetStatus): DeleteAssetResponse = {
    val __obj = js.Dynamic.literal(assetStatus = assetStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAssetResponse]
  }
  
  extension [Self <: DeleteAssetResponse](x: Self) {
    
    inline def setAssetStatus(value: AssetStatus): Self = StObject.set(x, "assetStatus", value.asInstanceOf[js.Any])
  }
}
