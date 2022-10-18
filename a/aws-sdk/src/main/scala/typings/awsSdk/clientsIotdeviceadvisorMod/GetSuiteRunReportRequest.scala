package typings.awsSdk.clientsIotdeviceadvisorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSuiteRunReportRequest extends StObject {
  
  /**
    * Suite definition ID of the test suite.
    */
  var suiteDefinitionId: UUID
  
  /**
    * Suite run ID of the test suite run.
    */
  var suiteRunId: UUID
}
object GetSuiteRunReportRequest {
  
  inline def apply(suiteDefinitionId: UUID, suiteRunId: UUID): GetSuiteRunReportRequest = {
    val __obj = js.Dynamic.literal(suiteDefinitionId = suiteDefinitionId.asInstanceOf[js.Any], suiteRunId = suiteRunId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSuiteRunReportRequest]
  }
  
  extension [Self <: GetSuiteRunReportRequest](x: Self) {
    
    inline def setSuiteDefinitionId(value: UUID): Self = StObject.set(x, "suiteDefinitionId", value.asInstanceOf[js.Any])
    
    inline def setSuiteRunId(value: UUID): Self = StObject.set(x, "suiteRunId", value.asInstanceOf[js.Any])
  }
}
