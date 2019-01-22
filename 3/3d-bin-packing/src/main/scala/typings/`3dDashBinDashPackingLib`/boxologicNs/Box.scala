package typings
package `3dDashBinDashPackingLib`.boxologicNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A box, trying to pack into a {@link Pallet}.
  *
  * @author Bill Knechtel, <br>
  *		   Migrated and Refactored by Jeongho Nam <http://samchon.org>
  */
@JSGlobal("boxologic.Box")
@js.native
class Box protected () extends Instance {
  /**
    * Construct from an instance.
    *
    * @param instance An instance adapts with.
    */
  def this(instance: `3dDashBinDashPackingLib`.bwsNs.packerNs.Instance) = this()
  /**
    * Coordinate-X of the box placement in a {@link Pallet}.
    */
  var cox: scala.Double = js.native
  /**
    * Coordinate-Y of the box placement in a {@link Pallet}.
    */
  var coy: scala.Double = js.native
  /**
    * Coordinate-Z of the box placement in a {@link Pallet}.
    */
  var coz: scala.Double = js.native
  /**
    * Whether the {@link Box} is packed into a {@link Pallet}.
    */
  var is_packed: scala.Boolean = js.native
  var overlapped_boxes: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify std.HashSet<Box> */ js.Any = js.native
  def hit_test(obj: Box): scala.Boolean = js.native
  /* private */ def hit_test_point(x: js.Any, y: js.Any, z: js.Any): js.Any = js.native
  /* private */ def hit_test_single(obj: js.Any): js.Any = js.native
}

