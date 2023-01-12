package typings.awsSdk.clientsGrafanaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsSsoAuthentication extends StObject {
  
  /**
    * The ID of the Amazon Web Services SSO-managed application that is created by Amazon Managed Grafana.
    */
  var ssoClientId: js.UndefOr[SSOClientId] = js.undefined
}
object AwsSsoAuthentication {
  
  inline def apply(): AwsSsoAuthentication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsSsoAuthentication]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsSsoAuthentication] (val x: Self) extends AnyVal {
    
    inline def setSsoClientId(value: SSOClientId): Self = StObject.set(x, "ssoClientId", value.asInstanceOf[js.Any])
    
    inline def setSsoClientIdUndefined: Self = StObject.set(x, "ssoClientId", js.undefined)
  }
}
