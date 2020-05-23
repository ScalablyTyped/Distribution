package typings.`3dBinPacking`.boxologic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A box, trying to pack into a {@link Pallet}.
  *
  * @author Bill Knechtel, <br>
  *		   Migrated and Refactored by Jeongho Nam <http://samchon.org>
  */
trait Box extends Instance {
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
  /**
    * Whether the {@link Box} is packed into a {@link Pallet}.
    */
  var is_packed: Boolean
  var overlapped_boxes: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.HashSet<Box> */ js.Any
  def hit_test(obj: Box): Boolean
  /* private */ def hit_test_point(x: js.Any, y: js.Any, z: js.Any): js.Any
  /* private */ def hit_test_single(obj: js.Any): js.Any
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
}

