package typings.awsSdk.clientsSagemakergeospatialMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VectorEnrichmentJobErrorDetails extends StObject {
  
  /**
    * A message that you define and then is processed and rendered by the Vector Enrichment job when the error occurs.
    */
  var ErrorMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The type of error generated during the Vector Enrichment job.
    */
  var ErrorType: js.UndefOr[VectorEnrichmentJobErrorType] = js.undefined
}
object VectorEnrichmentJobErrorDetails {
  
  inline def apply(): VectorEnrichmentJobErrorDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VectorEnrichmentJobErrorDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VectorEnrichmentJobErrorDetails] (val x: Self) extends AnyVal {
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    inline def setErrorType(value: VectorEnrichmentJobErrorType): Self = StObject.set(x, "ErrorType", value.asInstanceOf[js.Any])
    
    inline def setErrorTypeUndefined: Self = StObject.set(x, "ErrorType", js.undefined)
  }
}
