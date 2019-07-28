package typings.autobahn.autobahnMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("autobahn", "Error")
@js.native
class Error () extends IError {
  def this(error: String) = this()
  def this(error: String, args: js.Array[_]) = this()
  def this(error: String, args: js.Array[_], kwargs: js.Any) = this()
  /* CompleteClass */
  override var args: js.Array[_] = js.native
  /* CompleteClass */
  override var error: String = js.native
  /* CompleteClass */
  override var kwargs: js.Any = js.native
}

