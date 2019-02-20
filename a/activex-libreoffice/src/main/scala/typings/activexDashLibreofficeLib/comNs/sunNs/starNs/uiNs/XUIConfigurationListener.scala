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

