package typings.awsSdk.clientsPinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateOptOutListRequest extends StObject {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you don't specify a client token, a randomly generated token is used for the request to ensure idempotency.
    */
  var ClientToken: js.UndefOr[typings.awsSdk.clientsPinpointsmsvoicev2Mod.ClientToken] = js.undefined
  
  /**
    * The name of the new OptOutList.
    */
  var OptOutListName: typings.awsSdk.clientsPinpointsmsvoicev2Mod.OptOutListName
  
  /**
    * An array of tags (key and value pairs) to associate with the new OptOutList.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateOptOutListRequest {
  
  inline def apply(OptOutListName: OptOutListName): CreateOptOutListRequest = {
    val __obj = js.Dynamic.literal(OptOutListName = OptOutListName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOptOutListRequest]
  }
  
  extension [Self <: CreateOptOutListRequest](x: Self) {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setOptOutListName(value: OptOutListName): Self = StObject.set(x, "OptOutListName", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
