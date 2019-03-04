package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a single condition in a conditional format.
  * @see com.sun.star.sheet.TableConditionalFormat
  */
trait TableConditionalEntry
  extends XSheetCondition
     with XSheetConditionalEntry

object TableConditionalEntry {
  @scala.inline
  def apply(
    Formula1: java.lang.String,
    Formula2: java.lang.String,
    Operator: ConditionOperator,
    SourcePosition: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress,
    StyleName: java.lang.String,
    acquire: js.Function0[scala.Unit],
    getFormula1: js.Function0[java.lang.String],
    getFormula2: js.Function0[java.lang.String],
    getOperator: js.Function0[ConditionOperator],
    getSourcePosition: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress],
    getStyleName: js.Function0[java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setFormula1: js.Function1[java.lang.String, scala.Unit],
    setFormula2: js.Function1[java.lang.String, scala.Unit],
    setOperator: js.Function1[ConditionOperator, scala.Unit],
    setSourcePosition: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress, scala.Unit],
    setStyleName: js.Function1[java.lang.String, scala.Unit]
  ): TableConditionalEntry = {
    val __obj = js.Dynamic.literal(Formula1 = Formula1, Formula2 = Formula2, Operator = Operator, SourcePosition = SourcePosition, StyleName = StyleName, acquire = acquire, getFormula1 = getFormula1, getFormula2 = getFormula2, getOperator = getOperator, getSourcePosition = getSourcePosition, getStyleName = getStyleName, queryInterface = queryInterface, release = release, setFormula1 = setFormula1, setFormula2 = setFormula2, setOperator = setOperator, setSourcePosition = setSourcePosition, setStyleName = setStyleName)
  
    __obj.asInstanceOf[TableConditionalEntry]
  }
}

