package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnLevelPermissionRule extends StObject {
  
  /**
    * An array of column names.
    */
  var ColumnNames: js.UndefOr[ColumnNameList] = js.undefined
  
  /**
    * An array of Amazon Resource Names (ARNs) for Amazon QuickSight users or groups.
    */
  var Principals: js.UndefOr[PrincipalList] = js.undefined
}
object ColumnLevelPermissionRule {
  
  inline def apply(): ColumnLevelPermissionRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnLevelPermissionRule]
  }
  
  extension [Self <: ColumnLevelPermissionRule](x: Self) {
    
    inline def setColumnNames(value: ColumnNameList): Self = StObject.set(x, "ColumnNames", value.asInstanceOf[js.Any])
    
    inline def setColumnNamesUndefined: Self = StObject.set(x, "ColumnNames", js.undefined)
    
    inline def setColumnNamesVarargs(value: String*): Self = StObject.set(x, "ColumnNames", js.Array(value*))
    
    inline def setPrincipals(value: PrincipalList): Self = StObject.set(x, "Principals", value.asInstanceOf[js.Any])
    
    inline def setPrincipalsUndefined: Self = StObject.set(x, "Principals", js.undefined)
    
    inline def setPrincipalsVarargs(value: String*): Self = StObject.set(x, "Principals", js.Array(value*))
  }
}
