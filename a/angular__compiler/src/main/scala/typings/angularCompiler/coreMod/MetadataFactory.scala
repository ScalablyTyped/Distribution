package typings.angularCompiler.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetadataFactory[T] extends js.Object {
  var ngMetadataName: String = js.native
  def apply(args: js.Any*): T = js.native
  def isTypeOf(obj: js.Any): /* is T */ Boolean = js.native
}

