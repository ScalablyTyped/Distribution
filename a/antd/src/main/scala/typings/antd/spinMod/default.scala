package typings.antd.spinMod

import typings.antd.AnonSpinning
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/spin", JSImport.Default)
@js.native
class default protected () extends Spin {
  def this(props: SpinProps) = this()
}

/* static members */
@JSImport("antd/lib/spin", JSImport.Default)
@js.native
object default extends js.Object {
  var defaultProps: AnonSpinning = js.native
  def setDefaultIndicator(indicator: ReactNode): Unit = js.native
}

