package typings
package arcgisDashJsDashApiLib.esriTimeExtentMod

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
class Class ()
  extends arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.TimeExtent {
  def this(properties: arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.TimeExtentProperties) = this()
  /**
    * The end time of the time extent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeExtent.html#end)
    *
    * @default null
    */
  /* CompleteClass */
  override var end: stdLib.Date = js.native
  /**
    * The start time of the time extent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeExtent.html#start)
    *
    * @default null
    */
  /* CompleteClass */
  override var start: stdLib.Date = js.native
  /**
    * Returns the time extent resulting from the intersection of the current time extent and parsed time extent. Returns `null` if two time extents do not intersect.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeExtent.html#intersection)
    *
    * @param timeExtent The time extent to be intersected with the time extent on which `intersection()` is being called on.
    *
    */
  /* CompleteClass */
  override def intersection(timeExtent: arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.TimeExtent): arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.TimeExtent = js.native
  /**
    * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation. See the [Using fromJSON()](https://developers.arcgis.com/javascript/latest/guide/using-fromjson/index.html) topic in the Guide for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    *
    *
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

