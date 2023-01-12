package typings.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssignTapePoolOutput extends StObject {
  
  /**
    * The unique Amazon Resource Names (ARN) of the virtual tape that was added to the tape pool.
    */
  var TapeARN: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.TapeARN] = js.undefined
}
object AssignTapePoolOutput {
  
  inline def apply(): AssignTapePoolOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssignTapePoolOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssignTapePoolOutput] (val x: Self) extends AnyVal {
    
    inline def setTapeARN(value: TapeARN): Self = StObject.set(x, "TapeARN", value.asInstanceOf[js.Any])
    
    inline def setTapeARNUndefined: Self = StObject.set(x, "TapeARN", js.undefined)
  }
}
