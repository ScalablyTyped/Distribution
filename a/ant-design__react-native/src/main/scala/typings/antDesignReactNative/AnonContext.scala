package typings.antDesignReactNative

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactInstance
import typings.react.mod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonContext extends js.Object {
  var context: js.Any = js.native
  val props: ReadonlychildrenReactNode = js.native
  var refs: StringDictionary[ReactInstance] = js.native
  var state: js.Any = js.native
  def forceUpdate(): Unit = js.native
  def forceUpdate(callBack: js.Function0[Unit]): Unit = js.native
  def getValue(): js.Array[_] = js.native
  def onChange(i: js.Any, v: js.Any, cb: js.Any): Unit = js.native
  def onScrollChange(i: js.Any, v: js.Any): Unit = js.native
  def onValueChange(i: js.Any, v: js.Any): Unit = js.native
  def render(): Element = js.native
  def setState[K /* <: String | Double | js.Symbol */](state: js.Any): Unit = js.native
  def setState[K /* <: String | Double | js.Symbol */](state: js.Any, callback: js.Function0[Unit]): Unit = js.native
}

