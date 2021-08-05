package typings.activexLibreoffice.com_.sun.star.form

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides the possibility of receiving an event for configuration of parameters.
  *
  * This interface is usually implemented by components which are to execute a statement, and may need parameter information. For example, the {@link
  * com.sun.star.form.component.DataForm} is such a component. When it is bound to a statement which contains parameters, or to a query which is based
  * upon a parametrized statement, it needs values to fill in the parameters with actual values when it is being loaded. One method to gather these values
  * is calling the {@link XDatabaseParameterListener} listeners, which can fill them in.
  */
trait XDatabaseParameterBroadcaster
  extends StObject
     with XInterface {
  
  /**
    * adds the specified listener, to allow it to fill in necessary parameter values.
    * @param aListener the listener to add.
    * @see com.sun.star.form.XDatabaseParameterListener
    */
  def addParameterListener(aListener: XDatabaseParameterListener): Unit
  
  /**
    * removes the specified listener.
    * @param aListener the listener to remove.
    * @see com.sun.star.form.XDatabaseParameterListener
    */
  def removeParameterListener(aListener: XDatabaseParameterListener): Unit
}
object XDatabaseParameterBroadcaster {
  
  inline def apply(
    acquire: () => Unit,
    addParameterListener: XDatabaseParameterListener => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeParameterListener: XDatabaseParameterListener => Unit
  ): XDatabaseParameterBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addParameterListener = js.Any.fromFunction1(addParameterListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeParameterListener = js.Any.fromFunction1(removeParameterListener))
    __obj.asInstanceOf[XDatabaseParameterBroadcaster]
  }
  
  extension [Self <: XDatabaseParameterBroadcaster](x: Self) {
    
    inline def setAddParameterListener(value: XDatabaseParameterListener => Unit): Self = StObject.set(x, "addParameterListener", js.Any.fromFunction1(value))
    
    inline def setRemoveParameterListener(value: XDatabaseParameterListener => Unit): Self = StObject.set(x, "removeParameterListener", js.Any.fromFunction1(value))
  }
}
