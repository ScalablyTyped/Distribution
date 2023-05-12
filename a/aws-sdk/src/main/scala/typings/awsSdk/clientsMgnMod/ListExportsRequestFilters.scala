package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListExportsRequestFilters extends StObject {
  
  /**
    * List exports request filters export ids.
    */
  var exportIDs: js.UndefOr[ListExportsRequestFiltersExportIDs] = js.undefined
}
object ListExportsRequestFilters {
  
  inline def apply(): ListExportsRequestFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListExportsRequestFilters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListExportsRequestFilters] (val x: Self) extends AnyVal {
    
    inline def setExportIDs(value: ListExportsRequestFiltersExportIDs): Self = StObject.set(x, "exportIDs", value.asInstanceOf[js.Any])
    
    inline def setExportIDsUndefined: Self = StObject.set(x, "exportIDs", js.undefined)
    
    inline def setExportIDsVarargs(value: ExportID*): Self = StObject.set(x, "exportIDs", js.Array(value*))
  }
}
