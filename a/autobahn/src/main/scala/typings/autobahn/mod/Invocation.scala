package typings.autobahn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("autobahn", "Invocation")
@js.native
class Invocation () extends IInvocation {
  def this(caller: Double) = this()
  def this(caller: Double, progress: Boolean) = this()
  def this(caller: Double, progress: Boolean, procedure: String) = this()
  /* CompleteClass */
  override var procedure: String = js.native
}

