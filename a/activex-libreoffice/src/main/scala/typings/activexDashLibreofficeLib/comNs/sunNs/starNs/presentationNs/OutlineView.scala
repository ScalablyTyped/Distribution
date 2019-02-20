package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This component integrates an outline view to a presentation document into the desktop.
  *
  * In an outline view, the textual contents of presentation text objects from all presentation pages are presented as a continuous outline text.
  * @since OOo 1.1.2
  */
trait OutlineView
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.Controller
     with activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet {
  /** This is the area that is currently visible. */
  var VisibleArea: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle
}

