package typings.awsSdk.clientsRobomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelWorldGenerationJobRequest extends StObject {
  
  /**
    * The Amazon Resource Name (arn) of the world generator job to cancel.
    */
  var job: Arn
}
object CancelWorldGenerationJobRequest {
  
  inline def apply(job: Arn): CancelWorldGenerationJobRequest = {
    val __obj = js.Dynamic.literal(job = job.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelWorldGenerationJobRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CancelWorldGenerationJobRequest] (val x: Self) extends AnyVal {
    
    inline def setJob(value: Arn): Self = StObject.set(x, "job", value.asInstanceOf[js.Any])
  }
}
