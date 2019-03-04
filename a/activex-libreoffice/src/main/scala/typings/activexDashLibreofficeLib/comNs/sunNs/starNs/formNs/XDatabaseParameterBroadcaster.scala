package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides the possibility of receiving an event for configuration of parameters.
  *
  * This interface is usually implemented by components which are to execute a statement, and may need parameter information. For example, the {@link
  * com.sun.star.form.component.DataForm} is such a component. When it is bound to a statement which contains parameters, or to a query which is based
  * upon a parametrized statement, it needs values to fill in the parameters with actual values when it is being loaded. One method to gather these values
  * is calling the {@link XDatabaseParameterListener} listeners, which can fill them in.
  */
trait XDatabaseParameterBroadcaster
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * adds the specified listener, to allow it to fill in necessary parameter values.
    * @param aListener the listener to add.
    * @see com.sun.star.form.XDatabaseParameterListener
    */
  def addParameterListener(aListener: XDatabaseParameterListener): scala.Unit
  /**
    * removes the specified listener.
    * @param aListener the listener to remove.
    * @see com.sun.star.form.XDatabaseParameterListener
    */
  def removeParameterListener(aListener: XDatabaseParameterListener): scala.Unit
}

object XDatabaseParameterBroadcaster {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    addParameterListener: js.Function1[XDatabaseParameterListener, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeParameterListener: js.Function1[XDatabaseParameterListener, scala.Unit]
  ): XDatabaseParameterBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = acquire, addParameterListener = addParameterListener, queryInterface = queryInterface, release = release, removeParameterListener = removeParameterListener)
  
    __obj.asInstanceOf[XDatabaseParameterBroadcaster]
  }
}

