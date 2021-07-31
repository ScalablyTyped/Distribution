package typings.awsSdk.batchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttemptDetail extends StObject {
  
  /**
    * Details about the container in this job attempt.
    */
  var container: js.UndefOr[AttemptContainerDetail] = js.undefined
  
  /**
    * The Unix timestamp (in milliseconds) for when the attempt was started (when the attempt transitioned from the STARTING state to the RUNNING state).
    */
  var startedAt: js.UndefOr[Long] = js.undefined
  
  /**
    * A short, human-readable string to provide additional details about the current status of the job attempt.
    */
  var statusReason: js.UndefOr[String] = js.undefined
  
  /**
    * The Unix timestamp (in milliseconds) for when the attempt was stopped (when the attempt transitioned from the RUNNING state to a terminal state, such as SUCCEEDED or FAILED).
    */
  var stoppedAt: js.UndefOr[Long] = js.undefined
}
object AttemptDetail {
  
  @scala.inline
  def apply(): AttemptDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttemptDetail]
  }
  
  @scala.inline
  implicit class AttemptDetailMutableBuilder[Self <: AttemptDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainer(value: AttemptContainerDetail): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    @scala.inline
    def setStartedAt(value: Long): Self = StObject.set(x, "startedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartedAtUndefined: Self = StObject.set(x, "startedAt", js.undefined)
    
    @scala.inline
    def setStatusReason(value: String): Self = StObject.set(x, "statusReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusReasonUndefined: Self = StObject.set(x, "statusReason", js.undefined)
    
    @scala.inline
    def setStoppedAt(value: Long): Self = StObject.set(x, "stoppedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoppedAtUndefined: Self = StObject.set(x, "stoppedAt", js.undefined)
  }
}
