package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * this event is broadcasted by a configuration manager whenever the state of user interface element has changed.
  * @since OOo 2.0
  */
trait ConfigurationEvent
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.ContainerEvent {
  /** contains the resource URL of the user interface element or a configuration manager, which has been changed, inserted or replaced. */
  var ResourceURL: java.lang.String
  /** contains additional information about this configuration event. The type depends on the specific implementation. */
  var aInfo: js.Any
}

