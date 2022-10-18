package typings.awsSdk.clientsIotdeviceadvisorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSuiteRunResponse extends StObject {
  
  /**
    * Date (in Unix epoch time) when the test suite run ended.
    */
  var endTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Error reason for any test suite run failure.
    */
  var errorReason: js.UndefOr[ErrorReason] = js.undefined
  
  /**
    * Date (in Unix epoch time) when the test suite run started.
    */
  var startTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Status for the test suite run.
    */
  var status: js.UndefOr[SuiteRunStatus] = js.undefined
  
  /**
    * Suite definition ID for the test suite run.
    */
  var suiteDefinitionId: js.UndefOr[UUID] = js.undefined
  
  /**
    * Suite definition version for the test suite run.
    */
  var suiteDefinitionVersion: js.UndefOr[SuiteDefinitionVersion] = js.undefined
  
  /**
    * The ARN of the suite run.
    */
  var suiteRunArn: js.UndefOr[AmazonResourceName] = js.undefined
  
  /**
    * Suite run configuration for the test suite run.
    */
  var suiteRunConfiguration: js.UndefOr[SuiteRunConfiguration] = js.undefined
  
  /**
    * Suite run ID for the test suite run.
    */
  var suiteRunId: js.UndefOr[UUID] = js.undefined
  
  /**
    * The tags attached to the suite run.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * Test results for the test suite run.
    */
  var testResult: js.UndefOr[TestResult] = js.undefined
}
object GetSuiteRunResponse {
  
  inline def apply(): GetSuiteRunResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSuiteRunResponse]
  }
  
  extension [Self <: GetSuiteRunResponse](x: Self) {
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setErrorReason(value: ErrorReason): Self = StObject.set(x, "errorReason", value.asInstanceOf[js.Any])
    
    inline def setErrorReasonUndefined: Self = StObject.set(x, "errorReason", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setStatus(value: SuiteRunStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSuiteDefinitionId(value: UUID): Self = StObject.set(x, "suiteDefinitionId", value.asInstanceOf[js.Any])
    
    inline def setSuiteDefinitionIdUndefined: Self = StObject.set(x, "suiteDefinitionId", js.undefined)
    
    inline def setSuiteDefinitionVersion(value: SuiteDefinitionVersion): Self = StObject.set(x, "suiteDefinitionVersion", value.asInstanceOf[js.Any])
    
    inline def setSuiteDefinitionVersionUndefined: Self = StObject.set(x, "suiteDefinitionVersion", js.undefined)
    
    inline def setSuiteRunArn(value: AmazonResourceName): Self = StObject.set(x, "suiteRunArn", value.asInstanceOf[js.Any])
    
    inline def setSuiteRunArnUndefined: Self = StObject.set(x, "suiteRunArn", js.undefined)
    
    inline def setSuiteRunConfiguration(value: SuiteRunConfiguration): Self = StObject.set(x, "suiteRunConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSuiteRunConfigurationUndefined: Self = StObject.set(x, "suiteRunConfiguration", js.undefined)
    
    inline def setSuiteRunId(value: UUID): Self = StObject.set(x, "suiteRunId", value.asInstanceOf[js.Any])
    
    inline def setSuiteRunIdUndefined: Self = StObject.set(x, "suiteRunId", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTestResult(value: TestResult): Self = StObject.set(x, "testResult", value.asInstanceOf[js.Any])
    
    inline def setTestResultUndefined: Self = StObject.set(x, "testResult", js.undefined)
  }
}
