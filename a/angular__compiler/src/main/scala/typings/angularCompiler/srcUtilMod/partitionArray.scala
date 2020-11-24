package typings.angularCompiler.srcUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/util", "partitionArray")
@js.native
object partitionArray extends js.Object {
  
  def apply[T, F](arr: js.Array[T | F], conditionFn: js.Function1[/* value */ T | F, Boolean]): js.Tuple2[js.Array[T], js.Array[F]] = js.native
}
