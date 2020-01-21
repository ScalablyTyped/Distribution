package typings.appBuilderLib.electronFrameworkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.appBuilderLib.appBuilderLibStrings.darwin
  - typings.appBuilderLib.appBuilderLibStrings.linux
  - typings.appBuilderLib.appBuilderLibStrings.win32
  - typings.appBuilderLib.appBuilderLibStrings.mas
*/
trait ElectronPlatformName extends js.Object

object ElectronPlatformName {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def darwin: typings.appBuilderLib.appBuilderLibStrings.darwin = this.cast("darwin")
  @scala.inline
  def linux: typings.appBuilderLib.appBuilderLibStrings.linux = this.cast("linux")
  @scala.inline
  def mas: typings.appBuilderLib.appBuilderLibStrings.mas = this.cast("mas")
  @scala.inline
  def win32: typings.appBuilderLib.appBuilderLibStrings.win32 = this.cast("win32")
}

