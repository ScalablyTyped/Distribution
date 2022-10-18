package typings.awsSdk.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListExportsInput extends StObject {
  
  /**
    * Maximum number of results to return per page.
    */
  var MaxResults: js.UndefOr[ListExportsMaxLimit] = js.undefined
  
  /**
    * An optional string that, if supplied, must be copied from the output of a previous call to ListExports. When provided in this manner, the API fetches the next page of results.
    */
  var NextToken: js.UndefOr[ExportNextToken] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) associated with the exported table.
    */
  var TableArn: js.UndefOr[typings.awsSdk.clientsDynamodbMod.TableArn] = js.undefined
}
object ListExportsInput {
  
  inline def apply(): ListExportsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListExportsInput]
  }
  
  extension [Self <: ListExportsInput](x: Self) {
    
    inline def setMaxResults(value: ListExportsMaxLimit): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: ExportNextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTableArn(value: TableArn): Self = StObject.set(x, "TableArn", value.asInstanceOf[js.Any])
    
    inline def setTableArnUndefined: Self = StObject.set(x, "TableArn", js.undefined)
  }
}
