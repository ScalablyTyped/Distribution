package typings.`3dBinPacking`.boxologic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * <p> An abstract instance of boxologic. </p>
  *
  * <p> {@link st_Instance} represents a physical, tangible instance of 3-dimension. </p>
  *
  * @author Jeongho Nam <http://samchon.org>
  */
trait Instance extends js.Object {
  /**
    * Height of the tangible instance, length on the Y-axis in 3D.
    */
  var height: Double
  /**
    * Height considering layout placement.
    */
  var layout_height: Double
  /**
    * Length considering layout placement.
    */
  var layout_length: Double
  /**
    * Width considering layout placement.
    */
  var layout_width: Double
  /**
    * Length of the tangible instance, length on the Z-axis in 3D.
    */
  var length: Double
  /**
    * Volume, Width x Height x Length.
    */
  var volume: Double
  /**
    * Width of the tangible instance, length on the X-axis in 3D.
    */
  var width: Double
}

object Instance {
  @scala.inline
  def apply(
    height: Double,
    layout_height: Double,
    layout_length: Double,
    layout_width: Double,
    length: Double,
    volume: Double,
    width: Double
  ): Instance = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], layout_height = layout_height.asInstanceOf[js.Any], layout_length = layout_length.asInstanceOf[js.Any], layout_width = layout_width.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Instance]
  }
}

