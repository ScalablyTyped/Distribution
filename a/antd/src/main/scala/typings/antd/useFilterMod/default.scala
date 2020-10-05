package typings.antd.useFilterMod

import typings.antd.tableInterfaceMod.Key
import typings.antd.tableInterfaceMod.TransformColumns
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd/lib/table/hooks/useFilter", JSImport.Default)
@js.native
object default extends js.Object {
  def apply[RecordType](
    hasPrefixClsDropdownPrefixClsMergedColumnsOnFilterChangeGetPopupContainerLocale: FilterConfig[RecordType]
  ): js.Tuple3[
    TransformColumns[RecordType], 
    js.Array[FilterState[RecordType]], 
    js.Function0[Record[String, js.Array[Key] | Null]]
  ] = js.native
}

