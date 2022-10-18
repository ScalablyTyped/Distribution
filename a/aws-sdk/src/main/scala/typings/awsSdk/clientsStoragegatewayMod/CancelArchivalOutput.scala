package typings.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelArchivalOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the virtual tape for which archiving was canceled.
    */
  var TapeARN: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.TapeARN] = js.undefined
}
object CancelArchivalOutput {
  
  inline def apply(): CancelArchivalOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelArchivalOutput]
  }
  
  extension [Self <: CancelArchivalOutput](x: Self) {
    
    inline def setTapeARN(value: TapeARN): Self = StObject.set(x, "TapeARN", value.asInstanceOf[js.Any])
    
    inline def setTapeARNUndefined: Self = StObject.set(x, "TapeARN", js.undefined)
  }
}
