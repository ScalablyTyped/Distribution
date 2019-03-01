package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewState extends js.Object {
  /**
    * Represents the view's center point as an array of two numbers `[x, y]`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-ViewState.html#center)
    */
  val center: js.Array[scala.Double]
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
  val resolution: scala.Double
  /**
    * The clockwise rotation of due north in relation to the top of the view in degrees.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-ViewState.html#rotation)
    */
  val rotation: scala.Double
  /**
    * Represents the map scale at the center of the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-ViewState.html#scale)
    */
  val scale: scala.Double
  /**
    * Represents the width and height of the view in pixels, e.g. `[width, height]`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-ViewState.html#size)
    */
  val size: js.Array[scala.Double]
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
  def toMap(out: js.Array[scala.Double], x: scala.Double, y: scala.Double): js.Array[scala.Double]
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
  def toScreen(out: js.Array[scala.Double], x: scala.Double, y: scala.Double): js.Array[scala.Double]
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
  def toScreenNoRotation(out: js.Array[scala.Double], x: scala.Double, y: scala.Double): js.Array[scala.Double]
}

object ViewState {
  @scala.inline
  def apply(
    center: js.Array[scala.Double],
    clone: js.Function0[ViewState],
    copy: js.Function1[ViewState, ViewState],
    extent: Extent,
    resolution: scala.Double,
    rotation: scala.Double,
    scale: scala.Double,
    size: js.Array[scala.Double],
    toMap: js.Function3[js.Array[scala.Double], scala.Double, scala.Double, js.Array[scala.Double]],
    toScreen: js.Function3[js.Array[scala.Double], scala.Double, scala.Double, js.Array[scala.Double]],
    toScreenNoRotation: js.Function3[js.Array[scala.Double], scala.Double, scala.Double, js.Array[scala.Double]]
  ): ViewState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("center")(center)
    __obj.updateDynamic("clone")(clone)
    __obj.updateDynamic("copy")(copy)
    __obj.updateDynamic("extent")(extent)
    __obj.updateDynamic("resolution")(resolution)
    __obj.updateDynamic("rotation")(rotation)
    __obj.updateDynamic("scale")(scale)
    __obj.updateDynamic("size")(size)
    __obj.updateDynamic("toMap")(toMap)
    __obj.updateDynamic("toScreen")(toScreen)
    __obj.updateDynamic("toScreenNoRotation")(toScreenNoRotation)
    __obj.asInstanceOf[ViewState]
  }
}

