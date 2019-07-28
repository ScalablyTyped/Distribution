package typings.atAngularCompiler.srcCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetadataFactory[T] extends js.Object {
  var ngMetadataName: String = js.native
  def apply(args: js.Any*): T = js.native
  def isTypeOf(obj: js.Any): /* is T */ Boolean = js.native
}

