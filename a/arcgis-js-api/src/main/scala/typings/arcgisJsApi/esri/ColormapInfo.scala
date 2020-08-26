package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColormapInfo
  extends Accessor
     with JSONSupport {
  /**
    * The color of a given pixel. This can be autocast with an array of rgb(a) values, named string, hex string or an hsl(a) string, an object with `r`, `g`, `b`, and `a` properties, or a [Color](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html) object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-ColormapInfo.html#color)
    */
  var color: Color_ = js.native
  /**
    * The label for a given pixel value and color mapping.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-ColormapInfo.html#label)
    */
  var label: String = js.native
  /**
    * The raster pixel value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-ColormapInfo.html#value)
    */
  var value: Double = js.native
}

