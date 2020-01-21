package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewState extends js.Object {
  /**
    * Represents the view's center point as an array of two numbers `[x, y]`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-ViewState.html#center)
    */
  val center: js.Array[Double]
  /**
    * The extent represents the visible portion of a map within the view as an instance of Extent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-ViewState.html#extent)
    */
  val extent: Extent
  /**
    * Represents the size of one pixel in map units. The value of `resolution` is the result of the division of the [extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-ViewState.html#extent) width by the [size](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-ViewState.html#size).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-ViewState.html#resolution)
    */
  val resolution: Double
  /**
    * The clockwise rotation of due north in relation to the top of the view in degrees.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-ViewState.html#rotation)
    */
  val rotation: Double
  /**
    * Represents the map scale at the center of the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-ViewState.html#scale)
    */
  val scale: Double
  /**
    * Represents the width and height of the view in pixels, e.g. `[width, height]`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-ViewState.html#size)
    */
  val size: js.Array[Double]
  /**
    * Copies the properties from a given view state.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-ViewState.html#copy)
    *
    * @param state The view state to copy the properties from.
    *
    */
  def copy(state: ViewState): ViewState
  /**
    * Converts the x and y screen coordinates to map coordinates.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-ViewState.html#toMap)
    *
    * @param out The receiving array of the conversion.
    * @param x The horizontal screen coordinate to convert.
    * @param y The vertical screen coordinate to convert.
    *
    */
  def toMap(out: js.Array[Double], x: Double, y: Double): js.Array[Double]
  /**
    * Converts the x and y map coordinates to screen coordinates.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-ViewState.html#toScreen)
    *
    * @param out The receiving array of the conversion.
    * @param x The horizontal screen coordinate to convert.
    * @param y The vertical screen coordinate to convert.
    *
    */
  def toScreen(out: js.Array[Double], x: Double, y: Double): js.Array[Double]
  /**
    * Converts the x and y map coordinates to screen coordinates. This method is similar to [toScreen](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-ViewState.html#toScreen), without applying the view state rotation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-ViewState.html#toScreenNoRotation)
    *
    * @param out The receiving array of the conversion.
    * @param x The horizontal screen coordinate to convert.
    * @param y The vertical screen coordinate to convert.
    *
    */
  def toScreenNoRotation(out: js.Array[Double], x: Double, y: Double): js.Array[Double]
}

@JSGlobal("__esri.ViewState")
@js.native
object ViewState extends TopLevel[ViewStateConstructor]

