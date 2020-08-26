package typings.apolloUtilities.transformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetNodeConfig[N] extends js.Object {
  var name: js.UndefOr[String] = js.native
  var test: js.UndefOr[js.Function1[/* node */ N, Boolean]] = js.native
}

object GetNodeConfig {
  @scala.inline
  def apply[N](): GetNodeConfig[N] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetNodeConfig[N]]
  }
  @scala.inline
  implicit class GetNodeConfigOps[Self <: GetNodeConfig[_], N] (val x: Self with GetNodeConfig[N]) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setTest(value: /* node */ N => Boolean): Self = this.set("test", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTest: Self = this.set("test", js.undefined)
  }
  
}

