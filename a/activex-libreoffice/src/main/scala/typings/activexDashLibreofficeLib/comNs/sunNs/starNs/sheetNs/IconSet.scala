package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconSet extends XConditionEntry {
  var IconSetEntries: stdLib.SafeArray[XIconSetEntry]
  /** See {@link com.sun.star.sheet.IconSetType} for possible values. */
  var Icons: scala.Double
  var Reverse: scala.Boolean
  var ShowValue: scala.Boolean
}

object IconSet {
  @scala.inline
  def apply(
    IconSetEntries: stdLib.SafeArray[XIconSetEntry],
    Icons: scala.Double,
    Reverse: scala.Boolean,
    ShowValue: scala.Boolean,
    Type: scala.Double,
    acquire: () => scala.Unit,
    getType: () => scala.Double,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): IconSet = {
    val __obj = js.Dynamic.literal(IconSetEntries = IconSetEntries, Icons = Icons, Reverse = Reverse, ShowValue = ShowValue, Type = Type, acquire = js.Any.fromFunction0(acquire), getType = js.Any.fromFunction0(getType), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[IconSet]
  }
}

