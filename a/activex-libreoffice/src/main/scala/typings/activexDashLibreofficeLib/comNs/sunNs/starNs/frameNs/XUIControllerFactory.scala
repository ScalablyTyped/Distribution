package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * a factory to create User Interface controllers.
  *
  * A user interface controller can be registered for a command URL. A certain user interface controller will be created when a user interface element
  * contains a registered command URL.
  * @see PopupMenuControllerFactory
  * @see StatusbarControllerFactory
  * @see ToolbarControllerFactory
  * @since LibreOffice 4.1
  */
trait XUIControllerFactory
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XMultiComponentFactory
     with XUIControllerRegistration

