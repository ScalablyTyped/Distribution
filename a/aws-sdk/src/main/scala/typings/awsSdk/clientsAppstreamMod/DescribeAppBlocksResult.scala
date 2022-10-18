package typings.awsSdk.clientsAppstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAppBlocksResult extends StObject {
  
  /**
    * The app blocks in the list.
    */
  var AppBlocks: js.UndefOr[typings.awsSdk.clientsAppstreamMod.AppBlocks] = js.undefined
  
  /**
    * The pagination token used to retrieve the next page of results for this operation.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeAppBlocksResult {
  
  inline def apply(): DescribeAppBlocksResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAppBlocksResult]
  }
  
  extension [Self <: DescribeAppBlocksResult](x: Self) {
    
    inline def setAppBlocks(value: AppBlocks): Self = StObject.set(x, "AppBlocks", value.asInstanceOf[js.Any])
    
    inline def setAppBlocksUndefined: Self = StObject.set(x, "AppBlocks", js.undefined)
    
    inline def setAppBlocksVarargs(value: AppBlock*): Self = StObject.set(x, "AppBlocks", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
