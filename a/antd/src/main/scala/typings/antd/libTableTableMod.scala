package typings.antd

import org.scalablytyped.runtime.Instantiable0
import typings.antd.libTableCreateStoreMod.Store
import typings.antd.libTableInterfaceMod.CheckboxPropsCache
import typings.antd.libTableInterfaceMod.TableProps
import typings.antd.libTableTableMod.StoreTable
import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/table/Table", JSImport.Namespace)
@js.native
object libTableTableMod extends js.Object {
  @js.native
  trait StoreTable[T]
    extends Component[TableProps[T], js.Object, js.Any] {
    var CheckboxPropsCache: typings.antd.libTableInterfaceMod.CheckboxPropsCache = js.native
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
    var Column: Instantiable0[typings.antd.libTableColumnMod.default[js.Object]] = js.native
    var ColumnGroup: TypeofClassColumnGroup = js.native
    var displayName: String = js.native
  }
  
}

