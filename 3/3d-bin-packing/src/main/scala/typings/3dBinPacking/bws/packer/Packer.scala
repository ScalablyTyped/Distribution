package typings.`3dBinPacking`.bws.packer

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
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protocol.Entity * / any */ @JSGlobal("bws.packer.Packer")
@js.native
/**
  * Default Constructor.
  */
class Packer () extends js.Object {
  /**
    * Construct from members.
    *
    * @param wrapperArray Candidate wrappers who can contain instances.
    * @param instanceArray Instances to be packed into some wrappers.
    */
  def this(wrapperArray: WrapperArray, instanceArray: InstanceArray) = this()
  /**
    * Instances trying to pack into the wrapper.
    */
  var instanceArray: InstanceArray = js.native
  /**
    * Candidate wrappers who can contain instances.
    */
  var wrapperArray: WrapperArray = js.native
  /**
    * @inheritdoc
    */
  def TAG(): String = js.native
  /**
    * @inheritdoc
    */
  def construct(
    xml: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ js.Any
  ): Unit = js.native
  /**
    * Get instanceArray.
    */
  def getInstanceArray(): InstanceArray = js.native
  /**
    * Get wrapperArray.
    */
  def getWrapperArray(): WrapperArray = js.native
  /**
    * @brief Initialize sequence list (gene_array).
    *
    * @details
    * <p> Deducts initial sequence list by such assumption: </p>
    *
    * <ul>
    *	<li> Cost of larger wrapper is less than smaller one, within framework of price per volume unit. </li>
    *	<ul>
    *		<li> Wrapper Larger: (price: $1,000, volume: 100cm^3 -> price per volume unit: $10 / cm^3) </li>
    *		<li> Wrapper Smaller: (price: $700, volume: 50cm^3 -> price per volume unit: $14 / cm^3) </li>
    *		<li> Larger's <u>cost</u> is less than Smaller, within framework of price per volume unit </li>
    *	</ul>
    * </ul>
    *
    * <p> Method {@link initGenes initGenes()} constructs {@link WrapperGroup WrapperGroups} corresponding
    * with the {@link wrapperArray} and allocates {@link instanceArray instances} to a {@link WrapperGroup},
    * has the smallest <u>cost</u> between containbles. </p>
    *
    * <p> After executing packing solution by {@link WrapperGroup.optimize WrapperGroup.optimize()}, trying to
    * {@link repack re-pack} each {@link WrapperGroup} to another type of {@link Wrapper}, deducts the best
    * solution between them. It's the initial sequence list of genetic algorithm. </p>
    *
    * @return Initial sequence list.
    */
  /* protected */ def initGenes(): GAWrapperArray = js.native
  /**
    * <p> Deduct
    *
    */
  def optimize(): WrapperArray = js.native
  /**
    * Try to repack each wrappers to another type.
    *
    * @param $wrappers Wrappers to repack.
    * @return Re-packed wrappers.
    */
  /* protected */ def repack($wrappers: WrapperArray): WrapperArray = js.native
  /**
    * @inheritdoc
    */
  def toXML(): js.Any = js.native
}

