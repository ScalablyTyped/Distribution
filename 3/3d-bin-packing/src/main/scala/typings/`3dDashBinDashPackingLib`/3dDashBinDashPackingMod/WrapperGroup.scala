package typings
package `3dDashBinDashPackingLib`.`3dDashBinDashPackingMod`

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A group of {@link Wrapper Wrappers} with same type.
  *
  * @author Jeongho Nam <http://samchon.org>
  */
@JSImport("3d-bin-packing", "WrapperGroup")
@js.native
/**
  * Default Constructor.
  */
class WrapperGroup ()
  extends `3dDashBinDashPackingLib`.bwsNs.packerNs.WrapperGroup {
  /**
    * Construct from a sample.
    *
    * @param sample A sample, standard of the WrapperGroup.
    */
  def this(sample: `3dDashBinDashPackingLib`.bwsNs.packerNs.Wrapper) = this()
  /**
    * Copy Constructor.
    */
  def this(wrapperGroup: `3dDashBinDashPackingLib`.bwsNs.packerNs.WrapperGroup) = this()
  /**
    * Construct from members of the {@link sample}.
    *
    * @param name Name, identifier of the sample.
    * @param price Price, issued cost for a type of the sample.
    * @param width Width, dimensional length on the X-axis in 3D, of the sample.
    * @param height Height, dimensional length on the Y-axis in 3D, of the sample.
    * @param length Length, dimensional length on the Z-axis in 3D, of the sample.
    * @param thickness A thickness, causes shrinkness on containable volume, of the sample.
    */
  def this(name: java.lang.String, price: scala.Double, width: scala.Double, height: scala.Double, length: scala.Double, thickness: scala.Double) = this()
}

