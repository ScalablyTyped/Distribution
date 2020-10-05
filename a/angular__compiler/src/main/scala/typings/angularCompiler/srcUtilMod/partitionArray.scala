package typings.angularCompiler.srcUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/util", "partitionArray")
@js.native
object partitionArray extends js.Object {
  def apply[T](arr: js.Array[T], conditionFn: js.Function1[/* value */ T, Boolean]): js.Tuple2[js.Array[T], js.Array[T]] = js.native
}

