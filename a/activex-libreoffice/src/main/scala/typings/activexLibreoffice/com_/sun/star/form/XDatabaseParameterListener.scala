package typings.activexLibreoffice.com_.sun.star.form

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** allows to intercept value request for parametrized SQL statements. */
@js.native
trait XDatabaseParameterListener extends XEventListener {
  
  /**
    * is invoked when there is a need for parameter values
    * @param aEvent the event describing the parameter value request.
    * @returns `TRUE` when the execution of the parametrized statement should continue, `FALSE` otherwise.
    * @see com.sun.star.form.DatabaseParameterEvent
    */
  def approveParameter(aEvent: DatabaseParameterEvent): Boolean = js.native
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
  
  @scala.inline
  implicit class XDatabaseParameterListenerMutableBuilder[Self <: XDatabaseParameterListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApproveParameter(value: DatabaseParameterEvent => Boolean): Self = StObject.set(x, "approveParameter", js.Any.fromFunction1(value))
  }
}
