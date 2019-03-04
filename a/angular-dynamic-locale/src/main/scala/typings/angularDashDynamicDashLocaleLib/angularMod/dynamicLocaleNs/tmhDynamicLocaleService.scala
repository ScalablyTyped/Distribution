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
    get: js.Function0[java.lang.String],
    set: js.Function1[java.lang.String, angularLib.angularMod.angularNs.IPromise[java.lang.String]]
  ): tmhDynamicLocaleService = {
    val __obj = js.Dynamic.literal(get = get, set = set)
  
    __obj.asInstanceOf[tmhDynamicLocaleService]
  }
}

