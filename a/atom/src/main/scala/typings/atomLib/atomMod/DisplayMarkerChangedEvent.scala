package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisplayMarkerChangedEvent extends js.Object {
  /** Boolean indicating whether the marker had a tail before the change. */
  var hadTail: scala.Boolean
  /** Boolean indicating whether the marker now has a tail */
  var hasTail: scala.Boolean
  /** Boolean indicating whether the marker is now valid. */
  var isValid: scala.Boolean
  /** Point representing the new head buffer position. */
  var newHeadBufferPosition: Point
  /** Point representing the new head screen position. */
  var newHeadScreenPosition: Point
  /**
    *  -DEPRECATED- Object containing the marker's custom properties after the change.
    *  @deprecated
    */
  var newProperties: js.Object
  /** Point representing the new tail buffer position. */
  var newTailBufferPosition: Point
  /** Point representing the new tail screen position. */
  var newTailScreenPosition: Point
  /** Point representing the former head buffer position. */
  var oldHeadBufferPosition: Point
  /** Point representing the former head screen position. */
  var oldHeadScreenPosition: Point
  /**
    *  -DEPRECATED- Object containing the marker's custom properties before the change.
    *  @deprecated
    */
  var oldProperties: js.Object
  // Point representing the former tail buffer position. */
  var oldTailBufferPosition: Point
  /** Point representing the former tail screen position. */
  var oldTailScreenPosition: Point
  /**
    *  Boolean indicating whether this change was caused by a textual change to the
    *  buffer or whether the marker was manipulated directly via its public API.
    */
  var textChanged: scala.Boolean
  /** Boolean indicating whether the marker was valid before the change. */
  var wasValid: scala.Boolean
}

object DisplayMarkerChangedEvent {
  @scala.inline
  def apply(
    hadTail: scala.Boolean,
    hasTail: scala.Boolean,
    isValid: scala.Boolean,
    newHeadBufferPosition: Point,
    newHeadScreenPosition: Point,
    newProperties: js.Object,
    newTailBufferPosition: Point,
    newTailScreenPosition: Point,
    oldHeadBufferPosition: Point,
    oldHeadScreenPosition: Point,
    oldProperties: js.Object,
    oldTailBufferPosition: Point,
    oldTailScreenPosition: Point,
    textChanged: scala.Boolean,
    wasValid: scala.Boolean
  ): DisplayMarkerChangedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hadTail")(hadTail)
    __obj.updateDynamic("hasTail")(hasTail)
    __obj.updateDynamic("isValid")(isValid)
    __obj.updateDynamic("newHeadBufferPosition")(newHeadBufferPosition)
    __obj.updateDynamic("newHeadScreenPosition")(newHeadScreenPosition)
    __obj.updateDynamic("newProperties")(newProperties)
    __obj.updateDynamic("newTailBufferPosition")(newTailBufferPosition)
    __obj.updateDynamic("newTailScreenPosition")(newTailScreenPosition)
    __obj.updateDynamic("oldHeadBufferPosition")(oldHeadBufferPosition)
    __obj.updateDynamic("oldHeadScreenPosition")(oldHeadScreenPosition)
    __obj.updateDynamic("oldProperties")(oldProperties)
    __obj.updateDynamic("oldTailBufferPosition")(oldTailBufferPosition)
    __obj.updateDynamic("oldTailScreenPosition")(oldTailScreenPosition)
    __obj.updateDynamic("textChanged")(textChanged)
    __obj.updateDynamic("wasValid")(wasValid)
    __obj.asInstanceOf[DisplayMarkerChangedEvent]
  }
}

