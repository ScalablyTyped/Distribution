package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** a criterion describing how an object must match some rules that specify (part of) a search. */
trait SearchCriterium extends js.Object {
  /** a number of rule terms. */
  var Terms: activexDashInteropLib.SafeArray[RuleTerm]
}

object SearchCriterium {
  @scala.inline
  def apply(Terms: activexDashInteropLib.SafeArray[RuleTerm]): SearchCriterium = {
    val __obj = js.Dynamic.literal(Terms = Terms)
  
    __obj.asInstanceOf[SearchCriterium]
  }
}

