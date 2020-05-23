package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamLayerPurgeOptions extends Object {
  /**
    * Controls the maximum age of a feature in minutes. Features older than specified age will be removed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#purgeOptions)
    */
  var age: js.UndefOr[Double] = js.undefined
  /**
    * Controls the overall maximum number of features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#purgeOptions)
    */
  var displayCount: js.UndefOr[Double] = js.undefined
  /**
    * Controls the maximum number of observations to show within a [track](https://enterprise.arcgis.com/en/geoevent/latest/get-started/essential-geoevent-server-vocabulary.htm#ESRI_SECTION1_F45BBCE9ADFA4E57AF38DD225921EFCD). If [trackIdField](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#trackIdField) is not configured on the geoevent service, this property will have no effect. The default is 1.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#purgeOptions)
    */
  var maxObservations: js.UndefOr[Double] = js.undefined
}

object StreamLayerPurgeOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    age: js.UndefOr[Double] = js.undefined,
    displayCount: js.UndefOr[Double] = js.undefined,
    maxObservations: js.UndefOr[Double] = js.undefined
  ): StreamLayerPurgeOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (!js.isUndefined(age)) __obj.updateDynamic("age")(age.get.asInstanceOf[js.Any])
    if (!js.isUndefined(displayCount)) __obj.updateDynamic("displayCount")(displayCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxObservations)) __obj.updateDynamic("maxObservations")(maxObservations.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamLayerPurgeOptions]
  }
}

