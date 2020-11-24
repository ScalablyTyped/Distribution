package typings.angularCompiler.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetadataFactory[T] extends js.Object {
  
  def apply(args: js.Any*): T = js.native
  
  def isTypeOf(obj: js.Any): /* is T */ Boolean = js.native
  
  var ngMetadataName: String = js.native
}
