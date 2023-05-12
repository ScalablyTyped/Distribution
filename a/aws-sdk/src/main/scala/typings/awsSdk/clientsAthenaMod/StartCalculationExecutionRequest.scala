package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartCalculationExecutionRequest extends StObject {
  
  /**
    * Contains configuration information for the calculation.
    */
  var CalculationConfiguration: js.UndefOr[typings.awsSdk.clientsAthenaMod.CalculationConfiguration] = js.undefined
  
  /**
    * A unique case-sensitive string used to ensure the request to create the calculation is idempotent (executes only once). If another StartCalculationExecutionRequest is received, the same response is returned and another calculation is not created. If a parameter has changed, an error is returned.  This token is listed as not required because Amazon Web Services SDKs (for example the Amazon Web Services SDK for Java) auto-generate the token for users. If you are not using the Amazon Web Services SDK or the Amazon Web Services CLI, you must provide this token or the action will fail. 
    */
  var ClientRequestToken: js.UndefOr[IdempotencyToken] = js.undefined
  
  /**
    * A string that contains the code of the calculation.
    */
  var CodeBlock: js.UndefOr[typings.awsSdk.clientsAthenaMod.CodeBlock] = js.undefined
  
  /**
    * A description of the calculation.
    */
  var Description: js.UndefOr[DescriptionString] = js.undefined
  
  /**
    * The session ID.
    */
  var SessionId: typings.awsSdk.clientsAthenaMod.SessionId
}
object StartCalculationExecutionRequest {
  
  inline def apply(SessionId: SessionId): StartCalculationExecutionRequest = {
    val __obj = js.Dynamic.literal(SessionId = SessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartCalculationExecutionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartCalculationExecutionRequest] (val x: Self) extends AnyVal {
    
    inline def setCalculationConfiguration(value: CalculationConfiguration): Self = StObject.set(x, "CalculationConfiguration", value.asInstanceOf[js.Any])
    
    inline def setCalculationConfigurationUndefined: Self = StObject.set(x, "CalculationConfiguration", js.undefined)
    
    inline def setClientRequestToken(value: IdempotencyToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setCodeBlock(value: CodeBlock): Self = StObject.set(x, "CodeBlock", value.asInstanceOf[js.Any])
    
    inline def setCodeBlockUndefined: Self = StObject.set(x, "CodeBlock", js.undefined)
    
    inline def setDescription(value: DescriptionString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setSessionId(value: SessionId): Self = StObject.set(x, "SessionId", value.asInstanceOf[js.Any])
  }
}
