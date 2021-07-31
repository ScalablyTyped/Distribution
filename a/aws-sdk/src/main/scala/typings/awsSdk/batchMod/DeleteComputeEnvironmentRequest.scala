package typings.awsSdk.batchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteComputeEnvironmentRequest extends StObject {
  
  /**
    * The name or Amazon Resource Name (ARN) of the compute environment to delete.
    */
  var computeEnvironment: String
}
object DeleteComputeEnvironmentRequest {
  
  @scala.inline
  def apply(computeEnvironment: String): DeleteComputeEnvironmentRequest = {
    val __obj = js.Dynamic.literal(computeEnvironment = computeEnvironment.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteComputeEnvironmentRequest]
  }
  
  @scala.inline
  implicit class DeleteComputeEnvironmentRequestMutableBuilder[Self <: DeleteComputeEnvironmentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComputeEnvironment(value: String): Self = StObject.set(x, "computeEnvironment", value.asInstanceOf[js.Any])
  }
}
