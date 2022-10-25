package typings.awsSdk.clientsBatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EksAttemptDetail extends StObject {
  
  /**
    * The details for the final status of the containers for this job attempt.
    */
  var containers: js.UndefOr[EksAttemptContainerDetails] = js.undefined
  
  /**
    * The name of the node for this job attempt.
    */
  var nodeName: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the pod for this job attempt.
    */
  var podName: js.UndefOr[String] = js.undefined
  
  /**
    * The Unix timestamp (in milliseconds) for when the attempt was started (when the attempt transitioned from the STARTING state to the RUNNING state).
    */
  var startedAt: js.UndefOr[Long] = js.undefined
  
  /**
    * A short, human-readable string to provide additional details for the current status of the job attempt.
    */
  var statusReason: js.UndefOr[String] = js.undefined
  
  /**
    * The Unix timestamp (in milliseconds) for when the attempt was stopped. This happens when the attempt transitioned from the RUNNING state to a terminal state, such as SUCCEEDED or FAILED.
    */
  var stoppedAt: js.UndefOr[Long] = js.undefined
}
object EksAttemptDetail {
  
  inline def apply(): EksAttemptDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EksAttemptDetail]
  }
  
  extension [Self <: EksAttemptDetail](x: Self) {
    
    inline def setContainers(value: EksAttemptContainerDetails): Self = StObject.set(x, "containers", value.asInstanceOf[js.Any])
    
    inline def setContainersUndefined: Self = StObject.set(x, "containers", js.undefined)
    
    inline def setContainersVarargs(value: EksAttemptContainerDetail*): Self = StObject.set(x, "containers", js.Array(value*))
    
    inline def setNodeName(value: String): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
    
    inline def setNodeNameUndefined: Self = StObject.set(x, "nodeName", js.undefined)
    
    inline def setPodName(value: String): Self = StObject.set(x, "podName", value.asInstanceOf[js.Any])
    
    inline def setPodNameUndefined: Self = StObject.set(x, "podName", js.undefined)
    
    inline def setStartedAt(value: Long): Self = StObject.set(x, "startedAt", value.asInstanceOf[js.Any])
    
    inline def setStartedAtUndefined: Self = StObject.set(x, "startedAt", js.undefined)
    
    inline def setStatusReason(value: String): Self = StObject.set(x, "statusReason", value.asInstanceOf[js.Any])
    
    inline def setStatusReasonUndefined: Self = StObject.set(x, "statusReason", js.undefined)
    
    inline def setStoppedAt(value: Long): Self = StObject.set(x, "stoppedAt", value.asInstanceOf[js.Any])
    
    inline def setStoppedAtUndefined: Self = StObject.set(x, "stoppedAt", js.undefined)
  }
}
