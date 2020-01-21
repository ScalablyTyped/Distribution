package typings.appBuilderLib.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.appBuilderLib.appBuilderLibStrings.store
  - typings.appBuilderLib.appBuilderLibStrings.normal
  - typings.appBuilderLib.appBuilderLibStrings.maximum
*/
trait CompressionLevel extends js.Object

object CompressionLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def maximum: typings.appBuilderLib.appBuilderLibStrings.maximum = this.cast("maximum")
  @scala.inline
  def normal: typings.appBuilderLib.appBuilderLibStrings.normal = this.cast("normal")
  @scala.inline
  def store: typings.appBuilderLib.appBuilderLibStrings.store = this.cast("store")
}

