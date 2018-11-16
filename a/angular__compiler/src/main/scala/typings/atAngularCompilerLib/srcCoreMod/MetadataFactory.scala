package typings
package atAngularCompilerLib.srcCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetadataFactory[T] extends js.Object {
  var ngMetadataName: java.lang.String = js.native
  def apply(args: js.Any*): T = js.native
  def isTypeOf(obj: js.Any): /* is T */scala.Boolean = js.native
}

