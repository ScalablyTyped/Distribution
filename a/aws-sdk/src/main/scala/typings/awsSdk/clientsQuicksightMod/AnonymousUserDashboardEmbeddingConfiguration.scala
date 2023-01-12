package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnonymousUserDashboardEmbeddingConfiguration extends StObject {
  
  /**
    * The dashboard ID for the dashboard that you want the user to see first. This ID is included in the output URL. When the URL in response is accessed, Amazon QuickSight renders this dashboard. The Amazon Resource Name (ARN) of this dashboard must be included in the AuthorizedResourceArns parameter. Otherwise, the request will fail with InvalidParameterValueException.
    */
  var InitialDashboardId: RestrictiveResourceId
}
object AnonymousUserDashboardEmbeddingConfiguration {
  
  inline def apply(InitialDashboardId: RestrictiveResourceId): AnonymousUserDashboardEmbeddingConfiguration = {
    val __obj = js.Dynamic.literal(InitialDashboardId = InitialDashboardId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonymousUserDashboardEmbeddingConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnonymousUserDashboardEmbeddingConfiguration] (val x: Self) extends AnyVal {
    
    inline def setInitialDashboardId(value: RestrictiveResourceId): Self = StObject.set(x, "InitialDashboardId", value.asInstanceOf[js.Any])
  }
}
