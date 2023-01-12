package typings.awsSdk.clientsIotdeviceadvisorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSuiteRunRequest extends StObject {
  
  /**
    * Suite definition ID for the test suite run.
    */
  var suiteDefinitionId: UUID
  
  /**
    * Suite run ID for the test suite run.
    */
  var suiteRunId: UUID
}
object GetSuiteRunRequest {
  
  inline def apply(suiteDefinitionId: UUID, suiteRunId: UUID): GetSuiteRunRequest = {
    val __obj = js.Dynamic.literal(suiteDefinitionId = suiteDefinitionId.asInstanceOf[js.Any], suiteRunId = suiteRunId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSuiteRunRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSuiteRunRequest] (val x: Self) extends AnyVal {
    
    inline def setSuiteDefinitionId(value: UUID): Self = StObject.set(x, "suiteDefinitionId", value.asInstanceOf[js.Any])
    
    inline def setSuiteRunId(value: UUID): Self = StObject.set(x, "suiteRunId", value.asInstanceOf[js.Any])
  }
}
