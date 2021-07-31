package typings.antDesignReactNative.anon

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ErrorInfo
import typings.react.mod.FunctionComponentElement
import typings.react.mod.ReactElement
import typings.react.mod.ReactInstance
import typings.react.mod.global.JSX.Element
import typings.std.Error
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
      /* nextState */ js.Any, 
      /* nextContext */ js.Any, 
      Unit
    ]
  ] = js.native
  
  var componentDidCatch: js.UndefOr[js.Function2[/* error */ Error, /* errorInfo */ ErrorInfo, Unit]] = js.native
  
  var componentDidMount: js.UndefOr[js.Function0[Unit]] = js.native
  
  var componentDidUpdate: js.UndefOr[
    js.Function3[
      /* prevProps */ ReadonlyPopupPickerProps, 
      /* prevState */ js.Any, 
      /* snapshot */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  
  var componentWillMount: js.UndefOr[js.Function0[Unit]] = js.native
  
  var componentWillReceiveProps: js.UndefOr[
    js.Function2[/* nextProps */ ReadonlyPopupPickerProps, /* nextContext */ js.Any, Unit]
  ] = js.native
  
  var componentWillUnmount: js.UndefOr[js.Function0[Unit]] = js.native
  
  var componentWillUpdate: js.UndefOr[
    js.Function3[
      /* nextProps */ ReadonlyPopupPickerProps, 
      /* nextState */ js.Any, 
      /* nextContext */ js.Any, 
      Unit
    ]
  ] = js.native
  
  var context: js.Any = js.native
  
  def fireVisibleChange(visible: Boolean): Unit = js.native
  
  def forceUpdate(): Unit = js.native
  def forceUpdate(callback: js.Function0[Unit]): Unit = js.native
  
  def getContent(): js.UndefOr[String | ReactElement | FunctionComponentElement[Dictx]] = js.native
  
  def getRender(): Element = js.native
  
  var getSnapshotBeforeUpdate: js.UndefOr[
    js.Function2[/* prevProps */ ReadonlyPopupPickerProps, /* prevState */ js.Any, js.Any]
  ] = js.native
  
  def hide(): Unit = js.native
  
  def onDismiss(): Unit = js.native
  
  def onOk(): Unit = js.native
  
  def onPickerChange(pickerValue: js.Any): Unit = js.native
  
  def onTriggerClick(e: js.Any): Unit = js.native
  
  var picker: js.Any = js.native
  
  val props: ReadonlyPopupPickerPropsR = js.native
  
  var refs: StringDictionary[ReactInstance] = js.native
  
  def render(): Element = js.native
  
  def saveRef(picker: js.Any): Unit = js.native
  
  def setState[K /* <: String | Double | js.Symbol */](state: js.Any): Unit = js.native
  def setState[K /* <: String | Double | js.Symbol */](state: js.Any, callback: js.Function0[Unit]): Unit = js.native
  
  def setVisibleState(visible: js.Any): Unit = js.native
  
  var shouldComponentUpdate: js.UndefOr[
    js.Function3[
      /* nextProps */ ReadonlyPopupPickerProps, 
      /* nextState */ js.Any, 
      /* nextContext */ js.Any, 
      Boolean
    ]
  ] = js.native
  
  var state: js.Any = js.native
}
