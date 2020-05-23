package typings.`3dBinPacking`.boxologic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait Boxologic extends js.Object {
  var bbfx: js.Any
  var bbfy: js.Any
  var bbfz: js.Any
  var bboxi: js.Any
  var bboxx: js.Any
  var bboxy: js.Any
  var bboxz: js.Any
  /**
    * The best layer, which can deduct the {@link best_solution_volume}.
    */
  var best_layer: js.Any
  /**
    * The best orientation of the pallet, which can deduct the {@link best_solution_volume}.
    */
  var best_orientation: js.Any
  /**
    * The best volume, fit the best utilization degree of the pallet space.
    */
  var best_solution_volume: js.Any
  var bfx: js.Any
  var bfy: js.Any
  var bfz: js.Any
  /**
    * Boxes, trying to pack into the {@link pallet}.
    */
  var box_array: js.Any
  var boxi: js.Any
  var boxx: js.Any
  var boxy: js.Any
  var boxz: js.Any
  /**
    * Candidate {@link Box.layout_height layout_height} of the {@link cboxi current box}.
    */
  var cbox_layout_height: js.Any
  /**
    * Candidate {@link Box.layout_length layout_length} of the {@link cboxi current box}.
    */
  var cbox_layout_length: js.Any
  /**
    * Candidate {@link Box.layout_width layout_width} of the {@link cboxi current box}.
    */
  var cbox_layout_width: js.Any
  /**
    * Index of the current {@link box}.
    */
  var cboxi: js.Any
  /**
    * Whether the current packing layer is evened.
    */
  var evened: js.Any
  /**
    * Whether the utilization degree of pallet space is 100%.
    */
  var hundred_percent: js.Any
  /**
    * Instances trying to put into the wrapper.
    */
  var instanceArray: js.Any
  /**
    * Whether packing a layer is done.
    */
  var layer_done: js.Any
  /**
    * Key of the unevened layer in the current packing layer.
    */
  var layer_in_layer: js.Any
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
  var layer_map: js.Any
  /**
    * Current layer's key on iteration.
    */
  var layer_thickness: js.Any
  /**
    * Instances failed to pack by overloading.
    */
  var leftInstances: js.Any
  /**
    * Little Z, gotten from {@link Scrapped.cumz cumz} in {@link min_scrap_z}
    */
  var lilz: js.Any
  /**
    * Packed (filled) {@link Pallet.layout_height layout_height} of the {@link pallet}.
    */
  var packed_layout_height: js.Any
  /**
    * Packed {@link Pallet.vo1lume volume} of the {@lnk pallet}.
    */
  var packed_volume: js.Any
  /**
    * <p> Whether the packing is on progress. </p>
    *
    * <p> The {@link packing} is a flag variable for terminating iterations in
    * {@link iterate_orientations iterate_orientations()}, who deducts the best packing solution. </p>
    */
  var packing: js.Any
  /**
    * Whether the best solution is deducted.
    */
  var packing_best: js.Any
  /**
    * A pallet containing {@link Box boxes}.
    *
    * @see Wrapper
    */
  var pallet: js.Any
  /**
    * Previous layer's key had iterated.
    */
  var pre_layer: js.Any
  /**
    * Remained (unfilled) {@link Pallet.layout_height layout_height} of the {@link pallet}.
    */
  var remain_layout_height: js.Any
  /**
    * Remained (unfilled) {@link Pallet.layout_length layout_length} of the {@link pallet}.
    */
  var remain_layout_length: js.Any
  /**
    * {@link List} of {@link Scrapped} instances, edges of layers under construction.
    *
    * @see Scrapped
    * @see scrap_min_z
    */
  var scrap_list: js.Any
  /**
    * The topology {@link Scrapped}, the edge of the current layer under construction.
    *
    * @see Scrapped
    * @see scrap_list
    */
  var scrap_min_z: js.Any
  /**
    * Sum of all boxes' volume.
    */
  var total_box_volume: js.Any
  /**
    * A Wrapper to pack instances.
    */
  var wrapper: js.Any
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
  ): js.Any
  /**
    * After finding each box, the candidate boxes and the condition of the layer are examined.
    */
  /* private */ def check_found(): js.Any
  /**
    * <p> Construct layers. </p>
    *
    * <p> Creates all possible layer heights by giving a weight value to each of them. </p>
    */
  /* private */ def construct_layers(): js.Any
  /**
    * <p> Decode data </p>
    *
    * <p> Decodes the Boxologic's optimization result data to be suitable for the Packer's own. </p>
    */
  /* private */ def decode(): js.Any
  /**
    * <p> Encode data </p>
    *
    * <p> Encodes {@link bws.packer Packer}'s data to be suitable for the
    * {@link boxologic Boxologic}'s parametric data. </p>
    */
  /* private */ def encode(): js.Any
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
  /* private */ def find_box(hmx: js.Any, hy: js.Any, hmy: js.Any, hz: js.Any, hmz: js.Any): js.Any
  /**
    * Find the most proper layer height by looking at the unpacked boxes and
    * the remaining empty space available.
    */
  /* private */ def find_layer(thickness: js.Any): js.Any
  /**
    * <p> Find the first to be packed gap in the layer edge. </p>
    *
    * <p> Determine the gap with the {@link scrap_min_z smallest z} value in the current layer. </p>
    */
  /* private */ def find_smallest_z(): js.Any
  /* private */ def inspect_validity(): js.Any
  /**
    * Iterate a layer.
    *
    * @param thickness Thickness of the iterating layer.
    */
  /* private */ def iterate_layer(thickness: js.Any): js.Any
  /**
    * <p> Execute iterations by calling proper functions. </p>
    *
    * <p> Iterations are done and parameters of the best solution are found. </p>
    */
  /* private */ def iterate_orientations(): js.Any
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
  def pack(): js.Any
  /**
    * <p> Packs the boxes found and arranges all variables and records properly. </p>
    *
    * <p> Update the linked list and the Boxlist[] array as a box is packed. </p>
    */
  /* private */ def pack_layer(): js.Any
  /**
    * <p> Determine {@link box_arrray boxes}. </p>
    *
    * <p> Using the parameters found, packs the best solution found and reports. </p>
    */
  /* private */ def report_results(): js.Any
  /**
    * After packing of each box, 100% packing condition is checked.
    */
  /* private */ def volume_check(): js.Any
  /**
    * <p> Determine a {@link Box}. </p>
    *
    * <p> Transforms the found co-ordinate system to the one entered by the user and write them to the
    * report. </p>
    */
  /* private */ def write_box_file(): js.Any
}

