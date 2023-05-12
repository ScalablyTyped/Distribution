package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisteredUserQuickSightConsoleEmbeddingConfiguration extends StObject {
  
  /**
    * The embedding configuration of an embedded Amazon QuickSight console.
    */
  var FeatureConfigurations: js.UndefOr[RegisteredUserConsoleFeatureConfigurations] = js.undefined
  
  /**
    * The initial URL path for the Amazon QuickSight console. InitialPath is required. The entry point URL is constrained to the following paths:    /start     /start/analyses     /start/dashboards     /start/favorites     /dashboards/DashboardId. DashboardId is the actual ID key from the Amazon QuickSight console URL of the dashboard.    /analyses/AnalysisId. AnalysisId is the actual ID key from the Amazon QuickSight console URL of the analysis.  
    */
  var InitialPath: js.UndefOr[EntryPath] = js.undefined
}
object RegisteredUserQuickSightConsoleEmbeddingConfiguration {
  
  inline def apply(): RegisteredUserQuickSightConsoleEmbeddingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisteredUserQuickSightConsoleEmbeddingConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RegisteredUserQuickSightConsoleEmbeddingConfiguration] (val x: Self) extends AnyVal {
    
    inline def setFeatureConfigurations(value: RegisteredUserConsoleFeatureConfigurations): Self = StObject.set(x, "FeatureConfigurations", value.asInstanceOf[js.Any])
    
    inline def setFeatureConfigurationsUndefined: Self = StObject.set(x, "FeatureConfigurations", js.undefined)
    
    inline def setInitialPath(value: EntryPath): Self = StObject.set(x, "InitialPath", value.asInstanceOf[js.Any])
    
    inline def setInitialPathUndefined: Self = StObject.set(x, "InitialPath", js.undefined)
  }
}
