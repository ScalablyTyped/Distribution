package typings.angularDashOdataDashResources.ODataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProviderCallback[T] extends js.Object {
  def apply(queryString: String, success: js.Function0[_], error: js.Function0[_]): js.Array[T] = js.native
  def apply(queryString: String, success: js.Function0[_], error: js.Function0[_], isSingleElement: Boolean): T = js.native
  def apply(
    queryString: String,
    success: js.Function0[_],
    error: js.Function0[_],
    isSingleElement: Boolean,
    forceSingleElement: Boolean
  ): T = js.native
}

