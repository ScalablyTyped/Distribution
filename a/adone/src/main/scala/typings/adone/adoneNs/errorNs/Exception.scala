package typings.adone.adoneNs.errorNs

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.error.Exception")
@js.native
class Exception () extends Error {
  def this(message: String) = this()
  def this(message: Error) = this()
  def this(message: String, captureStackTrace: Boolean) = this()
  def this(message: Error, captureStackTrace: Boolean) = this()
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
}

