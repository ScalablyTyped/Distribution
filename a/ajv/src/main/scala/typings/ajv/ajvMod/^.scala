package typings.ajv.ajvMod

import org.scalablytyped.runtime.Instantiable1
import typings.ajv.TypeofClassMissingRefError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ajv", JSImport.Namespace)
@js.native
class ^ () extends Ajv {
  def this(options: Options) = this()
}

@JSImport("ajv", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  @JSName("$dataMetaSchema")
  var $dataMetaSchema: js.Object = js.native
  var MissingRefError: TypeofClassMissingRefError = js.native
  var ValidationError: Instantiable1[/* errors */ js.Array[ErrorObject], typings.ajv.ajvMod.AjvErrorsNs.ValidationError] = js.native
  def apply(): Ajv = js.native
  def apply(options: Options): Ajv = js.native
}

