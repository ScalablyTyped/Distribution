package typings.`3dDashBinDashPacking`.boxologicNs

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
@JSGlobal("boxologic.Instance")
@js.native
abstract class Instance protected () extends js.Object {
  /**
    * Construct from size members.
    *
    * @param width Width, length on the X-axis in 3D.
    * @param height Height, length on the Y-axis in 3D.
    * @param length Length, length on the Z-axis in 3D.
    */
  def this(width: Double, height: Double, length: Double) = this()
  /**
    * Height of the tangible instance, length on the Y-axis in 3D.
    */
  var height: Double = js.native
  /**
    * Height considering layout placement.
    */
  var layout_height: Double = js.native
  /**
    * Length considering layout placement.
    */
  var layout_length: Double = js.native
  /**
    * Width considering layout placement.
    */
  var layout_width: Double = js.native
  /**
    * Length of the tangible instance, length on the Z-axis in 3D.
    */
  var length: Double = js.native
  /**
    * Volume, Width x Height x Length.
    */
  var volume: Double = js.native
  /**
    * Width of the tangible instance, length on the X-axis in 3D.
    */
  var width: Double = js.native
}

