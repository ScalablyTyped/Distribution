package typings.awsSdk.clientsResiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAppVersionAppComponentResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Resilience Hub application. The format for this ARN is: arn:partition:resiliencehub:region:account:app/app-id. For more information about ARNs, see  Amazon Resource Names (ARNs) in the AWS General Reference guide.
    */
  var appArn: Arn
  
  /**
    * The list of Application Components that belong to this resource.
    */
  var appComponent: js.UndefOr[AppComponent] = js.undefined
  
  /**
    * The Resilience Hub application version.
    */
  var appVersion: EntityVersion
}
object UpdateAppVersionAppComponentResponse {
  
  inline def apply(appArn: Arn, appVersion: EntityVersion): UpdateAppVersionAppComponentResponse = {
    val __obj = js.Dynamic.literal(appArn = appArn.asInstanceOf[js.Any], appVersion = appVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAppVersionAppComponentResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateAppVersionAppComponentResponse] (val x: Self) extends AnyVal {
    
    inline def setAppArn(value: Arn): Self = StObject.set(x, "appArn", value.asInstanceOf[js.Any])
    
    inline def setAppComponent(value: AppComponent): Self = StObject.set(x, "appComponent", value.asInstanceOf[js.Any])
    
    inline def setAppComponentUndefined: Self = StObject.set(x, "appComponent", js.undefined)
    
    inline def setAppVersion(value: EntityVersion): Self = StObject.set(x, "appVersion", value.asInstanceOf[js.Any])
  }
}
