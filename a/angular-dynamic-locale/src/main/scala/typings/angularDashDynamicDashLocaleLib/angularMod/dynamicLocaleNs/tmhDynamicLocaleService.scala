package typings
package angularDashDynamicDashLocaleLib.angularMod.dynamicLocaleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait tmhDynamicLocaleService extends js.Object {
  def get(): java.lang.String
  def set(locale: java.lang.String): angularLib.angularMod.angularNs.IPromise[java.lang.String]
}

object tmhDynamicLocaleService {
  @scala.inline
  def apply(
    get: () => java.lang.String,
    set: java.lang.String => angularLib.angularMod.angularNs.IPromise[java.lang.String]
  ): tmhDynamicLocaleService = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), set = js.Any.fromFunction1(set))
  
    __obj.asInstanceOf[tmhDynamicLocaleService]
  }
}

