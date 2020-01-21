package typings.antd

import org.scalablytyped.runtime.Instantiable0
import typings.antd.tableInterfaceMod.TableProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/table", JSImport.Namespace)
@js.native
object tableMod extends js.Object {
  @js.native
  class default[T] protected ()
    extends typings.antd.tableTableMod.default[T] {
    def this(props: TableProps[T]) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var Column: Instantiable0[typings.antd.columnMod.default[js.Object]] = js.native
    var ColumnGroup: TypeofClassColumnGroup = js.native
    var displayName: String = js.native
  }
  
}

