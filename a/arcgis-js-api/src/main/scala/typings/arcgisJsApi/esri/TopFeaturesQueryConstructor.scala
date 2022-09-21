package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopFeaturesQueryConstructor
  extends StObject
     with /**
  * This class defines parameters for executing [top features queries](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#queryTopFeatures) from a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TopFeaturesQuery.html)
  */
Instantiable0[TopFeaturesQuery]
     with Instantiable1[/* properties */ TopFeaturesQueryProperties, TopFeaturesQuery] {
  
  def fromJSON(json: Any): TopFeaturesQuery = js.native
}
