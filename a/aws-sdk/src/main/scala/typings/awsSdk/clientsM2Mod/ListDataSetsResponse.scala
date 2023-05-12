package typings.awsSdk.clientsM2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDataSetsResponse extends StObject {
  
  /**
    * The list of data sets, containing information including the creation time, the data set name, the data set organization, the data set format, and the last time the data set was referenced or updated.
    */
  var dataSets: DataSetsSummaryList
  
  /**
    * If there are more items to return, this contains a token that is passed to a subsequent call to this operation to retrieve the next set of items.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListDataSetsResponse {
  
  inline def apply(dataSets: DataSetsSummaryList): ListDataSetsResponse = {
    val __obj = js.Dynamic.literal(dataSets = dataSets.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDataSetsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListDataSetsResponse] (val x: Self) extends AnyVal {
    
    inline def setDataSets(value: DataSetsSummaryList): Self = StObject.set(x, "dataSets", value.asInstanceOf[js.Any])
    
    inline def setDataSetsVarargs(value: DataSetSummary*): Self = StObject.set(x, "dataSets", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
