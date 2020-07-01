package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/form/hooks/useFrameState", JSImport.Namespace)
@js.native
object useFrameStateMod extends js.Object {
  def default[ValueType](defaultValue: ValueType): js.Tuple2[ValueType, js.Function1[/* updater */ Updater[ValueType], Unit]] = js.native
  type Updater[ValueType] = js.Function1[/* prev */ js.UndefOr[ValueType], ValueType]
}

