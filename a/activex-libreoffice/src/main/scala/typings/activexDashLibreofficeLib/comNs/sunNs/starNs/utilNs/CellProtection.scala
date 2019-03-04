package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** describes the kind of protection for a protectable cell. */
trait CellProtection extends js.Object {
  /** specifies if the formula is hidden from the user. */
  var IsFormulaHidden: scala.Boolean
  /** specifies if the cell is hidden from the user. */
  var IsHidden: scala.Boolean
  /** specifies if the cell is locked from modifications by the user. */
  var IsLocked: scala.Boolean
  /** specifies if the cell is hidden on printouts. */
  var IsPrintHidden: scala.Boolean
}

object CellProtection {
  @scala.inline
  def apply(
    IsFormulaHidden: scala.Boolean,
    IsHidden: scala.Boolean,
    IsLocked: scala.Boolean,
    IsPrintHidden: scala.Boolean
  ): CellProtection = {
    val __obj = js.Dynamic.literal(IsFormulaHidden = IsFormulaHidden, IsHidden = IsHidden, IsLocked = IsLocked, IsPrintHidden = IsPrintHidden)
  
    __obj.asInstanceOf[CellProtection]
  }
}

