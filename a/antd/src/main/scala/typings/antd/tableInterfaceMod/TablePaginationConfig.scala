package typings.antd.tableInterfaceMod

import typings.antd.paginationPaginationMod.PaginationProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TablePaginationConfig
  extends StObject
     with PaginationProps {
  
  var position: js.UndefOr[js.Array[TablePaginationPosition]] = js.undefined
}
object TablePaginationConfig {
  
  inline def apply(): TablePaginationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TablePaginationConfig]
  }
  
  extension [Self <: TablePaginationConfig](x: Self) {
    
    inline def setPosition(value: js.Array[TablePaginationPosition]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setPositionVarargs(value: TablePaginationPosition*): Self = StObject.set(x, "position", js.Array(value*))
  }
}
