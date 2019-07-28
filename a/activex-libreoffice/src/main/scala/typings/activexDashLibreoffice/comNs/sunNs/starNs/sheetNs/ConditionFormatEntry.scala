package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConditionFormatEntry extends XConditionEntry {
  var Formula1: String
  var Formula2: String
  /** See {@link com.sun.star.sheet.ConditionFormatOperator} for valid values */
  var Operator: Double
  var StyleName: String
}

object ConditionFormatEntry {
  @scala.inline
  def apply(
    Formula1: String,
    Formula2: String,
    Operator: Double,
    StyleName: String,
    Type: Double,
    acquire: () => Unit,
    getType: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): ConditionFormatEntry = {
    val __obj = js.Dynamic.literal(Formula1 = Formula1, Formula2 = Formula2, Operator = Operator, StyleName = StyleName, Type = Type, acquire = js.Any.fromFunction0(acquire), getType = js.Any.fromFunction0(getType), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[ConditionFormatEntry]
  }
}

