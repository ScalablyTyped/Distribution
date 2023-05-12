package typings.awsSdk.clientsSagemakergeospatialMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VectorEnrichmentJobExportErrorDetails extends StObject {
  
  /**
    * The message providing details about the errors generated during the Vector Enrichment job.
    */
  var Message: js.UndefOr[String] = js.undefined
  
  /**
    * The output error details for an Export operation on a Vector Enrichment job.
    */
  var Type: js.UndefOr[VectorEnrichmentJobExportErrorType] = js.undefined
}
object VectorEnrichmentJobExportErrorDetails {
  
  inline def apply(): VectorEnrichmentJobExportErrorDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VectorEnrichmentJobExportErrorDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VectorEnrichmentJobExportErrorDetails] (val x: Self) extends AnyVal {
    
    inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    inline def setType(value: VectorEnrichmentJobExportErrorType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
