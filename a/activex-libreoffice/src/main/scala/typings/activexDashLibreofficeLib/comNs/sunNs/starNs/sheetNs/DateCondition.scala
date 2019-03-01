package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateCondition extends XConditionEntry {
  /** See {@link com.sun.star.sheet.DateType} for possible values */
  var DateType: scala.Double
  var StyleName: java.lang.String
}

object DateCondition {
  @scala.inline
  def apply(
    DateType: scala.Double,
    StyleName: java.lang.String,
    Type: scala.Double,
    acquire: js.Function0[scala.Unit],
    getType: js.Function0[scala.Double],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): DateCondition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("DateType")(DateType)
    __obj.updateDynamic("StyleName")(StyleName)
    __obj.updateDynamic("Type")(Type)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getType")(getType)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[DateCondition]
  }
}

