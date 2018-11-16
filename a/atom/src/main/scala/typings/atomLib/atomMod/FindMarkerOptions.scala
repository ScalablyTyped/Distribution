package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FindMarkerOptions extends js.Object {
  /** Only include markers that contain the given Point, inclusive. */
  var containsPoint: js.UndefOr[PointCompatible] = js.undefined
  /** Only include markers that contain the given Range, inclusive. */
  var containsRange: js.UndefOr[RangeCompatible] = js.undefined
  /** Only include markers that end at the given Point. */
  var endPosition: js.UndefOr[PointCompatible] = js.undefined
  /** Only include markers that end at the given row number. */
  var endRow: js.UndefOr[scala.Double] = js.undefined
  /** Only include markers that end inside the given Range. */
  var endsInRange: js.UndefOr[RangeCompatible] = js.undefined
  /** Only include markers that intersect the given row number. */
  var intersectsRow: js.UndefOr[scala.Double] = js.undefined
  /** Only include markers that start at the given Point. */
  var startPosition: js.UndefOr[PointCompatible] = js.undefined
  /** Only include markers that start at the given row number. */
  var startRow: js.UndefOr[scala.Double] = js.undefined
  /** Only include markers that start inside the given Range. */
  var startsInRange: js.UndefOr[RangeCompatible] = js.undefined
}

