package typings.awsSdk.clientsRobomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeWorldGenerationJobRequest extends StObject {
  
  /**
    * The Amazon Resource Name (arn) of the world generation job to describe.
    */
  var job: Arn
}
object DescribeWorldGenerationJobRequest {
  
  inline def apply(job: Arn): DescribeWorldGenerationJobRequest = {
    val __obj = js.Dynamic.literal(job = job.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeWorldGenerationJobRequest]
  }
  
  extension [Self <: DescribeWorldGenerationJobRequest](x: Self) {
    
    inline def setJob(value: Arn): Self = StObject.set(x, "job", value.asInstanceOf[js.Any])
  }
}