object Boxologic {
  @scala.inline
  def apply(
    analyze_box: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any,
    bbfx: js.Any,
    bbfy: js.Any,
    bbfz: js.Any,
    bboxi: js.Any,
    bboxx: js.Any,
    bboxy: js.Any,
    bboxz: js.Any,
    best_layer: js.Any,
    best_orientation: js.Any,
    best_solution_volume: js.Any,
    bfx: js.Any,
    bfy: js.Any,
    bfz: js.Any,
    box_array: js.Any,
    boxi: js.Any,
    boxx: js.Any,
    boxy: js.Any,
    boxz: js.Any,
    cbox_layout_height: js.Any,
    cbox_layout_length: js.Any,
    cbox_layout_width: js.Any,
    cboxi: js.Any,
    check_found: () => js.Any,
    construct_layers: () => js.Any,
    decode: () => js.Any,
    encode: () => js.Any,
    evened: js.Any,
    find_box: (js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any,
    find_layer: js.Any => js.Any,
    find_smallest_z: () => js.Any,
    hundred_percent: js.Any,
    inspect_validity: () => js.Any,
    instanceArray: js.Any,
    iterate_layer: js.Any => js.Any,
    iterate_orientations: () => js.Any,
    layer_done: js.Any,
    layer_in_layer: js.Any,
    layer_map: js.Any,
    layer_thickness: js.Any,
    leftInstances: js.Any,
    lilz: js.Any,
    pack: () => js.Any,
    pack_layer: () => js.Any,
    packed_layout_height: js.Any,
    packed_volume: js.Any,
    packing: js.Any,
    packing_best: js.Any,
    pallet: js.Any,
    pre_layer: js.Any,
    remain_layout_height: js.Any,
    remain_layout_length: js.Any,
    report_results: () => js.Any,
    scrap_list: js.Any,
    scrap_min_z: js.Any,
    total_box_volume: js.Any,
    volume_check: () => js.Any,
    wrapper: js.Any,
    write_box_file: () => js.Any
  ): Boxologic = {
    val __obj = js.Dynamic.literal(analyze_box = js.Any.fromFunction9(analyze_box), bbfx = bbfx.asInstanceOf[js.Any], bbfy = bbfy.asInstanceOf[js.Any], bbfz = bbfz.asInstanceOf[js.Any], bboxi = bboxi.asInstanceOf[js.Any], bboxx = bboxx.asInstanceOf[js.Any], bboxy = bboxy.asInstanceOf[js.Any], bboxz = bboxz.asInstanceOf[js.Any], best_layer = best_layer.asInstanceOf[js.Any], best_orientation = best_orientation.asInstanceOf[js.Any], best_solution_volume = best_solution_volume.asInstanceOf[js.Any], bfx = bfx.asInstanceOf[js.Any], bfy = bfy.asInstanceOf[js.Any], bfz = bfz.asInstanceOf[js.Any], box_array = box_array.asInstanceOf[js.Any], boxi = boxi.asInstanceOf[js.Any], boxx = boxx.asInstanceOf[js.Any], boxy = boxy.asInstanceOf[js.Any], boxz = boxz.asInstanceOf[js.Any], cbox_layout_height = cbox_layout_height.asInstanceOf[js.Any], cbox_layout_length = cbox_layout_length.asInstanceOf[js.Any], cbox_layout_width = cbox_layout_width.asInstanceOf[js.Any], cboxi = cboxi.asInstanceOf[js.Any], check_found = js.Any.fromFunction0(check_found), construct_layers = js.Any.fromFunction0(construct_layers), decode = js.Any.fromFunction0(decode), encode = js.Any.fromFunction0(encode), evened = evened.asInstanceOf[js.Any], find_box = js.Any.fromFunction5(find_box), find_layer = js.Any.fromFunction1(find_layer), find_smallest_z = js.Any.fromFunction0(find_smallest_z), hundred_percent = hundred_percent.asInstanceOf[js.Any], inspect_validity = js.Any.fromFunction0(inspect_validity), instanceArray = instanceArray.asInstanceOf[js.Any], iterate_layer = js.Any.fromFunction1(iterate_layer), iterate_orientations = js.Any.fromFunction0(iterate_orientations), layer_done = layer_done.asInstanceOf[js.Any], layer_in_layer = layer_in_layer.asInstanceOf[js.Any], layer_map = layer_map.asInstanceOf[js.Any], layer_thickness = layer_thickness.asInstanceOf[js.Any], leftInstances = leftInstances.asInstanceOf[js.Any], lilz = lilz.asInstanceOf[js.Any], pack = js.Any.fromFunction0(pack), pack_layer = js.Any.fromFunction0(pack_layer), packed_layout_height = packed_layout_height.asInstanceOf[js.Any], packed_volume = packed_volume.asInstanceOf[js.Any], packing = packing.asInstanceOf[js.Any], packing_best = packing_best.asInstanceOf[js.Any], pallet = pallet.asInstanceOf[js.Any], pre_layer = pre_layer.asInstanceOf[js.Any], remain_layout_height = remain_layout_height.asInstanceOf[js.Any], remain_layout_length = remain_layout_length.asInstanceOf[js.Any], report_results = js.Any.fromFunction0(report_results), scrap_list = scrap_list.asInstanceOf[js.Any], scrap_min_z = scrap_min_z.asInstanceOf[js.Any], total_box_volume = total_box_volume.asInstanceOf[js.Any], volume_check = js.Any.fromFunction0(volume_check), wrapper = wrapper.asInstanceOf[js.Any], write_box_file = js.Any.fromFunction0(write_box_file))
    __obj.asInstanceOf[Boxologic]
  }
}

