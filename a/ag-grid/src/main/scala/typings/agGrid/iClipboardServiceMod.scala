package typings.agGrid

import typings.agGrid.columnMod.Column
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iClipboardServiceMod {
  
  @js.native
  trait IClipboardService extends StObject {
    
    def copyRangeDown(): Unit = js.native
    
    def copySelectedRangeToClipboard(): Unit = js.native
    def copySelectedRangeToClipboard(includeHeader: Boolean): Unit = js.native
    
    def copySelectedRowsToClipboard(): Unit = js.native
    def copySelectedRowsToClipboard(includeHeader: js.UndefOr[scala.Nothing], columnKeys: js.Array[String | Column]): Unit = js.native
    def copySelectedRowsToClipboard(includeHeader: Boolean): Unit = js.native
    def copySelectedRowsToClipboard(includeHeader: Boolean, columnKeys: js.Array[String | Column]): Unit = js.native
    
    def copyToClipboard(): Unit = js.native
    def copyToClipboard(includeHeader: Boolean): Unit = js.native
    
    def pasteFromClipboard(): Unit = js.native
  }
}
