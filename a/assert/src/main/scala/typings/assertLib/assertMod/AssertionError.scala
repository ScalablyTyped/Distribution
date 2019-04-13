package typings
package assertLib.assertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("assert", "AssertionError")
@js.native
class AssertionError ()
  extends stdLib.Error {
  def this(options: assertLib.Anon_Actual) = this()
  var actual: js.Any = js.native
  var expected: js.Any = js.native
  var generatedMessage: scala.Boolean = js.native
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  var operator: java.lang.String = js.native
}

