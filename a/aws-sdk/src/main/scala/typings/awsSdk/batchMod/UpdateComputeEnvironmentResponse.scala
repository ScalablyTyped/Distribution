package typings.awsSdk.batchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateComputeEnvironmentResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the compute environment.
    */
  var computeEnvironmentArn: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the compute environment. It can be up to 128 letters long. It can contain uppercase and lowercase letters, numbers, hyphens (-), and underscores (_).
    */
  var computeEnvironmentName: js.UndefOr[String] = js.undefined
}
object UpdateComputeEnvironmentResponse {
  
  inline def apply(): UpdateComputeEnvironmentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateComputeEnvironmentResponse]
  }
  
  extension [Self <: UpdateComputeEnvironmentResponse](x: Self) {
    
    inline def setComputeEnvironmentArn(value: String): Self = StObject.set(x, "computeEnvironmentArn", value.asInstanceOf[js.Any])
    
    inline def setComputeEnvironmentArnUndefined: Self = StObject.set(x, "computeEnvironmentArn", js.undefined)
    
    inline def setComputeEnvironmentName(value: String): Self = StObject.set(x, "computeEnvironmentName", value.asInstanceOf[js.Any])
    
    inline def setComputeEnvironmentNameUndefined: Self = StObject.set(x, "computeEnvironmentName", js.undefined)
  }
}
