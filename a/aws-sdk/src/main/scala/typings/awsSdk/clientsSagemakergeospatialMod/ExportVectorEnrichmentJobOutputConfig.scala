package typings.awsSdk.clientsSagemakergeospatialMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportVectorEnrichmentJobOutputConfig extends StObject {
  
  /**
    * The input structure for Amazon S3 data; representing the Amazon S3 location of the input data objects.
    */
  var S3Data: VectorEnrichmentJobS3Data
}
object ExportVectorEnrichmentJobOutputConfig {
  
  inline def apply(S3Data: VectorEnrichmentJobS3Data): ExportVectorEnrichmentJobOutputConfig = {
    val __obj = js.Dynamic.literal(S3Data = S3Data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportVectorEnrichmentJobOutputConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExportVectorEnrichmentJobOutputConfig] (val x: Self) extends AnyVal {
    
    inline def setS3Data(value: VectorEnrichmentJobS3Data): Self = StObject.set(x, "S3Data", value.asInstanceOf[js.Any])
  }
}
