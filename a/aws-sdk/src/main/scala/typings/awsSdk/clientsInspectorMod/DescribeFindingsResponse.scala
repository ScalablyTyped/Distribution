package typings.awsSdk.clientsInspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFindingsResponse extends StObject {
  
  /**
    * Finding details that cannot be described. An error code is provided for each failed item.
    */
  var failedItems: FailedItems
  
  /**
    * Information about the finding.
    */
  var findings: FindingList
}
object DescribeFindingsResponse {
  
  inline def apply(failedItems: FailedItems, findings: FindingList): DescribeFindingsResponse = {
    val __obj = js.Dynamic.literal(failedItems = failedItems.asInstanceOf[js.Any], findings = findings.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFindingsResponse]
  }
  
  extension [Self <: DescribeFindingsResponse](x: Self) {
    
    inline def setFailedItems(value: FailedItems): Self = StObject.set(x, "failedItems", value.asInstanceOf[js.Any])
    
    inline def setFindings(value: FindingList): Self = StObject.set(x, "findings", value.asInstanceOf[js.Any])
    
    inline def setFindingsVarargs(value: Finding*): Self = StObject.set(x, "findings", js.Array(value*))
  }
}
