package typings.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTapesOutput extends StObject {
  
  /**
    * A list of unique Amazon Resource Names (ARNs) that represents the virtual tapes that were created.
    */
  var TapeARNs: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.TapeARNs] = js.undefined
}
object CreateTapesOutput {
  
  inline def apply(): CreateTapesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTapesOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateTapesOutput] (val x: Self) extends AnyVal {
    
    inline def setTapeARNs(value: TapeARNs): Self = StObject.set(x, "TapeARNs", value.asInstanceOf[js.Any])
    
    inline def setTapeARNsUndefined: Self = StObject.set(x, "TapeARNs", js.undefined)
    
    inline def setTapeARNsVarargs(value: TapeARN*): Self = StObject.set(x, "TapeARNs", js.Array(value*))
  }
}
