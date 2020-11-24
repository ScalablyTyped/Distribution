package typings.ajv.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.TopLevel
import typings.ajv.anon.TypeofMissingRefError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  def apply(): Ajv = js.native
  def apply(options: Options): Ajv = js.native
  
  var MissingRefError: TypeofMissingRefError = js.native
  
  var ValidationError: Instantiable1[/* errors */ js.Array[ErrorObject], typings.ajv.mod.AjvErrors.ValidationError] = js.native
}
