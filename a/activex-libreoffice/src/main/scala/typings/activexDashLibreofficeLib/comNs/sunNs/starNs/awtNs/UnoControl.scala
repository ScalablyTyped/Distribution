package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies an abstract control.
  *
  * All components which implement this service can be integrated in a windowing environment. This service describes the controller of the Smalltalk model
  * view controller design.
  *
  * You must set a model and a stub to the {@link UnoControl} before using other methods. The implementation only allows the change of the graphics (
  * {@link XView} ) if the window is not visible. The change of the graphics in visible state should redirect the output to these graphics, but this
  * behavior is implementation-specific.
  *
  * The change of data directly at the control may not affect the model data. To ensure this behavior, modify the data of the model.
  */
trait UnoControl
  extends XControl
     with XWindow
     with XView
     with activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessible

