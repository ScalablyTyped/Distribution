package typings.awsSdk.clientsRobomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeWorldExportJobRequest extends StObject {
  
  /**
    * The Amazon Resource Name (arn) of the world export job to describe.
    */
  var job: Arn
}
object DescribeWorldExportJobRequest {
  
  inline def apply(job: Arn): DescribeWorldExportJobRequest = {
    val __obj = js.Dynamic.literal(job = job.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeWorldExportJobRequest]
  }
  
  extension [Self <: DescribeWorldExportJobRequest](x: Self) {
    
    inline def setJob(value: Arn): Self = StObject.set(x, "job", value.asInstanceOf[js.Any])
  }
}
