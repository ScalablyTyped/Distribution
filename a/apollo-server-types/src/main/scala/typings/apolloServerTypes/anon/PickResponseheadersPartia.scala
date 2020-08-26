package typings.apolloServerTypes.anon

import typings.apolloServerEnv.fetchMod.Headers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<apollo-server-env.apollo-server-env.Response, 'headers'> & std.Partial<std.Pick<apollo-server-types.apollo-server-types.Mutable<apollo-server-env.apollo-server-env.Response>, 'status'>> */
@js.native
trait PickResponseheadersPartia extends js.Object {
  var headers: Headers = js.native
  var status: js.UndefOr[Double] = js.native
}

object PickResponseheadersPartia {
  @scala.inline
  def apply(headers: Headers): PickResponseheadersPartia = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickResponseheadersPartia]
  }
  @scala.inline
  implicit class PickResponseheadersPartiaOps[Self <: PickResponseheadersPartia] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHeaders(value: Headers): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: Double): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

