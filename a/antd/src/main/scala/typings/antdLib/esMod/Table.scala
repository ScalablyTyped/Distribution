package typings
package antdLib.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/es", "Table")
@js.native
class Table[T] protected ()
  extends antdLib.esTableMod.default[T] {
  def this(props: antdLib.esTableInterfaceMod.TableProps[T]) = this()
}

/* static members */
@JSImport("antd/es", "Table")
@js.native
object Table extends js.Object {
  var Column: org.scalablytyped.runtime.Instantiable0[antdLib.esTableColumnMod.default[js.Object]] = js.native
  var ColumnGroup: antdLib.Anon_ANTTABLECOLUMNGROUP = js.native
  var defaultProps: antdLib.Anon_BorderedChildrenColumnName = js.native
  var propTypes: antdLib.Anon_ArgsBordered = js.native
}

