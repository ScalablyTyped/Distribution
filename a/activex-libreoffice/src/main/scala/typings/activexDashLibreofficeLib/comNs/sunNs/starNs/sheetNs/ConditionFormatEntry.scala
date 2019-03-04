package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConditionFormatEntry extends XConditionEntry {
  var Formula1: java.lang.String
  var Formula2: java.lang.String
  /** See {@link com.sun.star.sheet.ConditionFormatOperator} for valid values */
  var Operator: scala.Double
  var StyleName: java.lang.String
}

object ConditionFormatEntry {
  @scala.inline
  def apply(
    Formula1: java.lang.String,
    Formula2: java.lang.String,
    Operator: scala.Double,
    StyleName: java.lang.String,
    Type: scala.Double,
    acquire: js.Function0[scala.Unit],
    getType: js.Function0[scala.Double],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): ConditionFormatEntry = {
    val __obj = js.Dynamic.literal(Formula1 = Formula1, Formula2 = Formula2, Operator = Operator, StyleName = StyleName, Type = Type, acquire = acquire, getType = getType, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[ConditionFormatEntry]
  }
}

