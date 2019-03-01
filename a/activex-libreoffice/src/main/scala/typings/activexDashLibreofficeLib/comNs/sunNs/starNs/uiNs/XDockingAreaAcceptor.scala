package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * this interface enables developer to implement different docking area acceptors which are used by the frame based layout manager.
  *
  * A docking area acceptor is responsible to control the docking area of a container window. As OLE for example supports inplace and outplace editing,
  * there are different parts of code responsible for the container window. This interface enables developer to make support implementations for these
  * scenarios.
  * @see com.sun.star.frame.XFrame
  * @since OOo 2.0
  */
trait XDockingAreaAcceptor
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * provide the container window where the layout manager can request border space for docking windows.
    *
    * Additionally the layout manager uses this window to create its own child windows for docking purposes.
    */
  val ContainerWindow: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow
  /**
    * provide the container window where the layout manager can request border space for docking windows.
    *
    * Additionally the layout manager uses this window to create its own child windows for docking purposes.
    */
  def getContainerWindow(): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow
  /**
    * method to ask an implementation if the provided space for docking windows is available or not.
    *
    * The {@link com.sun.star.awt.Rectangle} parameter is filled by the caller with pixel data. The members of {@link com.sun.star.awt.Rectangle} must be
    * filled as following: X = requested area on left side (in pixel)Y = requested area on top side (in pixel)Width = requested area on right side (in
    * pixel)Height = requested area on bottom side (in pixel)
    */
  def requestDockingAreaSpace(RequestedSpace: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle): scala.Boolean
  /**
    * method to brief an implementation that we need new border space.
    *
    * The callee must size its document window so that we have the amount of space we have provided. The {@link com.sun.star.awt.Rectangle} parameter is
    * filled by the caller with pixel data. The members of {@link com.sun.star.awt.Rectangle} must be filled as following: X = new area on left side (in
    * pixel)Y = new area on top side (in pixel)Width = new area on right side (in pixel)Height = new area on bottom side (in pixel)
    */
  def setDockingAreaSpace(BorderSpace: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle): scala.Unit
}

object XDockingAreaAcceptor {
  @scala.inline
  def apply(
    ContainerWindow: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow,
    acquire: js.Function0[scala.Unit],
    getContainerWindow: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    requestDockingAreaSpace: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle, scala.Boolean],
    setDockingAreaSpace: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle, scala.Unit]
  ): XDockingAreaAcceptor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ContainerWindow")(ContainerWindow)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getContainerWindow")(getContainerWindow)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("requestDockingAreaSpace")(requestDockingAreaSpace)
    __obj.updateDynamic("setDockingAreaSpace")(setDockingAreaSpace)
    __obj.asInstanceOf[XDockingAreaAcceptor]
  }
}

