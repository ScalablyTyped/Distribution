package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides methods to access the settings of a condition in a conditional format or data validation.
  * @see com.sun.star.sheet.TableConditionalEntry
  * @see com.sun.star.sheet.TableValidation
  * @see com.sun.star.sheet.XSheetCondition
  */
trait XSheetCondition2 extends XSheetCondition {
  /** returns the operator in the condition (new interface). */
  var ConditionOperator: scala.Double
  /** returns the operator in the condition (new interface). */
  def getConditionOperator(): scala.Double
  /** sets the operator in the condition (new interface). */
  def setConditionOperator(nOperator: scala.Double): scala.Unit
}

