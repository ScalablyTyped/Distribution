package typings.antd.spinMod

import typings.antd.anon.Spinning
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd/lib/spin", JSImport.Default)
@js.native
class default protected () extends Spin {
  def this(props: SpinProps) = this()
}

/* static members */
@JSImport("antd/lib/spin", JSImport.Default)
@js.native
object default extends js.Object {
  var defaultProps: Spinning = js.native
  def setDefaultIndicator(indicator: ReactNode): Unit = js.native
}

