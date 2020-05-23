package typings.`3dBinPacking`

import typings.`3dBinPacking`.bws.packer.Instance
import typings.`3dBinPacking`.bws.packer.InstanceArray
import typings.`3dBinPacking`.bws.packer.Wrapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  /**
    * <p> A set of programs that calculate the best fit for boxes on a pallet migrated from language C. </p>
    *
    * <ul>
    *	<li> Original Boxologic: https://github.com/exad/boxologic </li>
    * </ul>
    *
    * @author Bill Knechtel, <br>
    *		   Migrated and Refactored by Jeongho Nam <http://samchon.org>
    */
  @js.native
  object boxologic extends js.Object {
    /**
      * A box, trying to pack into a {@link Pallet}.
      *
      * @author Bill Knechtel, <br>
      *		   Migrated and Refactored by Jeongho Nam <http://samchon.org>
      */
    @js.native
    class Box protected ()
      extends typings.`3dBinPacking`.boxologic.Box {
      /**
        * Construct from an instance.
        *
        * @param instance An instance adapts with.
        */
      def this(instance: typings.`3dBinPacking`.bws.packer.Instance) = this()
      /**
        * Coordinate-X of the box placement in a {@link Pallet}.
        */
      /* CompleteClass */
      override var cox: Double = js.native
      /**
        * Coordinate-Y of the box placement in a {@link Pallet}.
        */
      /* CompleteClass */
      override var coy: Double = js.native
      /**
        * Coordinate-Z of the box placement in a {@link Pallet}.
        */
      /* CompleteClass */
      override var coz: Double = js.native
      /**
        * Height of the tangible instance, length on the Y-axis in 3D.
        */
      /* CompleteClass */
      override var height: Double = js.native
      /**
        * Whether the {@link Box} is packed into a {@link Pallet}.
        */
      /* CompleteClass */
      override var is_packed: Boolean = js.native
      /**
        * Height considering layout placement.
        */
      /* CompleteClass */
      override var layout_height: Double = js.native
      /**
        * Length considering layout placement.
        */
      /* CompleteClass */
      override var layout_length: Double = js.native
      /**
        * Width considering layout placement.
        */
      /* CompleteClass */
      override var layout_width: Double = js.native
      /**
        * Length of the tangible instance, length on the Z-axis in 3D.
        */
      /* CompleteClass */
      override var length: Double = js.native
      /* CompleteClass */
      override var overlapped_boxes: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.HashSet<Box> */ js.Any = js.native
      /**
        * Volume, Width x Height x Length.
        */
      /* CompleteClass */
      override var volume: Double = js.native
      /**
        * Width of the tangible instance, length on the X-axis in 3D.
        */
      /* CompleteClass */
      override var width: Double = js.native
      /* CompleteClass */
      override def hit_test(obj: typings.`3dBinPacking`.boxologic.Box): Boolean = js.native
      /* CompleteClass */
      /* private */ override def hit_test_point(x: js.Any, y: js.Any, z: js.Any): js.Any = js.native
      /* CompleteClass */
      /* private */ override def hit_test_single(obj: js.Any): js.Any = js.native
    }
    
    /**
      * <p> A facade class of boxologic. </p>
      *
      * <p> The Boxologic class dudcts the best solution of packing boxes to a pallet. </p>
      *
      * <ul>
      *	<li> Reference: https://github.com/exad/boxologic </li>
      * </ul>
      *
      * @author Bill Knechtel, <br>
      *		   Migrated and Refactored by Jeongho Nam <http://samchon.org>
      */
    @js.native
    class Boxologic protected ()
      extends typings.`3dBinPacking`.boxologic.Boxologic {
      /**
        * Construct from a wrapper and instances.
        *
        * @param wrapper A Wrapper to pack instances.
        * @param instanceArray Instances trying to put into the wrapper.
        */
      def this(wrapper: Wrapper, instanceArray: InstanceArray) = this()
      /* CompleteClass */
      override var bbfx: js.Any = js.native
      /* CompleteClass */
      override var bbfy: js.Any = js.native
      /* CompleteClass */
      override var bbfz: js.Any = js.native
      /* CompleteClass */
      override var bboxi: js.Any = js.native
      /* CompleteClass */
      override var bboxx: js.Any = js.native
      /* CompleteClass */
      override var bboxy: js.Any = js.native
      /* CompleteClass */
      override var bboxz: js.Any = js.native
      /**
        * The best layer, which can deduct the {@link best_solution_volume}.
        */
      /* CompleteClass */
      override var best_layer: js.Any = js.native
      /**
        * The best orientation of the pallet, which can deduct the {@link best_solution_volume}.
        */
      /* CompleteClass */
      override var best_orientation: js.Any = js.native
      /**
        * The best volume, fit the best utilization degree of the pallet space.
        */
      /* CompleteClass */
      override var best_solution_volume: js.Any = js.native
      /* CompleteClass */
      override var bfx: js.Any = js.native
      /* CompleteClass */
      override var bfy: js.Any = js.native
      /* CompleteClass */
      override var bfz: js.Any = js.native
      /**
        * Boxes, trying to pack into the {@link pallet}.
        */
      /* CompleteClass */
      override var box_array: js.Any = js.native
      /* CompleteClass */
      override var boxi: js.Any = js.native
      /* CompleteClass */
      override var boxx: js.Any = js.native
      /* CompleteClass */
      override var boxy: js.Any = js.native
      /* CompleteClass */
      override var boxz: js.Any = js.native
      /**
        * Candidate {@link Box.layout_height layout_height} of the {@link cboxi current box}.
        */
      /* CompleteClass */
      override var cbox_layout_height: js.Any = js.native
      /**
        * Candidate {@link Box.layout_length layout_length} of the {@link cboxi current box}.
        */
      /* CompleteClass */
      override var cbox_layout_length: js.Any = js.native
      /**
        * Candidate {@link Box.layout_width layout_width} of the {@link cboxi current box}.
        */
      /* CompleteClass */
      override var cbox_layout_width: js.Any = js.native
      /**
        * Index of the current {@link box}.
        */
      /* CompleteClass */
      override var cboxi: js.Any = js.native
      /**
        * Whether the current packing layer is evened.
        */
      /* CompleteClass */
      override var evened: js.Any = js.native
      /**
        * Whether the utilization degree of pallet space is 100%.
        */
      /* CompleteClass */
      override var hundred_percent: js.Any = js.native
      /**
        * Instances trying to put into the wrapper.
        */
      /* CompleteClass */
      override var instanceArray: js.Any = js.native
      /**
        * Whether packing a layer is done.
        */
      /* CompleteClass */
      override var layer_done: js.Any = js.native
      /**
        * Key of the unevened layer in the current packing layer.
        */
      /* CompleteClass */
      override var layer_in_layer: js.Any = js.native
      /**
        * <p> All different lengths of {@link box_array all box} dimensions along with evaluation values. </p>
        *
        * <p> In other word, the <i>layer_map</i> stores those entries; each {@link Boxbox}'s length on each
        * axis as a <i>key</i> (width, height or length) and evaluation value as a <i>value</i>. The evaluation
        * value means sum of minimum gaps between the key and other {@link Box boxes}' width, height and length
        * </p>
        *
        * <code>
        FOR i := 0 to box_array.size()
        WHILE key IN width, length and height in box_array[i]
        BEGIN
        value := 0
        FOR j to box_array.size()
        value += min
        (
        abs(key - box_array[j].width),
        abs(key - box_array[j].height),
        abs(key - box_array[j].length)
        )
        layer_map.insert({key, value});
        END
        * </code>
        *
        * <ul>
        *	<li> key: A dimension value </li>
        *	<li> value: Evaluation weight value for the corresponding key. </li>
        * </ul>
        */
      /* CompleteClass */
      override var layer_map: js.Any = js.native
      /**
        * Current layer's key on iteration.
        */
      /* CompleteClass */
      override var layer_thickness: js.Any = js.native
      /**
        * Instances failed to pack by overloading.
        */
      /* CompleteClass */
      override var leftInstances: js.Any = js.native
      /**
        * Little Z, gotten from {@link Scrapped.cumz cumz} in {@link min_scrap_z}
        */
      /* CompleteClass */
      override var lilz: js.Any = js.native
      /**
        * Packed (filled) {@link Pallet.layout_height layout_height} of the {@link pallet}.
        */
      /* CompleteClass */
      override var packed_layout_height: js.Any = js.native
      /**
        * Packed {@link Pallet.vo1lume volume} of the {@lnk pallet}.
        */
      /* CompleteClass */
      override var packed_volume: js.Any = js.native
      /**
        * <p> Whether the packing is on progress. </p>
        *
        * <p> The {@link packing} is a flag variable for terminating iterations in
        * {@link iterate_orientations iterate_orientations()}, who deducts the best packing solution. </p>
        */
      /* CompleteClass */
      override var packing: js.Any = js.native
      /**
        * Whether the best solution is deducted.
        */
      /* CompleteClass */
      override var packing_best: js.Any = js.native
      /**
        * A pallet containing {@link Box boxes}.
        *
        * @see Wrapper
        */
      /* CompleteClass */
      override var pallet: js.Any = js.native
      /**
        * Previous layer's key had iterated.
        */
      /* CompleteClass */
      override var pre_layer: js.Any = js.native
      /**
        * Remained (unfilled) {@link Pallet.layout_height layout_height} of the {@link pallet}.
        */
      /* CompleteClass */
      override var remain_layout_height: js.Any = js.native
      /**
        * Remained (unfilled) {@link Pallet.layout_length layout_length} of the {@link pallet}.
        */
      /* CompleteClass */
      override var remain_layout_length: js.Any = js.native
      /**
        * {@link List} of {@link Scrapped} instances, edges of layers under construction.
        *
        * @see Scrapped
        * @see scrap_min_z
        */
      /* CompleteClass */
      override var scrap_list: js.Any = js.native
      /**
        * The topology {@link Scrapped}, the edge of the current layer under construction.
        *
        * @see Scrapped
        * @see scrap_list
        */
      /* CompleteClass */
      override var scrap_min_z: js.Any = js.native
      /**
        * Sum of all boxes' volume.
        */
      /* CompleteClass */
      override var total_box_volume: js.Any = js.native
      /**
        * A Wrapper to pack instances.
        */
      /* CompleteClass */
      override var wrapper: js.Any = js.native
      /**
        * <p> Analyzes each unpacked {@link Box box} to find the best fitting one to the empty space. </p>
        *
        * <p> Used by {@link find_box find_box()} to analyze box dimensions. </p>
        *
        * @param x index of a {@link Box box} in the {@link box_array}.
        *
        * @param hmx Maximum available x-dimension of the current gap to be filled.
        * @param hy Current layer thickness value.
        * @param hmy Current layer thickness value.
        * @param hz Z-dimension of the current gap to be filled.
        * @param hmz Maximum available z-dimension to the current gap to be filled.
        *
        * @param dim1 X-dimension of the orientation of the box being examined.
        * @param dim2 Y-dimension of the orientation of the box being examined.
        * @param dim3 Z-dimension of the orientation of the box being examined.
        */
      /* CompleteClass */
      /* private */ override def analyze_box(
        index: js.Any,
        hmx: js.Any,
        hy: js.Any,
        hmy: js.Any,
        hz: js.Any,
        hmz: js.Any,
        dim1: js.Any,
        dim2: js.Any,
        dim3: js.Any
      ): js.Any = js.native
      /**
        * After finding each box, the candidate boxes and the condition of the layer are examined.
        */
      /* CompleteClass */
      /* private */ override def check_found(): js.Any = js.native
      /**
        * <p> Construct layers. </p>
        *
        * <p> Creates all possible layer heights by giving a weight value to each of them. </p>
        */
      /* CompleteClass */
      /* private */ override def construct_layers(): js.Any = js.native
      /**
        * <p> Decode data </p>
        *
        * <p> Decodes the Boxologic's optimization result data to be suitable for the Packer's own. </p>
        */
      /* CompleteClass */
      /* private */ override def decode(): js.Any = js.native
      /**
        * <p> Encode data </p>
        *
        * <p> Encodes {@link bws.packer Packer}'s data to be suitable for the
        * {@link boxologic Boxologic}'s parametric data. </p>
        */
      /* CompleteClass */
      /* private */ override def encode(): js.Any = js.native
      /**
        * <p> Determine the gap with the samllest z value in the current layer. </p>
        *
        * <p> Find the most proper boxes by looking at all six possible orientations,
        * empty space given, adjacent boxes, and pallet limits. </p>
        *
        * @param hmx Maximum available x-dimension of the current gap to be filled.
        * @param hy Current layer thickness value.
        * @param hmy Current layer thickness value.
        * @param hz Z-dimension of the current gap to be filled.
        * @param hmz Maximum available z-dimension to the current gap to be filled.
        */
      /* CompleteClass */
      /* private */ override def find_box(hmx: js.Any, hy: js.Any, hmy: js.Any, hz: js.Any, hmz: js.Any): js.Any = js.native
      /**
        * Find the most proper layer height by looking at the unpacked boxes and
        * the remaining empty space available.
        */
      /* CompleteClass */
      /* private */ override def find_layer(thickness: js.Any): js.Any = js.native
      /**
        * <p> Find the first to be packed gap in the layer edge. </p>
        *
        * <p> Determine the gap with the {@link scrap_min_z smallest z} value in the current layer. </p>
        */
      /* CompleteClass */
      /* private */ override def find_smallest_z(): js.Any = js.native
      /* CompleteClass */
      /* private */ override def inspect_validity(): js.Any = js.native
      /**
        * Iterate a layer.
        *
        * @param thickness Thickness of the iterating layer.
        */
      /* CompleteClass */
      /* private */ override def iterate_layer(thickness: js.Any): js.Any = js.native
      /**
        * <p> Execute iterations by calling proper functions. </p>
        *
        * <p> Iterations are done and parameters of the best solution are found. </p>
        */
      /* CompleteClass */
      /* private */ override def iterate_orientations(): js.Any = js.native
      /**
        * <p> Pack instances to the {@link wrapper}. </p>
        *
        * <p> The {@link Boxologic.pack} is an adaptor method between {@link bws.packer Packer} and
        * {@link boxologic}. It encodes data from {@link bws.packer Packer}, deducts the best packing
        * solution decodes the optimization result and returns it. </p>
        *
        * <p> The optimization result is returned as a {@link Pair} like below: </p>
        * <ul>
        *	<li> first: The {@link wrapper} with packed instances. </li>
        *	<li> second: {@link leftInstances Left instances failed to pack} by overloading. </li>
        * </ul>
        *
        * @return A pair of {@link wrapper} with packed instances and
        *		   {@link leftInstances instances failed to pack} by overloading.
        */
      /* CompleteClass */
      override def pack(): js.Any = js.native
      /**
        * <p> Packs the boxes found and arranges all variables and records properly. </p>
        *
        * <p> Update the linked list and the Boxlist[] array as a box is packed. </p>
        */
      /* CompleteClass */
      /* private */ override def pack_layer(): js.Any = js.native
      /**
        * <p> Determine {@link box_arrray boxes}. </p>
        *
        * <p> Using the parameters found, packs the best solution found and reports. </p>
        */
      /* CompleteClass */
      /* private */ override def report_results(): js.Any = js.native
      /**
        * After packing of each box, 100% packing condition is checked.
        */
      /* CompleteClass */
      /* private */ override def volume_check(): js.Any = js.native
      /**
        * <p> Determine a {@link Box}. </p>
        *
        * <p> Transforms the found co-ordinate system to the one entered by the user and write them to the
        * report. </p>
        */
      /* CompleteClass */
      /* private */ override def write_box_file(): js.Any = js.native
    }
    
    /**
      * <p> An abstract instance of boxologic. </p>
      *
      * <p> {@link st_Instance} represents a physical, tangible instance of 3-dimension. </p>
      *
      * @author Jeongho Nam <http://samchon.org>
      */
    @js.native
    abstract class Instance protected ()
      extends typings.`3dBinPacking`.boxologic.Instance {
      /**
        * Construct from size members.
        *
        * @param width Width, length on the X-axis in 3D.
        * @param height Height, length on the Y-axis in 3D.
        * @param length Length, length on the Z-axis in 3D.
        */
      def this(width: Double, height: Double, length: Double) = this()
      /**
        * Height of the tangible instance, length on the Y-axis in 3D.
        */
      /* CompleteClass */
      override var height: Double = js.native
      /**
        * Height considering layout placement.
        */
      /* CompleteClass */
      override var layout_height: Double = js.native
      /**
        * Length considering layout placement.
        */
      /* CompleteClass */
      override var layout_length: Double = js.native
      /**
        * Width considering layout placement.
        */
      /* CompleteClass */
      override var layout_width: Double = js.native
      /**
        * Length of the tangible instance, length on the Z-axis in 3D.
        */
      /* CompleteClass */
      override var length: Double = js.native
      /**
        * Volume, Width x Height x Length.
        */
      /* CompleteClass */
      override var volume: Double = js.native
      /**
        * Width of the tangible instance, length on the X-axis in 3D.
        */
      /* CompleteClass */
      override var width: Double = js.native
    }
    
    /**
      * A pallet containing boxes.
      *
      * @author Bill Knechtel, <br>
      *		   Migrated and Refactored by Jeongho Nam <http://samchon.org>
      */
    @js.native
    class Pallet protected ()
      extends typings.`3dBinPacking`.boxologic.Pallet {
      /**
        * Construct from a wrapper.
        *
        * @param wrapper A wrapper wrapping instances.
        */
      def this(wrapper: Wrapper) = this()
      /**
        * Height of the tangible instance, length on the Y-axis in 3D.
        */
      /* CompleteClass */
      override var height: Double = js.native
      /**
        * Height considering layout placement.
        */
      /* CompleteClass */
      override var layout_height: Double = js.native
      /**
        * Length considering layout placement.
        */
      /* CompleteClass */
      override var layout_length: Double = js.native
      /**
        * Width considering layout placement.
        */
      /* CompleteClass */
      override var layout_width: Double = js.native
      /**
        * Length of the tangible instance, length on the Z-axis in 3D.
        */
      /* CompleteClass */
      override var length: Double = js.native
      /**
        * Volume, Width x Height x Length.
        */
      /* CompleteClass */
      override var volume: Double = js.native
      /**
        * Width of the tangible instance, length on the X-axis in 3D.
        */
      /* CompleteClass */
      override var width: Double = js.native
      /**
        * Set placement orientation.
        */
      /* CompleteClass */
      override def set_orientation(orientation: Double): Unit = js.native
    }
    
    /**
      * <p> Cumulated lengths of current layer. </p>
      *
      * <p> {@link Scrapped} represents an edge of the current layer under construction. </p>
      *
      * @author Bill Knechtel, <br>
      *		   Migrated and Refactored by Jeongho Nam <http://samchon.org>
      */
    @js.native
    /**
      * Default Constructor.
      */
    class Scrap ()
      extends typings.`3dBinPacking`.boxologic.Scrap {
      /**
        * Initialization Constructor.
        *
        * @param cumx Cumulated length on the x-axis.
        * @param cumz Cumulated length on the z-axis.
        */
      def this(cumx: Double, cumz: Double) = this()
      /**
        * Cumulated length on the X-axis in 3D.
        */
      /* CompleteClass */
      override var cumx: Double = js.native
      /**
        * Cumulated length on the Z-axis in 3D.
        */
      /* CompleteClass */
      override var cumz: Double = js.native
    }
    
  }
  
  @js.native
  object bws extends js.Object {
    @js.native
    object packer extends js.Object {
      @js.native
      class GAWrapperArray protected ()
        extends typings.`3dBinPacking`.bws.packer.GAWrapperArray {
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
        /* CompleteClass */
        override var instanceArray: typings.`3dBinPacking`.bws.packer.InstanceArray = js.native
        /* CompleteClass */
        override var price: js.Any = js.native
        /* CompleteClass */
        override var result: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.HashMap<string, WrapperGroup> */ js.Any = js.native
        /**
          * @brief Validity of this sequence list.
          */
        /* CompleteClass */
        override var valid: js.Any = js.native
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
        /* CompleteClass */
        /* private */ override def constructResult(): js.Any = js.native
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
        /* CompleteClass */
        override def less(obj: typings.`3dBinPacking`.bws.packer.GAWrapperArray): Boolean = js.native
      }
      
      /**
        * An array of Instance objects.
        *
        * @author Jeongho Nam <http://samchon.org>
        */
      @js.native
      /**
        * Default Constructor.
        */
      class InstanceArray ()
        extends typings.`3dBinPacking`.bws.packer.InstanceArray {
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
      @js.native
      /**
        * Default Constructor.
        */
      class InstanceForm ()
        extends typings.`3dBinPacking`.bws.packer.InstanceForm {
        def this(instance: Instance) = this()
        def this(instance: Instance, count: Double) = this()
        /* CompleteClass */
        @JSName("$count")
        override var $count: String = js.native
        /* CompleteClass */
        @JSName("$height")
        override var $height: String = js.native
        /* CompleteClass */
        @JSName("$length")
        override var $length: String = js.native
        /* CompleteClass */
        @JSName("$name")
        override var $name: String = js.native
        /* CompleteClass */
        @JSName("$width")
        override var $width: String = js.native
        /**
          * Repeated count of the {@link instance}.
          */
        /* CompleteClass */
        override var count: js.Any = js.native
        /**
          * A duplicated Instance.
          */
        /* CompleteClass */
        override var instance: js.Any = js.native
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
        /* CompleteClass */
        /* private */ override def createInstance(xml: js.Any): js.Any = js.native
        /* CompleteClass */
        override def getCount(): Double = js.native
        /* CompleteClass */
        override def getInstance(): Instance = js.native
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
      @js.native
      /**
        * Default Constructor.
        */
      class InstanceFormArray ()
        extends typings.`3dBinPacking`.bws.packer.InstanceFormArray {
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
      @js.native
      /**
        * Default Constructor.
        */
      class Packer ()
        extends typings.`3dBinPacking`.bws.packer.Packer {
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
          * Instances trying to pack into the wrapper.
          */
        /* CompleteClass */
        override var instanceArray: typings.`3dBinPacking`.bws.packer.InstanceArray = js.native
        /**
          * Candidate wrappers who can contain instances.
          */
        /* CompleteClass */
        override var wrapperArray: typings.`3dBinPacking`.bws.packer.WrapperArray = js.native
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
        /* CompleteClass */
        /* protected */ override def initGenes(): typings.`3dBinPacking`.bws.packer.GAWrapperArray = js.native
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
        /* CompleteClass */
        /* protected */ override def repack($wrappers: typings.`3dBinPacking`.bws.packer.WrapperArray): typings.`3dBinPacking`.bws.packer.WrapperArray = js.native
        /**
          * @inheritdoc
          */
        /* CompleteClass */
        override def toXML(): js.Any = js.native
      }
      
      /**
        * Bridge of {@link Packer} for {@link InstanceForm repeated instances}.
        *
        * @author Jeongho Nam <http://samchon.org>
        */
      @js.native
      /**
        * Default Constructor.
        */
      class PackerForm ()
        extends typings.`3dBinPacking`.bws.packer.PackerForm {
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
        /**
          * Form of Instances to pack.
          */
        /* CompleteClass */
        override var instanceFormArray: js.Any = js.native
        /**
          * Type of Wrappers to be used.
          */
        /* CompleteClass */
        override var wrapperArray: js.Any = js.native
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
        /* CompleteClass */
        override def optimize(): typings.`3dBinPacking`.bws.packer.WrapperArray = js.native
        /* CompleteClass */
        override def toPacker(): typings.`3dBinPacking`.bws.packer.Packer = js.native
        /* CompleteClass */
        override def toXML(): js.Any = js.native
      }
      
      /**
        * A product.
        *
        * @author Jeongho Nam <http://samchon.org>
        */
      @js.native
      /**
        * Default Constructor.
        */
      class Product ()
        extends typings.`3dBinPacking`.bws.packer.Product {
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
          * Height of the Product, length on the Y-axis in 3D.
          */
        /* CompleteClass */
        override var height: Double = js.native
        /**
          * Length of the Product, length on the Z-axis in 3D.
          */
        /* CompleteClass */
        override var length: Double = js.native
        /**
          * <p> Name, key of the Product. </p>
          *
          * <p> The name must be unique because a name identifies a {@link Product}. </p>
          */
        /* CompleteClass */
        override var name: String = js.native
        /**
          * Width of the Product, length on the X-axis in 3D.
          */
        /* CompleteClass */
        override var width: Double = js.native
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
          * Key of a Product is its name.
          */
        /* CompleteClass */
        override def key(): js.Any = js.native
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
      @js.native
      class Wrap protected ()
        extends typings.`3dBinPacking`.bws.packer.Wrap {
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
          * An instance wrapped into the {@link wrapper}.
          */
        /* CompleteClass */
        override var instance: Instance = js.native
        /**
          * Placement orientation of wrapped {@link instance}.
          */
        /* CompleteClass */
        override var orientation: Double = js.native
        /**
          * A wrapper wrapping the {@link instance}.
          */
        /* CompleteClass */
        override var wrapper: typings.`3dBinPacking`.bws.packer.Wrapper = js.native
        /**
          * Coordinate-X of the instance placement in the wrapper.
          */
        /* CompleteClass */
        override var x: Double = js.native
        /**
          * Coordinate-Y of the instance placement in the wrapper.
          */
        /* CompleteClass */
        override var y: Double = js.native
        /**
          * Coordinate-Z of the instance placement in the wrapper.
          */
        /* CompleteClass */
        override var z: Double = js.native
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
        /* CompleteClass */
        /* protected */ override def createInstance(`type`: String): Instance = js.native
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
      }
      
      /**
        * A wrapper wrapping instances.
        *
        * @author Jeongho Nam <http://samchon.org>
        */
      @js.native
      /**
        * Default Constructor.
        */
      class Wrapper ()
        extends typings.`3dBinPacking`.bws.packer.Wrapper {
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
        override var $height: String = js.native
        /* CompleteClass */
        @JSName("$length")
        override var $length: String = js.native
        /* CompleteClass */
        @JSName("$name")
        override var $name: String = js.native
        /* CompleteClass */
        @JSName("$price")
        override var $price: String = js.native
        /* CompleteClass */
        @JSName("$scale")
        override val $scale: String = js.native
        /* CompleteClass */
        @JSName("$spaceUtilization")
        override val $spaceUtilization: String = js.native
        /* CompleteClass */
        @JSName("$thickness")
        override var $thickness: String = js.native
        /* CompleteClass */
        @JSName("$width")
        override var $width: String = js.native
        /**
          * Height of the Wrapper, length on the Y-axis in 3D.
          */
        /* CompleteClass */
        override var height: Double = js.native
        /**
          * Length of the Wrapper, length on the Z-axis in 3D.
          */
        /* CompleteClass */
        override var length: Double = js.native
        /**
          * <p> Name, key of the Wrapper. </p>
          *
          * <p> The name represents a type of Wrapper and identifies the Wrapper. </p>
          */
        /* CompleteClass */
        override var name: String = js.native
        /**
          * Price, cost of using an Wrapper.
          */
        /* CompleteClass */
        override var price: Double = js.native
        /**
          * <p> Thickness, margin of a Wrapper causes shrinkness of containable volume. </p>
          *
          * <p> The thickness reduces each dimension's containable size (dimension - 2*thickness),
          * so finally, it reduces total containable volume (-8 * thickness^3). </p>
          */
        /* CompleteClass */
        override var thickness: Double = js.native
        /**
          * Width of the Wrapper, length on the X-axis in 3D.
          */
        /* CompleteClass */
        override var width: Double = js.native
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
          * Key of a Wrapper is its name.
          */
        /* CompleteClass */
        override def key(): js.Any = js.native
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
          * @inheritdoc
          */
        /* CompleteClass */
        override def toXML(): js.Any = js.native
      }
      
      @js.native
      /**
        * Default Constructor.
        */
      class WrapperArray ()
        extends typings.`3dBinPacking`.bws.packer.WrapperArray {
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
      @js.native
      /**
        * Default Constructor.
        */
      class WrapperGroup ()
        extends typings.`3dBinPacking`.bws.packer.WrapperGroup {
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
      
      @JSName("_Test")
      def Test(): Unit = js.native
    }
    
  }
  
}

