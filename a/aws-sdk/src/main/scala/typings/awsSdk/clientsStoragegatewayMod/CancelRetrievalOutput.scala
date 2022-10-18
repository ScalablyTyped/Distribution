package typings.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelRetrievalOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the virtual tape for which retrieval was canceled.
    */
  var TapeARN: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.TapeARN] = js.undefined
}
object CancelRetrievalOutput {
  
  inline def apply(): CancelRetrievalOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelRetrievalOutput]
  }
  
  extension [Self <: CancelRetrievalOutput](x: Self) {
    
    inline def setTapeARN(value: TapeARN): Self = StObject.set(x, "TapeARN", value.asInstanceOf[js.Any])
    
    inline def setTapeARNUndefined: Self = StObject.set(x, "TapeARN", js.undefined)
  }
}
