package typings.awsSdk.clientsCodepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecutorConfiguration extends StObject {
  
  /**
    * Details about the JobWorker executor of the action type.
    */
  var jobWorkerExecutorConfiguration: js.UndefOr[JobWorkerExecutorConfiguration] = js.undefined
  
  /**
    * Details about the Lambda executor of the action type.
    */
  var lambdaExecutorConfiguration: js.UndefOr[LambdaExecutorConfiguration] = js.undefined
}
object ExecutorConfiguration {
  
  inline def apply(): ExecutorConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecutorConfiguration]
  }
  
  extension [Self <: ExecutorConfiguration](x: Self) {
    
    inline def setJobWorkerExecutorConfiguration(value: JobWorkerExecutorConfiguration): Self = StObject.set(x, "jobWorkerExecutorConfiguration", value.asInstanceOf[js.Any])
    
    inline def setJobWorkerExecutorConfigurationUndefined: Self = StObject.set(x, "jobWorkerExecutorConfiguration", js.undefined)
    
    inline def setLambdaExecutorConfiguration(value: LambdaExecutorConfiguration): Self = StObject.set(x, "lambdaExecutorConfiguration", value.asInstanceOf[js.Any])
    
    inline def setLambdaExecutorConfigurationUndefined: Self = StObject.set(x, "lambdaExecutorConfiguration", js.undefined)
  }
}
