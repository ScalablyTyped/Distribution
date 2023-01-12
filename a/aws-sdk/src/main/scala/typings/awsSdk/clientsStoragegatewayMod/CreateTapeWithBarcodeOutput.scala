package typings.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTapeWithBarcodeOutput extends StObject {
  
  /**
    * A unique Amazon Resource Name (ARN) that represents the virtual tape that was created.
    */
  var TapeARN: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.TapeARN] = js.undefined
}
object CreateTapeWithBarcodeOutput {
  
  inline def apply(): CreateTapeWithBarcodeOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTapeWithBarcodeOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateTapeWithBarcodeOutput] (val x: Self) extends AnyVal {
    
    inline def setTapeARN(value: TapeARN): Self = StObject.set(x, "TapeARN", value.asInstanceOf[js.Any])
    
    inline def setTapeARNUndefined: Self = StObject.set(x, "TapeARN", js.undefined)
  }
}
