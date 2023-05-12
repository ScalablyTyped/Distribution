package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnonymousUserEmbeddingExperienceConfiguration extends StObject {
  
  /**
    * The type of embedding experience. In this case, Amazon QuickSight dashboards.
    */
  var Dashboard: js.UndefOr[AnonymousUserDashboardEmbeddingConfiguration] = js.undefined
  
  /**
    * The type of embedding experience. In this case, Amazon QuickSight visuals.
    */
  var DashboardVisual: js.UndefOr[AnonymousUserDashboardVisualEmbeddingConfiguration] = js.undefined
  
  /**
    * The Q search bar that you want to use for anonymous user embedding.
    */
  var QSearchBar: js.UndefOr[AnonymousUserQSearchBarEmbeddingConfiguration] = js.undefined
}
object AnonymousUserEmbeddingExperienceConfiguration {
  
  inline def apply(): AnonymousUserEmbeddingExperienceConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonymousUserEmbeddingExperienceConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnonymousUserEmbeddingExperienceConfiguration] (val x: Self) extends AnyVal {
    
    inline def setDashboard(value: AnonymousUserDashboardEmbeddingConfiguration): Self = StObject.set(x, "Dashboard", value.asInstanceOf[js.Any])
    
    inline def setDashboardUndefined: Self = StObject.set(x, "Dashboard", js.undefined)
    
    inline def setDashboardVisual(value: AnonymousUserDashboardVisualEmbeddingConfiguration): Self = StObject.set(x, "DashboardVisual", value.asInstanceOf[js.Any])
    
    inline def setDashboardVisualUndefined: Self = StObject.set(x, "DashboardVisual", js.undefined)
    
    inline def setQSearchBar(value: AnonymousUserQSearchBarEmbeddingConfiguration): Self = StObject.set(x, "QSearchBar", value.asInstanceOf[js.Any])
    
    inline def setQSearchBarUndefined: Self = StObject.set(x, "QSearchBar", js.undefined)
  }
}
