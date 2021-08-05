package typings.agGrid

import org.scalablytyped.runtime.StringDictionary
import typings.agGrid.clientSideRowModelMod.RowDataTransaction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object immutableServiceMod {
  
  @JSImport("ag-grid/dist/lib/rowModels/clientSide/immutableService", "ImmutableService")
  @js.native
  class ImmutableService () extends StObject {
    
    /* private */ var clientSideRowModel: js.Any = js.native
    
    def createTransactionForRowData(data: js.Array[js.Any]): js.Tuple2[RowDataTransaction, StringDictionary[Double]] = js.native
    
    /* private */ var gridOptionsWrapper: js.Any = js.native
    
    /* private */ def postConstruct(): js.Any = js.native
    
    /* private */ var rowModel: js.Any = js.native
  }
}
