package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelClientConfig extends StObject {
  
  /**
    * The maximum number of retries when invocation requests are failing. The default value is 3.
    */
  var InvocationsMaxRetries: js.UndefOr[typings.awsSdk.clientsSagemakerMod.InvocationsMaxRetries] = js.undefined
  
  /**
    * The timeout value in seconds for an invocation request. The default value is 600.
    */
  var InvocationsTimeoutInSeconds: js.UndefOr[typings.awsSdk.clientsSagemakerMod.InvocationsTimeoutInSeconds] = js.undefined
}
object ModelClientConfig {
  
  inline def apply(): ModelClientConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelClientConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModelClientConfig] (val x: Self) extends AnyVal {
    
    inline def setInvocationsMaxRetries(value: InvocationsMaxRetries): Self = StObject.set(x, "InvocationsMaxRetries", value.asInstanceOf[js.Any])
    
    inline def setInvocationsMaxRetriesUndefined: Self = StObject.set(x, "InvocationsMaxRetries", js.undefined)
    
    inline def setInvocationsTimeoutInSeconds(value: InvocationsTimeoutInSeconds): Self = StObject.set(x, "InvocationsTimeoutInSeconds", value.asInstanceOf[js.Any])
    
    inline def setInvocationsTimeoutInSecondsUndefined: Self = StObject.set(x, "InvocationsTimeoutInSeconds", js.undefined)
  }
}
