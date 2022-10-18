package typings.awsSdk.clientsApprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceSummary extends StObject {
  
  /**
    * The time when the App Runner service was created. It's in the Unix time stamp format.
    */
  var CreatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of this service.
    */
  var ServiceArn: js.UndefOr[AppRunnerResourceArn] = js.undefined
  
  /**
    * An ID that App Runner generated for this service. It's unique within the Amazon Web Services Region.
    */
  var ServiceId: js.UndefOr[typings.awsSdk.clientsApprunnerMod.ServiceId] = js.undefined
  
  /**
    * The customer-provided service name.
    */
  var ServiceName: js.UndefOr[typings.awsSdk.clientsApprunnerMod.ServiceName] = js.undefined
  
  /**
    * A subdomain URL that App Runner generated for this service. You can use this URL to access your service web application.
    */
  var ServiceUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The current state of the App Runner service. These particular values mean the following.    CREATE_FAILED – The service failed to create. Read the failure events and logs, change any parameters that need to be fixed, and retry the call to create the service. The failed service isn't usable, and still counts towards your service quota. When you're done analyzing the failure, delete the service.    DELETE_FAILED – The service failed to delete and can't be successfully recovered. Retry the service deletion call to ensure that all related resources are removed.  
    */
  var Status: js.UndefOr[ServiceStatus] = js.undefined
  
  /**
    * The time when the App Runner service was last updated. It's in theUnix time stamp format.
    */
  var UpdatedAt: js.UndefOr[js.Date] = js.undefined
}
object ServiceSummary {
  
  inline def apply(): ServiceSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceSummary]
  }
  
  extension [Self <: ServiceSummary](x: Self) {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setServiceArn(value: AppRunnerResourceArn): Self = StObject.set(x, "ServiceArn", value.asInstanceOf[js.Any])
    
    inline def setServiceArnUndefined: Self = StObject.set(x, "ServiceArn", js.undefined)
    
    inline def setServiceId(value: ServiceId): Self = StObject.set(x, "ServiceId", value.asInstanceOf[js.Any])
    
    inline def setServiceIdUndefined: Self = StObject.set(x, "ServiceId", js.undefined)
    
    inline def setServiceName(value: ServiceName): Self = StObject.set(x, "ServiceName", value.asInstanceOf[js.Any])
    
    inline def setServiceNameUndefined: Self = StObject.set(x, "ServiceName", js.undefined)
    
    inline def setServiceUrl(value: String): Self = StObject.set(x, "ServiceUrl", value.asInstanceOf[js.Any])
    
    inline def setServiceUrlUndefined: Self = StObject.set(x, "ServiceUrl", js.undefined)
    
    inline def setStatus(value: ServiceStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "UpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAtUndefined: Self = StObject.set(x, "UpdatedAt", js.undefined)
  }
}
