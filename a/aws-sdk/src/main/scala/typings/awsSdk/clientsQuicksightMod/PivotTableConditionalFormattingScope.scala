package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotTableConditionalFormattingScope extends StObject {
  
  /**
    * The role (field, field total, grand total) of the cell for conditional formatting.
    */
  var Role: js.UndefOr[PivotTableConditionalFormattingScopeRole] = js.undefined
}
object PivotTableConditionalFormattingScope {
  
  inline def apply(): PivotTableConditionalFormattingScope = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotTableConditionalFormattingScope]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PivotTableConditionalFormattingScope] (val x: Self) extends AnyVal {
    
    inline def setRole(value: PivotTableConditionalFormattingScopeRole): Self = StObject.set(x, "Role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "Role", js.undefined)
  }
}
