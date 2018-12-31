package typings
package antdLib.antdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd", "Table")
@js.native
class Table[T] protected ()
  extends antdLib.libTableMod.default[T] {
  def this(props: antdLib.libTableInterfaceMod.TableProps[T]) = this()
}

@JSImport("antd", "Table")
@js.native
object Table extends js.Object {
  var Column: org.scalablytyped.runtime.Instantiable0[
    antdLib.libTableColumnMod.default[
      /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for T */ js.Any
    ]
  ] = js.native
  var ColumnGroup: org.scalablytyped.runtime.Instantiable0[antdLib.libTableColumnGroupMod.default] = js.native
  var defaultProps: antdLib.Anon_Bordered = js.native
  var propTypes: antdLib.Anon_BorderedSize = js.native
}

