package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatureLayerSourceConstructor
  extends StObject
     with /**
  * The source for a feature layer to be used as fences for Geotriggers.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-geotriggersInfo-FeatureLayerSource.html)
  */
Instantiable0[FeatureLayerSource]
     with Instantiable1[/* properties */ FeatureLayerSourceProperties, FeatureLayerSource] {
  
  def fromJSON(json: Any): FeatureLayerSource = js.native
}
