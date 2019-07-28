package typings.`3dDashBinDashPacking`.`3dDashBinDashPackingMod`

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
  extends typings.`3dDashBinDashPacking`.bwsNs.packerNs.WrapperGroup {
  /**
    * Construct from a sample.
    *
    * @param sample A sample, standard of the WrapperGroup.
    */
  def this(sample: typings.`3dDashBinDashPacking`.bwsNs.packerNs.Wrapper) = this()
  /**
    * Copy Constructor.
    */
  def this(wrapperGroup: typings.`3dDashBinDashPacking`.bwsNs.packerNs.WrapperGroup) = this()
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
  def this(name: String, price: Double, width: Double, height: Double, length: Double, thickness: Double) = this()
}

