package typings.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetProtocolsListResponse extends StObject {
  
  /**
    * Information about the specified Firewall Manager protocols list.
    */
  var ProtocolsList: js.UndefOr[ProtocolsListData] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the specified protocols list.
    */
  var ProtocolsListArn: js.UndefOr[ResourceArn] = js.undefined
}
object GetProtocolsListResponse {
  
  inline def apply(): GetProtocolsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetProtocolsListResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetProtocolsListResponse] (val x: Self) extends AnyVal {
    
    inline def setProtocolsList(value: ProtocolsListData): Self = StObject.set(x, "ProtocolsList", value.asInstanceOf[js.Any])
    
    inline def setProtocolsListArn(value: ResourceArn): Self = StObject.set(x, "ProtocolsListArn", value.asInstanceOf[js.Any])
    
    inline def setProtocolsListArnUndefined: Self = StObject.set(x, "ProtocolsListArn", js.undefined)
    
    inline def setProtocolsListUndefined: Self = StObject.set(x, "ProtocolsList", js.undefined)
  }
}
