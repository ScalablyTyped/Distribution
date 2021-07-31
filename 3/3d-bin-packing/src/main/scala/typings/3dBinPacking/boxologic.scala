package typings.`3dBinPacking`

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
object boxologic {
  
  /**
    * A box, trying to pack into a {@link Pallet}.
    *
    * @author Bill Knechtel, <br>
    *		   Migrated and Refactored by Jeongho Nam <http://samchon.org>
    */
  trait Box
    extends StObject
       with Instance {
    
    /**
      * Coordinate-X of the box placement in a {@link Pallet}.
      */
    var cox: Double
    
    /**
      * Coordinate-Y of the box placement in a {@link Pallet}.
      */
    var coy: Double
    
    /**
      * Coordinate-Z of the box placement in a {@link Pallet}.
      */
    var coz: Double
    
    def hit_test(obj: Box): Boolean
    
    /* private */ def hit_test_point(x: js.Any, y: js.Any, z: js.Any): js.Any
    
    /* private */ def hit_test_single(obj: js.Any): js.Any
    
    /**
      * Whether the {@link Box} is packed into a {@link Pallet}.
      */
    var is_packed: Boolean
    
    var overlapped_boxes: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.HashSet<Box> */ js.Any
  }
  object Box {
    
    @scala.inline
    def apply(
      cox: Double,
      coy: Double,
      coz: Double,
      height: Double,
      hit_test: Box => Boolean,
      hit_test_point: (js.Any, js.Any, js.Any) => js.Any,
      hit_test_single: js.Any => js.Any,
      is_packed: Boolean,
      layout_height: Double,
      layout_length: Double,
      layout_width: Double,
      length: Double,
      overlapped_boxes: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.HashSet<Box> */ js.Any,
      volume: Double,
      width: Double
    ): Box = {
      val __obj = js.Dynamic.literal(cox = cox.asInstanceOf[js.Any], coy = coy.asInstanceOf[js.Any], coz = coz.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], hit_test = js.Any.fromFunction1(hit_test), hit_test_point = js.Any.fromFunction3(hit_test_point), hit_test_single = js.Any.fromFunction1(hit_test_single), is_packed = is_packed.asInstanceOf[js.Any], layout_height = layout_height.asInstanceOf[js.Any], layout_length = layout_length.asInstanceOf[js.Any], layout_width = layout_width.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], overlapped_boxes = overlapped_boxes.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Box]
    }
    
    @scala.inline
    implicit class BoxMutableBuilder[Self <: Box] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCox(value: Double): Self = StObject.set(x, "cox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoy(value: Double): Self = StObject.set(x, "coy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoz(value: Double): Self = StObject.set(x, "coz", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHit_test(value: Box => Boolean): Self = StObject.set(x, "hit_test", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHit_test_point(value: (js.Any, js.Any, js.Any) => js.Any): Self = StObject.set(x, "hit_test_point", js.Any.fromFunction3(value))
      
      @scala.inline
      def setHit_test_single(value: js.Any => js.Any): Self = StObject.set(x, "hit_test_single", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIs_packed(value: Boolean): Self = StObject.set(x, "is_packed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlapped_boxes(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.HashSet<Box> */ js.Any
      ): Self = StObject.set(x, "overlapped_boxes", value.asInstanceOf[js.Any])
    }
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
  trait Boxologic extends StObject {
    
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
      * Whether the current packing layer is evened.
      */
    var evened: js.Any
    
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
    
    /**
      * Whether the utilization degree of pallet space is 100%.
      */
    var hundred_percent: js.Any
    
    /* private */ def inspect_validity(): js.Any
    
    /**
      * Instances trying to put into the wrapper.
      */
    var instanceArray: js.Any
    
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
      * <p> Determine {@link box_arrray boxes}. </p>
      *
      * <p> Using the parameters found, packs the best solution found and reports. </p>
      */
    /* private */ def report_results(): js.Any
    
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
      * After packing of each box, 100% packing condition is checked.
      */
    /* private */ def volume_check(): js.Any
    
    /**
      * A Wrapper to pack instances.
      */
    var wrapper: js.Any
    
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
    
    @scala.inline
    implicit class BoxologicMutableBuilder[Self <: Boxologic] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnalyze_box(value: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any): Self = StObject.set(x, "analyze_box", js.Any.fromFunction9(value))
      
      @scala.inline
      def setBbfx(value: js.Any): Self = StObject.set(x, "bbfx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBbfy(value: js.Any): Self = StObject.set(x, "bbfy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBbfz(value: js.Any): Self = StObject.set(x, "bbfz", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBboxi(value: js.Any): Self = StObject.set(x, "bboxi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBboxx(value: js.Any): Self = StObject.set(x, "bboxx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBboxy(value: js.Any): Self = StObject.set(x, "bboxy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBboxz(value: js.Any): Self = StObject.set(x, "bboxz", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBest_layer(value: js.Any): Self = StObject.set(x, "best_layer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBest_orientation(value: js.Any): Self = StObject.set(x, "best_orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBest_solution_volume(value: js.Any): Self = StObject.set(x, "best_solution_volume", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBfx(value: js.Any): Self = StObject.set(x, "bfx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBfy(value: js.Any): Self = StObject.set(x, "bfy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBfz(value: js.Any): Self = StObject.set(x, "bfz", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBox_array(value: js.Any): Self = StObject.set(x, "box_array", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoxi(value: js.Any): Self = StObject.set(x, "boxi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoxx(value: js.Any): Self = StObject.set(x, "boxx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoxy(value: js.Any): Self = StObject.set(x, "boxy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoxz(value: js.Any): Self = StObject.set(x, "boxz", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCbox_layout_height(value: js.Any): Self = StObject.set(x, "cbox_layout_height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCbox_layout_length(value: js.Any): Self = StObject.set(x, "cbox_layout_length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCbox_layout_width(value: js.Any): Self = StObject.set(x, "cbox_layout_width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCboxi(value: js.Any): Self = StObject.set(x, "cboxi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheck_found(value: () => js.Any): Self = StObject.set(x, "check_found", js.Any.fromFunction0(value))
      
      @scala.inline
      def setConstruct_layers(value: () => js.Any): Self = StObject.set(x, "construct_layers", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDecode(value: () => js.Any): Self = StObject.set(x, "decode", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEncode(value: () => js.Any): Self = StObject.set(x, "encode", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEvened(value: js.Any): Self = StObject.set(x, "evened", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFind_box(value: (js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any): Self = StObject.set(x, "find_box", js.Any.fromFunction5(value))
      
      @scala.inline
      def setFind_layer(value: js.Any => js.Any): Self = StObject.set(x, "find_layer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFind_smallest_z(value: () => js.Any): Self = StObject.set(x, "find_smallest_z", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHundred_percent(value: js.Any): Self = StObject.set(x, "hundred_percent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInspect_validity(value: () => js.Any): Self = StObject.set(x, "inspect_validity", js.Any.fromFunction0(value))
      
      @scala.inline
      def setInstanceArray(value: js.Any): Self = StObject.set(x, "instanceArray", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIterate_layer(value: js.Any => js.Any): Self = StObject.set(x, "iterate_layer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIterate_orientations(value: () => js.Any): Self = StObject.set(x, "iterate_orientations", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLayer_done(value: js.Any): Self = StObject.set(x, "layer_done", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayer_in_layer(value: js.Any): Self = StObject.set(x, "layer_in_layer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayer_map(value: js.Any): Self = StObject.set(x, "layer_map", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayer_thickness(value: js.Any): Self = StObject.set(x, "layer_thickness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftInstances(value: js.Any): Self = StObject.set(x, "leftInstances", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLilz(value: js.Any): Self = StObject.set(x, "lilz", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPack(value: () => js.Any): Self = StObject.set(x, "pack", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPack_layer(value: () => js.Any): Self = StObject.set(x, "pack_layer", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPacked_layout_height(value: js.Any): Self = StObject.set(x, "packed_layout_height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPacked_volume(value: js.Any): Self = StObject.set(x, "packed_volume", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPacking(value: js.Any): Self = StObject.set(x, "packing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPacking_best(value: js.Any): Self = StObject.set(x, "packing_best", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPallet(value: js.Any): Self = StObject.set(x, "pallet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPre_layer(value: js.Any): Self = StObject.set(x, "pre_layer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemain_layout_height(value: js.Any): Self = StObject.set(x, "remain_layout_height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemain_layout_length(value: js.Any): Self = StObject.set(x, "remain_layout_length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReport_results(value: () => js.Any): Self = StObject.set(x, "report_results", js.Any.fromFunction0(value))
      
      @scala.inline
      def setScrap_list(value: js.Any): Self = StObject.set(x, "scrap_list", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrap_min_z(value: js.Any): Self = StObject.set(x, "scrap_min_z", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal_box_volume(value: js.Any): Self = StObject.set(x, "total_box_volume", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVolume_check(value: () => js.Any): Self = StObject.set(x, "volume_check", js.Any.fromFunction0(value))
      
      @scala.inline
      def setWrapper(value: js.Any): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrite_box_file(value: () => js.Any): Self = StObject.set(x, "write_box_file", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * <p> An abstract instance of boxologic. </p>
    *
    * <p> {@link st_Instance} represents a physical, tangible instance of 3-dimension. </p>
    *
    * @author Jeongho Nam <http://samchon.org>
    */
  trait Instance extends StObject {
    
    /**
      * Height of the tangible instance, length on the Y-axis in 3D.
      */
    var height: Double
    
    /**
      * Height considering layout placement.
      */
    var layout_height: Double
    
    /**
      * Length considering layout placement.
      */
    var layout_length: Double
    
    /**
      * Width considering layout placement.
      */
    var layout_width: Double
    
    /**
      * Length of the tangible instance, length on the Z-axis in 3D.
      */
    var length: Double
    
    /**
      * Volume, Width x Height x Length.
      */
    var volume: Double
    
    /**
      * Width of the tangible instance, length on the X-axis in 3D.
      */
    var width: Double
  }
  object Instance {
    
    @scala.inline
    def apply(
      height: Double,
      layout_height: Double,
      layout_length: Double,
      layout_width: Double,
      length: Double,
      volume: Double,
      width: Double
    ): Instance = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], layout_height = layout_height.asInstanceOf[js.Any], layout_length = layout_length.asInstanceOf[js.Any], layout_width = layout_width.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Instance]
    }
    
    @scala.inline
    implicit class InstanceMutableBuilder[Self <: Instance] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayout_height(value: Double): Self = StObject.set(x, "layout_height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayout_length(value: Double): Self = StObject.set(x, "layout_length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayout_width(value: Double): Self = StObject.set(x, "layout_width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * A pallet containing boxes.
    *
    * @author Bill Knechtel, <br>
    *		   Migrated and Refactored by Jeongho Nam <http://samchon.org>
    */
  trait Pallet
    extends StObject
       with Instance {
    
    /**
      * Set placement orientation.
      */
    def set_orientation(orientation: Double): Unit
  }
  object Pallet {
    
    @scala.inline
    def apply(
      height: Double,
      layout_height: Double,
      layout_length: Double,
      layout_width: Double,
      length: Double,
      set_orientation: Double => Unit,
      volume: Double,
      width: Double
    ): Pallet = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], layout_height = layout_height.asInstanceOf[js.Any], layout_length = layout_length.asInstanceOf[js.Any], layout_width = layout_width.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], set_orientation = js.Any.fromFunction1(set_orientation), volume = volume.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Pallet]
    }
    
    @scala.inline
    implicit class PalletMutableBuilder[Self <: Pallet] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSet_orientation(value: Double => Unit): Self = StObject.set(x, "set_orientation", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * <p> Cumulated lengths of current layer. </p>
    *
    * <p> {@link Scrapped} represents an edge of the current layer under construction. </p>
    *
    * @author Bill Knechtel, <br>
    *		   Migrated and Refactored by Jeongho Nam <http://samchon.org>
    */
  trait Scrap extends StObject {
    
    /**
      * Cumulated length on the X-axis in 3D.
      */
    var cumx: Double
    
    /**
      * Cumulated length on the Z-axis in 3D.
      */
    var cumz: Double
  }
  object Scrap {
    
    @scala.inline
    def apply(cumx: Double, cumz: Double): Scrap = {
      val __obj = js.Dynamic.literal(cumx = cumx.asInstanceOf[js.Any], cumz = cumz.asInstanceOf[js.Any])
      __obj.asInstanceOf[Scrap]
    }
    
    @scala.inline
    implicit class ScrapMutableBuilder[Self <: Scrap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCumx(value: Double): Self = StObject.set(x, "cumx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCumz(value: Double): Self = StObject.set(x, "cumz", value.asInstanceOf[js.Any])
    }
  }
}
