package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Conversion extends js.Object {
  /**
    * A formatted string based on the current [position](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Conversion.html#position) and display information on the [format](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Conversion.html#format).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Conversion.html#displayCoordinate)
    */
  val displayCoordinate: String
  /**
    * The [Format](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Format.html) for this conversion.  The Format contains information detailing how the Conversion should be performed and how it will be displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Conversion.html#format)
    */
  var format: Format
  /**
    * The position property contains the location information for this conversion.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Conversion.html#position)
    */
  var position: ConversionPosition
}

object Conversion {
  @scala.inline
  def apply(displayCoordinate: String, format: Format, position: ConversionPosition): Conversion = {
    val __obj = js.Dynamic.literal(displayCoordinate = displayCoordinate, format = format, position = position)
  
    __obj.asInstanceOf[Conversion]
  }
}

