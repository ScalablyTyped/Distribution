package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** allows to intercept value request for parametrized SQL statements. */
trait XDatabaseParameterListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /**
    * is invoked when there is a need for parameter values
    * @param aEvent the event describing the parameter value request.
    * @returns `TRUE` when the execution of the parametrized statement should continue, `FALSE` otherwise.
    * @see com.sun.star.form.DatabaseParameterEvent
    */
  def approveParameter(aEvent: DatabaseParameterEvent): scala.Boolean
}

