package typings.awsSdk.clientsDataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatabaseLFTagPolicyAndPermissions extends StObject {
  
  /**
    * A list of LF-tag conditions that apply to database resources.
    */
  var Expression: ListOfLFTags
  
  /**
    * The permissions granted to subscribers on database resources.
    */
  var Permissions: ListOfDatabaseLFTagPolicyPermissions
}
object DatabaseLFTagPolicyAndPermissions {
  
  inline def apply(Expression: ListOfLFTags, Permissions: ListOfDatabaseLFTagPolicyPermissions): DatabaseLFTagPolicyAndPermissions = {
    val __obj = js.Dynamic.literal(Expression = Expression.asInstanceOf[js.Any], Permissions = Permissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseLFTagPolicyAndPermissions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DatabaseLFTagPolicyAndPermissions] (val x: Self) extends AnyVal {
    
    inline def setExpression(value: ListOfLFTags): Self = StObject.set(x, "Expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionVarargs(value: LFTag*): Self = StObject.set(x, "Expression", js.Array(value*))
    
    inline def setPermissions(value: ListOfDatabaseLFTagPolicyPermissions): Self = StObject.set(x, "Permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsVarargs(value: DatabaseLFTagPolicyPermission*): Self = StObject.set(x, "Permissions", js.Array(value*))
  }
}
