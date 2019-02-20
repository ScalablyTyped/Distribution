package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This component integrates a view to a slide show of a presentation document into the desktop. */
trait PresentationView
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.Controller
     with activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow
     with activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XDrawView
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet {
  /** This is the area that is currently visible. */
  var VisibleArea: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle
}

