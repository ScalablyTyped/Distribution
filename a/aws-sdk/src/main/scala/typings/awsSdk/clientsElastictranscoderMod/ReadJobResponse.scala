package typings.awsSdk.clientsElastictranscoderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadJobResponse extends StObject {
  
  /**
    * A section of the response body that provides information about the job.
    */
  var Job: js.UndefOr[typings.awsSdk.clientsElastictranscoderMod.Job] = js.undefined
}
object ReadJobResponse {
  
  inline def apply(): ReadJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadJobResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadJobResponse] (val x: Self) extends AnyVal {
    
    inline def setJob(value: Job): Self = StObject.set(x, "Job", value.asInstanceOf[js.Any])
    
    inline def setJobUndefined: Self = StObject.set(x, "Job", js.undefined)
  }
}
