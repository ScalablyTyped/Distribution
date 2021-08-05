package typings.`3dBinPacking`

import typings.`3dBinPacking`.bws.packer.Instance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("3d-bin-packing", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("3d-bin-packing", "GAWrapperArray")
  @js.native
  class GAWrapperArray protected ()
    extends StObject
       with typings.`3dBinPacking`.bws.packer.GAWrapperArray {
    /**
      * @brief Copy Constructor.
      */
    def this(genes: typings.`3dBinPacking`.bws.packer.GAWrapperArray) = this()
    /**
      * Construct from instances.
      *
      * @param instanceArray Instances to be wrapped.
      */
    def this(instanceArray: typings.`3dBinPacking`.bws.packer.InstanceArray) = this()
    
    /**
      * @inheritdoc
      */
    /* CompleteClass */
    override def CHILD_TAG(): String = js.native
    
    /**
      * @inheritdoc
      */
    /* CompleteClass */
    override def TAG(): String = js.native
    
    /* private */ /* CompleteClass */
    override def constructResult(): js.Any = js.native
    
    /**
      * @inheritdoc
      */
    /* CompleteClass */
    override def createChild(
      xml: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ js.Any
    ): typings.`3dBinPacking`.bws.packer.Wrapper = js.native
    
    /**
      * Get (calculate) price.
      */
    /* CompleteClass */
    override def getPrice(): Double = js.native
    
    /**
      * @brief Get optimization result.
      *
      * @return result map.
      */
    /* CompleteClass */
    override def getResult(): js.Any = js.native
    
    /**
      * Get (calculate) utilization rate.
      */
    /* CompleteClass */
    override def getUtilization(): Double = js.native
    
    /* protected */ /* CompleteClass */
    var instanceArray: typings.`3dBinPacking`.bws.packer.InstanceArray = js.native
    
    /* CompleteClass */
    override def less(obj: typings.`3dBinPacking`.bws.packer.GAWrapperArray): Boolean = js.native
    
    /* private */ /* CompleteClass */
    var price: js.Any = js.native
    
    /* protected */ /* CompleteClass */
    var result: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.HashMap<string, WrapperGroup> */ js.Any = js.native
    
    /**
      * @brief Validity of this sequence list.
      */
    /* private */ /* CompleteClass */
    var valid: js.Any = js.native
  }
  
  /**
    * An array of Instance objects.
    *
    * @author Jeongho Nam <http://samchon.org>
    */
  @JSImport("3d-bin-packing", "InstanceArray")
  @js.native
  /**
    * Default Constructor.
    */
  class InstanceArray ()
    extends StObject
       with typings.`3dBinPacking`.bws.packer.InstanceArray {
    
    /**
      * @inheritdoc
      */
    /* CompleteClass */
    override def CHILD_TAG(): String = js.native
    
    /**
      * @inheritdoc
      */
    /* CompleteClass */
    override def TAG(): String = js.native
    
    /**
      * @inheritdoc
      */
    /* CompleteClass */
    override def createChild(
      xml: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ js.Any
    ): Instance = js.native
  }
  
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
    extends StObject
       with typings.`3dBinPacking`.bws.packer.InstanceForm {
    def this(instance: Instance) = this()
    def this(instance: Unit, count: Double) = this()
    def this(instance: Instance, count: Double) = this()
    
    /* CompleteClass */
    @JSName("$count")
    var $count: String = js.native
    
    /* CompleteClass */
    @JSName("$height")
    var $height: String = js.native
    
    /* CompleteClass */
    @JSName("$length")
    var $length: String = js.native
    
    /* CompleteClass */
    @JSName("$name")
    var $name: String = js.native
    
    /* CompleteClass */
    @JSName("$width")
    var $width: String = js.native
    
    /**
      * @inheritdoc
      */
    /* CompleteClass */
    override def TAG(): String = js.native
    
    /**
      * @inheritdoc
      */
    /* CompleteClass */
    override def construct(
      xml: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ js.Any
    ): Unit = js.native
    
    /**
      * Repeated count of the {@link instance}.
      */
    /* private */ /* CompleteClass */
    var count: js.Any = js.native
    
    /* private */ /* CompleteClass */
    override def createInstance(xml: js.Any): js.Any = js.native
    
    /* CompleteClass */
    override def getCount(): Double = js.native
    
    /* CompleteClass */
    override def getInstance(): Instance = js.native
    
    /**
      * A duplicated Instance.
      */
    /* private */ /* CompleteClass */
    var instance: js.Any = js.native
    
    /* CompleteClass */
    override def key(): js.Any = js.native
    
    /* CompleteClass */
    override def setCount(`val`: Double): Unit = js.native
    
    /**
      * <p> Repeated {@link instance} to {@link InstanceArray}.
      *
      * @details
      * <p> Contains the {@link instance repeated instance} to an {@link InstanceArray} to make
      * {@link instance} to participate in the packing process. The returned {@link InstanceArray} will be
      * registered on {@link Packer.instanceArray}.
      *
      * @return An array of instance containing repeated {@link instance}.
      */
    /* CompleteClass */
    override def toInstanceArray(): typings.`3dBinPacking`.bws.packer.InstanceArray = js.native
    
    /**
      * @inheritdoc
      */
    /* CompleteClass */
    override def toXML(): js.Any = js.native
  }
  
  /**
    * An array of {@link InstanceForm} objects.
    *
    * @author Jeongho Nam <http://samchon.org>
    */
  @JSImport("3d-bin-packing", "InstanceFormArray")
  @js.native
  /**
    * Default Constructor.
    */
  class InstanceFormArray ()
    extends StObject
       with typings.`3dBinPacking`.bws.packer.InstanceFormArray {
    
    /* CompleteClass */
    override def CHILD_TAG(): String = js.native
    
    /* CompleteClass */
    override def TAG(): String = js.native
    
    /* CompleteClass */
    override def createChild(
      xml: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ js.Any
    ): typings.`3dBinPacking`.bws.packer.InstanceForm = js.native
    
    /**
      * Convert {@link InstanceForm} objects to {@link InstanceArray}.
      *
      * @return An array of instance containing repeated instances in {@link InstanceForm} objects.
      */
    /* CompleteClass */
    override def toInstanceArray(): typings.`3dBinPacking`.bws.packer.InstanceArray = js.native
  }
  
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
    extends StObject
       with typings.`3dBinPacking`.bws.packer.Packer {
    /**
      * Construct from members.
      *
      * @param wrapperArray Candidate wrappers who can contain instances.
      * @param instanceArray Instances to be packed into some wrappers.
      */
    def this(
      wrapperArray: typings.`3dBinPacking`.bws.packer.WrapperArray,
      instanceArray: typings.`3dBinPacking`.bws.packer.InstanceArray
    ) = this()
    
    /**
      * @inheritdoc
      */
    /* CompleteClass */
    override def TAG(): String = js.native
    
    /**
      * @inheritdoc
      */
    /* CompleteClass */
    override def construct(
      xml: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ js.Any
    ): Unit = js.native
    
    /**
      * Get instanceArray.
      */
    /* CompleteClass */
    override def getInstanceArray(): typings.`3dBinPacking`.bws.packer.InstanceArray = js.native
    
    /**
      * Get wrapperArray.
      */
    /* CompleteClass */
    override def getWrapperArray(): typings.`3dBinPacking`.bws.packer.WrapperArray = js.native
    
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
    /* protected */ /* CompleteClass */
    override def initGenes(): typings.`3dBinPacking`.bws.packer.GAWrapperArray = js.native
    
    /**
      * Instances trying to pack into the wrapper.
      */
    /* protected */ /* CompleteClass */
    var instanceArray: typings.`3dBinPacking`.bws.packer.InstanceArray = js.native
    
    /**
      * <p> Deduct
      *
      */
    /* CompleteClass */
    override def optimize(): typings.`3dBinPacking`.bws.packer.WrapperArray = js.native
    
    /**
      * Try to repack each wrappers to another type.
      *
      * @param $wrappers Wrappers to repack.
      * @return Re-packed wrappers.
      */
    /* protected */ /* CompleteClass */
    override def repack($wrappers: typings.`3dBinPacking`.bws.packer.WrapperArray): typings.`3dBinPacking`.bws.packer.WrapperArray = js.native
    
    /**
      * @inheritdoc
      */
    /* CompleteClass */
    override def toXML(): js.Any = js.native
    
    /**
      * Candidate wrappers who can contain instances.
      */
    /* protected */ /* CompleteClass */
    var wrapperArray: typings.`3dBinPacking`.bws.packer.WrapperArray = js.native
  }
  
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
    extends StObject
       with typings.`3dBinPacking`.bws.packer.PackerForm {
    /**
      * Initializer Constructor.
      *
      * @param instanceFormArray Form of Instances to pack.
      * @param wrapperArray Type of Wrappers to be used.
      */
    def this(
      instanceFormArray: typings.`3dBinPacking`.bws.packer.InstanceFormArray,
      wrapperArray: typings.`3dBinPacking`.bws.packer.WrapperArray
    ) = this()
    
    /* CompleteClass */
    override def TAG(): String = js.native
    
    /* CompleteClass */
    override def construct(
      xml: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ js.Any
    ): Unit = js.native
    
    /* CompleteClass */
    override def getInstanceFormArray(): typings.`3dBinPacking`.bws.packer.InstanceFormArray = js.native
    
    /* CompleteClass */
    override def getWrapperArray(): typings.`3dBinPacking`.bws.packer.WrapperArray = js.native
    
    /**
      * Form of Instances to pack.
      */
    /* private */ /* CompleteClass */
    var instanceFormArray: js.Any = js.native
    
    /* CompleteClass */
    override def optimize(): typings.`3dBinPacking`.bws.packer.WrapperArray = js.native
    
    /* CompleteClass */
    override def toPacker(): typings.`3dBinPacking`.bws.packer.Packer = js.native
    
    /* CompleteClass */
    override def toXML(): js.Any = js.native
    
    /**
      * Type of Wrappers to be used.
      */
    /* private */ /* CompleteClass */
    var wrapperArray: js.Any = js.native
  }
  
  /**
    * A product.
    *
    * @author Jeongho Nam <http://samchon.org>
    */
  @JSImport("3d-bin-packing", "Product")
  @js.native
  /**
    * Default Constructor.
    */
  class Product ()
    extends StObject
       with typings.`3dBinPacking`.bws.packer.Product {
    /**
      * Construct from members.
      *
      * @param name Name, identifier of the Product.
      * @param width Width, length on the X-axis in 3D.
      * @param height Height, length on the Y-axis in 3D.
      * @param length Length, length on the Z-axis in 3D.
      */
    def this(name: String, width: Double, height: Double, length: Double) = this()
    
    /**
      * @inheritdoc
      */
    /* CompleteClass */
    override def TAG(): String = js.native
    
    /**
      * <p> A type, identifier of derived class. </p>
      *
      * <h4> Derived types </h4>
      * <ul>
      *	<li> {@link Product product} </li>
      *	<li> {@link Wrapper wrapper} </li>
      * <ul>
      */
    /* CompleteClass */
    override def TYPE(): String = js.native
    
    /**
      * Get height, length on the Y-axis in 3D.
      */
    /* CompleteClass */
    override def getHeight(): Double = js.native
    
    /**
      * Get length, length on the Z-axis in 3D.
      */
    /* CompleteClass */
    override def getLength(): Double = js.native
    
    /**
      * Get name.
      */
    /* CompleteClass */
    override def getName(): String = js.native
    
    /**
      * Get (calculate) volume.
      *
      * @return width x height x length
      */
    /* CompleteClass */
    override def getVolume(): Double = js.native
    
    /**
      * Get width, length on the X-axis in 3D.
      */
    /* CompleteClass */
    override def getWidth(): Double = js.native
    
    /**
      * Height of the Product, length on the Y-axis in 3D.
      */
    /* protected */ /* CompleteClass */
    var height: Double = js.native
    
    /**
      * Key of a Product is its name.
      */
    /* CompleteClass */
    override def key(): js.Any = js.native
    
    /**
      * Length of the Product, length on the Z-axis in 3D.
      */
    /* protected */ /* CompleteClass */
    var length: Double = js.native
    
    /**
      * <p> Name, key of the Product. </p>
      *
      * <p> The name must be unique because a name identifies a {@link Product}. </p>
      */
    /* protected */ /* CompleteClass */
    var name: String = js.native
    
    /**
      * Set height, length on the Y-axis in 3D.
      */
    /* CompleteClass */
    override def setHeight(`val`: Double): Unit = js.native
    
    /**
      * Set length, length on the Z-axis in 3D.
      */
    /* CompleteClass */
    override def setLength(`val`: Double): Unit = js.native
    
    /**
      * Set name.
      */
    /* CompleteClass */
    override def setName(`val`: String): Unit = js.native
    
    /**
      * Set width, length on the X-axis in 3D.
      */
    /* CompleteClass */
    override def setWidth(`val`: Double): Unit = js.native
    
    /**
      * @inheritdoc
      */
    /* CompleteClass */
    override def toXML(): js.Any = js.native
    
    /**
      * Width of the Product, length on the X-axis in 3D.
      */
    /* protected */ /* CompleteClass */
    var width: Double = js.native
  }
  
  inline def Test(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_Test")().asInstanceOf[Unit]
  
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
    extends StObject
       with typings.`3dBinPacking`.bws.packer.Wrap {
    /**
      * Construct from a Wrapper.
      *
      * @param wrapper A wrapper who will contain an instance.
      */
    def this(wrapper: typings.`3dBinPacking`.bws.packer.Wrapper) = this()
    /**
      * Construct from a Wrapper and Instance with its position and default orientation 1.
      *
      * @param wrapper A wrapper who contains the instance.
      * @param instance An instance contained into the wrapper.
      * @param x Coordinate-X of the {@link instance} placement in the {@link wrapper}.
      * @param y Coordinate-Y of the {@link instance} placement in the {@link wrapper}.
      * @param z Coordinate-Z of the {@link instance} placement in the {@link wrapper}.
      */
    def this(
      wrapper: typings.`3dBinPacking`.bws.packer.Wrapper,
      instance: Instance,
      x: Double,
      y: Double,
      z: Double
    ) = this()
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
    def this(
      wrapper: typings.`3dBinPacking`.bws.packer.Wrapper,
      instance: Instance,
      x: Double,
      y: Double,
      z: Double,
      orientation: Double
    ) = this()
    
    /* CompleteClass */
    @JSName("$instanceName")
    override val $instanceName: String = js.native
    
    /* CompleteClass */
    @JSName("$layoutScale")
    override val $layoutScale: String = js.native
    
    /* CompleteClass */
    @JSName("$position")
    override val $position: String = js.native
    
    /**
      * @inheritdoc
      */
    /* CompleteClass */
    override def TAG(): String = js.native
    
    /**
      * @brief Orientation change is occured in level of the packer.
      *
      * @details orientation Packer's new orientation.
      */
    /* CompleteClass */
    override def changeWrapperOrientation(orientation: Double): Unit = js.native
    
    /**
      * @inheritdoc
      */
    /* CompleteClass */
    override def construct(
      xml: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ js.Any
    ): Unit = js.native
    
    /**
      * Factory method of wrapped Instance.
      *
      * @param type Type of contained Instance's type.
      */
    /* protected */ /* CompleteClass */
    override def createInstance(`type`: String): Instance = js.native
    
    /**
      * @brief Estimate orientation by given size.
      *
      * @param width Width by placement.
      * @param height Height by placement.
      * @param length Length by placement.
      */
    /* CompleteClass */
    override def estimateOrientation(width: Double, height: Double, length: Double): Unit = js.native
    
    /**
      * Get instance.
      */
    /* CompleteClass */
    override def getInstance(): Instance = js.native
    
    /**
      * Get height.
      */
    /* CompleteClass */
    override def getLayoutHeight(): Double = js.native
    
    /**
      * Get width.
      */
    /* CompleteClass */
    override def getLayoutWidth(): Double = js.native
    
    /**
      * Get length.
      */
    /* CompleteClass */
    override def getLength(): Double = js.native
    
    /**
      * Get orientation.
      */
    /* CompleteClass */
    override def getOrientation(): Double = js.native
    
    /**
      * Get volume.
      */
    /* CompleteClass */
    override def getVolume(): Double = js.native
    
    /**
      * Get wrapper.
      */
    /* CompleteClass */
    override def getWrapper(): typings.`3dBinPacking`.bws.packer.Wrapper = js.native
    
    /**
      * Get x.
      */
    /* CompleteClass */
    override def getX(): Double = js.native
    
    /**
      * Get y.
      */
    /* CompleteClass */
    override def getY(): Double = js.native
    
    /**
      * Get z.
      */
    /* CompleteClass */
    override def getZ(): Double = js.native
    
    /**
      * An instance wrapped into the {@link wrapper}.
      */
    /* protected */ /* CompleteClass */
    var instance: Instance = js.native
    
    /**
      * Placement orientation of wrapped {@link instance}.
      */
    /* protected */ /* CompleteClass */
    var orientation: Double = js.native
    
    /**
      * Set orientation.
      *
      * @param orientation Orientation code (1 to 6).
      */
    /* CompleteClass */
    override def setOrientation(orientation: Double): Unit = js.native
    
    /**
      * Set position.
      *
      * @param x Coordinate-X of the instance placement in the wrapper.
      * @param y Coordinate-Y of the instance placement in the wrapper.
      * @param z Coordinate-Z of the instance placement in the wrapper.
      */
    /* CompleteClass */
    override def setPosition(x: Double, y: Double, z: Double): Unit = js.native
    
    /**
      * @inheritdoc
      */
    /* CompleteClass */
    override def toXML(): js.Any = js.native
    
    /**
      * A wrapper wrapping the {@link instance}.
      */
    /* protected */ /* CompleteClass */
    var wrapper: typings.`3dBinPacking`.bws.packer.Wrapper = js.native
    
    /**
      * Coordinate-X of the instance placement in the wrapper.
      */
    /* protected */ /* CompleteClass */
    var x: Double = js.native
    
    /**
      * Coordinate-Y of the instance placement in the wrapper.
      */
    /* protected */ /* CompleteClass */
    var y: Double = js.native
    
    /**
      * Coordinate-Z of the instance placement in the wrapper.
      */
    /* protected */ /* CompleteClass */
    var z: Double = js.native
  }
  
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
    extends StObject
       with typings.`3dBinPacking`.bws.packer.Wrapper {
    /**
      * Copy Constructor.
      */
    def this(wrapper: typings.`3dBinPacking`.bws.packer.Wrapper) = this()
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
    def this(name: String, price: Double, width: Double, height: Double, length: Double, thickness: Double) = this()
    
    /* CompleteClass */
    @JSName("$height")
    var $height: String = js.native
    
    /* CompleteClass */
    @JSName("$length")
    var $length: String = js.native
    
    /* CompleteClass */
    @JSName("$name")
    var $name: String = js.native
    
    /* CompleteClass */
    @JSName("$price")
    var $price: String = js.native
    
    /* CompleteClass */
    @JSName("$scale")
    override val $scale: String = js.native
    
    /* CompleteClass */
    @JSName("$spaceUtilization")
    override val $spaceUtilization: String = js.native
    
    /* CompleteClass */
    @JSName("$thickness")
    var $thickness: String = js.native
    
    /* CompleteClass */
    @JSName("$width")
    var $width: String = js.native
    
    /**
      * @inheritdoc
      */
    /* CompleteClass */
    override def CHILD_TAG(): String = js.native
    
    /**
      * @inheritdoc
      */
    /* CompleteClass */
    override def TAG(): String = js.native
    
    /**
      * <p> A type, identifier of derived class. </p>
      *
      * <h4> Derived types </h4>
      * <ul>
      *	<li> {@link Product product} </li>
      *	<li> {@link Wrapper wrapper} </li>
      * <ul>
      */
    /* CompleteClass */
    override def TYPE(): String = js.native
    
    /**
      * <p> Wrapper is enough greater? </p>
      *
      * <p> Test whether the Wrapper is enough greater than an Instance to contain. </p>
      *
      * @param instance An Instance to test.
      * @return Enough greater or not.
      */
    /* CompleteClass */
    override def containable(instance: Instance): Boolean = js.native
    
    /**
      * @inheritdoc
      */
    /* CompleteClass */
    override def createChild(
      xml: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ js.Any
    ): typings.`3dBinPacking`.bws.packer.Wrap = js.native
    
    /* CompleteClass */
    override def equals(obj: typings.`3dBinPacking`.bws.packer.Wrapper): Boolean = js.native
    
    /**
      * <p> Get (calculate) containable height, length on the Y-axis in 3D. </p>
      *
      * <p> Calculates containable height considering the {@link thickness}. </p>
      *
      * @return height - (2 x thickness)
      */
    /* CompleteClass */
    override def getContainableHeight(): Double = js.native
    
    /**
      * <p> Get (calculate) containable length, length on the Z-axis in 3D. </p>
      *
      * <p> Calculates containable length considering the {@link thickness}. </p>
      *
      * @return length - (2 x thickness)
      */
    /* CompleteClass */
    override def getContainableLength(): Double = js.native
    
    /**
      * <p> Get (calculate) containable volume. </p>
      *
      * <p> Calculates containable volume considering the {@link thickness}. </p>
      *
      * @return volume - {(2 x thickness) ^ 3}
      */
    /* CompleteClass */
    override def getContainableVolume(): Double = js.native
    
    /**
      * <p> Get (calculate) containable width, length on the X-axis in 3D. </p>
      *
      * <p> Calculates containable width considering the {@link thickness}. </p>
      *
      * @return width - (2 x thickness)
      */
    /* CompleteClass */
    override def getContainableWidth(): Double = js.native
    
    /**
      * Get height, length on the Y-axis in 3D.
      */
    /* CompleteClass */
    override def getHeight(): Double = js.native
    
    /**
      * Get length, length on the Z-axis in 3D.
      */
    /* CompleteClass */
    override def getLength(): Double = js.native
    
    /**
      * Get name.
      */
    /* CompleteClass */
    override def getName(): String = js.native
    
    /**
      * Get price.
      */
    /* CompleteClass */
    override def getPrice(): Double = js.native
    
    /**
      * Get thickness.
      */
    /* CompleteClass */
    override def getThickness(): Double = js.native
    
    /**
      * Get utilization ratio of containable volume.
      *
      * @return utilization ratio.
      */
    /* CompleteClass */
    override def getUtilization(): Double = js.native
    
    /**
      * Get (calculate) volume.
      *
      * @return width x height x length
      */
    /* CompleteClass */
    override def getVolume(): Double = js.native
    
    /**
      * Get width, length on the X-axis in 3D.
      */
    /* CompleteClass */
    override def getWidth(): Double = js.native
    
    /**
      * Height of the Wrapper, length on the Y-axis in 3D.
      */
    /* protected */ /* CompleteClass */
    var height: Double = js.native
    
    /**
      * Key of a Wrapper is its name.
      */
    /* CompleteClass */
    override def key(): js.Any = js.native
    
    /**
      * Length of the Wrapper, length on the Z-axis in 3D.
      */
    /* protected */ /* CompleteClass */
    var length: Double = js.native
    
    /**
      * <p> Name, key of the Wrapper. </p>
      *
      * <p> The name represents a type of Wrapper and identifies the Wrapper. </p>
      */
    /* protected */ /* CompleteClass */
    var name: String = js.native
    
    /**
      * Price, cost of using an Wrapper.
      */
    /* protected */ /* CompleteClass */
    var price: Double = js.native
    
    /**
      * Set height, length on the Y-axis in 3D.
      */
    /* CompleteClass */
    override def setHeight(`val`: Double): Unit = js.native
    
    /**
      * Set length, length on the Z-axis in 3D.
      */
    /* CompleteClass */
    override def setLength(`val`: Double): Unit = js.native
    
    /**
      * Set name.
      */
    /* CompleteClass */
    override def setName(`val`: String): Unit = js.native
    
    /**
      * Set price.
      */
    /* CompleteClass */
    override def setPrice(`val`: Double): Unit = js.native
    
    /**
      * Set thickness.
      */
    /* CompleteClass */
    override def setThickness(`val`: Double): Unit = js.native
    
    /**
      * Set width, length on the X-axis in 3D.
      */
    /* CompleteClass */
    override def setWidth(`val`: Double): Unit = js.native
    
    /**
      * <p> Thickness, margin of a Wrapper causes shrinkness of containable volume. </p>
      *
      * <p> The thickness reduces each dimension's containable size (dimension - 2*thickness),
      * so finally, it reduces total containable volume (-8 * thickness^3). </p>
      */
    /* protected */ /* CompleteClass */
    var thickness: Double = js.native
    
    /**
      * @inheritdoc
      */
    /* CompleteClass */
    override def toXML(): js.Any = js.native
    
    /**
      * Width of the Wrapper, length on the X-axis in 3D.
      */
    /* protected */ /* CompleteClass */
    var width: Double = js.native
  }
  
  @JSImport("3d-bin-packing", "WrapperArray")
  @js.native
  /**
    * Default Constructor.
    */
  class WrapperArray ()
    extends StObject
       with typings.`3dBinPacking`.bws.packer.WrapperArray {
    
    /**
      * @inheritdoc
      */
    /* CompleteClass */
    override def CHILD_TAG(): String = js.native
    
    /**
      * @inheritdoc
      */
    /* CompleteClass */
    override def TAG(): String = js.native
    
    /**
      * @inheritdoc
      */
    /* CompleteClass */
    override def createChild(
      xml: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ js.Any
    ): typings.`3dBinPacking`.bws.packer.Wrapper = js.native
    
    /**
      * Get (calculate) price.
      */
    /* CompleteClass */
    override def getPrice(): Double = js.native
    
    /**
      * Get (calculate) utilization rate.
      */
    /* CompleteClass */
    override def getUtilization(): Double = js.native
  }
  
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
    extends StObject
       with typings.`3dBinPacking`.bws.packer.WrapperGroup {
    /**
      * Construct from a sample.
      *
      * @param sample A sample, standard of the WrapperGroup.
      */
    def this(sample: typings.`3dBinPacking`.bws.packer.Wrapper) = this()
    /**
      * Copy Constructor.
      */
    def this(wrapperGroup: typings.`3dBinPacking`.bws.packer.WrapperGroup) = this()
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
    
    /**
      * @inheritdoc
      */
    /* CompleteClass */
    override def CHILD_TAG(): String = js.native
    
    /**
      * @inheritdoc
      */
    /* CompleteClass */
    override def TAG(): String = js.native
    
    /**
      * @inheritdoc
      */
    /* CompleteClass */
    override def createChild(
      xml: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ js.Any
    ): typings.`3dBinPacking`.bws.packer.Wrapper = js.native
    
    /**
      * Get (calculate) price.
      */
    /* CompleteClass */
    override def getPrice(): Double = js.native
    
    /**
      * Get (calculate) utilization rate.
      */
    /* CompleteClass */
    override def getUtilization(): Double = js.native
  }
}
