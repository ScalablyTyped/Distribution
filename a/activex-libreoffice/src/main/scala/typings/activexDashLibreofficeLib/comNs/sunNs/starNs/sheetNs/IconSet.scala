package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconSet extends XConditionEntry {
  var IconSetEntries: activexDashInteropLib.SafeArray[XIconSetEntry]
  /** See {@link com.sun.star.sheet.IconSetType} for possible values. */
  var Icons: scala.Double
  var Reverse: scala.Boolean
  var ShowValue: scala.Boolean
}

object IconSet {
  @scala.inline
  def apply(
    IconSetEntries: activexDashInteropLib.SafeArray[XIconSetEntry],
    Icons: scala.Double,
    Reverse: scala.Boolean,
    ShowValue: scala.Boolean,
    Type: scala.Double,
    acquire: js.Function0[scala.Unit],
    getType: js.Function0[scala.Double],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): IconSet = {
    val __obj = js.Dynamic.literal(IconSetEntries = IconSetEntries, Icons = Icons, Reverse = Reverse, ShowValue = ShowValue, Type = Type, acquire = acquire, getType = getType, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[IconSet]
  }
}

