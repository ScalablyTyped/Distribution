package typings.awsSdk.clientsLakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchTablesByLFTagsResponse extends StObject {
  
  /**
    * A continuation token, present if the current list segment is not the last.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
  
  /**
    * A list of tables that meet the LF-tag conditions.
    */
  var TableList: js.UndefOr[TableLFTagsList] = js.undefined
}
object SearchTablesByLFTagsResponse {
  
  inline def apply(): SearchTablesByLFTagsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchTablesByLFTagsResponse]
  }
  
  extension [Self <: SearchTablesByLFTagsResponse](x: Self) {
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTableList(value: TableLFTagsList): Self = StObject.set(x, "TableList", value.asInstanceOf[js.Any])
    
    inline def setTableListUndefined: Self = StObject.set(x, "TableList", js.undefined)
    
    inline def setTableListVarargs(value: TaggedTable*): Self = StObject.set(x, "TableList", js.Array(value*))
  }
}
