package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Conversion extends js.Object {
  /**
    * A formatted string based on the current [position](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Conversion.html#position) and display information on the [format](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Conversion.html#format).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Conversion.html#displayCoordinate)
    */
  val displayCoordinate: String = js.native
  /**
    * The [Format](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Format.html) for this conversion.  The Format contains information detailing how the Conversion should be performed and how it will be displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Conversion.html#format)
    */
  var format: Format = js.native
  /**
    * The position property contains the location information for this conversion.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Conversion.html#position)
    */
  var position: ConversionPosition = js.native
}

object Conversion {
  @scala.inline
  def apply(displayCoordinate: String, format: Format, position: ConversionPosition): Conversion = {
    val __obj = js.Dynamic.literal(displayCoordinate = displayCoordinate.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Conversion]
  }
  @scala.inline
  implicit class ConversionOps[Self <: Conversion] (val x: Self) extends AnyVal {
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
    def setDisplayCoordinate(value: String): Self = this.set("displayCoordinate", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormat(value: Format): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: ConversionPosition): Self = this.set("position", value.asInstanceOf[js.Any])
  }
  
}

