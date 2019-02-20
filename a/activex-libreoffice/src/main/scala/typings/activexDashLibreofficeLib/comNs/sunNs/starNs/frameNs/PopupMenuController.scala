package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to a pop-up menu controller.
  *
  * A pop-up menu controller is used to make special functions available to users, which depend on runtime or context specific conditions. ;  A typical
  * example for a pop-up menu controller can be a recent file list implementation which provides a list of latest files that a user has worked on. This
  * list gets changes consistently during a work session.
  * @since OOo 2.0
  */
trait PopupMenuController
  extends XStatusListener
     with XPopupMenuController
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XInitialization
     with XDispatchProvider
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent

