package typings
package `3dDashBinDashPackingLib`.`3dDashBinDashPackingMod`

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A wrapper wrapping instances.
  *
  * @author Jeongho Nam <http://samchon.org>
  */
@JSImport("3d-bin-packing", "Wrapper")
@js.native
/**
  * Default Constructor.
  */
class Wrapper ()
  extends `3dDashBinDashPackingLib`.bwsNs.packerNs.Wrapper {
  /**
    * Copy Constructor.
    */
  def this(wrapper: `3dDashBinDashPackingLib`.bwsNs.packerNs.Wrapper) = this()
  /**
    * Construct from members.
    *
    * @param name Name, identifier of a Wrapper.
    * @param price Price, issued cost for a type of the Wrapper.
    * @param width Width, dimensional length on the X-axis in 3D.
    * @param height Height, dimensional length on the Y-axis in 3D.
    * @param length Length, dimensional length on the Z-axis in 3D.
    * @param thickness A thickness causes shrinkness on containable volume.
    */
  def this(name: java.lang.String, price: scala.Double, width: scala.Double, height: scala.Double, length: scala.Double, thickness: scala.Double) = this()
}

