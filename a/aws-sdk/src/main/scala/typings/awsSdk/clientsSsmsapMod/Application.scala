package typings.awsSdk.clientsSsmsapMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Application extends StObject {
  
  /**
    * 
    */
  var AppRegistryArn: js.UndefOr[typings.awsSdk.clientsSsmsapMod.AppRegistryArn] = js.undefined
  
  /**
    * 
    */
  var Arn: js.UndefOr[SsmSapArn] = js.undefined
  
  /**
    * 
    */
  var Components: js.UndefOr[ComponentIdList] = js.undefined
  
  /**
    * 
    */
  var Id: js.UndefOr[ApplicationId] = js.undefined
  
  /**
    * 
    */
  var LastUpdated: js.UndefOr[js.Date] = js.undefined
  
  /**
    * 
    */
  var Status: js.UndefOr[ApplicationStatus] = js.undefined
  
  /**
    * 
    */
  var StatusMessage: js.UndefOr[String] = js.undefined
  
  /**
    * 
    */
  var Type: js.UndefOr[ApplicationType] = js.undefined
}
object Application {
  
  inline def apply(): Application = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Application]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Application] (val x: Self) extends AnyVal {
    
    inline def setAppRegistryArn(value: AppRegistryArn): Self = StObject.set(x, "AppRegistryArn", value.asInstanceOf[js.Any])
    
    inline def setAppRegistryArnUndefined: Self = StObject.set(x, "AppRegistryArn", js.undefined)
    
    inline def setArn(value: SsmSapArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setComponents(value: ComponentIdList): Self = StObject.set(x, "Components", value.asInstanceOf[js.Any])
    
    inline def setComponentsUndefined: Self = StObject.set(x, "Components", js.undefined)
    
    inline def setComponentsVarargs(value: ComponentId*): Self = StObject.set(x, "Components", js.Array(value*))
    
    inline def setId(value: ApplicationId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setLastUpdated(value: js.Date): Self = StObject.set(x, "LastUpdated", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedUndefined: Self = StObject.set(x, "LastUpdated", js.undefined)
    
    inline def setStatus(value: ApplicationStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setType(value: ApplicationType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
