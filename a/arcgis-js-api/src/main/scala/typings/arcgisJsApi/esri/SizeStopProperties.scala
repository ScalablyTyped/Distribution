package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SizeStopProperties extends js.Object {
  /**
    * A string value used to label the stop in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-support-SizeStop.html#label)
    */
  var label: js.UndefOr[String] = js.native
  /**
    * The size value in points (between `0` and `90`) used to render features with the given [value](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-support-SizeStop.html#value). This value may also be autocast from a string in points or pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-support-SizeStop.html#size)
    */
  var size: js.UndefOr[Double | String] = js.native
  /**
    * Specifies the data value to map to the given [size](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-support-SizeStop.html#size).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-support-SizeStop.html#value)
    */
  var value: js.UndefOr[Double] = js.native
}

object SizeStopProperties {
  @scala.inline
  def apply(): SizeStopProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SizeStopProperties]
  }
  @scala.inline
  implicit class SizeStopPropertiesOps[Self <: SizeStopProperties] (val x: Self) extends AnyVal {
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
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setSize(value: Double | String): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

