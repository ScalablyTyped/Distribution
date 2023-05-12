package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCalculationExecutionCodeResponse extends StObject {
  
  /**
    * The unencrypted code that was executed for the calculation.
    */
  var CodeBlock: js.UndefOr[typings.awsSdk.clientsAthenaMod.CodeBlock] = js.undefined
}
object GetCalculationExecutionCodeResponse {
  
  inline def apply(): GetCalculationExecutionCodeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCalculationExecutionCodeResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetCalculationExecutionCodeResponse] (val x: Self) extends AnyVal {
    
    inline def setCodeBlock(value: CodeBlock): Self = StObject.set(x, "CodeBlock", value.asInstanceOf[js.Any])
    
    inline def setCodeBlockUndefined: Self = StObject.set(x, "CodeBlock", js.undefined)
  }
}
