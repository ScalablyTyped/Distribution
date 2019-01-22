package typings
package `3dDashBinDashPackingLib`.boxologicNs

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
  def this(width: scala.Double, height: scala.Double, length: scala.Double) = this()
  /**
    * Height of the tangible instance, length on the Y-axis in 3D.
    */
  var height: scala.Double = js.native
  /**
    * Height considering layout placement.
    */
  var layout_height: scala.Double = js.native
  /**
    * Length considering layout placement.
    */
  var layout_length: scala.Double = js.native
  /**
    * Width considering layout placement.
    */
  var layout_width: scala.Double = js.native
  /**
    * Length of the tangible instance, length on the Z-axis in 3D.
    */
  var length: scala.Double = js.native
  /**
    * Volume, Width x Height x Length.
    */
  var volume: scala.Double = js.native
  /**
    * Width of the tangible instance, length on the X-axis in 3D.
    */
  var width: scala.Double = js.native
}

