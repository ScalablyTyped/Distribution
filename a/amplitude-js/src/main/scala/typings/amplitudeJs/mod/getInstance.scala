package typings.amplitudeJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("amplitude-js", "getInstance")
@js.native
object getInstance extends js.Object {
  def apply(): AmplitudeClient = js.native
  def apply(instanceName: String): AmplitudeClient = js.native
}

