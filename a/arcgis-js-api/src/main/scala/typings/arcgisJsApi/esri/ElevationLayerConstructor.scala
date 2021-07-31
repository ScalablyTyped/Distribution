package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElevationLayerConstructor
  extends StObject
     with /**
  * ElevationLayer is a tile layer used for rendering elevations in [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html)
  */
Instantiable0[ElevationLayer]
     with Instantiable1[/* properties */ ElevationLayerProperties, ElevationLayer] {
  
  def fromJSON(json: js.Any): ElevationLayer = js.native
}
