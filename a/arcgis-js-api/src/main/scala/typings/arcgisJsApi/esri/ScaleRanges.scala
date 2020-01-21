package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScaleRanges extends Accessor {
  /**
    * Clamps the scale to the closest minScale or maxScale on the scale range. If the provided scale goes beyond the allowed range, it snaps back to the clamped value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider-ScaleRanges.html#clampScale)
    *
    * @param scale The scale value from the slider.
    *
    */
  def clampScale(scale: Double): Double = js.native
  /**
    * Determines whether the given scale is within the current scale range.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider-ScaleRanges.html#contains)
    *
    * @param scale The scale value.
    *
    */
  def contains(scale: Double): Boolean = js.native
  /**
    * Finds the scale range name at a given index.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider-ScaleRanges.html#findScaleRangeByIndex)
    *
    * @param index The index of the scale.
    *
    */
  def findScaleRangeByIndex(index: Double): NamedScaleRange = js.native
  /**
    * Helper to create a ScaleRanges object from a minimum and maximum scale.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider-ScaleRanges.html#fromScaleRange)
    *
    * @param minScale The minimum scale.
    * @param maxScale The maximum scale.
    *
    */
  def fromScaleRange(minScale: Double, maxScale: Double): ScaleRanges = js.native
  /**
    * Determines if the input scale value can be considered to be at the smallest scale range edge.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider-ScaleRanges.html#isMaxScaleEdge)
    *
    * @param scale The scale value to test against the scale range.
    *
    */
  def isMaxScaleEdge(scale: Unit): Boolean = js.native
  /**
    * Determines if the input scale value can be considered to be at the largest scale range edge.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider-ScaleRanges.html#isMinScaleEdge)
    *
    * @param scale The scale value to test against the scale range.
    *
    */
  def isMinScaleEdge(scale: Unit): Boolean = js.native
}

@JSGlobal("__esri.ScaleRanges")
@js.native
object ScaleRanges extends TopLevel[ScaleRangesConstructor]

