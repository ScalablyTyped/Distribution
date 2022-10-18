package typings.awsSdk.clientsIotdeviceadvisorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartSuiteRunResponse extends StObject {
  
  /**
    * Starts a Device Advisor test suite run based on suite create time.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Amazon Resource Name (ARN) of the started suite run.
    */
  var suiteRunArn: js.UndefOr[AmazonResourceName] = js.undefined
  
  /**
    * Suite Run ID of the started suite run.
    */
  var suiteRunId: js.UndefOr[UUID] = js.undefined
}
object StartSuiteRunResponse {
  
  inline def apply(): StartSuiteRunResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartSuiteRunResponse]
  }
  
  extension [Self <: StartSuiteRunResponse](x: Self) {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setSuiteRunArn(value: AmazonResourceName): Self = StObject.set(x, "suiteRunArn", value.asInstanceOf[js.Any])
    
    inline def setSuiteRunArnUndefined: Self = StObject.set(x, "suiteRunArn", js.undefined)
    
    inline def setSuiteRunId(value: UUID): Self = StObject.set(x, "suiteRunId", value.asInstanceOf[js.Any])
    
    inline def setSuiteRunIdUndefined: Self = StObject.set(x, "suiteRunId", js.undefined)
  }
}
