package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelRegisterSettings extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the SageMaker model registry account. Required only to register model versions created by a different SageMaker Canvas Amazon Web Services account than the Amazon Web Services account in which SageMaker model registry is set up.
    */
  var CrossAccountModelRegisterRoleArn: js.UndefOr[RoleArn] = js.undefined
  
  /**
    * Describes whether the integration to the model registry is enabled or disabled in the Canvas application.
    */
  var Status: js.UndefOr[FeatureStatus] = js.undefined
}
object ModelRegisterSettings {
  
  inline def apply(): ModelRegisterSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelRegisterSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModelRegisterSettings] (val x: Self) extends AnyVal {
    
    inline def setCrossAccountModelRegisterRoleArn(value: RoleArn): Self = StObject.set(x, "CrossAccountModelRegisterRoleArn", value.asInstanceOf[js.Any])
    
    inline def setCrossAccountModelRegisterRoleArnUndefined: Self = StObject.set(x, "CrossAccountModelRegisterRoleArn", js.undefined)
    
    inline def setStatus(value: FeatureStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
