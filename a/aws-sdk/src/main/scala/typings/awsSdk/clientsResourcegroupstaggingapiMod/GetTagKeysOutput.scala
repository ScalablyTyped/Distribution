package typings.awsSdk.clientsResourcegroupstaggingapiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTagKeysOutput extends StObject {
  
  /**
    * A string that indicates that there is more data available than this response contains. To receive the next part of the response, specify this response value as the PaginationToken value in the request for the next page.
    */
  var PaginationToken: js.UndefOr[typings.awsSdk.clientsResourcegroupstaggingapiMod.PaginationToken] = js.undefined
  
  /**
    * A list of all tag keys in the Amazon Web Services account.
    */
  var TagKeys: js.UndefOr[TagKeyList] = js.undefined
}
object GetTagKeysOutput {
  
  inline def apply(): GetTagKeysOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTagKeysOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetTagKeysOutput] (val x: Self) extends AnyVal {
    
    inline def setPaginationToken(value: PaginationToken): Self = StObject.set(x, "PaginationToken", value.asInstanceOf[js.Any])
    
    inline def setPaginationTokenUndefined: Self = StObject.set(x, "PaginationToken", js.undefined)
    
    inline def setTagKeys(value: TagKeyList): Self = StObject.set(x, "TagKeys", value.asInstanceOf[js.Any])
    
    inline def setTagKeysUndefined: Self = StObject.set(x, "TagKeys", js.undefined)
    
    inline def setTagKeysVarargs(value: TagKey*): Self = StObject.set(x, "TagKeys", js.Array(value*))
  }
}
