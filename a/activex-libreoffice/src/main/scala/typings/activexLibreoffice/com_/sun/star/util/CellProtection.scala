package typings.activexLibreoffice.com_.sun.star.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** describes the kind of protection for a protectable cell. */
@js.native
trait CellProtection extends js.Object {
  
  /** specifies if the formula is hidden from the user. */
  var IsFormulaHidden: Boolean = js.native
  
  /** specifies if the cell is hidden from the user. */
  var IsHidden: Boolean = js.native
  
  /** specifies if the cell is locked from modifications by the user. */
  var IsLocked: Boolean = js.native
  
  /** specifies if the cell is hidden on printouts. */
  var IsPrintHidden: Boolean = js.native
}
object CellProtection {
  
  @scala.inline
  def apply(IsFormulaHidden: Boolean, IsHidden: Boolean, IsLocked: Boolean, IsPrintHidden: Boolean): CellProtection = {
    val __obj = js.Dynamic.literal(IsFormulaHidden = IsFormulaHidden.asInstanceOf[js.Any], IsHidden = IsHidden.asInstanceOf[js.Any], IsLocked = IsLocked.asInstanceOf[js.Any], IsPrintHidden = IsPrintHidden.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellProtection]
  }
  
  @scala.inline
  implicit class CellProtectionOps[Self <: CellProtection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIsFormulaHidden(value: Boolean): Self = this.set("IsFormulaHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHidden(value: Boolean): Self = this.set("IsHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLocked(value: Boolean): Self = this.set("IsLocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPrintHidden(value: Boolean): Self = this.set("IsPrintHidden", value.asInstanceOf[js.Any])
  }
}
