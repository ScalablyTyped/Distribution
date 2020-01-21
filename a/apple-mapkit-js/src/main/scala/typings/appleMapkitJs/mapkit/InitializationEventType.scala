package typings.appleMapkitJs.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.appleMapkitJs.appleMapkitJsStrings.`configuration-change`
  - typings.appleMapkitJs.appleMapkitJsStrings.error
*/
trait InitializationEventType extends js.Object

object InitializationEventType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `configuration-change`: typings.appleMapkitJs.appleMapkitJsStrings.`configuration-change` = this.cast("configuration-change")
  @scala.inline
  def error: typings.appleMapkitJs.appleMapkitJsStrings.error = this.cast("error")
}

