package typings.arcgisJsApi.timeExtentMod

import typings.arcgisJsApi.esri.TimeExtent
import typings.arcgisJsApi.esri.TimeExtentProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/TimeExtent", JSImport.Namespace)
@js.native
/**
  * A period of time with a definitive [start](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeExtent.html#start) and [end](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeExtent.html#end) date. Time extent is used to [display](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-FeatureLayerView.html#filter) or [query](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-FeatureLayerView.html#queryFeatures) features that fall within the specified time period. To represent an instant of time, set the [start](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeExtent.html#start) and [end](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeExtent.html#end) times to the same date.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeExtent.html)
  */
class Class () extends TimeExtent {
  def this(properties: TimeExtentProperties) = this()
}

