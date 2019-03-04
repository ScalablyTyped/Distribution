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
    val __obj = js.Dynamic.literal(DateType = DateType, StyleName = StyleName, Type = Type, acquire = acquire, getType = getType, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[DateCondition]
  }
}

