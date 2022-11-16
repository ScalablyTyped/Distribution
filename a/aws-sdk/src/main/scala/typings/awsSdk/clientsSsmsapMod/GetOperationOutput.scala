package typings.awsSdk.clientsSsmsapMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetOperationOutput extends StObject {
  
  /**
    * 
    */
  var Operation: js.UndefOr[typings.awsSdk.clientsSsmsapMod.Operation] = js.undefined
}
object GetOperationOutput {
  
  inline def apply(): GetOperationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOperationOutput]
  }
  
  extension [Self <: GetOperationOutput](x: Self) {
    
    inline def setOperation(value: Operation): Self = StObject.set(x, "Operation", value.asInstanceOf[js.Any])
    
    inline def setOperationUndefined: Self = StObject.set(x, "Operation", js.undefined)
  }
}
