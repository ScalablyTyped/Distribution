package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAuditFindingResponse extends StObject {
  
  var finding: js.UndefOr[AuditFinding] = js.undefined
}
object DescribeAuditFindingResponse {
  
  inline def apply(): DescribeAuditFindingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAuditFindingResponse]
  }
  
  extension [Self <: DescribeAuditFindingResponse](x: Self) {
    
    inline def setFinding(value: AuditFinding): Self = StObject.set(x, "finding", value.asInstanceOf[js.Any])
    
    inline def setFindingUndefined: Self = StObject.set(x, "finding", js.undefined)
  }
}
