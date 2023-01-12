package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UtilityNetworkProperties
  extends StObject
     with NetworkProperties {
  
  /**
    * This property returns the list of trace configurations shared on the webmap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-UtilityNetwork.html#sharedNamedTraceConfigurations)
    */
  var sharedNamedTraceConfigurations: js.UndefOr[js.Array[NamedTraceConfiguration]] = js.undefined
}
object UtilityNetworkProperties {
  
  inline def apply(): UtilityNetworkProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UtilityNetworkProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UtilityNetworkProperties] (val x: Self) extends AnyVal {
    
    inline def setSharedNamedTraceConfigurations(value: js.Array[NamedTraceConfiguration]): Self = StObject.set(x, "sharedNamedTraceConfigurations", value.asInstanceOf[js.Any])
    
    inline def setSharedNamedTraceConfigurationsUndefined: Self = StObject.set(x, "sharedNamedTraceConfigurations", js.undefined)
    
    inline def setSharedNamedTraceConfigurationsVarargs(value: NamedTraceConfiguration*): Self = StObject.set(x, "sharedNamedTraceConfigurations", js.Array(value*))
  }
}
