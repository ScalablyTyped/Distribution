package typings.antd

import typings.antd.libCheckboxCheckboxMod.CheckboxChangeEvent
import typings.antd.libTableInterfaceMod.SelectionCheckboxAllProps
import typings.antd.libTableInterfaceMod.SelectionCheckboxAllState
import typings.antd.libTableInterfaceMod.SelectionItem
import typings.antd.libTableSelectionCheckboxAllMod.SelectionCheckboxAll
import typings.react.reactMod.Component
import typings.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/table/SelectionCheckboxAll", JSImport.Namespace)
@js.native
object libTableSelectionCheckboxAllMod extends js.Object {
  @js.native
  trait SelectionCheckboxAll[T]
    extends Component[SelectionCheckboxAllProps[T], SelectionCheckboxAllState, js.Any] {
    var defaultSelections: js.Array[SelectionItem] = js.native
    @JSName("state")
    var state_SelectionCheckboxAll: Anon_Checked = js.native
    @JSName("componentDidMount")
    def componentDidMount_MSelectionCheckboxAll(): Unit = js.native
    @JSName("componentWillUnmount")
    def componentWillUnmount_MSelectionCheckboxAll(): Unit = js.native
    def handleSelectAllChange(e: CheckboxChangeEvent): Unit = js.native
    def renderMenus(selections: js.Array[SelectionItem]): js.Array[Element] = js.native
    def setCheckState(props: SelectionCheckboxAllProps[T]): Unit = js.native
    def subscribe(): Unit = js.native
    def unsubscribe(): Unit = js.native
  }
  
  @js.native
  class default[T] protected () extends SelectionCheckboxAll[T] {
    def this(props: SelectionCheckboxAllProps[T]) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    def getDerivedStateFromProps[T](props: SelectionCheckboxAllProps[T], state: SelectionCheckboxAllState): SelectionCheckboxAllState = js.native
  }
  
}

