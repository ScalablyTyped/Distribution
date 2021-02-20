package typings.`3dBinPacking`

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bws {
  
  object packer {
    
    @js.native
    trait GAWrapperArray extends WrapperArray {
      
      /* private */ def constructResult(): js.Any = js.native
      
      /**
        * @brief Get optimization result.
        *
        * @return result map.
        */
      def getResult(): js.Any = js.native
      
      var instanceArray: InstanceArray = js.native
      
      def less(obj: GAWrapperArray): Boolean = js.native
      
      var price: js.Any = js.native
      
      var result: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.HashMap<string, WrapperGroup> */ js.Any = js.native
      
      /**
        * @brief Validity of this sequence list.
        */
      var valid: js.Any = js.native
    }
    object GAWrapperArray {
      
      @scala.inline
      def apply(
        CHILD_TAG: () => String,
        TAG: () => String,
        constructResult: () => js.Any,
        createChild: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ js.Any => Wrapper,
        getPrice: () => Double,
        getResult: () => js.Any,
        getUtilization: () => Double,
        instanceArray: InstanceArray,
        less: GAWrapperArray => Boolean,
        price: js.Any,
        result: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.HashMap<string, WrapperGroup> */ js.Any,
        valid: js.Any
      ): GAWrapperArray = {
        val __obj = js.Dynamic.literal(CHILD_TAG = js.Any.fromFunction0(CHILD_TAG), TAG = js.Any.fromFunction0(TAG), constructResult = js.Any.fromFunction0(constructResult), createChild = js.Any.fromFunction1(createChild), getPrice = js.Any.fromFunction0(getPrice), getResult = js.Any.fromFunction0(getResult), getUtilization = js.Any.fromFunction0(getUtilization), instanceArray = instanceArray.asInstanceOf[js.Any], less = js.Any.fromFunction1(less), price = price.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
        __obj.asInstanceOf[GAWrapperArray]
      }
      
      @scala.inline
      implicit class GAWrapperArrayMutableBuilder[Self <: GAWrapperArray] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setConstructResult(value: () => js.Any): Self = StObject.set(x, "constructResult", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetResult(value: () => js.Any): Self = StObject.set(x, "getResult", js.Any.fromFunction0(value))
        
        @scala.inline
        def setInstanceArray(value: InstanceArray): Self = StObject.set(x, "instanceArray", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLess(value: GAWrapperArray => Boolean): Self = StObject.set(x, "less", js.Any.fromFunction1(value))
        
        @scala.inline
        def setPrice(value: js.Any): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResult(
          value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.HashMap<string, WrapperGroup> */ js.Any
        ): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValid(value: js.Any): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * An interface of physical 3D-instances.
      *
      * @author Jeongho Nam <http://samchon.org>
      */
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protocol.IEntity * / any */ @js.native
    trait Instance extends StObject {
      
      /**
        * <p> A type, identifier of derived class. </p>
        *
        * <h4> Derived types </h4>
        * <ul>
        *	<li> {@link Product product} </li>
        *	<li> {@link Wrapper wrapper} </li>
        * <ul>
        */
      def TYPE(): String = js.native
      
      /**
        * Get height, length on the Y-axis in 3D.
        */
      def getHeight(): Double = js.native
      
      /**
        * Get length, length on the Z-axis in 3D.
        */
      def getLength(): Double = js.native
      
      /**
        * Get name.
        */
      def getName(): String = js.native
      
      /**
        * Get (calculate) volume.
        *
        * @return width x height x length
        */
      def getVolume(): Double = js.native
      
      /**
        * Get width, length on the X-axis in 3D.
        */
      def getWidth(): Double = js.native
      
      /**
        * Set height, length on the Y-axis in 3D.
        */
      def setHeight(`val`: Double): Unit = js.native
      
      /**
        * Set length, length on the Z-axis in 3D.
        */
      def setLength(`val`: Double): Unit = js.native
      
      /**
        * Set name.
        */
      def setName(`val`: String): Unit = js.native
      
      /**
        * Set width, length on the X-axis in 3D.
        */
      def setWidth(`val`: Double): Unit = js.native
    }
    object Instance {
      
      @scala.inline
      def apply(
        TYPE: () => String,
        getHeight: () => Double,
        getLength: () => Double,
        getName: () => String,
        getVolume: () => Double,
        getWidth: () => Double,
        setHeight: Double => Unit,
        setLength: Double => Unit,
        setName: String => Unit,
        setWidth: Double => Unit
      ): Instance = {
        val __obj = js.Dynamic.literal(TYPE = js.Any.fromFunction0(TYPE), getHeight = js.Any.fromFunction0(getHeight), getLength = js.Any.fromFunction0(getLength), getName = js.Any.fromFunction0(getName), getVolume = js.Any.fromFunction0(getVolume), getWidth = js.Any.fromFunction0(getWidth), setHeight = js.Any.fromFunction1(setHeight), setLength = js.Any.fromFunction1(setLength), setName = js.Any.fromFunction1(setName), setWidth = js.Any.fromFunction1(setWidth))
        __obj.asInstanceOf[Instance]
      }
      
      @scala.inline
      implicit class InstanceMutableBuilder[Self <: Instance] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setGetHeight(value: () => Double): Self = StObject.set(x, "getHeight", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetLength(value: () => Double): Self = StObject.set(x, "getLength", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetVolume(value: () => Double): Self = StObject.set(x, "getVolume", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetWidth(value: () => Double): Self = StObject.set(x, "getWidth", js.Any.fromFunction0(value))
        
        @scala.inline
        def setSetHeight(value: Double => Unit): Self = StObject.set(x, "setHeight", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetLength(value: Double => Unit): Self = StObject.set(x, "setLength", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetName(value: String => Unit): Self = StObject.set(x, "setName", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetWidth(value: Double => Unit): Self = StObject.set(x, "setWidth", js.Any.fromFunction1(value))
        
        @scala.inline
        def setTYPE(value: () => String): Self = StObject.set(x, "TYPE", js.Any.fromFunction0(value))
      }
    }
    
    /**
      * An array of Instance objects.
      *
      * @author Jeongho Nam <http://samchon.org>
      */
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protocol.EntityArray<Instance> * / any */ @js.native
    trait InstanceArray extends StObject {
      
      /**
        * @inheritdoc
        */
      def CHILD_TAG(): String = js.native
      
      /**
        * @inheritdoc
        */
      def TAG(): String = js.native
      
      /**
        * @inheritdoc
        */
      def createChild(
        xml: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ js.Any
      ): Instance = js.native
    }
    object InstanceArray {
      
      @scala.inline
      def apply(
        CHILD_TAG: () => String,
        TAG: () => String,
        createChild: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ js.Any => Instance
      ): InstanceArray = {
        val __obj = js.Dynamic.literal(CHILD_TAG = js.Any.fromFunction0(CHILD_TAG), TAG = js.Any.fromFunction0(TAG), createChild = js.Any.fromFunction1(createChild))
        __obj.asInstanceOf[InstanceArray]
      }
      
      @scala.inline
      implicit class InstanceArrayMutableBuilder[Self <: InstanceArray] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCHILD_TAG(value: () => String): Self = StObject.set(x, "CHILD_TAG", js.Any.fromFunction0(value))
        
        @scala.inline
        def setCreateChild(
          value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ js.Any => Instance
        ): Self = StObject.set(x, "createChild", js.Any.fromFunction1(value))
        
        @scala.inline
        def setTAG(value: () => String): Self = StObject.set(x, "TAG", js.Any.fromFunction0(value))
      }
    }
    
    /**
      * <p> A repeated Instance. </p>
      *
      * <p> InstanceForm is an utility class for repeated {@link Instance}. It is designed for shrinking
      * volume of network message I/O by storing {@link count repeated count}. </p>
      *
      * @author Jeongho Nam <http://samchon.org>
      */
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protocol.Entity * / any */ @js.native
    trait InstanceForm extends StObject {
      
      @JSName("$count")
      var $count: String = js.native
      
      @JSName("$height")
      var $height: String = js.native
      
      @JSName("$length")
      var $length: String = js.native
      
      @JSName("$name")
      var $name: String = js.native
      
      @JSName("$width")
      var $width: String = js.native
      
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
        * Repeated count of the {@link instance}.
        */
      var count: js.Any = js.native
      
      /* private */ def createInstance(xml: js.Any): js.Any = js.native
      
      def getCount(): Double = js.native
      
      def getInstance(): Instance = js.native
      
      /**
        * A duplicated Instance.
        */
      var instance: js.Any = js.native
      
      def key(): js.Any = js.native
      
      def setCount(`val`: Double): Unit = js.native
      
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
      def toInstanceArray(): InstanceArray = js.native
      
      /**
        * @inheritdoc
        */
      def toXML(): js.Any = js.native
    }
    object InstanceForm {
      
      @scala.inline
      def apply(
        $count: String,
        $height: String,
        $length: String,
        $name: String,
        $width: String,
        TAG: () => String,
        construct: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ js.Any => Unit,
        count: js.Any,
        createInstance: js.Any => js.Any,
        getCount: () => Double,
        getInstance: () => Instance,
        instance: js.Any,
        key: () => js.Any,
        setCount: Double => Unit,
        toInstanceArray: () => InstanceArray,
        toXML: () => js.Any
      ): InstanceForm = {
        val __obj = js.Dynamic.literal($count = $count.asInstanceOf[js.Any], $height = $height.asInstanceOf[js.Any], $length = $length.asInstanceOf[js.Any], $name = $name.asInstanceOf[js.Any], $width = $width.asInstanceOf[js.Any], TAG = js.Any.fromFunction0(TAG), construct = js.Any.fromFunction1(construct), count = count.asInstanceOf[js.Any], createInstance = js.Any.fromFunction1(createInstance), getCount = js.Any.fromFunction0(getCount), getInstance = js.Any.fromFunction0(getInstance), instance = instance.asInstanceOf[js.Any], key = js.Any.fromFunction0(key), setCount = js.Any.fromFunction1(setCount), toInstanceArray = js.Any.fromFunction0(toInstanceArray), toXML = js.Any.fromFunction0(toXML))
        __obj.asInstanceOf[InstanceForm]
      }
      
      @scala.inline
      implicit class InstanceFormMutableBuilder[Self <: InstanceForm] (val x: Self) extends AnyVal {
        
        @scala.inline
        def set$count(value: String): Self = StObject.set(x, "$count", value.asInstanceOf[js.Any])
        
        @scala.inline
        def set$height(value: String): Self = StObject.set(x, "$height", value.asInstanceOf[js.Any])
        
        @scala.inline
        def set$length(value: String): Self = StObject.set(x, "$length", value.asInstanceOf[js.Any])
        
        @scala.inline
        def set$name(value: String): Self = StObject.set(x, "$name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def set$width(value: String): Self = StObject.set(x, "$width", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setConstruct(
          value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ js.Any => Unit
        ): Self = StObject.set(x, "construct", js.Any.fromFunction1(value))
        
        @scala.inline
        def setCount(value: js.Any): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCreateInstance(value: js.Any => js.Any): Self = StObject.set(x, "createInstance", js.Any.fromFunction1(value))
        
        @scala.inline
        def setGetCount(value: () => Double): Self = StObject.set(x, "getCount", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetInstance(value: () => Instance): Self = StObject.set(x, "getInstance", js.Any.fromFunction0(value))
        
        @scala.inline
        def setInstance(value: js.Any): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKey(value: () => js.Any): Self = StObject.set(x, "key", js.Any.fromFunction0(value))
        
        @scala.inline
        def setSetCount(value: Double => Unit): Self = StObject.set(x, "setCount", js.Any.fromFunction1(value))
        
        @scala.inline
        def setTAG(value: () => String): Self = StObject.set(x, "TAG", js.Any.fromFunction0(value))
        
        @scala.inline
        def setToInstanceArray(value: () => InstanceArray): Self = StObject.set(x, "toInstanceArray", js.Any.fromFunction0(value))
        
        @scala.inline
        def setToXML(value: () => js.Any): Self = StObject.set(x, "toXML", js.Any.fromFunction0(value))
      }
    }
    
    /**
      * An array of {@link InstanceForm} objects.
      *
      * @author Jeongho Nam <http://samchon.org>
      */
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protocol.EntityArrayCollection<InstanceForm> * / any */ @js.native
    trait InstanceFormArray extends StObject {
      
      def CHILD_TAG(): String = js.native
      
      def TAG(): String = js.native
      
      def createChild(
        xml: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ js.Any
      ): InstanceForm = js.native
      
      /**
        * Convert {@link InstanceForm} objects to {@link InstanceArray}.
        *
        * @return An array of instance containing repeated instances in {@link InstanceForm} objects.
        */
      def toInstanceArray(): InstanceArray = js.native
    }
    object InstanceFormArray {
      
      @scala.inline
      def apply(
        CHILD_TAG: () => String,
        TAG: () => String,
        createChild: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ js.Any => InstanceForm,
        toInstanceArray: () => InstanceArray
      ): InstanceFormArray = {
        val __obj = js.Dynamic.literal(CHILD_TAG = js.Any.fromFunction0(CHILD_TAG), TAG = js.Any.fromFunction0(TAG), createChild = js.Any.fromFunction1(createChild), toInstanceArray = js.Any.fromFunction0(toInstanceArray))
        __obj.asInstanceOf[InstanceFormArray]
      }
      
      @scala.inline
      implicit class InstanceFormArrayMutableBuilder[Self <: InstanceFormArray] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCHILD_TAG(value: () => String): Self = StObject.set(x, "CHILD_TAG", js.Any.fromFunction0(value))
        
        @scala.inline
        def setCreateChild(
          value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ js.Any => InstanceForm
        ): Self = StObject.set(x, "createChild", js.Any.fromFunction1(value))
        
        @scala.inline
        def setTAG(value: () => String): Self = StObject.set(x, "TAG", js.Any.fromFunction0(value))
        
        @scala.inline
        def setToInstanceArray(value: () => InstanceArray): Self = StObject.set(x, "toInstanceArray", js.Any.fromFunction0(value))
      }
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
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protocol.Entity * / any */ @js.native
    trait Packer extends StObject {
      
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
        * Instances trying to pack into the wrapper.
        */
      var instanceArray: InstanceArray = js.native
      
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
      
      /**
        * Candidate wrappers who can contain instances.
        */
      var wrapperArray: WrapperArray = js.native
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
      implicit class PackerMutableBuilder[Self <: Packer] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setConstruct(
          value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ js.Any => Unit
        ): Self = StObject.set(x, "construct", js.Any.fromFunction1(value))
        
        @scala.inline
        def setGetInstanceArray(value: () => InstanceArray): Self = StObject.set(x, "getInstanceArray", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetWrapperArray(value: () => WrapperArray): Self = StObject.set(x, "getWrapperArray", js.Any.fromFunction0(value))
        
        @scala.inline
        def setInitGenes(value: () => GAWrapperArray): Self = StObject.set(x, "initGenes", js.Any.fromFunction0(value))
        
        @scala.inline
        def setInstanceArray(value: InstanceArray): Self = StObject.set(x, "instanceArray", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOptimize(value: () => WrapperArray): Self = StObject.set(x, "optimize", js.Any.fromFunction0(value))
        
        @scala.inline
        def setRepack(value: WrapperArray => WrapperArray): Self = StObject.set(x, "repack", js.Any.fromFunction1(value))
        
        @scala.inline
        def setTAG(value: () => String): Self = StObject.set(x, "TAG", js.Any.fromFunction0(value))
        
        @scala.inline
        def setToXML(value: () => js.Any): Self = StObject.set(x, "toXML", js.Any.fromFunction0(value))
        
        @scala.inline
        def setWrapperArray(value: WrapperArray): Self = StObject.set(x, "wrapperArray", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * Bridge of {@link Packer} for {@link InstanceForm repeated instances}.
      *
      * @author Jeongho Nam <http://samchon.org>
      */
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protocol.Entity * / any */ @js.native
    trait PackerForm extends StObject {
      
      def TAG(): String = js.native
      
      def construct(
        xml: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ js.Any
      ): Unit = js.native
      
      def getInstanceFormArray(): InstanceFormArray = js.native
      
      def getWrapperArray(): WrapperArray = js.native
      
      /**
        * Form of Instances to pack.
        */
      var instanceFormArray: js.Any = js.native
      
      def optimize(): WrapperArray = js.native
      
      def toPacker(): Packer = js.native
      
      def toXML(): js.Any = js.native
      
      /**
        * Type of Wrappers to be used.
        */
      var wrapperArray: js.Any = js.native
    }
    object PackerForm {
      
      @scala.inline
      def apply(
        TAG: () => String,
        construct: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ js.Any => Unit,
        getInstanceFormArray: () => InstanceFormArray,
        getWrapperArray: () => WrapperArray,
        instanceFormArray: js.Any,
        optimize: () => WrapperArray,
        toPacker: () => Packer,
        toXML: () => js.Any,
        wrapperArray: js.Any
      ): PackerForm = {
        val __obj = js.Dynamic.literal(TAG = js.Any.fromFunction0(TAG), construct = js.Any.fromFunction1(construct), getInstanceFormArray = js.Any.fromFunction0(getInstanceFormArray), getWrapperArray = js.Any.fromFunction0(getWrapperArray), instanceFormArray = instanceFormArray.asInstanceOf[js.Any], optimize = js.Any.fromFunction0(optimize), toPacker = js.Any.fromFunction0(toPacker), toXML = js.Any.fromFunction0(toXML), wrapperArray = wrapperArray.asInstanceOf[js.Any])
        __obj.asInstanceOf[PackerForm]
      }
      
      @scala.inline
      implicit class PackerFormMutableBuilder[Self <: PackerForm] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setConstruct(
          value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ js.Any => Unit
        ): Self = StObject.set(x, "construct", js.Any.fromFunction1(value))
        
        @scala.inline
        def setGetInstanceFormArray(value: () => InstanceFormArray): Self = StObject.set(x, "getInstanceFormArray", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetWrapperArray(value: () => WrapperArray): Self = StObject.set(x, "getWrapperArray", js.Any.fromFunction0(value))
        
        @scala.inline
        def setInstanceFormArray(value: js.Any): Self = StObject.set(x, "instanceFormArray", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOptimize(value: () => WrapperArray): Self = StObject.set(x, "optimize", js.Any.fromFunction0(value))
        
        @scala.inline
        def setTAG(value: () => String): Self = StObject.set(x, "TAG", js.Any.fromFunction0(value))
        
        @scala.inline
        def setToPacker(value: () => Packer): Self = StObject.set(x, "toPacker", js.Any.fromFunction0(value))
        
        @scala.inline
        def setToXML(value: () => js.Any): Self = StObject.set(x, "toXML", js.Any.fromFunction0(value))
        
        @scala.inline
        def setWrapperArray(value: js.Any): Self = StObject.set(x, "wrapperArray", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * A product.
      *
      * @author Jeongho Nam <http://samchon.org>
      */
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protocol.Entity * / any */ @js.native
    trait Product extends Instance {
      
      /**
        * @inheritdoc
        */
      def TAG(): String = js.native
      
      /**
        * Height of the Product, length on the Y-axis in 3D.
        */
      var height: Double = js.native
      
      /**
        * Key of a Product is its name.
        */
      def key(): js.Any = js.native
      
      /**
        * Length of the Product, length on the Z-axis in 3D.
        */
      var length: Double = js.native
      
      /**
        * <p> Name, key of the Product. </p>
        *
        * <p> The name must be unique because a name identifies a {@link Product}. </p>
        */
      var name: String = js.native
      
      /**
        * @inheritdoc
        */
      def toXML(): js.Any = js.native
      
      /**
        * Width of the Product, length on the X-axis in 3D.
        */
      var width: Double = js.native
    }
    object Product {
      
      @scala.inline
      def apply(
        TAG: () => String,
        TYPE: () => String,
        getHeight: () => Double,
        getLength: () => Double,
        getName: () => String,
        getVolume: () => Double,
        getWidth: () => Double,
        height: Double,
        key: () => js.Any,
        length: Double,
        name: String,
        setHeight: Double => Unit,
        setLength: Double => Unit,
        setName: String => Unit,
        setWidth: Double => Unit,
        toXML: () => js.Any,
        width: Double
      ): Product = {
        val __obj = js.Dynamic.literal(TAG = js.Any.fromFunction0(TAG), TYPE = js.Any.fromFunction0(TYPE), getHeight = js.Any.fromFunction0(getHeight), getLength = js.Any.fromFunction0(getLength), getName = js.Any.fromFunction0(getName), getVolume = js.Any.fromFunction0(getVolume), getWidth = js.Any.fromFunction0(getWidth), height = height.asInstanceOf[js.Any], key = js.Any.fromFunction0(key), length = length.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], setHeight = js.Any.fromFunction1(setHeight), setLength = js.Any.fromFunction1(setLength), setName = js.Any.fromFunction1(setName), setWidth = js.Any.fromFunction1(setWidth), toXML = js.Any.fromFunction0(toXML), width = width.asInstanceOf[js.Any])
        __obj.asInstanceOf[Product]
      }
      
      @scala.inline
      implicit class ProductMutableBuilder[Self <: Product] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKey(value: () => js.Any): Self = StObject.set(x, "key", js.Any.fromFunction0(value))
        
        @scala.inline
        def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTAG(value: () => String): Self = StObject.set(x, "TAG", js.Any.fromFunction0(value))
        
        @scala.inline
        def setToXML(value: () => js.Any): Self = StObject.set(x, "toXML", js.Any.fromFunction0(value))
        
        @scala.inline
        def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      }
    }
    
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
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protocol.Entity * / any */ @js.native
    trait Wrap extends StObject {
      
      @JSName("$instanceName")
      val $instanceName: String = js.native
      
      @JSName("$layoutScale")
      val $layoutScale: String = js.native
      
      @JSName("$position")
      val $position: String = js.native
      
      /**
        * @inheritdoc
        */
      def TAG(): String = js.native
      
      /**
        * @brief Orientation change is occured in level of the packer.
        *
        * @details orientation Packer's new orientation.
        */
      def changeWrapperOrientation(orientation: Double): Unit = js.native
      
      /**
        * @inheritdoc
        */
      def construct(
        xml: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ js.Any
      ): Unit = js.native
      
      /**
        * Factory method of wrapped Instance.
        *
        * @param type Type of contained Instance's type.
        */
      /* protected */ def createInstance(`type`: String): Instance = js.native
      
      /**
        * @brief Estimate orientation by given size.
        *
        * @param width Width by placement.
        * @param height Height by placement.
        * @param length Length by placement.
        */
      def estimateOrientation(width: Double, height: Double, length: Double): Unit = js.native
      
      /**
        * Get instance.
        */
      def getInstance(): Instance = js.native
      
      /**
        * Get height.
        */
      def getLayoutHeight(): Double = js.native
      
      /**
        * Get width.
        */
      def getLayoutWidth(): Double = js.native
      
      /**
        * Get length.
        */
      def getLength(): Double = js.native
      
      /**
        * Get orientation.
        */
      def getOrientation(): Double = js.native
      
      /**
        * Get volume.
        */
      def getVolume(): Double = js.native
      
      /**
        * Get wrapper.
        */
      def getWrapper(): Wrapper = js.native
      
      /**
        * Get x.
        */
      def getX(): Double = js.native
      
      /**
        * Get y.
        */
      def getY(): Double = js.native
      
      /**
        * Get z.
        */
      def getZ(): Double = js.native
      
      /**
        * An instance wrapped into the {@link wrapper}.
        */
      var instance: Instance = js.native
      
      /**
        * Placement orientation of wrapped {@link instance}.
        */
      var orientation: Double = js.native
      
      /**
        * Set orientation.
        *
        * @param orientation Orientation code (1 to 6).
        */
      def setOrientation(orientation: Double): Unit = js.native
      
      /**
        * Set position.
        *
        * @param x Coordinate-X of the instance placement in the wrapper.
        * @param y Coordinate-Y of the instance placement in the wrapper.
        * @param z Coordinate-Z of the instance placement in the wrapper.
        */
      def setPosition(x: Double, y: Double, z: Double): Unit = js.native
      
      /**
        * @inheritdoc
        */
      def toXML(): js.Any = js.native
      
      /**
        * A wrapper wrapping the {@link instance}.
        */
      var wrapper: Wrapper = js.native
      
      /**
        * Coordinate-X of the instance placement in the wrapper.
        */
      var x: Double = js.native
      
      /**
        * Coordinate-Y of the instance placement in the wrapper.
        */
      var y: Double = js.native
      
      /**
        * Coordinate-Z of the instance placement in the wrapper.
        */
      var z: Double = js.native
    }
    object Wrap {
      
      @scala.inline
      def apply(
        $instanceName: String,
        $layoutScale: String,
        $position: String,
        TAG: () => String,
        changeWrapperOrientation: Double => Unit,
        construct: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ js.Any => Unit,
        createInstance: String => Instance,
        estimateOrientation: (Double, Double, Double) => Unit,
        getInstance: () => Instance,
        getLayoutHeight: () => Double,
        getLayoutWidth: () => Double,
        getLength: () => Double,
        getOrientation: () => Double,
        getVolume: () => Double,
        getWrapper: () => Wrapper,
        getX: () => Double,
        getY: () => Double,
        getZ: () => Double,
        instance: Instance,
        orientation: Double,
        setOrientation: Double => Unit,
        setPosition: (Double, Double, Double) => Unit,
        toXML: () => js.Any,
        wrapper: Wrapper,
        x: Double,
        y: Double,
        z: Double
      ): Wrap = {
        val __obj = js.Dynamic.literal($instanceName = $instanceName.asInstanceOf[js.Any], $layoutScale = $layoutScale.asInstanceOf[js.Any], $position = $position.asInstanceOf[js.Any], TAG = js.Any.fromFunction0(TAG), changeWrapperOrientation = js.Any.fromFunction1(changeWrapperOrientation), construct = js.Any.fromFunction1(construct), createInstance = js.Any.fromFunction1(createInstance), estimateOrientation = js.Any.fromFunction3(estimateOrientation), getInstance = js.Any.fromFunction0(getInstance), getLayoutHeight = js.Any.fromFunction0(getLayoutHeight), getLayoutWidth = js.Any.fromFunction0(getLayoutWidth), getLength = js.Any.fromFunction0(getLength), getOrientation = js.Any.fromFunction0(getOrientation), getVolume = js.Any.fromFunction0(getVolume), getWrapper = js.Any.fromFunction0(getWrapper), getX = js.Any.fromFunction0(getX), getY = js.Any.fromFunction0(getY), getZ = js.Any.fromFunction0(getZ), instance = instance.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], setOrientation = js.Any.fromFunction1(setOrientation), setPosition = js.Any.fromFunction3(setPosition), toXML = js.Any.fromFunction0(toXML), wrapper = wrapper.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
        __obj.asInstanceOf[Wrap]
      }
      
      @scala.inline
      implicit class WrapMutableBuilder[Self <: Wrap] (val x: Self) extends AnyVal {
        
        @scala.inline
        def set$instanceName(value: String): Self = StObject.set(x, "$instanceName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def set$layoutScale(value: String): Self = StObject.set(x, "$layoutScale", value.asInstanceOf[js.Any])
        
        @scala.inline
        def set$position(value: String): Self = StObject.set(x, "$position", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setChangeWrapperOrientation(value: Double => Unit): Self = StObject.set(x, "changeWrapperOrientation", js.Any.fromFunction1(value))
        
        @scala.inline
        def setConstruct(
          value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ js.Any => Unit
        ): Self = StObject.set(x, "construct", js.Any.fromFunction1(value))
        
        @scala.inline
        def setCreateInstance(value: String => Instance): Self = StObject.set(x, "createInstance", js.Any.fromFunction1(value))
        
        @scala.inline
        def setEstimateOrientation(value: (Double, Double, Double) => Unit): Self = StObject.set(x, "estimateOrientation", js.Any.fromFunction3(value))
        
        @scala.inline
        def setGetInstance(value: () => Instance): Self = StObject.set(x, "getInstance", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetLayoutHeight(value: () => Double): Self = StObject.set(x, "getLayoutHeight", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetLayoutWidth(value: () => Double): Self = StObject.set(x, "getLayoutWidth", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetLength(value: () => Double): Self = StObject.set(x, "getLength", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetOrientation(value: () => Double): Self = StObject.set(x, "getOrientation", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetVolume(value: () => Double): Self = StObject.set(x, "getVolume", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetWrapper(value: () => Wrapper): Self = StObject.set(x, "getWrapper", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetX(value: () => Double): Self = StObject.set(x, "getX", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetY(value: () => Double): Self = StObject.set(x, "getY", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetZ(value: () => Double): Self = StObject.set(x, "getZ", js.Any.fromFunction0(value))
        
        @scala.inline
        def setInstance(value: Instance): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOrientation(value: Double): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSetOrientation(value: Double => Unit): Self = StObject.set(x, "setOrientation", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetPosition(value: (Double, Double, Double) => Unit): Self = StObject.set(x, "setPosition", js.Any.fromFunction3(value))
        
        @scala.inline
        def setTAG(value: () => String): Self = StObject.set(x, "TAG", js.Any.fromFunction0(value))
        
        @scala.inline
        def setToXML(value: () => js.Any): Self = StObject.set(x, "toXML", js.Any.fromFunction0(value))
        
        @scala.inline
        def setWrapper(value: Wrapper): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * A wrapper wrapping instances.
      *
      * @author Jeongho Nam <http://samchon.org>
      */
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protocol.EntityDeque<Wrap> * / any */ @js.native
    trait Wrapper extends Instance {
      
      @JSName("$height")
      var $height: String = js.native
      
      @JSName("$length")
      var $length: String = js.native
      
      @JSName("$name")
      var $name: String = js.native
      
      @JSName("$price")
      var $price: String = js.native
      
      @JSName("$scale")
      val $scale: String = js.native
      
      @JSName("$spaceUtilization")
      val $spaceUtilization: String = js.native
      
      @JSName("$thickness")
      var $thickness: String = js.native
      
      @JSName("$width")
      var $width: String = js.native
      
      /**
        * @inheritdoc
        */
      def CHILD_TAG(): String = js.native
      
      /**
        * @inheritdoc
        */
      def TAG(): String = js.native
      
      /**
        * <p> Wrapper is enough greater? </p>
        *
        * <p> Test whether the Wrapper is enough greater than an Instance to contain. </p>
        *
        * @param instance An Instance to test.
        * @return Enough greater or not.
        */
      def containable(instance: Instance): Boolean = js.native
      
      /**
        * @inheritdoc
        */
      def createChild(
        xml: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ js.Any
      ): Wrap = js.native
      
      def equals(obj: Wrapper): Boolean = js.native
      
      /**
        * <p> Get (calculate) containable height, length on the Y-axis in 3D. </p>
        *
        * <p> Calculates containable height considering the {@link thickness}. </p>
        *
        * @return height - (2 x thickness)
        */
      def getContainableHeight(): Double = js.native
      
      /**
        * <p> Get (calculate) containable length, length on the Z-axis in 3D. </p>
        *
        * <p> Calculates containable length considering the {@link thickness}. </p>
        *
        * @return length - (2 x thickness)
        */
      def getContainableLength(): Double = js.native
      
      /**
        * <p> Get (calculate) containable volume. </p>
        *
        * <p> Calculates containable volume considering the {@link thickness}. </p>
        *
        * @return volume - {(2 x thickness) ^ 3}
        */
      def getContainableVolume(): Double = js.native
      
      /**
        * <p> Get (calculate) containable width, length on the X-axis in 3D. </p>
        *
        * <p> Calculates containable width considering the {@link thickness}. </p>
        *
        * @return width - (2 x thickness)
        */
      def getContainableWidth(): Double = js.native
      
      /**
        * Get price.
        */
      def getPrice(): Double = js.native
      
      /**
        * Get thickness.
        */
      def getThickness(): Double = js.native
      
      /**
        * Get utilization ratio of containable volume.
        *
        * @return utilization ratio.
        */
      def getUtilization(): Double = js.native
      
      /**
        * Height of the Wrapper, length on the Y-axis in 3D.
        */
      var height: Double = js.native
      
      /**
        * Key of a Wrapper is its name.
        */
      def key(): js.Any = js.native
      
      /**
        * Length of the Wrapper, length on the Z-axis in 3D.
        */
      var length: Double = js.native
      
      /**
        * <p> Name, key of the Wrapper. </p>
        *
        * <p> The name represents a type of Wrapper and identifies the Wrapper. </p>
        */
      var name: String = js.native
      
      /**
        * Price, cost of using an Wrapper.
        */
      var price: Double = js.native
      
      /**
        * Set price.
        */
      def setPrice(`val`: Double): Unit = js.native
      
      /**
        * Set thickness.
        */
      def setThickness(`val`: Double): Unit = js.native
      
      /**
        * <p> Thickness, margin of a Wrapper causes shrinkness of containable volume. </p>
        *
        * <p> The thickness reduces each dimension's containable size (dimension - 2*thickness),
        * so finally, it reduces total containable volume (-8 * thickness^3). </p>
        */
      var thickness: Double = js.native
      
      /**
        * @inheritdoc
        */
      def toXML(): js.Any = js.native
      
      /**
        * Width of the Wrapper, length on the X-axis in 3D.
        */
      var width: Double = js.native
    }
    object Wrapper {
      
      @scala.inline
      def apply(
        $height: String,
        $length: String,
        $name: String,
        $price: String,
        $scale: String,
        $spaceUtilization: String,
        $thickness: String,
        $width: String,
        CHILD_TAG: () => String,
        TAG: () => String,
        TYPE: () => String,
        containable: Instance => Boolean,
        createChild: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ js.Any => Wrap,
        equals_ : Wrapper => Boolean,
        getContainableHeight: () => Double,
        getContainableLength: () => Double,
        getContainableVolume: () => Double,
        getContainableWidth: () => Double,
        getHeight: () => Double,
        getLength: () => Double,
        getName: () => String,
        getPrice: () => Double,
        getThickness: () => Double,
        getUtilization: () => Double,
        getVolume: () => Double,
        getWidth: () => Double,
        height: Double,
        key: () => js.Any,
        length: Double,
        name: String,
        price: Double,
        setHeight: Double => Unit,
        setLength: Double => Unit,
        setName: String => Unit,
        setPrice: Double => Unit,
        setThickness: Double => Unit,
        setWidth: Double => Unit,
        thickness: Double,
        toXML: () => js.Any,
        width: Double
      ): Wrapper = {
        val __obj = js.Dynamic.literal($height = $height.asInstanceOf[js.Any], $length = $length.asInstanceOf[js.Any], $name = $name.asInstanceOf[js.Any], $price = $price.asInstanceOf[js.Any], $scale = $scale.asInstanceOf[js.Any], $spaceUtilization = $spaceUtilization.asInstanceOf[js.Any], $thickness = $thickness.asInstanceOf[js.Any], $width = $width.asInstanceOf[js.Any], CHILD_TAG = js.Any.fromFunction0(CHILD_TAG), TAG = js.Any.fromFunction0(TAG), TYPE = js.Any.fromFunction0(TYPE), containable = js.Any.fromFunction1(containable), createChild = js.Any.fromFunction1(createChild), getContainableHeight = js.Any.fromFunction0(getContainableHeight), getContainableLength = js.Any.fromFunction0(getContainableLength), getContainableVolume = js.Any.fromFunction0(getContainableVolume), getContainableWidth = js.Any.fromFunction0(getContainableWidth), getHeight = js.Any.fromFunction0(getHeight), getLength = js.Any.fromFunction0(getLength), getName = js.Any.fromFunction0(getName), getPrice = js.Any.fromFunction0(getPrice), getThickness = js.Any.fromFunction0(getThickness), getUtilization = js.Any.fromFunction0(getUtilization), getVolume = js.Any.fromFunction0(getVolume), getWidth = js.Any.fromFunction0(getWidth), height = height.asInstanceOf[js.Any], key = js.Any.fromFunction0(key), length = length.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], setHeight = js.Any.fromFunction1(setHeight), setLength = js.Any.fromFunction1(setLength), setName = js.Any.fromFunction1(setName), setPrice = js.Any.fromFunction1(setPrice), setThickness = js.Any.fromFunction1(setThickness), setWidth = js.Any.fromFunction1(setWidth), thickness = thickness.asInstanceOf[js.Any], toXML = js.Any.fromFunction0(toXML), width = width.asInstanceOf[js.Any])
        __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
        __obj.asInstanceOf[Wrapper]
      }
      
      @scala.inline
      implicit class WrapperMutableBuilder[Self <: Wrapper] (val x: Self) extends AnyVal {
        
        @scala.inline
        def set$height(value: String): Self = StObject.set(x, "$height", value.asInstanceOf[js.Any])
        
        @scala.inline
        def set$length(value: String): Self = StObject.set(x, "$length", value.asInstanceOf[js.Any])
        
        @scala.inline
        def set$name(value: String): Self = StObject.set(x, "$name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def set$price(value: String): Self = StObject.set(x, "$price", value.asInstanceOf[js.Any])
        
        @scala.inline
        def set$scale(value: String): Self = StObject.set(x, "$scale", value.asInstanceOf[js.Any])
        
        @scala.inline
        def set$spaceUtilization(value: String): Self = StObject.set(x, "$spaceUtilization", value.asInstanceOf[js.Any])
        
        @scala.inline
        def set$thickness(value: String): Self = StObject.set(x, "$thickness", value.asInstanceOf[js.Any])
        
        @scala.inline
        def set$width(value: String): Self = StObject.set(x, "$width", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCHILD_TAG(value: () => String): Self = StObject.set(x, "CHILD_TAG", js.Any.fromFunction0(value))
        
        @scala.inline
        def setContainable(value: Instance => Boolean): Self = StObject.set(x, "containable", js.Any.fromFunction1(value))
        
        @scala.inline
        def setCreateChild(
          value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ js.Any => Wrap
        ): Self = StObject.set(x, "createChild", js.Any.fromFunction1(value))
        
        @scala.inline
        def setEquals_(value: Wrapper => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
        
        @scala.inline
        def setGetContainableHeight(value: () => Double): Self = StObject.set(x, "getContainableHeight", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetContainableLength(value: () => Double): Self = StObject.set(x, "getContainableLength", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetContainableVolume(value: () => Double): Self = StObject.set(x, "getContainableVolume", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetContainableWidth(value: () => Double): Self = StObject.set(x, "getContainableWidth", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetPrice(value: () => Double): Self = StObject.set(x, "getPrice", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetThickness(value: () => Double): Self = StObject.set(x, "getThickness", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetUtilization(value: () => Double): Self = StObject.set(x, "getUtilization", js.Any.fromFunction0(value))
        
        @scala.inline
        def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKey(value: () => js.Any): Self = StObject.set(x, "key", js.Any.fromFunction0(value))
        
        @scala.inline
        def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPrice(value: Double): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSetPrice(value: Double => Unit): Self = StObject.set(x, "setPrice", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetThickness(value: Double => Unit): Self = StObject.set(x, "setThickness", js.Any.fromFunction1(value))
        
        @scala.inline
        def setTAG(value: () => String): Self = StObject.set(x, "TAG", js.Any.fromFunction0(value))
        
        @scala.inline
        def setThickness(value: Double): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setToXML(value: () => js.Any): Self = StObject.set(x, "toXML", js.Any.fromFunction0(value))
        
        @scala.inline
        def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      }
    }
    
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protocol.EntityArrayCollection<Wrapper> * / any */ @js.native
    trait WrapperArray extends StObject {
      
      /**
        * @inheritdoc
        */
      def CHILD_TAG(): String = js.native
      
      /**
        * @inheritdoc
        */
      def TAG(): String = js.native
      
      /**
        * @inheritdoc
        */
      def createChild(
        xml: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ js.Any
      ): Wrapper = js.native
      
      /**
        * Get (calculate) price.
        */
      def getPrice(): Double = js.native
      
      /**
        * Get (calculate) utilization rate.
        */
      def getUtilization(): Double = js.native
    }
    object WrapperArray {
      
      @scala.inline
      def apply(
        CHILD_TAG: () => String,
        TAG: () => String,
        createChild: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ js.Any => Wrapper,
        getPrice: () => Double,
        getUtilization: () => Double
      ): WrapperArray = {
        val __obj = js.Dynamic.literal(CHILD_TAG = js.Any.fromFunction0(CHILD_TAG), TAG = js.Any.fromFunction0(TAG), createChild = js.Any.fromFunction1(createChild), getPrice = js.Any.fromFunction0(getPrice), getUtilization = js.Any.fromFunction0(getUtilization))
        __obj.asInstanceOf[WrapperArray]
      }
      
      @scala.inline
      implicit class WrapperArrayMutableBuilder[Self <: WrapperArray] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCHILD_TAG(value: () => String): Self = StObject.set(x, "CHILD_TAG", js.Any.fromFunction0(value))
        
        @scala.inline
        def setCreateChild(
          value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ js.Any => Wrapper
        ): Self = StObject.set(x, "createChild", js.Any.fromFunction1(value))
        
        @scala.inline
        def setGetPrice(value: () => Double): Self = StObject.set(x, "getPrice", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetUtilization(value: () => Double): Self = StObject.set(x, "getUtilization", js.Any.fromFunction0(value))
        
        @scala.inline
        def setTAG(value: () => String): Self = StObject.set(x, "TAG", js.Any.fromFunction0(value))
      }
    }
    
    /**
      * A group of {@link Wrapper Wrappers} with same type.
      *
      * @author Jeongho Nam <http://samchon.org>
      */
    @js.native
    trait WrapperGroup extends WrapperArray {
      
      /**
        * <p> Allocate instance(s) to the WrapperGroup. </p>
        *
        * <p> Inspect the instance is enough small to be wrapped into an empty wrapper. If the instance
        * is enough small, registers the instance (or repeated instances) to the {@link reserveds} and
        * returns <code>true</code>. If the instance is too large to be capsuled, returns <code>false</code>. </p>
        *
        * <h4>Note</h4>
        * <p> The word <u>the instance is enough small to be wrapped into the empty wrapper</u> means
        * the instance can be contained into an empty, a new wrapper contaning nothing literally. </p>
        *
        * <p> In the method allocate(), it doesn't consider how many instances are wrapped into ordinary
        * wrapper and how much volumes are consumed.  </p>
        *
        * @param instance An Instance to allocate.
        * @param n Repeating number of the <i>instance</i>.
        *
        * @return Whether the instance is enough small to be wrapped into a (new) wrapper
        *		   of same type with the sample.
        */
      def allocate(instance: Instance): Boolean = js.native
      def allocate(instance: Instance, n: Double): Boolean = js.native
      
      /**
        * Allocated instances.
        */
      var allocatedInstanceArray: InstanceArray = js.native
      
      /**
        * Get allocated instances.
        */
      def getAllocatedInstanceArray(): InstanceArray = js.native
      
      /**
        * Get sample.
        */
      def getSample(): Wrapper = js.native
      
      /**
        * Key of a WrapperGroup is dependent on its sample.
        */
      def key(): js.Any = js.native
      
      /**
        * <p> Run optimization in level of the group. </p>
        *
        * <p> The optimization routine begins by creating a {@link Wrapper} like the {@link sample}. Then
        * try to pack {@link allocatedInstanceArray allocated instances} to the {@link Wrapper} as a lot as
        * possible. If there're some {@link Wrappers} can't be packed by overloading, then create a new
        * {@link Wrapper} again and try to pack {@link allocatedInstanceArray instances} again, too. </p>
        *
        * <p> Repeats those steps until all {@link alloctedInstanceArray instances} are {@link Wrap packed}
        * so that there's not any {@link Instance instance} left. </p>
        *
        * <h4> Warning </h4>
        * <p> When call this {@link optimize optimize()} method, ordinary children {@link Wrapper} objects
        * in the {@link WrapperGroup} will be substituted with the newly optimized {@link Wrapper} objects. </p>
        */
      def optimize(): Unit = js.native
      
      /**
        * <p> Wrap allocated instances into <b>a new</b> {@link Wrapper}. </p>
        *
        * <p> {@link Wrap Wraps} instances to a new Wrapper which is copied from the sample. </p>
        * <p> After the wrapping is done, the new {@link Wrapper} is registered to the {@link WrapperGroup}
        * as a child and instances failed to wrap by overloading is returned. </p>
        *
        * @param instanceArray instances to {@link Wrap wrap} into <b>a new</b> {@link Wrapper}.
        *
        * @return Instances failed to {@link Wrap wrap} by overloading.
        * @see boxologic
        */
      /* private */ def pack(instanceArray: js.Any): js.Any = js.native
      
      /**
        * <p> A sample, standard of the WrapperGroup. </p>
        *
        * <p> The sample represents what type of Wrappers are grouped into the WrapperGroup. </p>
        */
      var sample: Wrapper = js.native
    }
  }
}
