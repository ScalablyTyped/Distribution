package typings.antd.mod

import typings.antd.AnonClassName
import typings.antd.AnonDefault
import typings.antd.spinMod.SpinProps
import typings.antd.spinMod.default
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd", "Spin")
@js.native
class Spin protected () extends default {
  def this(props: SpinProps) = this()
}

/* static members */
@JSImport("antd", "Spin")
@js.native
object Spin extends js.Object {
  var defaultProps: AnonDefault = js.native
  var propTypes: AnonClassName = js.native
  def setDefaultIndicator(indicator: ReactNode): Unit = js.native
}

