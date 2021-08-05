package typings.antd.anon

import typings.antd.tableInterfaceMod.CompareFn
import typings.antd.tableInterfaceMod.SortOrder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Compare[RecordType] extends StObject {
  
  var compare: js.UndefOr[CompareFn[RecordType]] = js.undefined
  
  /** Config multiple sorter order priority */
  var multiple: js.UndefOr[Double] = js.undefined
}
object Compare {
  
  inline def apply[RecordType](): Compare[RecordType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Compare[RecordType]]
  }
  
  extension [Self <: Compare[?], RecordType](x: Self & Compare[RecordType]) {
    
    inline def setCompare(value: (RecordType, RecordType, /* sortOrder */ js.UndefOr[SortOrder]) => Double): Self = StObject.set(x, "compare", js.Any.fromFunction3(value))
    
    inline def setCompareUndefined: Self = StObject.set(x, "compare", js.undefined)
    
    inline def setMultiple(value: Double): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
  }
}
