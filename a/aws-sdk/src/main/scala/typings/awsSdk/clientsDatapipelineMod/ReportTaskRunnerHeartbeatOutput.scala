package typings.awsSdk.clientsDatapipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReportTaskRunnerHeartbeatOutput extends StObject {
  
  /**
    * Indicates whether the calling task runner should terminate.
    */
  var terminate: Boolean
}
object ReportTaskRunnerHeartbeatOutput {
  
  inline def apply(terminate: Boolean): ReportTaskRunnerHeartbeatOutput = {
    val __obj = js.Dynamic.literal(terminate = terminate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportTaskRunnerHeartbeatOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReportTaskRunnerHeartbeatOutput] (val x: Self) extends AnyVal {
    
    inline def setTerminate(value: Boolean): Self = StObject.set(x, "terminate", value.asInstanceOf[js.Any])
  }
}
