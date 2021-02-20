package typings.activexLibreoffice.com_.sun.star.util

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** describes the kind of protection for a protectable cell. */
@js.native
trait CellProtection extends StObject {
  
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
  implicit class CellProtectionMutableBuilder[Self <: CellProtection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsFormulaHidden(value: Boolean): Self = StObject.set(x, "IsFormulaHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHidden(value: Boolean): Self = StObject.set(x, "IsHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLocked(value: Boolean): Self = StObject.set(x, "IsLocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPrintHidden(value: Boolean): Self = StObject.set(x, "IsPrintHidden", value.asInstanceOf[js.Any])
  }
}
