package typings.angularDashDynamicDashLocale.angularMod.dynamicLocaleNs

import typings.angular.angularMod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait tmhDynamicLocaleService extends js.Object {
  def get(): String
  def set(locale: String): IPromise[String]
}

object tmhDynamicLocaleService {
  @scala.inline
  def apply(get: () => String, set: String => IPromise[String]): tmhDynamicLocaleService = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), set = js.Any.fromFunction1(set))
  
    __obj.asInstanceOf[tmhDynamicLocaleService]
  }
}

