package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeQuerySuggestionsConfigRequest extends StObject {
  
  /**
    * The identifier of the index with query suggestions that you want to get information on.
    */
  var IndexId: typings.awsSdk.clientsKendraMod.IndexId
}
object DescribeQuerySuggestionsConfigRequest {
  
  inline def apply(IndexId: IndexId): DescribeQuerySuggestionsConfigRequest = {
    val __obj = js.Dynamic.literal(IndexId = IndexId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeQuerySuggestionsConfigRequest]
  }
  
  extension [Self <: DescribeQuerySuggestionsConfigRequest](x: Self) {
    
    inline def setIndexId(value: IndexId): Self = StObject.set(x, "IndexId", value.asInstanceOf[js.Any])
  }
}
