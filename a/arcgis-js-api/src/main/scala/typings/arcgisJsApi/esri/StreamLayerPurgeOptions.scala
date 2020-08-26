package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamLayerPurgeOptions extends Object {
  /**
    * Controls the maximum age of a feature in minutes. Features older than specified age will be removed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#purgeOptions)
    */
  var age: js.UndefOr[Double] = js.native
  /**
    * Controls the overall maximum number of features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#purgeOptions)
    */
  var displayCount: js.UndefOr[Double] = js.native
  /**
    * Controls the maximum number of observations to show within a [track](https://enterprise.arcgis.com/en/geoevent/latest/get-started/essential-geoevent-server-vocabulary.htm#ESRI_SECTION1_F45BBCE9ADFA4E57AF38DD225921EFCD). If [trackIdField](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#trackIdField) is not configured on the geoevent service, this property will have no effect. The default is 1.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#purgeOptions)
    */
  var maxObservations: js.UndefOr[Double] = js.native
}

object StreamLayerPurgeOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): StreamLayerPurgeOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[StreamLayerPurgeOptions]
  }
  @scala.inline
  implicit class StreamLayerPurgeOptionsOps[Self <: StreamLayerPurgeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAge(value: Double): Self = this.set("age", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAge: Self = this.set("age", js.undefined)
    @scala.inline
    def setDisplayCount(value: Double): Self = this.set("displayCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayCount: Self = this.set("displayCount", js.undefined)
    @scala.inline
    def setMaxObservations(value: Double): Self = this.set("maxObservations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxObservations: Self = this.set("maxObservations", js.undefined)
  }
  
}

