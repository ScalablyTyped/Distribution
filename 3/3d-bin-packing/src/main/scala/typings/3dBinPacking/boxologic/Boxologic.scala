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
@js.native
trait Boxologic extends js.Object {
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
  @scala.inline
  implicit class BoxologicOps[Self <: Boxologic] (val x: Self) extends AnyVal {
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
    def setAnalyze_box(value: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any): Self = this.set("analyze_box", js.Any.fromFunction9(value))
    @scala.inline
    def setBbfx(value: js.Any): Self = this.set("bbfx", value.asInstanceOf[js.Any])
    @scala.inline
    def setBbfy(value: js.Any): Self = this.set("bbfy", value.asInstanceOf[js.Any])
    @scala.inline
    def setBbfz(value: js.Any): Self = this.set("bbfz", value.asInstanceOf[js.Any])
    @scala.inline
    def setBboxi(value: js.Any): Self = this.set("bboxi", value.asInstanceOf[js.Any])
    @scala.inline
    def setBboxx(value: js.Any): Self = this.set("bboxx", value.asInstanceOf[js.Any])
    @scala.inline
    def setBboxy(value: js.Any): Self = this.set("bboxy", value.asInstanceOf[js.Any])
    @scala.inline
    def setBboxz(value: js.Any): Self = this.set("bboxz", value.asInstanceOf[js.Any])
    @scala.inline
    def setBest_layer(value: js.Any): Self = this.set("best_layer", value.asInstanceOf[js.Any])
    @scala.inline
    def setBest_orientation(value: js.Any): Self = this.set("best_orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def setBest_solution_volume(value: js.Any): Self = this.set("best_solution_volume", value.asInstanceOf[js.Any])
    @scala.inline
    def setBfx(value: js.Any): Self = this.set("bfx", value.asInstanceOf[js.Any])
    @scala.inline
    def setBfy(value: js.Any): Self = this.set("bfy", value.asInstanceOf[js.Any])
    @scala.inline
    def setBfz(value: js.Any): Self = this.set("bfz", value.asInstanceOf[js.Any])
    @scala.inline
    def setBox_array(value: js.Any): Self = this.set("box_array", value.asInstanceOf[js.Any])
    @scala.inline
    def setBoxi(value: js.Any): Self = this.set("boxi", value.asInstanceOf[js.Any])
    @scala.inline
    def setBoxx(value: js.Any): Self = this.set("boxx", value.asInstanceOf[js.Any])
    @scala.inline
    def setBoxy(value: js.Any): Self = this.set("boxy", value.asInstanceOf[js.Any])
    @scala.inline
    def setBoxz(value: js.Any): Self = this.set("boxz", value.asInstanceOf[js.Any])
    @scala.inline
    def setCbox_layout_height(value: js.Any): Self = this.set("cbox_layout_height", value.asInstanceOf[js.Any])
    @scala.inline
    def setCbox_layout_length(value: js.Any): Self = this.set("cbox_layout_length", value.asInstanceOf[js.Any])
    @scala.inline
    def setCbox_layout_width(value: js.Any): Self = this.set("cbox_layout_width", value.asInstanceOf[js.Any])
    @scala.inline
    def setCboxi(value: js.Any): Self = this.set("cboxi", value.asInstanceOf[js.Any])
    @scala.inline
    def setCheck_found(value: () => js.Any): Self = this.set("check_found", js.Any.fromFunction0(value))
    @scala.inline
    def setConstruct_layers(value: () => js.Any): Self = this.set("construct_layers", js.Any.fromFunction0(value))
    @scala.inline
    def setDecode(value: () => js.Any): Self = this.set("decode", js.Any.fromFunction0(value))
    @scala.inline
    def setEncode(value: () => js.Any): Self = this.set("encode", js.Any.fromFunction0(value))
    @scala.inline
    def setEvened(value: js.Any): Self = this.set("evened", value.asInstanceOf[js.Any])
    @scala.inline
    def setFind_box(value: (js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any): Self = this.set("find_box", js.Any.fromFunction5(value))
    @scala.inline
    def setFind_layer(value: js.Any => js.Any): Self = this.set("find_layer", js.Any.fromFunction1(value))
    @scala.inline
    def setFind_smallest_z(value: () => js.Any): Self = this.set("find_smallest_z", js.Any.fromFunction0(value))
    @scala.inline
    def setHundred_percent(value: js.Any): Self = this.set("hundred_percent", value.asInstanceOf[js.Any])
    @scala.inline
    def setInspect_validity(value: () => js.Any): Self = this.set("inspect_validity", js.Any.fromFunction0(value))
    @scala.inline
    def setInstanceArray(value: js.Any): Self = this.set("instanceArray", value.asInstanceOf[js.Any])
    @scala.inline
    def setIterate_layer(value: js.Any => js.Any): Self = this.set("iterate_layer", js.Any.fromFunction1(value))
    @scala.inline
    def setIterate_orientations(value: () => js.Any): Self = this.set("iterate_orientations", js.Any.fromFunction0(value))
    @scala.inline
    def setLayer_done(value: js.Any): Self = this.set("layer_done", value.asInstanceOf[js.Any])
    @scala.inline
    def setLayer_in_layer(value: js.Any): Self = this.set("layer_in_layer", value.asInstanceOf[js.Any])
    @scala.inline
    def setLayer_map(value: js.Any): Self = this.set("layer_map", value.asInstanceOf[js.Any])
    @scala.inline
    def setLayer_thickness(value: js.Any): Self = this.set("layer_thickness", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeftInstances(value: js.Any): Self = this.set("leftInstances", value.asInstanceOf[js.Any])
    @scala.inline
    def setLilz(value: js.Any): Self = this.set("lilz", value.asInstanceOf[js.Any])
    @scala.inline
    def setPack(value: () => js.Any): Self = this.set("pack", js.Any.fromFunction0(value))
    @scala.inline
    def setPack_layer(value: () => js.Any): Self = this.set("pack_layer", js.Any.fromFunction0(value))
    @scala.inline
    def setPacked_layout_height(value: js.Any): Self = this.set("packed_layout_height", value.asInstanceOf[js.Any])
    @scala.inline
    def setPacked_volume(value: js.Any): Self = this.set("packed_volume", value.asInstanceOf[js.Any])
    @scala.inline
    def setPacking(value: js.Any): Self = this.set("packing", value.asInstanceOf[js.Any])
    @scala.inline
    def setPacking_best(value: js.Any): Self = this.set("packing_best", value.asInstanceOf[js.Any])
    @scala.inline
    def setPallet(value: js.Any): Self = this.set("pallet", value.asInstanceOf[js.Any])
    @scala.inline
    def setPre_layer(value: js.Any): Self = this.set("pre_layer", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemain_layout_height(value: js.Any): Self = this.set("remain_layout_height", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemain_layout_length(value: js.Any): Self = this.set("remain_layout_length", value.asInstanceOf[js.Any])
    @scala.inline
    def setReport_results(value: () => js.Any): Self = this.set("report_results", js.Any.fromFunction0(value))
    @scala.inline
    def setScrap_list(value: js.Any): Self = this.set("scrap_list", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrap_min_z(value: js.Any): Self = this.set("scrap_min_z", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotal_box_volume(value: js.Any): Self = this.set("total_box_volume", value.asInstanceOf[js.Any])
    @scala.inline
    def setVolume_check(value: () => js.Any): Self = this.set("volume_check", js.Any.fromFunction0(value))
    @scala.inline
    def setWrapper(value: js.Any): Self = this.set("wrapper", value.asInstanceOf[js.Any])
    @scala.inline
    def setWrite_box_file(value: () => js.Any): Self = this.set("write_box_file", js.Any.fromFunction0(value))
  }
  
}

