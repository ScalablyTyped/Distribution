package typings.antd.anon

import typings.antd.tableInterfaceMod.CompareFn
import typings.antd.tableInterfaceMod.SortOrder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Compare[RecordType] extends StObject {
  
  var compare: js.UndefOr[CompareFn[RecordType]] = js.native
  
  /** Config multiple sorter order priority */
  var multiple: js.UndefOr[Double] = js.native
}
object Compare {
  
  @scala.inline
  def apply[RecordType](): Compare[RecordType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Compare[RecordType]]
  }
  
  @scala.inline
  implicit class CompareMutableBuilder[Self <: Compare[_], RecordType] (val x: Self with Compare[RecordType]) extends AnyVal {
    
    @scala.inline
    def setCompare(value: (RecordType, RecordType, /* sortOrder */ js.UndefOr[SortOrder]) => Double): Self = StObject.set(x, "compare", js.Any.fromFunction3(value))
    
    @scala.inline
    def setCompareUndefined: Self = StObject.set(x, "compare", js.undefined)
    
    @scala.inline
    def setMultiple(value: Double): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
  }
}
