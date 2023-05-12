package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotTableDataPathOption extends StObject {
  
  /**
    * The list of data path values for the data path options.
    */
  var DataPathList: DataPathValueList
  
  /**
    * The width of the data path option.
    */
  var Width: js.UndefOr[PixelLength] = js.undefined
}
object PivotTableDataPathOption {
  
  inline def apply(DataPathList: DataPathValueList): PivotTableDataPathOption = {
    val __obj = js.Dynamic.literal(DataPathList = DataPathList.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotTableDataPathOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PivotTableDataPathOption] (val x: Self) extends AnyVal {
    
    inline def setDataPathList(value: DataPathValueList): Self = StObject.set(x, "DataPathList", value.asInstanceOf[js.Any])
    
    inline def setDataPathListVarargs(value: DataPathValue*): Self = StObject.set(x, "DataPathList", js.Array(value*))
    
    inline def setWidth(value: PixelLength): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "Width", js.undefined)
  }
}
