package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchImportFindingsRequest extends StObject {
  
  /**
    * A list of findings to import. To successfully import a finding, it must follow the Amazon Web Services Security Finding Format. Maximum of 100 findings per request.
    */
  var Findings: BatchImportFindingsRequestFindingList
}
object BatchImportFindingsRequest {
  
  inline def apply(Findings: BatchImportFindingsRequestFindingList): BatchImportFindingsRequest = {
    val __obj = js.Dynamic.literal(Findings = Findings.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchImportFindingsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchImportFindingsRequest] (val x: Self) extends AnyVal {
    
    inline def setFindings(value: BatchImportFindingsRequestFindingList): Self = StObject.set(x, "Findings", value.asInstanceOf[js.Any])
    
    inline def setFindingsVarargs(value: AwsSecurityFinding*): Self = StObject.set(x, "Findings", js.Array(value*))
  }
}
