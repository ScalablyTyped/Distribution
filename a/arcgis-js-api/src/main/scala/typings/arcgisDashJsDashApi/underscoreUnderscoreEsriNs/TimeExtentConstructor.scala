package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeExtentConstructor
  extends /**
  * A period of time with a definitive [start](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeExtent.html#start) and [end](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeExtent.html#end) date. Time extent is used to [display](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-FeatureLayerView.html#filter) or [query](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-FeatureLayerView.html#queryFeatures) features that fall within the specified time period. To represent an instant of time, set the [start](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeExtent.html#start) and [end](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeExtent.html#end) times to the same date.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeExtent.html)
  */
Instantiable0[TimeExtent]
     with Instantiable1[/* properties */ TimeExtentProperties, TimeExtent] {
  def fromJSON(json: js.Any): TimeExtent = js.native
}

