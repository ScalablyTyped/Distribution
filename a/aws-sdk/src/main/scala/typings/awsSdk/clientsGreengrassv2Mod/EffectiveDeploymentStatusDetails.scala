package typings.awsSdk.clientsGreengrassv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EffectiveDeploymentStatusDetails extends StObject {
  
  /**
    * Contains an ordered list of short error codes that range from the most generic error to the most specific one. The error codes describe the reason for failure whenever the coreDeviceExecutionStatus is in a failed state. The response will be an empty list if there is no error.
    */
  var errorStack: js.UndefOr[EffectiveDeploymentErrorStack] = js.undefined
  
  /**
    * Contains tags which describe the error. You can use the error types to classify errors to assist with remediating the failure. The response will be an empty list if there is no error.
    */
  var errorTypes: js.UndefOr[EffectiveDeploymentErrorTypeList] = js.undefined
}
object EffectiveDeploymentStatusDetails {
  
  inline def apply(): EffectiveDeploymentStatusDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EffectiveDeploymentStatusDetails]
  }
  
  extension [Self <: EffectiveDeploymentStatusDetails](x: Self) {
    
    inline def setErrorStack(value: EffectiveDeploymentErrorStack): Self = StObject.set(x, "errorStack", value.asInstanceOf[js.Any])
    
    inline def setErrorStackUndefined: Self = StObject.set(x, "errorStack", js.undefined)
    
    inline def setErrorStackVarargs(value: EffectiveDeploymentErrorCode*): Self = StObject.set(x, "errorStack", js.Array(value*))
    
    inline def setErrorTypes(value: EffectiveDeploymentErrorTypeList): Self = StObject.set(x, "errorTypes", value.asInstanceOf[js.Any])
    
    inline def setErrorTypesUndefined: Self = StObject.set(x, "errorTypes", js.undefined)
    
    inline def setErrorTypesVarargs(value: EffectiveDeploymentErrorType*): Self = StObject.set(x, "errorTypes", js.Array(value*))
  }
}
