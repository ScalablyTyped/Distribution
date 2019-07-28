package typings.angular.angularMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

///////////////////////////////////////////////////////////////////////////
// SCEDelegateService
// see http://docs.angularjs.org/api/ng.$sceDelegate
///////////////////////////////////////////////////////////////////////////
trait ISCEDelegateService extends js.Object {
  def getTrusted(`type`: String, mayBeTrusted: js.Any): js.Any
  def trustAs(`type`: String, value: js.Any): js.Any
  def valueOf(value: js.Any): js.Any
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
}

