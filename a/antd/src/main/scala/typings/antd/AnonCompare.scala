package typings.antd

import typings.antd.tableInterfaceMod.CompareFn
import typings.antd.tableInterfaceMod.SortOrder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCompare[RecordType] extends js.Object {
  var compare: CompareFn[RecordType]
  /** Config multiple sorter order priority */
  var multiple: Double
}

object AnonCompare {
  @scala.inline
  def apply[RecordType](
    compare: (RecordType, RecordType, /* sortOrder */ js.UndefOr[SortOrder]) => Double,
    multiple: Double
  ): AnonCompare[RecordType] = {
    val __obj = js.Dynamic.literal(compare = js.Any.fromFunction3(compare), multiple = multiple.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCompare[RecordType]]
  }
}

