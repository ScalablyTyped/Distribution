package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchUpdateFindingsResponse extends StObject {
  
  /**
    * The list of findings that were updated successfully.
    */
  var ProcessedFindings: AwsSecurityFindingIdentifierList
  
  /**
    * The list of findings that were not updated.
    */
  var UnprocessedFindings: BatchUpdateFindingsUnprocessedFindingsList
}
object BatchUpdateFindingsResponse {
  
  inline def apply(
    ProcessedFindings: AwsSecurityFindingIdentifierList,
    UnprocessedFindings: BatchUpdateFindingsUnprocessedFindingsList
  ): BatchUpdateFindingsResponse = {
    val __obj = js.Dynamic.literal(ProcessedFindings = ProcessedFindings.asInstanceOf[js.Any], UnprocessedFindings = UnprocessedFindings.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchUpdateFindingsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchUpdateFindingsResponse] (val x: Self) extends AnyVal {
    
    inline def setProcessedFindings(value: AwsSecurityFindingIdentifierList): Self = StObject.set(x, "ProcessedFindings", value.asInstanceOf[js.Any])
    
    inline def setProcessedFindingsVarargs(value: AwsSecurityFindingIdentifier*): Self = StObject.set(x, "ProcessedFindings", js.Array(value*))
    
    inline def setUnprocessedFindings(value: BatchUpdateFindingsUnprocessedFindingsList): Self = StObject.set(x, "UnprocessedFindings", value.asInstanceOf[js.Any])
    
    inline def setUnprocessedFindingsVarargs(value: BatchUpdateFindingsUnprocessedFinding*): Self = StObject.set(x, "UnprocessedFindings", js.Array(value*))
  }
}
