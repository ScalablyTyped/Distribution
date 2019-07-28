package typings.`3dDashBinDashPacking`.`3dDashBinDashPackingMod`

import typings.`3dDashBinDashPacking`.bwsNs.packerNs.Instance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * <p> A repeated Instance. </p>
  *
  * <p> InstanceForm is an utility class for repeated {@link Instance}. It is designed for shrinking
  * volume of network message I/O by storing {@link count repeated count}. </p>
  *
  * @author Jeongho Nam <http://samchon.org>
  */
@JSImport("3d-bin-packing", "InstanceForm")
@js.native
/**
  * Default Constructor.
  */
class InstanceForm ()
  extends typings.`3dDashBinDashPacking`.bwsNs.packerNs.InstanceForm {
  def this(instance: Instance) = this()
  def this(instance: Instance, count: Double) = this()
}

