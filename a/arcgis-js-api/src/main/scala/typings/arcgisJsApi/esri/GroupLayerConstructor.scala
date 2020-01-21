package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupLayerConstructor
  extends /**
  * GroupLayer provides the ability to organize several sublayers into one common layer. Suppose there are several [FeatureLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) that all represent water features in different dimensions. For example, wells (points), streams (lines), and lakes (polygons). The GroupLayer provides the functionality to treat them as one layer called "Water Features" even though they are stored as separate feature layers. To accomplish this, create a new GroupLayer and use the [add()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GroupLayer.html#add) method to add each of the water layers to the GroupLayer.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GroupLayer.html)
  */
Instantiable0[GroupLayer]
     with Instantiable1[/* properties */ GroupLayerProperties, GroupLayer] {
  def fromJSON(json: js.Any): GroupLayer = js.native
}

