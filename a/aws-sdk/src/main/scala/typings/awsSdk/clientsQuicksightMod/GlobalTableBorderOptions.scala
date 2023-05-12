package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlobalTableBorderOptions extends StObject {
  
  /**
    * Determines the options for side specific border.
    */
  var SideSpecificBorder: js.UndefOr[TableSideBorderOptions] = js.undefined
  
  /**
    * Determines the options for uniform border.
    */
  var UniformBorder: js.UndefOr[TableBorderOptions] = js.undefined
}
object GlobalTableBorderOptions {
  
  inline def apply(): GlobalTableBorderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalTableBorderOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GlobalTableBorderOptions] (val x: Self) extends AnyVal {
    
    inline def setSideSpecificBorder(value: TableSideBorderOptions): Self = StObject.set(x, "SideSpecificBorder", value.asInstanceOf[js.Any])
    
    inline def setSideSpecificBorderUndefined: Self = StObject.set(x, "SideSpecificBorder", js.undefined)
    
    inline def setUniformBorder(value: TableBorderOptions): Self = StObject.set(x, "UniformBorder", value.asInstanceOf[js.Any])
    
    inline def setUniformBorderUndefined: Self = StObject.set(x, "UniformBorder", js.undefined)
  }
}
