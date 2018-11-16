package typings
package angularDashOdataDashResourcesLib.ODataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProviderCallback[T] extends js.Object {
  def apply(queryString: java.lang.String, success: js.Function0[_], error: js.Function0[_]): js.Array[T] = js.native
  def apply(
    queryString: java.lang.String,
    success: js.Function0[_],
    error: js.Function0[_],
    isSingleElement: scala.Boolean
  ): T = js.native
  def apply(
    queryString: java.lang.String,
    success: js.Function0[_],
    error: js.Function0[_],
    isSingleElement: scala.Boolean,
    forceSingleElement: scala.Boolean
  ): T = js.native
}

