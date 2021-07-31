package typings.agGrid

import typings.agGrid.columnMod.Column
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object autoGroupColServiceMod {
  
  @JSImport("ag-grid/dist/lib/columnController/autoGroupColService", "AutoGroupColService")
  @js.native
  class AutoGroupColService () extends StObject {
    
    var balancedColumnTreeBuilder: js.Any = js.native
    
    var columnController: js.Any = js.native
    
    var context: js.Any = js.native
    
    def createAutoGroupColumns(rowGroupColumns: js.Array[Column]): js.Array[Column] = js.native
    
    /* private */ def createOneAutoGroupColumn(rowGroupCol: js.Any, index: js.Any): js.Any = js.native
    
    /* private */ def generateDefaultColDef(rowGroupCol: js.Any): js.Any = js.native
    
    var gridOptionsWrapper: js.Any = js.native
  }
  /* static members */
  object AutoGroupColService {
    
    @JSImport("ag-grid/dist/lib/columnController/autoGroupColService", "AutoGroupColService")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ag-grid/dist/lib/columnController/autoGroupColService", "AutoGroupColService.GROUP_AUTO_COLUMN_BUNDLE_ID")
    @js.native
    def GROUP_AUTO_COLUMN_BUNDLE_ID: String = js.native
    @scala.inline
    def GROUP_AUTO_COLUMN_BUNDLE_ID_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GROUP_AUTO_COLUMN_BUNDLE_ID")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/columnController/autoGroupColService", "AutoGroupColService.GROUP_AUTO_COLUMN_ID")
    @js.native
    def GROUP_AUTO_COLUMN_ID: String = js.native
    @scala.inline
    def GROUP_AUTO_COLUMN_ID_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GROUP_AUTO_COLUMN_ID")(x.asInstanceOf[js.Any])
  }
}
