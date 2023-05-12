package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvaluationContext extends StObject {
  
  /**
    * A unique EvaluationContextIdentifier ID for an EvaluationContext.
    */
  var EvaluationContextIdentifier: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.EvaluationContextIdentifier] = js.undefined
}
object EvaluationContext {
  
  inline def apply(): EvaluationContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EvaluationContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EvaluationContext] (val x: Self) extends AnyVal {
    
    inline def setEvaluationContextIdentifier(value: EvaluationContextIdentifier): Self = StObject.set(x, "EvaluationContextIdentifier", value.asInstanceOf[js.Any])
    
    inline def setEvaluationContextIdentifierUndefined: Self = StObject.set(x, "EvaluationContextIdentifier", js.undefined)
  }
}
