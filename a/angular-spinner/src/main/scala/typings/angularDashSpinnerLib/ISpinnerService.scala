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

