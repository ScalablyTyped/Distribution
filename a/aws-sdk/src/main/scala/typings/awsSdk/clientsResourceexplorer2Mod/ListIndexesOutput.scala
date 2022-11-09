package typings.awsSdk.clientsResourceexplorer2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListIndexesOutput extends StObject {
  
  /**
    * A structure that contains the details and status of each index.
    */
  var Indexes: js.UndefOr[IndexList] = js.undefined
  
  /**
    * If present, indicates that more output is available than is included in the current response. Use this value in the NextToken request parameter in a subsequent call to the operation to get the next part of the output. You should repeat this until the NextToken response element comes back as null.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListIndexesOutput {
  
  inline def apply(): ListIndexesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListIndexesOutput]
  }
  
  extension [Self <: ListIndexesOutput](x: Self) {
    
    inline def setIndexes(value: IndexList): Self = StObject.set(x, "Indexes", value.asInstanceOf[js.Any])
    
    inline def setIndexesUndefined: Self = StObject.set(x, "Indexes", js.undefined)
    
    inline def setIndexesVarargs(value: Index*): Self = StObject.set(x, "Indexes", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
