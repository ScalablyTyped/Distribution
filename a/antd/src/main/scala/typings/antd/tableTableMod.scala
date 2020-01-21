package typings.antd

import org.scalablytyped.runtime.Instantiable0
import typings.antd.createStoreMod.Store
import typings.antd.tableInterfaceMod.CheckboxPropsCache
import typings.antd.tableInterfaceMod.TableProps
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/table/Table", JSImport.Namespace)
@js.native
object tableTableMod extends js.Object {
  @js.native
  trait StoreTable[T]
    extends Component[TableProps[T], js.Object, js.Any] {
    var CheckboxPropsCache: typings.antd.tableInterfaceMod.CheckboxPropsCache = js.native
    var store: Store = js.native
    def setCheckboxPropsCache(cache: CheckboxPropsCache): CheckboxPropsCache = js.native
  }
  
  @js.native
  class default[T] protected () extends StoreTable[T] {
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

