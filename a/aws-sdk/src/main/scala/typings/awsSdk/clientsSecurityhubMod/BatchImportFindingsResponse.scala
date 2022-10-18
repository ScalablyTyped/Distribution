package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchImportFindingsResponse extends StObject {
  
  /**
    * The number of findings that failed to import.
    */
  var FailedCount: Integer
  
  /**
    * The list of findings that failed to import.
    */
  var FailedFindings: js.UndefOr[ImportFindingsErrorList] = js.undefined
  
  /**
    * The number of findings that were successfully imported.
    */
  var SuccessCount: Integer
}
object BatchImportFindingsResponse {
  
  inline def apply(FailedCount: Integer, SuccessCount: Integer): BatchImportFindingsResponse = {
    val __obj = js.Dynamic.literal(FailedCount = FailedCount.asInstanceOf[js.Any], SuccessCount = SuccessCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchImportFindingsResponse]
  }
  
  extension [Self <: BatchImportFindingsResponse](x: Self) {
    
    inline def setFailedCount(value: Integer): Self = StObject.set(x, "FailedCount", value.asInstanceOf[js.Any])
    
    inline def setFailedFindings(value: ImportFindingsErrorList): Self = StObject.set(x, "FailedFindings", value.asInstanceOf[js.Any])
    
    inline def setFailedFindingsUndefined: Self = StObject.set(x, "FailedFindings", js.undefined)
    
    inline def setFailedFindingsVarargs(value: ImportFindingsError*): Self = StObject.set(x, "FailedFindings", js.Array(value*))
    
    inline def setSuccessCount(value: Integer): Self = StObject.set(x, "SuccessCount", value.asInstanceOf[js.Any])
  }
}
