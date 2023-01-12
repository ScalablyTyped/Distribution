package typings.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAppsListRequest extends StObject {
  
  /**
    * The ID of the applications list that you want to delete. You can retrieve this ID from PutAppsList, ListAppsLists, and GetAppsList.
    */
  var ListId: typings.awsSdk.clientsFmsMod.ListId
}
object DeleteAppsListRequest {
  
  inline def apply(ListId: ListId): DeleteAppsListRequest = {
    val __obj = js.Dynamic.literal(ListId = ListId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAppsListRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteAppsListRequest] (val x: Self) extends AnyVal {
    
    inline def setListId(value: ListId): Self = StObject.set(x, "ListId", value.asInstanceOf[js.Any])
  }
}
