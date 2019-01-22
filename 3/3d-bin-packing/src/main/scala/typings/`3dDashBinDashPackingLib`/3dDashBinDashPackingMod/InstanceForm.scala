package typings
package `3dDashBinDashPackingLib`.`3dDashBinDashPackingMod`

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
  extends `3dDashBinDashPackingLib`.bwsNs.packerNs.InstanceForm {
  def this(instance: `3dDashBinDashPackingLib`.bwsNs.packerNs.Instance) = this()
  def this(instance: `3dDashBinDashPackingLib`.bwsNs.packerNs.Instance, count: scala.Double) = this()
}

