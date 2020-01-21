package typings.appleMapkitJs.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// prettier-ignore
/* Rewritten from type alias, can be one of: 
  - typings.appleMapkitJs.appleMapkitJsStrings.select
  - typings.appleMapkitJs.appleMapkitJsStrings.deselect
  - typings.appleMapkitJs.appleMapkitJsStrings.`drag-start`
  - typings.appleMapkitJs.appleMapkitJsStrings.dragging
  - typings.appleMapkitJs.appleMapkitJsStrings.`drag-end`
*/
trait AnnotationEventType extends js.Object

object AnnotationEventType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def deselect: typings.appleMapkitJs.appleMapkitJsStrings.deselect = this.cast("deselect")
  @scala.inline
  def `drag-end`: typings.appleMapkitJs.appleMapkitJsStrings.`drag-end` = this.cast("drag-end")
  @scala.inline
  def `drag-start`: typings.appleMapkitJs.appleMapkitJsStrings.`drag-start` = this.cast("drag-start")
  @scala.inline
  def dragging: typings.appleMapkitJs.appleMapkitJsStrings.dragging = this.cast("dragging")
  @scala.inline
  def select: typings.appleMapkitJs.appleMapkitJsStrings.select = this.cast("select")
}

