package typings.awsSdk.clientsSsmcontactsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPageResolutionsRequest extends StObject {
  
  /**
    * A token to start the list. Use this token to get the next set of results.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the contact engaged for the incident.
    */
  var PageId: SsmContactsArn
}
object ListPageResolutionsRequest {
  
  inline def apply(PageId: SsmContactsArn): ListPageResolutionsRequest = {
    val __obj = js.Dynamic.literal(PageId = PageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPageResolutionsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListPageResolutionsRequest] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPageId(value: SsmContactsArn): Self = StObject.set(x, "PageId", value.asInstanceOf[js.Any])
  }
}
