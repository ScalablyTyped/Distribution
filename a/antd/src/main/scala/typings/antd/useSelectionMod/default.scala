package typings.antd.useSelectionMod

import typings.antd.tableInterfaceMod.Key
import typings.antd.tableInterfaceMod.TableRowSelection
import typings.antd.tableInterfaceMod.TransformColumns
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/table/hooks/useSelection", JSImport.Default)
@js.native
object default extends js.Object {
  def apply[RecordType](rowSelection: js.UndefOr[TableRowSelection[RecordType]], config: UseSelectionConfig[RecordType]): js.Tuple2[TransformColumns[RecordType], Set[Key]] = js.native
}

