package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SupportedOperation extends StObject {
  
  /**
    * A list of the supported operations.
    */
  var OperationName: js.UndefOr[String] = js.undefined
}
object SupportedOperation {
  
  inline def apply(): SupportedOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SupportedOperation]
  }
  
  extension [Self <: SupportedOperation](x: Self) {
    
    inline def setOperationName(value: String): Self = StObject.set(x, "OperationName", value.asInstanceOf[js.Any])
    
    inline def setOperationNameUndefined: Self = StObject.set(x, "OperationName", js.undefined)
  }
}
