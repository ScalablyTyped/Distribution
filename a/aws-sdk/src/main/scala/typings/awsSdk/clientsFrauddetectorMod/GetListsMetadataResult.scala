package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetListsMetadataResult extends StObject {
  
  /**
    *  The metadata of the specified list or all lists under the account. 
    */
  var lists: js.UndefOr[AllowDenyLists] = js.undefined
  
  /**
    *  The next page token. 
    */
  var nextToken: js.UndefOr[typings.awsSdk.clientsFrauddetectorMod.nextToken] = js.undefined
}
object GetListsMetadataResult {
  
  inline def apply(): GetListsMetadataResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetListsMetadataResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetListsMetadataResult] (val x: Self) extends AnyVal {
    
    inline def setLists(value: AllowDenyLists): Self = StObject.set(x, "lists", value.asInstanceOf[js.Any])
    
    inline def setListsUndefined: Self = StObject.set(x, "lists", js.undefined)
    
    inline def setListsVarargs(value: AllowDenyList*): Self = StObject.set(x, "lists", js.Array(value*))
    
    inline def setNextToken(value: nextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
