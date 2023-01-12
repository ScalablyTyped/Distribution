package typings.awsSdk.clientsEvidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectAppConfigResourceConfig extends StObject {
  
  /**
    * The ID of the AppConfig application to use for client-side evaluation. 
    */
  var applicationId: js.UndefOr[AppConfigResourceId] = js.undefined
  
  /**
    * The ID of the AppConfig environment to use for client-side evaluation. This must be an environment that is within the application that you specify for applicationId.
    */
  var environmentId: js.UndefOr[AppConfigResourceId] = js.undefined
}
object ProjectAppConfigResourceConfig {
  
  inline def apply(): ProjectAppConfigResourceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectAppConfigResourceConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProjectAppConfigResourceConfig] (val x: Self) extends AnyVal {
    
    inline def setApplicationId(value: AppConfigResourceId): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
    
    inline def setApplicationIdUndefined: Self = StObject.set(x, "applicationId", js.undefined)
    
    inline def setEnvironmentId(value: AppConfigResourceId): Self = StObject.set(x, "environmentId", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentIdUndefined: Self = StObject.set(x, "environmentId", js.undefined)
  }
}
