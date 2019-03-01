package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindDisplayMarkerOptions extends js.Object {
  /** Only include markers contained in this Range in buffer coordinates. */
  var containedInBufferRange: js.UndefOr[RangeCompatible] = js.undefined
  /** Only include markers contained in this Range in screen coordinates. */
  var containedInScreenRange: js.UndefOr[RangeCompatible] = js.undefined
  /** Only include markers containing this Point in buffer coordinates. */
  var containsBufferPosition: js.UndefOr[PointCompatible] = js.undefined
  /** Only include markers containing this Range in buffer coordinates. */
  var containsBufferRange: js.UndefOr[RangeCompatible] = js.undefined
  /** Only include markers ending at this Point in buffer coordinates. */
  var endBufferPosition: js.UndefOr[PointCompatible] = js.undefined
  /** Only include markers ending at this row in buffer coordinates. */
  var endBufferRow: js.UndefOr[scala.Double] = js.undefined
  /** Only include markers ending at this Point in screen coordinates. */
  var endScreenPosition: js.UndefOr[PointCompatible] = js.undefined
  /** Only include markers ending at this row in screen coordinates. */
  var endScreenRow: js.UndefOr[scala.Double] = js.undefined
  /** Only include markers ending inside this Range in buffer coordinates. */
  var endsInBufferRange: js.UndefOr[RangeCompatible] = js.undefined
  /** Only include markers ending inside this Range in screen coordinates. */
  var endsInScreenRange: js.UndefOr[RangeCompatible] = js.undefined
  /** Only include markers intersecting this Range in buffer coordinates. */
  var intersectsBufferRange: js.UndefOr[RangeCompatible] = js.undefined
  /**
    *  Only include markers intersecting this Array of [startRow, endRow] in
    *  buffer coordinates.
    */
  var intersectsBufferRowRange: js.UndefOr[js.Tuple2[scala.Double, scala.Double]] = js.undefined
  /** Only include markers intersecting this Range in screen coordinates. */
  var intersectsScreenRange: js.UndefOr[RangeCompatible] = js.undefined
  /**
    *  Only include markers intersecting this Array of [startRow, endRow] in
    *  screen coordinates.
    */
  var intersectsScreenRowRange: js.UndefOr[js.Tuple2[scala.Double, scala.Double]] = js.undefined
  /** Only include markers starting at this Point in buffer coordinates. */
  var startBufferPosition: js.UndefOr[PointCompatible] = js.undefined
  /** Only include markers starting at this row in buffer coordinates. */
  var startBufferRow: js.UndefOr[scala.Double] = js.undefined
  /** Only include markers starting at this Point in screen coordinates. */
  var startScreenPosition: js.UndefOr[PointCompatible] = js.undefined
  /** Only include markers starting at this row in screen coordinates. */
  var startScreenRow: js.UndefOr[scala.Double] = js.undefined
  /** Only include markers starting inside this Range in buffer coordinates. */
  var startsInBufferRange: js.UndefOr[RangeCompatible] = js.undefined
  /** Only include markers starting inside this Range in screen coordinates. */
  var startsInScreenRange: js.UndefOr[RangeCompatible] = js.undefined
}

object FindDisplayMarkerOptions {
  @scala.inline
  def apply(
    containedInBufferRange: RangeCompatible = null,
    containedInScreenRange: RangeCompatible = null,
    containsBufferPosition: PointCompatible = null,
    containsBufferRange: RangeCompatible = null,
    endBufferPosition: PointCompatible = null,
    endBufferRow: scala.Int | scala.Double = null,
    endScreenPosition: PointCompatible = null,
    endScreenRow: scala.Int | scala.Double = null,
    endsInBufferRange: RangeCompatible = null,
    endsInScreenRange: RangeCompatible = null,
    intersectsBufferRange: RangeCompatible = null,
    intersectsBufferRowRange: js.Tuple2[scala.Double, scala.Double] = null,
    intersectsScreenRange: RangeCompatible = null,
    intersectsScreenRowRange: js.Tuple2[scala.Double, scala.Double] = null,
    startBufferPosition: PointCompatible = null,
    startBufferRow: scala.Int | scala.Double = null,
    startScreenPosition: PointCompatible = null,
    startScreenRow: scala.Int | scala.Double = null,
    startsInBufferRange: RangeCompatible = null,
    startsInScreenRange: RangeCompatible = null
  ): FindDisplayMarkerOptions = {
    val __obj = js.Dynamic.literal()
    if (containedInBufferRange != null) __obj.updateDynamic("containedInBufferRange")(containedInBufferRange.asInstanceOf[js.Any])
    if (containedInScreenRange != null) __obj.updateDynamic("containedInScreenRange")(containedInScreenRange.asInstanceOf[js.Any])
    if (containsBufferPosition != null) __obj.updateDynamic("containsBufferPosition")(containsBufferPosition.asInstanceOf[js.Any])
    if (containsBufferRange != null) __obj.updateDynamic("containsBufferRange")(containsBufferRange.asInstanceOf[js.Any])
    if (endBufferPosition != null) __obj.updateDynamic("endBufferPosition")(endBufferPosition.asInstanceOf[js.Any])
    if (endBufferRow != null) __obj.updateDynamic("endBufferRow")(endBufferRow.asInstanceOf[js.Any])
    if (endScreenPosition != null) __obj.updateDynamic("endScreenPosition")(endScreenPosition.asInstanceOf[js.Any])
    if (endScreenRow != null) __obj.updateDynamic("endScreenRow")(endScreenRow.asInstanceOf[js.Any])
    if (endsInBufferRange != null) __obj.updateDynamic("endsInBufferRange")(endsInBufferRange.asInstanceOf[js.Any])
    if (endsInScreenRange != null) __obj.updateDynamic("endsInScreenRange")(endsInScreenRange.asInstanceOf[js.Any])
    if (intersectsBufferRange != null) __obj.updateDynamic("intersectsBufferRange")(intersectsBufferRange.asInstanceOf[js.Any])
    if (intersectsBufferRowRange != null) __obj.updateDynamic("intersectsBufferRowRange")(intersectsBufferRowRange)
    if (intersectsScreenRange != null) __obj.updateDynamic("intersectsScreenRange")(intersectsScreenRange.asInstanceOf[js.Any])
    if (intersectsScreenRowRange != null) __obj.updateDynamic("intersectsScreenRowRange")(intersectsScreenRowRange)
    if (startBufferPosition != null) __obj.updateDynamic("startBufferPosition")(startBufferPosition.asInstanceOf[js.Any])
    if (startBufferRow != null) __obj.updateDynamic("startBufferRow")(startBufferRow.asInstanceOf[js.Any])
    if (startScreenPosition != null) __obj.updateDynamic("startScreenPosition")(startScreenPosition.asInstanceOf[js.Any])
    if (startScreenRow != null) __obj.updateDynamic("startScreenRow")(startScreenRow.asInstanceOf[js.Any])
    if (startsInBufferRange != null) __obj.updateDynamic("startsInBufferRange")(startsInBufferRange.asInstanceOf[js.Any])
    if (startsInScreenRange != null) __obj.updateDynamic("startsInScreenRange")(startsInScreenRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindDisplayMarkerOptions]
  }
}

