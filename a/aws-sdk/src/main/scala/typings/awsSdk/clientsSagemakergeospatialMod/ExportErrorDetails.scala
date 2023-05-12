package typings.awsSdk.clientsSagemakergeospatialMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportErrorDetails extends StObject {
  
  /**
    * The structure for returning the export error details while exporting results of an Earth Observation job.
    */
  var ExportResults: js.UndefOr[ExportErrorDetailsOutput] = js.undefined
  
  /**
    * The structure for returning the export error details while exporting the source images of an Earth Observation job.
    */
  var ExportSourceImages: js.UndefOr[ExportErrorDetailsOutput] = js.undefined
}
object ExportErrorDetails {
  
  inline def apply(): ExportErrorDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportErrorDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExportErrorDetails] (val x: Self) extends AnyVal {
    
    inline def setExportResults(value: ExportErrorDetailsOutput): Self = StObject.set(x, "ExportResults", value.asInstanceOf[js.Any])
    
    inline def setExportResultsUndefined: Self = StObject.set(x, "ExportResults", js.undefined)
    
    inline def setExportSourceImages(value: ExportErrorDetailsOutput): Self = StObject.set(x, "ExportSourceImages", value.asInstanceOf[js.Any])
    
    inline def setExportSourceImagesUndefined: Self = StObject.set(x, "ExportSourceImages", js.undefined)
  }
}
