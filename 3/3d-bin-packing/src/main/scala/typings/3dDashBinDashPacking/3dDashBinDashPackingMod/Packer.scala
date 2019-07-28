package typings.`3dDashBinDashPacking`.`3dDashBinDashPackingMod`

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @brief Packer, a solver of 3d bin packing with multiple wrappers.
  *
  * @details
  * <p> Packer is a facade class supporting packing operations in user side. You can solve a packing problem
  * by constructing Packer class with {@link WrapperArray wrappers} and {@link InstanceArray instances} to
  * pack and executing {@link optimize Packer.optimize()} method. </p>
  *
  * <p> In background side, deducting packing solution, those algorithms are used. </p>
  * <ul>
  *	<li> <a href="http://betterwaysystems.github.io/packer/reference/AirForceBinPacking.pdf" target="_blank">
  *		Airforce Bin Packing; 3D pallet packing problem: A human intelligence-based heuristic approach </a>
  *	</li>
  *	<li> Genetic Algorithm </li>
  *	<li> Greedy and Back-tracking algorithm </li>
  * </ul>
  *
  * @author Jeongho Nam <http://samchon.org>
  */
@JSImport("3d-bin-packing", "Packer")
@js.native
/**
  * Default Constructor.
  */
class Packer ()
  extends typings.`3dDashBinDashPacking`.bwsNs.packerNs.Packer {
  /**
    * Construct from members.
    *
    * @param wrapperArray Candidate wrappers who can contain instances.
    * @param instanceArray Instances to be packed into some wrappers.
    */
  def this(
    wrapperArray: typings.`3dDashBinDashPacking`.bwsNs.packerNs.WrapperArray,
    instanceArray: typings.`3dDashBinDashPacking`.bwsNs.packerNs.InstanceArray
  ) = this()
}

