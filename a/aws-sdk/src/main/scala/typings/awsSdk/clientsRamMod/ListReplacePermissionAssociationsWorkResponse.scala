package typings.awsSdk.clientsRamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListReplacePermissionAssociationsWorkResponse extends StObject {
  
  /**
    * If present, this value indicates that more output is available than is included in the current response. Use this value in the NextToken request parameter in a subsequent call to the operation to get the next part of the output. You should repeat this until the NextToken response element comes back as null. This indicates that this is the last page of results.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    * An array of data structures that provide details of the matching work IDs.
    */
  var replacePermissionAssociationsWorks: js.UndefOr[ReplacePermissionAssociationsWorkList] = js.undefined
}
object ListReplacePermissionAssociationsWorkResponse {
  
  inline def apply(): ListReplacePermissionAssociationsWorkResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListReplacePermissionAssociationsWorkResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListReplacePermissionAssociationsWorkResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setReplacePermissionAssociationsWorks(value: ReplacePermissionAssociationsWorkList): Self = StObject.set(x, "replacePermissionAssociationsWorks", value.asInstanceOf[js.Any])
    
    inline def setReplacePermissionAssociationsWorksUndefined: Self = StObject.set(x, "replacePermissionAssociationsWorks", js.undefined)
    
    inline def setReplacePermissionAssociationsWorksVarargs(value: ReplacePermissionAssociationsWork*): Self = StObject.set(x, "replacePermissionAssociationsWorks", js.Array(value*))
  }
}
