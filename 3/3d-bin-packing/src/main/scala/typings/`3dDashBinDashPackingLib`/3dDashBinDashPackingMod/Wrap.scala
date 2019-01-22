package typings
package `3dDashBinDashPackingLib`.`3dDashBinDashPackingMod`

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * <p> Wrap represents an act wrap(ping). </p>
  *
  * <p> {@link Wrap} is a class represents an act wrapping an {@link Instance} to an {@link Wrapper}.
  * To represent the relationship, Wrap uses Bridge and Capsular patterns to links and intermediates
  * relationship between Wrapper and Instance. </p>
  *
  * <p> Wrap also helps packing optimization and 3d-visualization with its own members
  * {@link orientation} and position variables {@link x}, {@link y} and {@link z}. </p>
  *
  * @author Jeongho Nam <http://samchon.org>
  */
@JSImport("3d-bin-packing", "Wrap")
@js.native
class Wrap protected ()
  extends `3dDashBinDashPackingLib`.bwsNs.packerNs.Wrap {
  /**
    * Construct from a Wrapper.
    *
    * @param wrapper A wrapper who will contain an instance.
    */
  def this(wrapper: `3dDashBinDashPackingLib`.bwsNs.packerNs.Wrapper) = this()
  /**
    * Construct from a Wrapper and Instance with its position and default orientation 1.
    *
    * @param wrapper A wrapper who contains the instance.
    * @param instance An instance contained into the wrapper.
    * @param x Coordinate-X of the {@link instance} placement in the {@link wrapper}.
    * @param y Coordinate-Y of the {@link instance} placement in the {@link wrapper}.
    * @param z Coordinate-Z of the {@link instance} placement in the {@link wrapper}.
    */
  def this(wrapper: `3dDashBinDashPackingLib`.bwsNs.packerNs.Wrapper, instance: `3dDashBinDashPackingLib`.bwsNs.packerNs.Instance, x: scala.Double, y: scala.Double, z: scala.Double) = this()
  /**
    * Construct from a Wrapper and Instance with its position and orientation.
    *
    * @param wrapper A wrapper who contains the instance.
    * @param instance An instance contained into the wrapper.
    * @param x Coordinate-X of the {@link instance} placement in the {@link wrapper}.
    * @param y Coordinate-Y of the {@link instance} placement in the {@link wrapper}.
    * @param z Coordinate-Z of the {@link instance} placement in the {@link wrapper}.
    * @param orientation Placement orientation of wrapped {@link instance}.
    */
  def this(wrapper: `3dDashBinDashPackingLib`.bwsNs.packerNs.Wrapper, instance: `3dDashBinDashPackingLib`.bwsNs.packerNs.Instance, x: scala.Double, y: scala.Double, z: scala.Double, orientation: scala.Double) = this()
}

