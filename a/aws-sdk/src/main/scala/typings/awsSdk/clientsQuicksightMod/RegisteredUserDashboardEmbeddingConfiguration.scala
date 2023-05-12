package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisteredUserDashboardEmbeddingConfiguration extends StObject {
  
  /**
    * The feature configurations of an embbedded Amazon QuickSight dashboard.
    */
  var FeatureConfigurations: js.UndefOr[RegisteredUserDashboardFeatureConfigurations] = js.undefined
  
  /**
    * The dashboard ID for the dashboard that you want the user to see first. This ID is included in the output URL. When the URL in response is accessed, Amazon QuickSight renders this dashboard if the user has permissions to view it. If the user does not have permission to view this dashboard, they see a permissions error message.
    */
  var InitialDashboardId: ShortRestrictiveResourceId
}
object RegisteredUserDashboardEmbeddingConfiguration {
  
  inline def apply(InitialDashboardId: ShortRestrictiveResourceId): RegisteredUserDashboardEmbeddingConfiguration = {
    val __obj = js.Dynamic.literal(InitialDashboardId = InitialDashboardId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisteredUserDashboardEmbeddingConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RegisteredUserDashboardEmbeddingConfiguration] (val x: Self) extends AnyVal {
    
    inline def setFeatureConfigurations(value: RegisteredUserDashboardFeatureConfigurations): Self = StObject.set(x, "FeatureConfigurations", value.asInstanceOf[js.Any])
    
    inline def setFeatureConfigurationsUndefined: Self = StObject.set(x, "FeatureConfigurations", js.undefined)
    
    inline def setInitialDashboardId(value: ShortRestrictiveResourceId): Self = StObject.set(x, "InitialDashboardId", value.asInstanceOf[js.Any])
  }
}
