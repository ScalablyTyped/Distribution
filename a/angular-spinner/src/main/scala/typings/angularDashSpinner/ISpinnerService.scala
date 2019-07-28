package typings.angularDashSpinner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISpinnerService extends js.Object {
  /**
    * Start selected spinner
    *
    * @param spinner key
    */
  def spin(key: String): Unit
  /**
    * Stop selected spinner
    *
    * @param spinner key
    */
  def stop(key: String): Unit
}

object ISpinnerService {
  @scala.inline
  def apply(spin: String => Unit, stop: String => Unit): ISpinnerService = {
    val __obj = js.Dynamic.literal(spin = js.Any.fromFunction1(spin), stop = js.Any.fromFunction1(stop))
  
    __obj.asInstanceOf[ISpinnerService]
  }
}

