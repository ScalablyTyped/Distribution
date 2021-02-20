package typings.awsSdk.batchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateComputeEnvironmentResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the compute environment.
    */
  var computeEnvironmentArn: js.UndefOr[String] = js.native
  
  /**
    * The name of the compute environment.
    */
  var computeEnvironmentName: js.UndefOr[String] = js.native
}
object UpdateComputeEnvironmentResponse {
  
  @scala.inline
  def apply(): UpdateComputeEnvironmentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateComputeEnvironmentResponse]
  }
  
  @scala.inline
  implicit class UpdateComputeEnvironmentResponseMutableBuilder[Self <: UpdateComputeEnvironmentResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComputeEnvironmentArn(value: String): Self = StObject.set(x, "computeEnvironmentArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputeEnvironmentArnUndefined: Self = StObject.set(x, "computeEnvironmentArn", js.undefined)
    
    @scala.inline
    def setComputeEnvironmentName(value: String): Self = StObject.set(x, "computeEnvironmentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputeEnvironmentNameUndefined: Self = StObject.set(x, "computeEnvironmentName", js.undefined)
  }
}
