package typings.awsSdk.clientsResourcegroupstaggingapiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTagValuesOutput extends StObject {
  
  /**
    * A string that indicates that there is more data available than this response contains. To receive the next part of the response, specify this response value as the PaginationToken value in the request for the next page.
    */
  var PaginationToken: js.UndefOr[typings.awsSdk.clientsResourcegroupstaggingapiMod.PaginationToken] = js.undefined
  
  /**
    * A list of all tag values for the specified key currently used in the specified Amazon Web Services Region for the calling account.
    */
  var TagValues: js.UndefOr[TagValuesOutputList] = js.undefined
}
object GetTagValuesOutput {
  
  inline def apply(): GetTagValuesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTagValuesOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetTagValuesOutput] (val x: Self) extends AnyVal {
    
    inline def setPaginationToken(value: PaginationToken): Self = StObject.set(x, "PaginationToken", value.asInstanceOf[js.Any])
    
    inline def setPaginationTokenUndefined: Self = StObject.set(x, "PaginationToken", js.undefined)
    
    inline def setTagValues(value: TagValuesOutputList): Self = StObject.set(x, "TagValues", value.asInstanceOf[js.Any])
    
    inline def setTagValuesUndefined: Self = StObject.set(x, "TagValues", js.undefined)
    
    inline def setTagValuesVarargs(value: TagValue*): Self = StObject.set(x, "TagValues", js.Array(value*))
  }
}
