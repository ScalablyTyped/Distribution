package typings.appBuilderLib.pkgOptionsMod

import typings.appBuilderLib.appBuilderLibStrings.none_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.appBuilderLib.appBuilderLibStrings.tofit
  - typings.appBuilderLib.appBuilderLibStrings.none_
  - typings.appBuilderLib.appBuilderLibStrings.proportional
*/
trait BackgroundScaling extends js.Object

object BackgroundScaling {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def none: none_ = this.cast("none")
  @scala.inline
  def proportional: typings.appBuilderLib.appBuilderLibStrings.proportional = this.cast("proportional")
  @scala.inline
  def tofit: typings.appBuilderLib.appBuilderLibStrings.tofit = this.cast("tofit")
}

