package typings.awsSdk.batchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateComputeEnvironmentResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the compute environment.
    */
  var computeEnvironmentArn: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the compute environment.
    */
  var computeEnvironmentName: js.UndefOr[String] = js.undefined
}
object CreateComputeEnvironmentResponse {
  
  inline def apply(): CreateComputeEnvironmentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateComputeEnvironmentResponse]
  }
  
  extension [Self <: CreateComputeEnvironmentResponse](x: Self) {
    
    inline def setComputeEnvironmentArn(value: String): Self = StObject.set(x, "computeEnvironmentArn", value.asInstanceOf[js.Any])
    
    inline def setComputeEnvironmentArnUndefined: Self = StObject.set(x, "computeEnvironmentArn", js.undefined)
    
    inline def setComputeEnvironmentName(value: String): Self = StObject.set(x, "computeEnvironmentName", value.asInstanceOf[js.Any])
    
    inline def setComputeEnvironmentNameUndefined: Self = StObject.set(x, "computeEnvironmentName", js.undefined)
  }
}
