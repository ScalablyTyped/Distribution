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
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protocol.Entity * / any */ @js.native
trait Packer extends js.Object {
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

object Packer {
  @scala.inline
  def apply(
    TAG: () => String,
    construct: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ js.Any => Unit,
    getInstanceArray: () => InstanceArray,
    getWrapperArray: () => WrapperArray,
    initGenes: () => GAWrapperArray,
    instanceArray: InstanceArray,
    optimize: () => WrapperArray,
    repack: WrapperArray => WrapperArray,
    toXML: () => js.Any,
    wrapperArray: WrapperArray
  ): Packer = {
    val __obj = js.Dynamic.literal(TAG = js.Any.fromFunction0(TAG), construct = js.Any.fromFunction1(construct), getInstanceArray = js.Any.fromFunction0(getInstanceArray), getWrapperArray = js.Any.fromFunction0(getWrapperArray), initGenes = js.Any.fromFunction0(initGenes), instanceArray = instanceArray.asInstanceOf[js.Any], optimize = js.Any.fromFunction0(optimize), repack = js.Any.fromFunction1(repack), toXML = js.Any.fromFunction0(toXML), wrapperArray = wrapperArray.asInstanceOf[js.Any])
    __obj.asInstanceOf[Packer]
  }
  @scala.inline
  implicit class PackerOps[Self <: Packer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTAG(value: () => String): Self = this.set("TAG", js.Any.fromFunction0(value))
    @scala.inline
    def setConstruct(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ js.Any => Unit
    ): Self = this.set("construct", js.Any.fromFunction1(value))
    @scala.inline
    def setGetInstanceArray(value: () => InstanceArray): Self = this.set("getInstanceArray", js.Any.fromFunction0(value))
    @scala.inline
    def setGetWrapperArray(value: () => WrapperArray): Self = this.set("getWrapperArray", js.Any.fromFunction0(value))
    @scala.inline
    def setInitGenes(value: () => GAWrapperArray): Self = this.set("initGenes", js.Any.fromFunction0(value))
    @scala.inline
    def setInstanceArray(value: InstanceArray): Self = this.set("instanceArray", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptimize(value: () => WrapperArray): Self = this.set("optimize", js.Any.fromFunction0(value))
    @scala.inline
    def setRepack(value: WrapperArray => WrapperArray): Self = this.set("repack", js.Any.fromFunction1(value))
    @scala.inline
    def setToXML(value: () => js.Any): Self = this.set("toXML", js.Any.fromFunction0(value))
    @scala.inline
    def setWrapperArray(value: WrapperArray): Self = this.set("wrapperArray", value.asInstanceOf[js.Any])
  }
  
}

