package typings.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Problem extends StObject {
  
  /**
    * Information about the associated device.
    */
  var device: js.UndefOr[Device] = js.undefined
  
  /**
    * Information about the associated job.
    */
  var job: js.UndefOr[ProblemDetail] = js.undefined
  
  /**
    * A message about the problem's result.
    */
  var message: js.UndefOr[Message] = js.undefined
  
  /**
    * The problem's result. Allowed values include:   PENDING   PASSED   WARNED   FAILED   SKIPPED   ERRORED   STOPPED  
    */
  var result: js.UndefOr[ExecutionResult] = js.undefined
  
  /**
    * Information about the associated run.
    */
  var run: js.UndefOr[ProblemDetail] = js.undefined
  
  /**
    * Information about the associated suite.
    */
  var suite: js.UndefOr[ProblemDetail] = js.undefined
  
  /**
    * Information about the associated test.
    */
  var test: js.UndefOr[ProblemDetail] = js.undefined
}
object Problem {
  
  inline def apply(): Problem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Problem]
  }
  
  extension [Self <: Problem](x: Self) {
    
    inline def setDevice(value: Device): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
    
    inline def setJob(value: ProblemDetail): Self = StObject.set(x, "job", value.asInstanceOf[js.Any])
    
    inline def setJobUndefined: Self = StObject.set(x, "job", js.undefined)
    
    inline def setMessage(value: Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setResult(value: ExecutionResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    
    inline def setRun(value: ProblemDetail): Self = StObject.set(x, "run", value.asInstanceOf[js.Any])
    
    inline def setRunUndefined: Self = StObject.set(x, "run", js.undefined)
    
    inline def setSuite(value: ProblemDetail): Self = StObject.set(x, "suite", value.asInstanceOf[js.Any])
    
    inline def setSuiteUndefined: Self = StObject.set(x, "suite", js.undefined)
    
    inline def setTest(value: ProblemDetail): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    inline def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
  }
}
