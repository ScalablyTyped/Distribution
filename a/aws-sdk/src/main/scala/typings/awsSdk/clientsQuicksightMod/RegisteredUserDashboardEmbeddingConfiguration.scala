package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisteredUserDashboardEmbeddingConfiguration extends StObject {
  
  /**
    * The dashboard ID for the dashboard that you want the user to see first. This ID is included in the output URL. When the URL in response is accessed, Amazon QuickSight renders this dashboard if the user has permissions to view it. If the user does not have permission to view this dashboard, they see a permissions error message.
    */
  var InitialDashboardId: RestrictiveResourceId
}
object RegisteredUserDashboardEmbeddingConfiguration {
  
  inline def apply(InitialDashboardId: RestrictiveResourceId): RegisteredUserDashboardEmbeddingConfiguration = {
    val __obj = js.Dynamic.literal(InitialDashboardId = InitialDashboardId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisteredUserDashboardEmbeddingConfiguration]
  }
  
  extension [Self <: RegisteredUserDashboardEmbeddingConfiguration](x: Self) {
    
    inline def setInitialDashboardId(value: RestrictiveResourceId): Self = StObject.set(x, "InitialDashboardId", value.asInstanceOf[js.Any])
  }
}
