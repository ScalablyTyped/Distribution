package typings.awsSdk.clientsIotdeviceadvisorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestCaseRun extends StObject {
  
  /**
    * Provides test case run end time.
    */
  var endTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Provides test case run failure result.
    */
  var failure: js.UndefOr[Failure] = js.undefined
  
  /**
    * Provides test case run log URL.
    */
  var logUrl: js.UndefOr[LogUrl] = js.undefined
  
  /**
    * Provides test case run start time.
    */
  var startTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Provides the test case run status. Status is one of the following:    PASS: Test passed.    FAIL: Test failed.    PENDING: Test has not started running but is scheduled.    RUNNING: Test is running.    STOPPING: Test is performing cleanup steps. You will see this status only if you stop a suite run.    STOPPED Test is stopped. You will see this status only if you stop a suite run.    PASS_WITH_WARNINGS: Test passed with warnings.    ERORR: Test faced an error when running due to an internal issue.  
    */
  var status: js.UndefOr[Status] = js.undefined
  
  /**
    * Provides the test case run definition ID.
    */
  var testCaseDefinitionId: js.UndefOr[UUID] = js.undefined
  
  /**
    * Provides the test case run definition name.
    */
  var testCaseDefinitionName: js.UndefOr[TestCaseDefinitionName] = js.undefined
  
  /**
    * Provides the test case run ID.
    */
  var testCaseRunId: js.UndefOr[UUID] = js.undefined
  
  /**
    *  Provides the test scenarios for the test case run. 
    */
  var testScenarios: js.UndefOr[TestCaseScenariosList] = js.undefined
  
  /**
    * Provides test case run warnings.
    */
  var warnings: js.UndefOr[Warnings] = js.undefined
}
object TestCaseRun {
  
  inline def apply(): TestCaseRun = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestCaseRun]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestCaseRun] (val x: Self) extends AnyVal {
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setFailure(value: Failure): Self = StObject.set(x, "failure", value.asInstanceOf[js.Any])
    
    inline def setFailureUndefined: Self = StObject.set(x, "failure", js.undefined)
    
    inline def setLogUrl(value: LogUrl): Self = StObject.set(x, "logUrl", value.asInstanceOf[js.Any])
    
    inline def setLogUrlUndefined: Self = StObject.set(x, "logUrl", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTestCaseDefinitionId(value: UUID): Self = StObject.set(x, "testCaseDefinitionId", value.asInstanceOf[js.Any])
    
    inline def setTestCaseDefinitionIdUndefined: Self = StObject.set(x, "testCaseDefinitionId", js.undefined)
    
    inline def setTestCaseDefinitionName(value: TestCaseDefinitionName): Self = StObject.set(x, "testCaseDefinitionName", value.asInstanceOf[js.Any])
    
    inline def setTestCaseDefinitionNameUndefined: Self = StObject.set(x, "testCaseDefinitionName", js.undefined)
    
    inline def setTestCaseRunId(value: UUID): Self = StObject.set(x, "testCaseRunId", value.asInstanceOf[js.Any])
    
    inline def setTestCaseRunIdUndefined: Self = StObject.set(x, "testCaseRunId", js.undefined)
    
    inline def setTestScenarios(value: TestCaseScenariosList): Self = StObject.set(x, "testScenarios", value.asInstanceOf[js.Any])
    
    inline def setTestScenariosUndefined: Self = StObject.set(x, "testScenarios", js.undefined)
    
    inline def setTestScenariosVarargs(value: TestCaseScenario*): Self = StObject.set(x, "testScenarios", js.Array(value*))
    
    inline def setWarnings(value: Warnings): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
  }
}
