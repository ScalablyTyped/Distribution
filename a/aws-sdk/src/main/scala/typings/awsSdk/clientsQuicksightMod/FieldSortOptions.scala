package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldSortOptions extends StObject {
  
  /**
    * The sort configuration for a column that is not used in a field well.
    */
  var ColumnSort: js.UndefOr[typings.awsSdk.clientsQuicksightMod.ColumnSort] = js.undefined
  
  /**
    * The sort configuration for a field in a field well.
    */
  var FieldSort: js.UndefOr[typings.awsSdk.clientsQuicksightMod.FieldSort] = js.undefined
}
object FieldSortOptions {
  
  inline def apply(): FieldSortOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldSortOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FieldSortOptions] (val x: Self) extends AnyVal {
    
    inline def setColumnSort(value: ColumnSort): Self = StObject.set(x, "ColumnSort", value.asInstanceOf[js.Any])
    
    inline def setColumnSortUndefined: Self = StObject.set(x, "ColumnSort", js.undefined)
    
    inline def setFieldSort(value: FieldSort): Self = StObject.set(x, "FieldSort", value.asInstanceOf[js.Any])
    
    inline def setFieldSortUndefined: Self = StObject.set(x, "FieldSort", js.undefined)
  }
}
