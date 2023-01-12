package typings.awsSdk.clientsLookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IngestedFilesSummary extends StObject {
  
  /**
    * Indicates the number of files that were discarded. A file could be discarded because its format is invalid (for example, a jpg or pdf) or not readable.
    */
  var DiscardedFiles: js.UndefOr[ListOfDiscardedFiles] = js.undefined
  
  /**
    * Indicates the number of files that were successfully ingested.
    */
  var IngestedNumberOfFiles: Integer
  
  /**
    * Indicates the total number of files that were submitted for ingestion.
    */
  var TotalNumberOfFiles: Integer
}
object IngestedFilesSummary {
  
  inline def apply(IngestedNumberOfFiles: Integer, TotalNumberOfFiles: Integer): IngestedFilesSummary = {
    val __obj = js.Dynamic.literal(IngestedNumberOfFiles = IngestedNumberOfFiles.asInstanceOf[js.Any], TotalNumberOfFiles = TotalNumberOfFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngestedFilesSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IngestedFilesSummary] (val x: Self) extends AnyVal {
    
    inline def setDiscardedFiles(value: ListOfDiscardedFiles): Self = StObject.set(x, "DiscardedFiles", value.asInstanceOf[js.Any])
    
    inline def setDiscardedFilesUndefined: Self = StObject.set(x, "DiscardedFiles", js.undefined)
    
    inline def setDiscardedFilesVarargs(value: S3Object*): Self = StObject.set(x, "DiscardedFiles", js.Array(value*))
    
    inline def setIngestedNumberOfFiles(value: Integer): Self = StObject.set(x, "IngestedNumberOfFiles", value.asInstanceOf[js.Any])
    
    inline def setTotalNumberOfFiles(value: Integer): Self = StObject.set(x, "TotalNumberOfFiles", value.asInstanceOf[js.Any])
  }
}
