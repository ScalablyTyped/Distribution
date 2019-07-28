package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.CellAddress
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
    Formula1: String,
    Formula2: String,
    Operator: ConditionOperator,
    SourcePosition: CellAddress,
    StyleName: String,
    acquire: () => Unit,
    getFormula1: () => String,
    getFormula2: () => String,
    getOperator: () => ConditionOperator,
    getSourcePosition: () => CellAddress,
    getStyleName: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setFormula1: String => Unit,
    setFormula2: String => Unit,
    setOperator: ConditionOperator => Unit,
    setSourcePosition: CellAddress => Unit,
    setStyleName: String => Unit
  ): TableConditionalEntry = {
    val __obj = js.Dynamic.literal(Formula1 = Formula1, Formula2 = Formula2, Operator = Operator, SourcePosition = SourcePosition, StyleName = StyleName, acquire = js.Any.fromFunction0(acquire), getFormula1 = js.Any.fromFunction0(getFormula1), getFormula2 = js.Any.fromFunction0(getFormula2), getOperator = js.Any.fromFunction0(getOperator), getSourcePosition = js.Any.fromFunction0(getSourcePosition), getStyleName = js.Any.fromFunction0(getStyleName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setFormula1 = js.Any.fromFunction1(setFormula1), setFormula2 = js.Any.fromFunction1(setFormula2), setOperator = js.Any.fromFunction1(setOperator), setSourcePosition = js.Any.fromFunction1(setSourcePosition), setStyleName = js.Any.fromFunction1(setStyleName))
  
    __obj.asInstanceOf[TableConditionalEntry]
  }
}

