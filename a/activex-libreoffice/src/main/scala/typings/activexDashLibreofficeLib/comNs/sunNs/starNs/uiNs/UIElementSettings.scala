package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes the internal structure of a configurable user interface element.
  *
  * No assumption is made about any graphical representation: You could have a menu or a toolbar working with the same {@link UIElementSettings} although
  * limitations based on the real user interface element may be visible.
  * @since OOo 2.0
  */
trait UIElementSettings
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XSingleComponentFactory {
  /**
    * determine an optional user interface name of the user interface element.
    *
    * A toolbar can show a its user interface name on the window title, when it is in floating mode.
    */
  var UIName: java.lang.String
}

