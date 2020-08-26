package typings.angular.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

///////////////////////////////////////////////////////////////////////////
// SCEDelegateService
// see http://docs.angularjs.org/api/ng/service/$sceDelegate
///////////////////////////////////////////////////////////////////////////
@js.native
trait ISCEDelegateService extends js.Object {
  def getTrusted(`type`: String, mayBeTrusted: js.Any): js.Any = js.native
  def trustAs(`type`: String, value: js.Any): js.Any = js.native
  def valueOf(value: js.Any): js.Any = js.native
}

object ISCEDelegateService {
  @scala.inline
  def apply(
    getTrusted: (String, js.Any) => js.Any,
    trustAs: (String, js.Any) => js.Any,
    valueOf: js.Any => js.Any
  ): ISCEDelegateService = {
    val __obj = js.Dynamic.literal(getTrusted = js.Any.fromFunction2(getTrusted), trustAs = js.Any.fromFunction2(trustAs), valueOf = js.Any.fromFunction1(valueOf))
    __obj.asInstanceOf[ISCEDelegateService]
  }
  @scala.inline
  implicit class ISCEDelegateServiceOps[Self <: ISCEDelegateService] (val x: Self) extends AnyVal {
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
    def setGetTrusted(value: (String, js.Any) => js.Any): Self = this.set("getTrusted", js.Any.fromFunction2(value))
    @scala.inline
    def setTrustAs(value: (String, js.Any) => js.Any): Self = this.set("trustAs", js.Any.fromFunction2(value))
    @scala.inline
    def setValueOf(value: js.Any => js.Any): Self = this.set("valueOf", js.Any.fromFunction1(value))
  }
  
}

