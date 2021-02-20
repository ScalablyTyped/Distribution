package typings.agGrid.iExcelCreatorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExcelProtection extends StObject {
  
  var hideFormula: Boolean = js.native
  
  var `protected`: Boolean = js.native
}
object ExcelProtection {
  
  @scala.inline
  def apply(hideFormula: Boolean, `protected`: Boolean): ExcelProtection = {
    val __obj = js.Dynamic.literal(hideFormula = hideFormula.asInstanceOf[js.Any])
    __obj.updateDynamic("protected")(`protected`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExcelProtection]
  }
  
  @scala.inline
  implicit class ExcelProtectionMutableBuilder[Self <: ExcelProtection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHideFormula(value: Boolean): Self = StObject.set(x, "hideFormula", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtected(value: Boolean): Self = StObject.set(x, "protected", value.asInstanceOf[js.Any])
  }
}
