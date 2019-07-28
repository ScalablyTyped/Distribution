package typings.`3dDashBinDashPacking`.`3dDashBinDashPackingMod`

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Bridge of {@link Packer} for {@link InstanceForm repeated instances}.
  *
  * @author Jeongho Nam <http://samchon.org>
  */
@JSImport("3d-bin-packing", "PackerForm")
@js.native
/**
  * Default Constructor.
  */
class PackerForm ()
  extends typings.`3dDashBinDashPacking`.bwsNs.packerNs.PackerForm {
  /**
    * Initializer Constructor.
    *
    * @param instanceFormArray Form of Instances to pack.
    * @param wrapperArray Type of Wrappers to be used.
    */
  def this(
    instanceFormArray: typings.`3dDashBinDashPacking`.bwsNs.packerNs.InstanceFormArray,
    wrapperArray: typings.`3dDashBinDashPacking`.bwsNs.packerNs.WrapperArray
  ) = this()
}

