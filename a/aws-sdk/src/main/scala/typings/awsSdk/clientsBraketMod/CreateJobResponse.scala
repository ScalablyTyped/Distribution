package typings.awsSdk.clientsBraketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateJobResponse extends StObject {
  
  /**
    * The ARN of the Amazon Braket job created.
    */
  var jobArn: JobArn
}
object CreateJobResponse {
  
  inline def apply(jobArn: JobArn): CreateJobResponse = {
    val __obj = js.Dynamic.literal(jobArn = jobArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateJobResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateJobResponse] (val x: Self) extends AnyVal {
    
    inline def setJobArn(value: JobArn): Self = StObject.set(x, "jobArn", value.asInstanceOf[js.Any])
  }
}
