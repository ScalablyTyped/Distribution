package typings.apolloServerTypes

import typings.apolloServerEnv.fetchMod.Headers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<apollo-server-env.apollo-server-env.Response, 'headers'> & std.Partial<std.Pick<apollo-server-types.apollo-server-types.Mutable<apollo-server-env.apollo-server-env.Response>, 'status'>> */
trait PickResponseheadersPartia extends js.Object {
  var headers: Headers
  var status: js.UndefOr[Double] = js.undefined
}

object PickResponseheadersPartia {
  @scala.inline
  def apply(headers: Headers, status: Int | Double = null): PickResponseheadersPartia = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickResponseheadersPartia]
  }
}

