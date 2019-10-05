package typings.ajv.ajvMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.TopLevel
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
object ^ extends TopLevel[Instantiable0[Ajv] with (Instantiable1[/* options */ Options, Ajv])] {
  @JSName("$dataMetaSchema")
  var $dataMetaSchema: js.Object = js.native
  var MissingRefError: TypeofClassMissingRefError = js.native
  var ValidationError: Instantiable1[/* errors */ js.Array[ErrorObject], typings.ajv.ajvMod.AjvErrors.ValidationError] = js.native
  def apply(): Ajv = js.native
  def apply(options: Options): Ajv = js.native
}

