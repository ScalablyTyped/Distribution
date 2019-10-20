package typings.antd

import org.scalablytyped.runtime.Instantiable0
import typings.antd.esTableCreateStoreMod.Store
import typings.antd.esTableInterfaceMod.CheckboxPropsCache
import typings.antd.esTableInterfaceMod.TableProps
import typings.antd.esTableTableMod.StoreTable
import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/es/table/Table", JSImport.Namespace)
@js.native
object esTableTableMod extends js.Object {
  @js.native
  trait StoreTable[T]
    extends Component[OmitTablePropsTkeyofWithStore[T], js.Object, js.Any] {
    var CheckboxPropsCache: typings.antd.esTableInterfaceMod.CheckboxPropsCache = js.native
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
    var Column: Instantiable0[typings.antd.esTableColumnMod.default[js.Object]] = js.native
    var ColumnGroup: TypeofClassColumnGroup = js.native
    var displayName: String = js.native
  }
  
}

