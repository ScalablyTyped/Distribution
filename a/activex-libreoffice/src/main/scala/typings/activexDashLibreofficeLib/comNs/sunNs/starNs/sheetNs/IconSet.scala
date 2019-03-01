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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("IconSetEntries")(IconSetEntries)
    __obj.updateDynamic("Icons")(Icons)
    __obj.updateDynamic("Reverse")(Reverse)
    __obj.updateDynamic("ShowValue")(ShowValue)
    __obj.updateDynamic("Type")(Type)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getType")(getType)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[IconSet]
  }
}

