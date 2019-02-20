package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * use the {@link Frame} service instead of this
  * @deprecated Deprecated
  */
trait DesktopTask
  extends XFramesSupplier
     with XDesktopTask
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
     with XWindowArranger {
  var IsAlwaysVisible: scala.Boolean
  var IsDesktop: scala.Boolean
  var IsFloating: scala.Boolean
  /** use th visible state of the frame container window instead of this */
  var IsVisible: scala.Boolean
  /** use the position of the frame container window instead of this */
  var Position: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point
  /** use the size of the frame container window instead of this */
  var Size: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size
  /** use property {@link Frame.Title} instead of that */
  var Title: java.lang.String
  /**
    * use {@link com.sun.star.lang.XInitialization} instead.
    * @deprecated Deprecated
    */
  /* InferMemberOverrides */
  override def initialize(TaskWindow: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow): scala.Unit
}

