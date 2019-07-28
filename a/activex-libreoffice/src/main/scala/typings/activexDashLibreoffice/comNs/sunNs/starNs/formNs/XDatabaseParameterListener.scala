package typings.activexDashLibreoffice.comNs.sunNs.starNs.formNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** allows to intercept value request for parametrized SQL statements. */
trait XDatabaseParameterListener extends XEventListener {
  /**
    * is invoked when there is a need for parameter values
    * @param aEvent the event describing the parameter value request.
    * @returns `TRUE` when the execution of the parametrized statement should continue, `FALSE` otherwise.
    * @see com.sun.star.form.DatabaseParameterEvent
    */
  def approveParameter(aEvent: DatabaseParameterEvent): Boolean
}

object XDatabaseParameterListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    approveParameter: DatabaseParameterEvent => Boolean,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDatabaseParameterListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), approveParameter = js.Any.fromFunction1(approveParameter), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XDatabaseParameterListener]
  }
}

