package typings.awsSdk.clientsLakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LFTagPolicyResource extends StObject {
  
  /**
    * The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent metadata store. It contains database definitions, table definitions, and other control information to manage your Lake Formation environment. 
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  
  /**
    * A list of LF-tag conditions that apply to the resource's LF-tag policy.
    */
  var Expression: typings.awsSdk.clientsLakeformationMod.Expression
  
  /**
    * The resource type for which the LF-tag policy applies.
    */
  var ResourceType: typings.awsSdk.clientsLakeformationMod.ResourceType
}
object LFTagPolicyResource {
  
  inline def apply(Expression: Expression, ResourceType: ResourceType): LFTagPolicyResource = {
    val __obj = js.Dynamic.literal(Expression = Expression.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[LFTagPolicyResource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LFTagPolicyResource] (val x: Self) extends AnyVal {
    
    inline def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    inline def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    inline def setExpression(value: Expression): Self = StObject.set(x, "Expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionVarargs(value: LFTag*): Self = StObject.set(x, "Expression", js.Array(value*))
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
  }
}
