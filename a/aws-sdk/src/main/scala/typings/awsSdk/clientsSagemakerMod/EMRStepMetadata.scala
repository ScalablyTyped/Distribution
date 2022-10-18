package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EMRStepMetadata extends StObject {
  
  /**
    * The identifier of the EMR cluster.
    */
  var ClusterId: js.UndefOr[String256] = js.undefined
  
  /**
    * The path to the log file where the cluster step's failure root cause is recorded.
    */
  var LogFilePath: js.UndefOr[String1024] = js.undefined
  
  /**
    * The identifier of the EMR cluster step.
    */
  var StepId: js.UndefOr[String256] = js.undefined
  
  /**
    * The name of the EMR cluster step.
    */
  var StepName: js.UndefOr[String256] = js.undefined
}
object EMRStepMetadata {
  
  inline def apply(): EMRStepMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EMRStepMetadata]
  }
  
  extension [Self <: EMRStepMetadata](x: Self) {
    
    inline def setClusterId(value: String256): Self = StObject.set(x, "ClusterId", value.asInstanceOf[js.Any])
    
    inline def setClusterIdUndefined: Self = StObject.set(x, "ClusterId", js.undefined)
    
    inline def setLogFilePath(value: String1024): Self = StObject.set(x, "LogFilePath", value.asInstanceOf[js.Any])
    
    inline def setLogFilePathUndefined: Self = StObject.set(x, "LogFilePath", js.undefined)
    
    inline def setStepId(value: String256): Self = StObject.set(x, "StepId", value.asInstanceOf[js.Any])
    
    inline def setStepIdUndefined: Self = StObject.set(x, "StepId", js.undefined)
    
    inline def setStepName(value: String256): Self = StObject.set(x, "StepName", value.asInstanceOf[js.Any])
    
    inline def setStepNameUndefined: Self = StObject.set(x, "StepName", js.undefined)
  }
}
