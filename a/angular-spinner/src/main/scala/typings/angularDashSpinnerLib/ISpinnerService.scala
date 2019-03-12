package typings
package angularDashSpinnerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISpinnerService extends js.Object {
  /**
    * Start selected spinner
    *
    * @param spinner key
    */
  def spin(key: java.lang.String): scala.Unit
  /**
    * Stop selected spinner
    *
    * @param spinner key
    */
  def stop(key: java.lang.String): scala.Unit
}

object ISpinnerService {
  @scala.inline
  def apply(spin: java.lang.String => scala.Unit, stop: java.lang.String => scala.Unit): ISpinnerService = {
    val __obj = js.Dynamic.literal(spin = js.Any.fromFunction1(spin), stop = js.Any.fromFunction1(stop))
  
    __obj.asInstanceOf[ISpinnerService]
  }
}

