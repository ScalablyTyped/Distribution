package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegistrationOutput extends StObject {
  
  /**
    * Explains the status of the registration attempt from Amazon AppFlow. If the attempt fails, the message explains why.
    */
  var message: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates the number of resources that Amazon AppFlow created or updated. Possible resources include metadata tables and data partitions.
    */
  var result: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates the status of the registration attempt from Amazon AppFlow.
    */
  var status: js.UndefOr[ExecutionStatus] = js.undefined
}
object RegistrationOutput {
  
  inline def apply(): RegistrationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegistrationOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RegistrationOutput] (val x: Self) extends AnyVal {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    
    inline def setStatus(value: ExecutionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
