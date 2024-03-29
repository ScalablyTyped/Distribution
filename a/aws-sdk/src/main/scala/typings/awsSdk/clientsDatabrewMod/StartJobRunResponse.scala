package typings.awsSdk.clientsDatabrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartJobRunResponse extends StObject {
  
  /**
    * A system-generated identifier for this particular job run.
    */
  var RunId: JobRunId
}
object StartJobRunResponse {
  
  inline def apply(RunId: JobRunId): StartJobRunResponse = {
    val __obj = js.Dynamic.literal(RunId = RunId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartJobRunResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartJobRunResponse] (val x: Self) extends AnyVal {
    
    inline def setRunId(value: JobRunId): Self = StObject.set(x, "RunId", value.asInstanceOf[js.Any])
  }
}
