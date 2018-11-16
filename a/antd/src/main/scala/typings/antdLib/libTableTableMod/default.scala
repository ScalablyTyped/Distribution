package typings
package antdLib.libTableTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/table/Table", JSImport.Default)
@js.native
class default[T] protected () extends Table[T] {
  def this(props: antdLib.libTableInterfaceMod.TableProps[T]) = this()
}

@JSImport("antd/lib/table/Table", JSImport.Default)
@js.native
object default extends js.Object {
  var Column: ScalablyTyped.runtime.Instantiable0[antdLib.libTableColumnMod.default[js.Object]] = js.native
  var ColumnGroup: ScalablyTyped.runtime.Instantiable0[antdLib.libTableColumnGroupMod.default] = js.native
  var defaultProps: antdLib.Anon_Bordered = js.native
  var propTypes: antdLib.Anon_BorderedSize = js.native
}

