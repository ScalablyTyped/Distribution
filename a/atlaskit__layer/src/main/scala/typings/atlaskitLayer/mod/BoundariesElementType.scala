package typings.atlaskitLayer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atlaskitLayer.atlaskitLayerStrings.viewport
  - typings.atlaskitLayer.atlaskitLayerStrings.window
  - typings.atlaskitLayer.atlaskitLayerStrings.scrollParent
*/
trait BoundariesElementType extends js.Object

object BoundariesElementType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def scrollParent: typings.atlaskitLayer.atlaskitLayerStrings.scrollParent = this.cast("scrollParent")
  @scala.inline
  def viewport: typings.atlaskitLayer.atlaskitLayerStrings.viewport = this.cast("viewport")
  @scala.inline
  def window: typings.atlaskitLayer.atlaskitLayerStrings.window = this.cast("window")
}

