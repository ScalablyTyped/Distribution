package typings.appBuilderLib.winOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.appBuilderLib.appBuilderLibStrings.asInvoker
  - typings.appBuilderLib.appBuilderLibStrings.highestAvailable
  - typings.appBuilderLib.appBuilderLibStrings.requireAdministrator
*/
trait RequestedExecutionLevel extends js.Object

object RequestedExecutionLevel {
  @scala.inline
  def asInvoker: typings.appBuilderLib.appBuilderLibStrings.asInvoker = this.cast("asInvoker")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def highestAvailable: typings.appBuilderLib.appBuilderLibStrings.highestAvailable = this.cast("highestAvailable")
  @scala.inline
  def requireAdministrator: typings.appBuilderLib.appBuilderLibStrings.requireAdministrator = this.cast("requireAdministrator")
}

