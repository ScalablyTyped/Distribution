package typings.aceBuilds.mod.Ace

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.aceBuilds.aceBuildsStrings.auto
  - typings.aceBuilds.aceBuildsStrings.unix
  - typings.aceBuilds.aceBuildsStrings.windows
*/
trait NewLineMode extends js.Object

object NewLineMode {
  @scala.inline
  def auto: typings.aceBuilds.aceBuildsStrings.auto = this.cast("auto")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def unix: typings.aceBuilds.aceBuildsStrings.unix = this.cast("unix")
  @scala.inline
  def windows: typings.aceBuilds.aceBuildsStrings.windows = this.cast("windows")
}

