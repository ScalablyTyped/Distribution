package typings.awsSdk.clientsRobomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelWorldExportJobRequest extends StObject {
  
  /**
    * The Amazon Resource Name (arn) of the world export job to cancel.
    */
  var job: Arn
}
object CancelWorldExportJobRequest {
  
  inline def apply(job: Arn): CancelWorldExportJobRequest = {
    val __obj = js.Dynamic.literal(job = job.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelWorldExportJobRequest]
  }
  
  extension [Self <: CancelWorldExportJobRequest](x: Self) {
    
    inline def setJob(value: Arn): Self = StObject.set(x, "job", value.asInstanceOf[js.Any])
  }
}
