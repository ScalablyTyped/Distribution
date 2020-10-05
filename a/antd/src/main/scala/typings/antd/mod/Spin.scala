package typings.antd.mod

import typings.antd.anon.Spinning
import typings.antd.spinMod.SpinProps
import typings.antd.spinMod.default
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd", "Spin")
@js.native
class Spin protected () extends default {
  def this(props: SpinProps) = this()
}

/* static members */
@JSImport("antd", "Spin")
@js.native
object Spin extends js.Object {
  var defaultProps: Spinning = js.native
  def setDefaultIndicator(indicator: ReactNode): Unit = js.native
}

