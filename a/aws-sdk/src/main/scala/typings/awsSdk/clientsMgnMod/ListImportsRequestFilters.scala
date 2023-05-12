package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListImportsRequestFilters extends StObject {
  
  /**
    * List imports request filters import IDs.
    */
  var importIDs: js.UndefOr[ImportIDsFilter] = js.undefined
}
object ListImportsRequestFilters {
  
  inline def apply(): ListImportsRequestFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListImportsRequestFilters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListImportsRequestFilters] (val x: Self) extends AnyVal {
    
    inline def setImportIDs(value: ImportIDsFilter): Self = StObject.set(x, "importIDs", value.asInstanceOf[js.Any])
    
    inline def setImportIDsUndefined: Self = StObject.set(x, "importIDs", js.undefined)
    
    inline def setImportIDsVarargs(value: ImportID*): Self = StObject.set(x, "importIDs", js.Array(value*))
  }
}
