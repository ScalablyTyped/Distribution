package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageScanFindingsFilter extends StObject {
  
  /**
    * The name of the image scan finding filter. Filter names are case-sensitive.
    */
  var name: js.UndefOr[FilterName] = js.undefined
  
  /**
    * The filter values. Filter values are case-sensitive.
    */
  var values: js.UndefOr[ImageScanFindingsFilterValues] = js.undefined
}
object ImageScanFindingsFilter {
  
  inline def apply(): ImageScanFindingsFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageScanFindingsFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageScanFindingsFilter] (val x: Self) extends AnyVal {
    
    inline def setName(value: FilterName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValues(value: ImageScanFindingsFilterValues): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: FilterValue*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
