package typings.antd

import typings.rcTable.interfaceMod.GetRowKey
import typings.react.mod.ReactText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/table/hooks/useLazyKVMap", JSImport.Namespace)
@js.native
object useLazyKVMapMod extends js.Object {
  def default[RecordType](data: js.Array[RecordType], childrenColumnName: String, getRowKey: GetRowKey[RecordType]): js.Array[js.Function1[/* key */ ReactText, RecordType]] = js.native
}

