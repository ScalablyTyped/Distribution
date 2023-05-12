package typings.awsSdk.clientsSecuritylakeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLogSourcesRequest extends StObject {
  
  /**
    * Lists the log sources in input order, namely Region, source type, and member account.
    */
  var inputOrder: js.UndefOr[DimensionSet] = js.undefined
  
  /**
    * List the view of log sources for enabled Amazon Security Lake accounts for specific Amazon Web Services sources from specific accounts and specific Regions.
    */
  var listAllDimensions: js.UndefOr[AllDimensionsMap] = js.undefined
  
  /**
    * List the view of log sources for enabled Security Lake accounts for all Amazon Web Services sources from specific accounts or specific Regions.
    */
  var listSingleDimension: js.UndefOr[InputSet] = js.undefined
  
  /**
    * Lists the view of log sources for enabled Security Lake accounts for specific Amazon Web Services sources from specific accounts or specific Regions.
    */
  var listTwoDimensions: js.UndefOr[TwoDimensionsMap] = js.undefined
  
  /**
    * The maximum number of accounts for which the log sources are displayed.
    */
  var maxResults: js.UndefOr[Integer] = js.undefined
  
  /**
    * If nextToken is returned, there are more results available. You can repeat the call using the returned token to retrieve the next page.
    */
  var nextToken: js.UndefOr[SafeString] = js.undefined
}
object ListLogSourcesRequest {
  
  inline def apply(): ListLogSourcesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLogSourcesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListLogSourcesRequest] (val x: Self) extends AnyVal {
    
    inline def setInputOrder(value: DimensionSet): Self = StObject.set(x, "inputOrder", value.asInstanceOf[js.Any])
    
    inline def setInputOrderUndefined: Self = StObject.set(x, "inputOrder", js.undefined)
    
    inline def setInputOrderVarargs(value: Dimension*): Self = StObject.set(x, "inputOrder", js.Array(value*))
    
    inline def setListAllDimensions(value: AllDimensionsMap): Self = StObject.set(x, "listAllDimensions", value.asInstanceOf[js.Any])
    
    inline def setListAllDimensionsUndefined: Self = StObject.set(x, "listAllDimensions", js.undefined)
    
    inline def setListSingleDimension(value: InputSet): Self = StObject.set(x, "listSingleDimension", value.asInstanceOf[js.Any])
    
    inline def setListSingleDimensionUndefined: Self = StObject.set(x, "listSingleDimension", js.undefined)
    
    inline def setListSingleDimensionVarargs(value: SafeString*): Self = StObject.set(x, "listSingleDimension", js.Array(value*))
    
    inline def setListTwoDimensions(value: TwoDimensionsMap): Self = StObject.set(x, "listTwoDimensions", value.asInstanceOf[js.Any])
    
    inline def setListTwoDimensionsUndefined: Self = StObject.set(x, "listTwoDimensions", js.undefined)
    
    inline def setMaxResults(value: Integer): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: SafeString): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
