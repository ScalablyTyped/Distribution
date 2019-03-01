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
  def apply(spin: js.Function1[java.lang.String, scala.Unit], stop: js.Function1[java.lang.String, scala.Unit]): ISpinnerService = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("spin")(spin)
    __obj.updateDynamic("stop")(stop)
    __obj.asInstanceOf[ISpinnerService]
  }
}

