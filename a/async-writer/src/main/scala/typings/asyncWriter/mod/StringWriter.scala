package typings.asyncWriter.mod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("async-writer", "StringWriter")
@js.native
class StringWriter protected () extends js.Object {
  def this(events: EventEmitter) = this()
  def end(): Unit = js.native
  def write(what: String): StringWriter = js.native
}

