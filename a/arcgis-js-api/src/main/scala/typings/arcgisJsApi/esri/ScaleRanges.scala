package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScaleRanges extends Accessor {
  
  /**
    * Clamps the scale to the closest minScale or maxScale on the scale range.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider-ScaleRanges.html#clampScale)
    */
  def clampScale(scale: Double): Double = js.native
  
  /**
    * Determines whether the given scale is within the current scale range.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider-ScaleRanges.html#contains)
    */
  def contains(scale: Double): Boolean = js.native
  
  /**
    * Finds the scale range name at a given index.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider-ScaleRanges.html#findScaleRangeByIndex)
    */
  def findScaleRangeByIndex(index: Double): NamedScaleRange = js.native
  
  /**
    * Helper to create a ScaleRanges object from a minimum and maximum scale.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider-ScaleRanges.html#fromScaleRange)
    */
  def fromScaleRange(minScale: Double, maxScale: Double): ScaleRanges = js.native
  
  /**
    * Determines if the input scale value can be considered to be at the smallest scale range edge.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider-ScaleRanges.html#isMaxScaleEdge)
    */
  def isMaxScaleEdge(scale: Unit): Boolean = js.native
  
  /**
    * Determines if the input scale value can be considered to be at the largest scale range edge.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider-ScaleRanges.html#isMinScaleEdge)
    */
  def isMinScaleEdge(scale: Unit): Boolean = js.native
}
