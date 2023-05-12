package typings.awsSdk.clientsSsmsapMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetApplicationInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the application registry.
    */
  var AppRegistryArn: js.UndefOr[typings.awsSdk.clientsSsmsapMod.AppRegistryArn] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the application. 
    */
  var ApplicationArn: js.UndefOr[SsmSapArn] = js.undefined
  
  /**
    * The ID of the application.
    */
  var ApplicationId: js.UndefOr[typings.awsSdk.clientsSsmsapMod.ApplicationId] = js.undefined
}
object GetApplicationInput {
  
  inline def apply(): GetApplicationInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetApplicationInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetApplicationInput] (val x: Self) extends AnyVal {
    
    inline def setAppRegistryArn(value: AppRegistryArn): Self = StObject.set(x, "AppRegistryArn", value.asInstanceOf[js.Any])
    
    inline def setAppRegistryArnUndefined: Self = StObject.set(x, "AppRegistryArn", js.undefined)
    
    inline def setApplicationArn(value: SsmSapArn): Self = StObject.set(x, "ApplicationArn", value.asInstanceOf[js.Any])
    
    inline def setApplicationArnUndefined: Self = StObject.set(x, "ApplicationArn", js.undefined)
    
    inline def setApplicationId(value: ApplicationId): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    inline def setApplicationIdUndefined: Self = StObject.set(x, "ApplicationId", js.undefined)
  }
}
