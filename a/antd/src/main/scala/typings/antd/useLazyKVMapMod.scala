package typings.antd

import typings.antd.tableInterfaceMod.Key
import typings.rcTable.interfaceMod.GetRowKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd/lib/table/hooks/useLazyKVMap", JSImport.Namespace)
@js.native
object useLazyKVMapMod extends js.Object {
  
  def default[RecordType](data: js.Array[RecordType], childrenColumnName: String, getRowKey: GetRowKey[RecordType]): js.Array[js.Function1[/* key */ Key, RecordType]] = js.native
}
