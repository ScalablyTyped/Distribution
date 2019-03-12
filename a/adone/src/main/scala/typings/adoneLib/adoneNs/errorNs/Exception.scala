package typings
package adoneLib.adoneNs.errorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.error.Exception")
@js.native
class Exception ()
  extends stdLib.Error {
  def this(message: java.lang.String) = this()
  def this(message: stdLib.Error) = this()
  def this(message: java.lang.String, captureStackTrace: scala.Boolean) = this()
  def this(message: stdLib.Error, captureStackTrace: scala.Boolean) = this()
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
}

