package typings.angularCore.mod

import typings.angularCore.angularCoreStrings.document_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.angularCore.angularCoreStrings.document_
  - typings.angularCore.angularCoreStrings.window
  - typings.angularCore.angularCoreStrings.body
*/
trait GlobalTargetName extends js.Object

object GlobalTargetName {
  @scala.inline
  def body: typings.angularCore.angularCoreStrings.body = this.cast("body")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def document: document_ = this.cast("document")
  @scala.inline
  def window: typings.angularCore.angularCoreStrings.window = this.cast("window")
}

