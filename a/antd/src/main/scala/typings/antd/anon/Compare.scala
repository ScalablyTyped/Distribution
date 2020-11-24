package typings.antd.anon

import typings.antd.tableInterfaceMod.CompareFn
import typings.antd.tableInterfaceMod.SortOrder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Compare[RecordType] extends js.Object {
  
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
  implicit class CompareOps[Self <: Compare[_], RecordType] (val x: Self with Compare[RecordType]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCompare(value: (RecordType, RecordType, /* sortOrder */ js.UndefOr[SortOrder]) => Double): Self = this.set("compare", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteCompare: Self = this.set("compare", js.undefined)
    
    @scala.inline
    def setMultiple(value: Double): Self = this.set("multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiple: Self = this.set("multiple", js.undefined)
  }
}
