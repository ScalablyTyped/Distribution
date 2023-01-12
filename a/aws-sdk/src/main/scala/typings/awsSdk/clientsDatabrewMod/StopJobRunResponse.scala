package typings.awsSdk.clientsDatabrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopJobRunResponse extends StObject {
  
  /**
    * The ID of the job run that you stopped.
    */
  var RunId: JobRunId
}
object StopJobRunResponse {
  
  inline def apply(RunId: JobRunId): StopJobRunResponse = {
    val __obj = js.Dynamic.literal(RunId = RunId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopJobRunResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StopJobRunResponse] (val x: Self) extends AnyVal {
    
    inline def setRunId(value: JobRunId): Self = StObject.set(x, "RunId", value.asInstanceOf[js.Any])
  }
}
