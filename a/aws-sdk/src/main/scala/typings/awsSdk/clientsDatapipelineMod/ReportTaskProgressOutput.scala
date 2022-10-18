package typings.awsSdk.clientsDatapipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReportTaskProgressOutput extends StObject {
  
  /**
    * If true, the calling task runner should cancel processing of the task. The task runner does not need to call SetTaskStatus for canceled tasks.
    */
  var canceled: Boolean
}
object ReportTaskProgressOutput {
  
  inline def apply(canceled: Boolean): ReportTaskProgressOutput = {
    val __obj = js.Dynamic.literal(canceled = canceled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportTaskProgressOutput]
  }
  
  extension [Self <: ReportTaskProgressOutput](x: Self) {
    
    inline def setCanceled(value: Boolean): Self = StObject.set(x, "canceled", value.asInstanceOf[js.Any])
  }
}
