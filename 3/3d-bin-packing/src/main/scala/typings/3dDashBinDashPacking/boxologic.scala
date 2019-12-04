package typings.`3dDashBinDashPacking`

import typings.`3dDashBinDashPacking`.boxologic.Box
import typings.`3dDashBinDashPacking`.boxologic.Instance
import typings.`3dDashBinDashPacking`.bws.packer.InstanceArray
import typings.`3dDashBinDashPacking`.bws.packer.Wrapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
@JSGlobal("boxologic")
@js.native
object boxologic extends js.Object {
  /**
    * A box, trying to pack into a {@link Pallet}.
    *
    * @author Bill Knechtel, <br>
    *		   Migrated and Refactored by Jeongho Nam <http://samchon.org>
    */
  @js.native
  class Box protected () extends Instance {
    /**
      * Construct from an instance.
      *
      * @param instance An instance adapts with.
      */
    def this(instance: typings.`3dDashBinDashPacking`.bws.packer.Instance) = this()
    /**
      * Coordinate-X of the box placement in a {@link Pallet}.
      */
    var cox: Double = js.native
    /**
      * Coordinate-Y of the box placement in a {@link Pallet}.
      */
    var coy: Double = js.native
    /**
      * Coordinate-Z of the box placement in a {@link Pallet}.
      */
    var coz: Double = js.native
    /**
      * Whether the {@link Box} is packed into a {@link Pallet}.
      */
    var is_packed: Boolean = js.native
    var overlapped_boxes: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.HashSet<Box> */ js.Any = js.native
    def hit_test(obj: Box): Boolean = js.native
    /* private */ def hit_test_point(x: js.Any, y: js.Any, z: js.Any): js.Any = js.native
    /* private */ def hit_test_single(obj: js.Any): js.Any = js.native
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
  class Boxologic protected () extends js.Object {
    /**
      * Construct from a wrapper and instances.
      *
      * @param wrapper A Wrapper to pack instances.
      * @param instanceArray Instances trying to put into the wrapper.
      */
    def this(wrapper: Wrapper, instanceArray: InstanceArray) = this()
    var bbfx: js.Any = js.native
    var bbfy: js.Any = js.native
    var bbfz: js.Any = js.native
    var bboxi: js.Any = js.native
    var bboxx: js.Any = js.native
    var bboxy: js.Any = js.native
    var bboxz: js.Any = js.native
    /**
      * The best layer, which can deduct the {@link best_solution_volume}.
      */
    var best_layer: js.Any = js.native
    /**
      * The best orientation of the pallet, which can deduct the {@link best_solution_volume}.
      */
    var best_orientation: js.Any = js.native
    /**
      * The best volume, fit the best utilization degree of the pallet space.
      */
    var best_solution_volume: js.Any = js.native
    var bfx: js.Any = js.native
    var bfy: js.Any = js.native
    var bfz: js.Any = js.native
    /**
      * Boxes, trying to pack into the {@link pallet}.
      */
    var box_array: js.Any = js.native
    var boxi: js.Any = js.native
    var boxx: js.Any = js.native
    var boxy: js.Any = js.native
    var boxz: js.Any = js.native
    /**
      * Candidate {@link Box.layout_height layout_height} of the {@link cboxi current box}.
      */
    var cbox_layout_height: js.Any = js.native
    /**
      * Candidate {@link Box.layout_length layout_length} of the {@link cboxi current box}.
      */
    var cbox_layout_length: js.Any = js.native
    /**
      * Candidate {@link Box.layout_width layout_width} of the {@link cboxi current box}.
      */
    var cbox_layout_width: js.Any = js.native
    /**
      * Index of the current {@link box}.
      */
    var cboxi: js.Any = js.native
    /**
      * Whether the current packing layer is evened.
      */
    var evened: js.Any = js.native
    /**
      * Whether the utilization degree of pallet space is 100%.
      */
    var hundred_percent: js.Any = js.native
    /**
      * Instances trying to put into the wrapper.
      */
    var instanceArray: js.Any = js.native
    /**
      * Whether packing a layer is done.
      */
    var layer_done: js.Any = js.native
    /**
      * Key of the unevened layer in the current packing layer.
      */
    var layer_in_layer: js.Any = js.native
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
    var layer_map: js.Any = js.native
    /**
      * Current layer's key on iteration.
      */
    var layer_thickness: js.Any = js.native
    /**
      * Instances failed to pack by overloading.
      */
    var leftInstances: js.Any = js.native
    /**
      * Little Z, gotten from {@link Scrapped.cumz cumz} in {@link min_scrap_z}
      */
    var lilz: js.Any = js.native
    /**
      * Packed (filled) {@link Pallet.layout_height layout_height} of the {@link pallet}.
      */
    var packed_layout_height: js.Any = js.native
    /**
      * Packed {@link Pallet.vo1lume volume} of the {@lnk pallet}.
      */
    var packed_volume: js.Any = js.native
    /**
      * <p> Whether the packing is on progress. </p>
      *
      * <p> The {@link packing} is a flag variable for terminating iterations in
      * {@link iterate_orientations iterate_orientations()}, who deducts the best packing solution. </p>
      */
    var packing: js.Any = js.native
    /**
      * Whether the best solution is deducted.
      */
    var packing_best: js.Any = js.native
    /**
      * A pallet containing {@link Box boxes}.
      *
      * @see Wrapper
      */
    var pallet: js.Any = js.native
    /**
      * Previous layer's key had iterated.
      */
    var pre_layer: js.Any = js.native
    /**
      * Remained (unfilled) {@link Pallet.layout_height layout_height} of the {@link pallet}.
      */
    var remain_layout_height: js.Any = js.native
    /**
      * Remained (unfilled) {@link Pallet.layout_length layout_length} of the {@link pallet}.
      */
    var remain_layout_length: js.Any = js.native
    /**
      * {@link List} of {@link Scrapped} instances, edges of layers under construction.
      *
      * @see Scrapped
      * @see scrap_min_z
      */
    var scrap_list: js.Any = js.native
    /**
      * The topology {@link Scrapped}, the edge of the current layer under construction.
      *
      * @see Scrapped
      * @see scrap_list
      */
    var scrap_min_z: js.Any = js.native
    /**
      * Sum of all boxes' volume.
      */
    var total_box_volume: js.Any = js.native
    /**
      * A Wrapper to pack instances.
      */
    var wrapper: js.Any = js.native
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
    /* private */ def analyze_box(
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
    /* private */ def check_found(): js.Any = js.native
    /**
      * <p> Construct layers. </p>
      *
      * <p> Creates all possible layer heights by giving a weight value to each of them. </p>
      */
    /* private */ def construct_layers(): js.Any = js.native
    /**
      * <p> Decode data </p>
      *
      * <p> Decodes the Boxologic's optimization result data to be suitable for the Packer's own. </p>
      */
    /* private */ def decode(): js.Any = js.native
    /**
      * <p> Encode data </p>
      *
      * <p> Encodes {@link bws.packer Packer}'s data to be suitable for the
      * {@link boxologic Boxologic}'s parametric data. </p>
      */
    /* private */ def encode(): js.Any = js.native
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
    /* private */ def find_box(hmx: js.Any, hy: js.Any, hmy: js.Any, hz: js.Any, hmz: js.Any): js.Any = js.native
    /**
      * Find the most proper layer height by looking at the unpacked boxes and
      * the remaining empty space available.
      */
    /* private */ def find_layer(thickness: js.Any): js.Any = js.native
    /**
      * <p> Find the first to be packed gap in the layer edge. </p>
      *
      * <p> Determine the gap with the {@link scrap_min_z smallest z} value in the current layer. </p>
      */
    /* private */ def find_smallest_z(): js.Any = js.native
    /* private */ def inspect_validity(): js.Any = js.native
    /**
      * Iterate a layer.
      *
      * @param thickness Thickness of the iterating layer.
      */
    /* private */ def iterate_layer(thickness: js.Any): js.Any = js.native
    /**
      * <p> Execute iterations by calling proper functions. </p>
      *
      * <p> Iterations are done and parameters of the best solution are found. </p>
      */
    /* private */ def iterate_orientations(): js.Any = js.native
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
    def pack(): js.Any = js.native
    /**
      * <p> Packs the boxes found and arranges all variables and records properly. </p>
      *
      * <p> Update the linked list and the Boxlist[] array as a box is packed. </p>
      */
    /* private */ def pack_layer(): js.Any = js.native
    /**
      * <p> Determine {@link box_arrray boxes}. </p>
      *
      * <p> Using the parameters found, packs the best solution found and reports. </p>
      */
    /* private */ def report_results(): js.Any = js.native
    /**
      * After packing of each box, 100% packing condition is checked.
      */
    /* private */ def volume_check(): js.Any = js.native
    /**
      * <p> Determine a {@link Box}. </p>
      *
      * <p> Transforms the found co-ordinate system to the one entered by the user and write them to the
      * report. </p>
      */
    /* private */ def write_box_file(): js.Any = js.native
  }
  
