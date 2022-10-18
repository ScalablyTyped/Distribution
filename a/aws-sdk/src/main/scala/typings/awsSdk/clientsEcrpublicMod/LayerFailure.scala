package typings.awsSdk.clientsEcrpublicMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayerFailure extends StObject {
  
  /**
    * The failure code associated with the failure.
    */
  var failureCode: js.UndefOr[LayerFailureCode] = js.undefined
  
  /**
    * The reason for the failure.
    */
  var failureReason: js.UndefOr[LayerFailureReason] = js.undefined
  
  /**
    * The layer digest associated with the failure.
    */
  var layerDigest: js.UndefOr[BatchedOperationLayerDigest] = js.undefined
}
object LayerFailure {
  
  inline def apply(): LayerFailure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayerFailure]
  }
  
  extension [Self <: LayerFailure](x: Self) {
    
    inline def setFailureCode(value: LayerFailureCode): Self = StObject.set(x, "failureCode", value.asInstanceOf[js.Any])
    
    inline def setFailureCodeUndefined: Self = StObject.set(x, "failureCode", js.undefined)
    
    inline def setFailureReason(value: LayerFailureReason): Self = StObject.set(x, "failureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "failureReason", js.undefined)
    
    inline def setLayerDigest(value: BatchedOperationLayerDigest): Self = StObject.set(x, "layerDigest", value.asInstanceOf[js.Any])
    
    inline def setLayerDigestUndefined: Self = StObject.set(x, "layerDigest", js.undefined)
  }
}
