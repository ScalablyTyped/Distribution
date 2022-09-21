package typings.antDesignReactNative.anon

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ErrorInfo
import typings.react.mod.ReactInstance
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentDidCatch extends StObject {
  
  var UNSAFE_componentWillMount: js.UndefOr[js.Function0[Unit]] = js.native
  
  var UNSAFE_componentWillReceiveProps: js.UndefOr[js.Function2[/* nextProps */ Readonlydefault, /* nextContext */ Any, Unit]] = js.native
  
  var UNSAFE_componentWillUpdate: js.UndefOr[
    js.Function3[/* nextProps */ Readonlydefault, /* nextState */ Any, /* nextContext */ Any, Unit]
  ] = js.native
  
  var componentDidCatch: js.UndefOr[js.Function2[/* error */ js.Error, /* errorInfo */ ErrorInfo, Unit]] = js.native
  
  var componentDidMount: js.UndefOr[js.Function0[Unit]] = js.native
  
  var componentDidUpdate: js.UndefOr[
    js.Function3[
      /* prevProps */ Readonlydefault, 
      /* prevState */ Any, 
      /* snapshot */ js.UndefOr[Any], 
      Unit
    ]
  ] = js.native
  
  var componentWillMount: js.UndefOr[js.Function0[Unit]] = js.native
  
  var componentWillReceiveProps: js.UndefOr[js.Function2[/* nextProps */ Readonlydefault, /* nextContext */ Any, Unit]] = js.native
  
  var componentWillUnmount: js.UndefOr[js.Function0[Unit]] = js.native
  
  var componentWillUpdate: js.UndefOr[
    js.Function3[/* nextProps */ Readonlydefault, /* nextState */ Any, /* nextContext */ Any, Unit]
  ] = js.native
  
  var context: Any = js.native
  
  def forceUpdate(): Unit = js.native
  def forceUpdate(callback: js.Function0[Unit]): Unit = js.native
  
  var getSnapshotBeforeUpdate: js.UndefOr[js.Function2[/* prevProps */ Readonlydefault, /* prevState */ Any, Any]] = js.native
  
  def getValue(): Any = js.native
  
  def onChange(i: Any, v: Any, cb: Any): Unit = js.native
  
  def onScrollChange(i: Any, v: Any): Unit = js.native
  
  def onValueChange(i: Any, v: Any): Unit = js.native
  
  val props: ReadonlydefaultReadonlych = js.native
  
  var refs: StringDictionary[ReactInstance] = js.native
  
  def render(): Element = js.native
  
  def setState[K /* <: String | Double | js.Symbol */](state: Any): Unit = js.native
  def setState[K /* <: String | Double | js.Symbol */](state: Any, callback: js.Function0[Unit]): Unit = js.native
  
  var shouldComponentUpdate: js.UndefOr[
    js.Function3[/* nextProps */ Readonlydefault, /* nextState */ Any, /* nextContext */ Any, Boolean]
  ] = js.native
  
  var state: Any = js.native
}
