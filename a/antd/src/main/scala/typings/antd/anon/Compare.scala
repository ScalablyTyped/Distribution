package typings.antd.anon

import typings.antd.tableInterfaceMod.CompareFn
import typings.antd.tableInterfaceMod.SortOrder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Compare[RecordType] extends js.Object {
  var compare: CompareFn[RecordType] = js.native
  /** Config multiple sorter order priority */
  var multiple: Double = js.native
}

object Compare {
  @scala.inline
  def apply[RecordType](
    compare: (RecordType, RecordType, /* sortOrder */ js.UndefOr[SortOrder]) => Double,
    multiple: Double
  ): Compare[RecordType] = {
    val __obj = js.Dynamic.literal(compare = js.Any.fromFunction3(compare), multiple = multiple.asInstanceOf[js.Any])
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
    def setMultiple(value: Double): Self = this.set("multiple", value.asInstanceOf[js.Any])
  }
  
}

