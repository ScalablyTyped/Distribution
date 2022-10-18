package typings.awsSdk.clientsRoute53recoveryreadinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCellsResponse extends StObject {
  
  /**
    * A list of cells.
    */
  var Cells: js.UndefOr[listOfCellOutput] = js.undefined
  
  /**
    * The token that identifies which batch of results you want to see.
    */
  var NextToken: js.UndefOr[string] = js.undefined
}
object ListCellsResponse {
  
  inline def apply(): ListCellsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCellsResponse]
  }
  
  extension [Self <: ListCellsResponse](x: Self) {
    
    inline def setCells(value: listOfCellOutput): Self = StObject.set(x, "Cells", value.asInstanceOf[js.Any])
    
    inline def setCellsUndefined: Self = StObject.set(x, "Cells", js.undefined)
    
    inline def setCellsVarargs(value: CellOutput*): Self = StObject.set(x, "Cells", js.Array(value*))
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
