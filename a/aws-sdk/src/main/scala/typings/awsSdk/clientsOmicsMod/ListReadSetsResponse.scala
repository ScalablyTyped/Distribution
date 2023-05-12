package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListReadSetsResponse extends StObject {
  
  /**
    * A pagination token that's included if more results are available.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * A list of read sets.
    */
  var readSets: ReadSetList
}
object ListReadSetsResponse {
  
  inline def apply(readSets: ReadSetList): ListReadSetsResponse = {
    val __obj = js.Dynamic.literal(readSets = readSets.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListReadSetsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListReadSetsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setReadSets(value: ReadSetList): Self = StObject.set(x, "readSets", value.asInstanceOf[js.Any])
    
    inline def setReadSetsVarargs(value: ReadSetListItem*): Self = StObject.set(x, "readSets", js.Array(value*))
  }
}
