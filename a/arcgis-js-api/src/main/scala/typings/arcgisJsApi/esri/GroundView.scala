package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroundView
  extends StObject
     with Accessor {
  
  /**
    * An elevation sampler that may be used to sample and query elevation values from the ground surface that is currently being displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-GroundView.html#elevationSampler)
    */
  val elevationSampler: ElevationSampler = js.native
  
  /**
    * A collection containing a hierarchical list of all the created [LayerViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) of the [layers](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html#layers) in the ground.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-GroundView.html#layerViews)
    */
  val layerViews: Collection[LayerView] = js.native
  
  /**
    * Value is `true` when any of the ground layer views are updating.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-GroundView.html#updating)
    */
  val updating: Boolean = js.native
}
