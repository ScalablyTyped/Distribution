package typings.activexLibreoffice.com_.sun.star.ucb

import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** a criterion describing how an object must match some rules that specify (part of) a search. */
trait SearchCriterium extends js.Object {
  /** a number of rule terms. */
  var Terms: SafeArray[RuleTerm]
}

object SearchCriterium {
  @scala.inline
  def apply(Terms: SafeArray[RuleTerm]): SearchCriterium = {
    val __obj = js.Dynamic.literal(Terms = Terms.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchCriterium]
  }
}

