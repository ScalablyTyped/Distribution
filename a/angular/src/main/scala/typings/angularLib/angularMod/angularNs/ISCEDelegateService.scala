package typings
package angularLib.angularMod.angularNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

///////////////////////////////////////////////////////////////////////////
// SCEDelegateService
// see http://docs.angularjs.org/api/ng.$sceDelegate
///////////////////////////////////////////////////////////////////////////
trait ISCEDelegateService extends js.Object {
  def getTrusted(`type`: java.lang.String, mayBeTrusted: js.Any): js.Any
  def trustAs(`type`: java.lang.String, value: js.Any): js.Any
  def valueOf(value: js.Any): js.Any
}

object ISCEDelegateService {
  @scala.inline
  def apply(
    getTrusted: js.Function2[java.lang.String, js.Any, js.Any],
    trustAs: js.Function2[java.lang.String, js.Any, js.Any],
    valueOf: js.Function1[js.Any, js.Any]
  ): ISCEDelegateService = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getTrusted")(getTrusted)
    __obj.updateDynamic("trustAs")(trustAs)
    __obj.updateDynamic("valueOf")(valueOf)
    __obj.asInstanceOf[ISCEDelegateService]
  }
}

