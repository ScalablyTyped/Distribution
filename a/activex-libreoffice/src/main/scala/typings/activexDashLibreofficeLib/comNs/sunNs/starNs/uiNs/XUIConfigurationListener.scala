package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * supplies information about changes of a user interface configuration manager.
  * @since OOo 2.0
  */
trait XUIConfigurationListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /**
    * is invoked when a configuration has inserted an user interface element.
    * @param Event provides information about the element which has been inserted.
    */
  def elementInserted(Event: ConfigurationEvent): scala.Unit
  /**
    * is invoked when a configuration has removed an user interface element.
    * @param Event provides information about the element which has been removed.
    */
  def elementRemoved(Event: ConfigurationEvent): scala.Unit
  /**
    * is invoked when a configuration has replaced an user interface element.
    * @param Event provides information about the element which has been inserted/replaced.
    */
  def elementReplaced(Event: ConfigurationEvent): scala.Unit
}

object XUIConfigurationListener {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    disposing: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject => scala.Unit,
    elementInserted: ConfigurationEvent => scala.Unit,
    elementRemoved: ConfigurationEvent => scala.Unit,
    elementReplaced: ConfigurationEvent => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XUIConfigurationListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), elementInserted = js.Any.fromFunction1(elementInserted), elementRemoved = js.Any.fromFunction1(elementRemoved), elementReplaced = js.Any.fromFunction1(elementReplaced), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XUIConfigurationListener]
  }
}

