package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.`type`
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconSet extends XConditionEntry {
  var IconSetEntries: SafeArray[XIconSetEntry]
  /** See {@link com.sun.star.sheet.IconSetType} for possible values. */
  var Icons: Double
  var Reverse: Boolean
  var ShowValue: Boolean
}

object IconSet {
  @scala.inline
  def apply(
    IconSetEntries: SafeArray[XIconSetEntry],
    Icons: Double,
    Reverse: Boolean,
    ShowValue: Boolean,
    Type: Double,
    acquire: () => Unit,
    getType: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): IconSet = {
    val __obj = js.Dynamic.literal(IconSetEntries = IconSetEntries, Icons = Icons, Reverse = Reverse, ShowValue = ShowValue, Type = Type, acquire = js.Any.fromFunction0(acquire), getType = js.Any.fromFunction0(getType), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[IconSet]
  }
}

