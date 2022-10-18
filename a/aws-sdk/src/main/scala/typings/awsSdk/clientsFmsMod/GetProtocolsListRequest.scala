package typings.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetProtocolsListRequest extends StObject {
  
  /**
    * Specifies whether the list to retrieve is a default list owned by Firewall Manager.
    */
  var DefaultList: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the Firewall Manager protocols list that you want the details for.
    */
  var ListId: typings.awsSdk.clientsFmsMod.ListId
}
object GetProtocolsListRequest {
  
  inline def apply(ListId: ListId): GetProtocolsListRequest = {
    val __obj = js.Dynamic.literal(ListId = ListId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetProtocolsListRequest]
  }
  
  extension [Self <: GetProtocolsListRequest](x: Self) {
    
    inline def setDefaultList(value: Boolean): Self = StObject.set(x, "DefaultList", value.asInstanceOf[js.Any])
    
    inline def setDefaultListUndefined: Self = StObject.set(x, "DefaultList", js.undefined)
    
    inline def setListId(value: ListId): Self = StObject.set(x, "ListId", value.asInstanceOf[js.Any])
  }
}
