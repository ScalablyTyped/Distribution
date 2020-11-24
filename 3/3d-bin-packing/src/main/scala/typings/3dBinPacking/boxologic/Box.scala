package typings.`3dBinPacking`.boxologic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A box, trying to pack into a {@link Pallet}.
  *
  * @author Bill Knechtel, <br>
  *		   Migrated and Refactored by Jeongho Nam <http://samchon.org>
  */
@js.native
trait Box extends Instance {
  
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
  
  def hit_test(obj: Box): Boolean = js.native
  
  /* private */ def hit_test_point(x: js.Any, y: js.Any, z: js.Any): js.Any = js.native
  
  /* private */ def hit_test_single(obj: js.Any): js.Any = js.native
  
  /**
    * Whether the {@link Box} is packed into a {@link Pallet}.
    */
  var is_packed: Boolean = js.native
  
  var overlapped_boxes: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.HashSet<Box> */ js.Any = js.native
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
  implicit class BoxOps[Self <: Box] (val x: Self) extends AnyVal {
    
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
    def setCox(value: Double): Self = this.set("cox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoy(value: Double): Self = this.set("coy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoz(value: Double): Self = this.set("coz", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHit_test(value: Box => Boolean): Self = this.set("hit_test", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHit_test_point(value: (js.Any, js.Any, js.Any) => js.Any): Self = this.set("hit_test_point", js.Any.fromFunction3(value))
    
    @scala.inline
    def setHit_test_single(value: js.Any => js.Any): Self = this.set("hit_test_single", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIs_packed(value: Boolean): Self = this.set("is_packed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlapped_boxes(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.HashSet<Box> */ js.Any
    ): Self = this.set("overlapped_boxes", value.asInstanceOf[js.Any])
  }
}
