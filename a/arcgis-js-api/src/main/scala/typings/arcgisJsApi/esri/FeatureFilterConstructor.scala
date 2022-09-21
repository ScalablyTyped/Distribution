package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatureFilterConstructor
  extends StObject
     with /**
  * This class defines parameters for setting a client-side filter on a [featureEffect](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#featureEffect) or [layer view](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-FeatureLayerView.html#filter).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureFilter.html)
  */
Instantiable0[FeatureFilter]
     with Instantiable1[/* properties */ FeatureFilterProperties, FeatureFilter] {
  
  def fromJSON(json: Any): FeatureFilter = js.native
}