  /**
    * <p> An abstract instance of boxologic. </p>
    *
    * <p> {@link st_Instance} represents a physical, tangible instance of 3-dimension. </p>
    *
    * @author Jeongho Nam <http://samchon.org>
    */
  @js.native
  abstract class Instance protected () extends js.Object {
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
    var height: Double = js.native
    /**
      * Height considering layout placement.
      */
    var layout_height: Double = js.native
    /**
      * Length considering layout placement.
      */
    var layout_length: Double = js.native
    /**
      * Width considering layout placement.
      */
    var layout_width: Double = js.native
    /**
      * Length of the tangible instance, length on the Z-axis in 3D.
      */
    var length: Double = js.native
    /**
      * Volume, Width x Height x Length.
      */
    var volume: Double = js.native
    /**
      * Width of the tangible instance, length on the X-axis in 3D.
      */
    var width: Double = js.native
  }
  
  /**
    * A pallet containing boxes.
    *
    * @author Bill Knechtel, <br>
    *		   Migrated and Refactored by Jeongho Nam <http://samchon.org>
    */
  @js.native
  class Pallet protected () extends Instance {
    /**
      * Construct from a wrapper.
      *
      * @param wrapper A wrapper wrapping instances.
      */
    def this(wrapper: Wrapper) = this()
    /**
      * Set placement orientation.
      */
    def set_orientation(orientation: Double): Unit = js.native
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
  class Scrap () extends js.Object {
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
    var cumx: Double = js.native
    /**
      * Cumulated length on the Z-axis in 3D.
      */
    var cumz: Double = js.native
  }
  
}

