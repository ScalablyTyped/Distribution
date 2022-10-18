package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailedDeleteRemediationExceptionsBatch extends StObject {
  
  /**
    * Returns remediation exception resource key object of the failed items.
    */
  var FailedItems: js.UndefOr[RemediationExceptionResourceKeys] = js.undefined
  
  /**
    * Returns a failure message for delete remediation exception. For example, Config creates an exception due to an internal error.
    */
  var FailureMessage: js.UndefOr[String] = js.undefined
}
object FailedDeleteRemediationExceptionsBatch {
  
  inline def apply(): FailedDeleteRemediationExceptionsBatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailedDeleteRemediationExceptionsBatch]
  }
  
  extension [Self <: FailedDeleteRemediationExceptionsBatch](x: Self) {
    
    inline def setFailedItems(value: RemediationExceptionResourceKeys): Self = StObject.set(x, "FailedItems", value.asInstanceOf[js.Any])
    
    inline def setFailedItemsUndefined: Self = StObject.set(x, "FailedItems", js.undefined)
    
    inline def setFailedItemsVarargs(value: RemediationExceptionResourceKey*): Self = StObject.set(x, "FailedItems", js.Array(value*))
    
    inline def setFailureMessage(value: String): Self = StObject.set(x, "FailureMessage", value.asInstanceOf[js.Any])
    
    inline def setFailureMessageUndefined: Self = StObject.set(x, "FailureMessage", js.undefined)
  }
}
