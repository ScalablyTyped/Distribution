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
    acquire: js.Function0[scala.Unit],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    elementInserted: js.Function1[ConfigurationEvent, scala.Unit],
    elementRemoved: js.Function1[ConfigurationEvent, scala.Unit],
    elementReplaced: js.Function1[ConfigurationEvent, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XUIConfigurationListener = {
    val __obj = js.Dynamic.literal(acquire = acquire, disposing = disposing, elementInserted = elementInserted, elementRemoved = elementRemoved, elementReplaced = elementReplaced, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XUIConfigurationListener]
  }
}

