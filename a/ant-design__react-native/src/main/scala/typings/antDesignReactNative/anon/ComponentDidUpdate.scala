package typings.antDesignReactNative.anon

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ErrorInfo
import typings.react.mod.FunctionComponentElement
import typings.react.mod.ReactElement
import typings.react.mod.ReactInstance
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentDidUpdate extends StObject {
  
  var UNSAFE_componentWillMount: js.UndefOr[js.Function0[Unit]] = js.native
  
  def UNSAFE_componentWillReceiveProps(nextProps: Visible): Unit = js.native
  
  var UNSAFE_componentWillUpdate: js.UndefOr[
    js.Function3[
      /* nextProps */ ReadonlyPopupPickerProps, 
      /* nextState */ Any, 
      /* nextContext */ Any, 
      Unit
    ]
  ] = js.native
  
  var componentDidCatch: js.UndefOr[js.Function2[/* error */ js.Error, /* errorInfo */ ErrorInfo, Unit]] = js.native
  
  var componentDidMount: js.UndefOr[js.Function0[Unit]] = js.native
  
  var componentDidUpdate: js.UndefOr[
    js.Function3[
      /* prevProps */ ReadonlyPopupPickerProps, 
      /* prevState */ Any, 
      /* snapshot */ js.UndefOr[Any], 
      Unit
    ]
  ] = js.native
  
  var componentWillMount: js.UndefOr[js.Function0[Unit]] = js.native
  
  var componentWillReceiveProps: js.UndefOr[
    js.Function2[/* nextProps */ ReadonlyPopupPickerProps, /* nextContext */ Any, Unit]
  ] = js.native
  
  var componentWillUnmount: js.UndefOr[js.Function0[Unit]] = js.native
  
  var componentWillUpdate: js.UndefOr[
    js.Function3[
      /* nextProps */ ReadonlyPopupPickerProps, 
      /* nextState */ Any, 
      /* nextContext */ Any, 
      Unit
    ]
  ] = js.native
  
  var context: Any = js.native
  
  def fireVisibleChange(visible: Boolean): Unit = js.native
  
  def forceUpdate(): Unit = js.native
  def forceUpdate(callback: js.Function0[Unit]): Unit = js.native
  
  def getContent(): js.UndefOr[String | ReactElement | FunctionComponentElement[Dictx]] = js.native
  
  def getRender(): ReactNode = js.native
  
  var getSnapshotBeforeUpdate: js.UndefOr[js.Function2[/* prevProps */ ReadonlyPopupPickerProps, /* prevState */ Any, Any]] = js.native
  
  def hide(): Unit = js.native
  
  def onDismiss(): Unit = js.native
  
  def onOk(): Unit = js.native
  
  def onPickerChange(pickerValue: Any): Unit = js.native
  
  def onTriggerClick(e: Any): Unit = js.native
  
  var picker: Any = js.native
  
  val props: ReadonlyPopupPickerPropsR = js.native
  
  var refs: StringDictionary[ReactInstance] = js.native
  
  def render(): ReactNode = js.native
  
  def saveRef(picker: Any): Unit = js.native
  
  def setState[K /* <: String | Double | js.Symbol */](state: Any): Unit = js.native
  def setState[K /* <: String | Double | js.Symbol */](state: Any, callback: js.Function0[Unit]): Unit = js.native
  
  def setVisibleState(visible: Any): Unit = js.native
  
  var shouldComponentUpdate: js.UndefOr[
    js.Function3[
      /* nextProps */ ReadonlyPopupPickerProps, 
      /* nextState */ Any, 
      /* nextContext */ Any, 
      Boolean
    ]
  ] = js.native
  
  var state: Any = js.native
}
