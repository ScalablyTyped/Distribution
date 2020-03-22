package typings.antd.useSorterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/table/hooks/useSorter", "getSortData")
@js.native
object getSortData extends js.Object {
  def apply[RecordType](
    data: js.Array[RecordType],
    sortStates: js.Array[SortState[RecordType]],
    childrenColumnName: String
  ): js.Array[RecordType] = js.native
}

