package typings.awsSdk.clientsDataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableLFTagPolicyAndPermissions extends StObject {
  
  /**
    * A list of LF-tag conditions that apply to table resources.
    */
  var Expression: ListOfLFTags
  
  /**
    * The permissions granted to subscribers on table resources.
    */
  var Permissions: ListOfTableTagPolicyLFPermissions
}
object TableLFTagPolicyAndPermissions {
  
  inline def apply(Expression: ListOfLFTags, Permissions: ListOfTableTagPolicyLFPermissions): TableLFTagPolicyAndPermissions = {
    val __obj = js.Dynamic.literal(Expression = Expression.asInstanceOf[js.Any], Permissions = Permissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableLFTagPolicyAndPermissions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableLFTagPolicyAndPermissions] (val x: Self) extends AnyVal {
    
    inline def setExpression(value: ListOfLFTags): Self = StObject.set(x, "Expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionVarargs(value: LFTag*): Self = StObject.set(x, "Expression", js.Array(value*))
    
    inline def setPermissions(value: ListOfTableTagPolicyLFPermissions): Self = StObject.set(x, "Permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsVarargs(value: TableTagPolicyLFPermission*): Self = StObject.set(x, "Permissions", js.Array(value*))
  }
}
