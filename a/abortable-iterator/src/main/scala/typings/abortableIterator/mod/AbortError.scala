package typings.abortableIterator.mod

import typings.abortableIterator.abortableIteratorStrings.aborted
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("abortable-iterator", "AbortError")
@js.native
class AbortError () extends Error {
  def this(message: String) = this()
  def this(message: js.UndefOr[scala.Nothing], code: String) = this()
  def this(message: String, code: String) = this()
  
  var code: String = js.native
  
  var `type`: aborted = js.native
}
