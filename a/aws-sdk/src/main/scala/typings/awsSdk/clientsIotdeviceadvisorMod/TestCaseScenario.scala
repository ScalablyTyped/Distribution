package typings.awsSdk.clientsIotdeviceadvisorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestCaseScenario extends StObject {
  
  /**
    * Provides test case scenario failure result.
    */
  var failure: js.UndefOr[Failure] = js.undefined
  
  /**
    * Provides the test case scenario status. Status is one of the following:    PASS: Test passed.    FAIL: Test failed.    PENDING: Test has not started running but is scheduled.    RUNNING: Test is running.    STOPPING: Test is performing cleanup steps. You will see this status only if you stop a suite run.    STOPPED Test is stopped. You will see this status only if you stop a suite run.    PASS_WITH_WARNINGS: Test passed with warnings.    ERORR: Test faced an error when running due to an internal issue.  
    */
  var status: js.UndefOr[TestCaseScenarioStatus] = js.undefined
  
  /**
    *  
    */
  var systemMessage: js.UndefOr[SystemMessage] = js.undefined
  
  /**
    * Provides test case scenario ID.
    */
  var testCaseScenarioId: js.UndefOr[TestCaseScenarioId] = js.undefined
  
  /**
    * Provides test case scenario type. Type is one of the following:   Advanced   Basic  
    */
  var testCaseScenarioType: js.UndefOr[TestCaseScenarioType] = js.undefined
}
object TestCaseScenario {
  
  inline def apply(): TestCaseScenario = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestCaseScenario]
  }
  
  extension [Self <: TestCaseScenario](x: Self) {
    
    inline def setFailure(value: Failure): Self = StObject.set(x, "failure", value.asInstanceOf[js.Any])
    
    inline def setFailureUndefined: Self = StObject.set(x, "failure", js.undefined)
    
    inline def setStatus(value: TestCaseScenarioStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSystemMessage(value: SystemMessage): Self = StObject.set(x, "systemMessage", value.asInstanceOf[js.Any])
    
    inline def setSystemMessageUndefined: Self = StObject.set(x, "systemMessage", js.undefined)
    
    inline def setTestCaseScenarioId(value: TestCaseScenarioId): Self = StObject.set(x, "testCaseScenarioId", value.asInstanceOf[js.Any])
    
    inline def setTestCaseScenarioIdUndefined: Self = StObject.set(x, "testCaseScenarioId", js.undefined)
    
    inline def setTestCaseScenarioType(value: TestCaseScenarioType): Self = StObject.set(x, "testCaseScenarioType", value.asInstanceOf[js.Any])
    
    inline def setTestCaseScenarioTypeUndefined: Self = StObject.set(x, "testCaseScenarioType", js.undefined)
  }
}
