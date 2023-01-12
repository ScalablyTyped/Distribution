package typings.awsSdk.clientsSsmsapMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetOperationInput extends StObject {
  
  /**
    * 
    */
  var OperationId: typings.awsSdk.clientsSsmsapMod.OperationId
}
object GetOperationInput {
  
  inline def apply(OperationId: OperationId): GetOperationInput = {
    val __obj = js.Dynamic.literal(OperationId = OperationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOperationInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetOperationInput] (val x: Self) extends AnyVal {
    
    inline def setOperationId(value: OperationId): Self = StObject.set(x, "OperationId", value.asInstanceOf[js.Any])
  }
}
