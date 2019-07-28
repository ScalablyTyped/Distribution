package typings.activexDashLibreoffice.comNs.sunNs.starNs.uiNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.Rectangle
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XWindow
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
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
trait XDockingAreaAcceptor extends XInterface {
  /**
    * provide the container window where the layout manager can request border space for docking windows.
    *
    * Additionally the layout manager uses this window to create its own child windows for docking purposes.
    */
  val ContainerWindow: XWindow
  /**
    * provide the container window where the layout manager can request border space for docking windows.
    *
    * Additionally the layout manager uses this window to create its own child windows for docking purposes.
    */
  def getContainerWindow(): XWindow
  /**
    * method to ask an implementation if the provided space for docking windows is available or not.
    *
    * The {@link com.sun.star.awt.Rectangle} parameter is filled by the caller with pixel data. The members of {@link com.sun.star.awt.Rectangle} must be
    * filled as following: X = requested area on left side (in pixel)Y = requested area on top side (in pixel)Width = requested area on right side (in
    * pixel)Height = requested area on bottom side (in pixel)
    */
  def requestDockingAreaSpace(RequestedSpace: Rectangle): Boolean
  /**
    * method to brief an implementation that we need new border space.
    *
    * The callee must size its document window so that we have the amount of space we have provided. The {@link com.sun.star.awt.Rectangle} parameter is
    * filled by the caller with pixel data. The members of {@link com.sun.star.awt.Rectangle} must be filled as following: X = new area on left side (in
    * pixel)Y = new area on top side (in pixel)Width = new area on right side (in pixel)Height = new area on bottom side (in pixel)
    */
  def setDockingAreaSpace(BorderSpace: Rectangle): Unit
}

object XDockingAreaAcceptor {
  @scala.inline
  def apply(
    ContainerWindow: XWindow,
    acquire: () => Unit,
    getContainerWindow: () => XWindow,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    requestDockingAreaSpace: Rectangle => Boolean,
    setDockingAreaSpace: Rectangle => Unit
  ): XDockingAreaAcceptor = {
    val __obj = js.Dynamic.literal(ContainerWindow = ContainerWindow, acquire = js.Any.fromFunction0(acquire), getContainerWindow = js.Any.fromFunction0(getContainerWindow), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), requestDockingAreaSpace = js.Any.fromFunction1(requestDockingAreaSpace), setDockingAreaSpace = js.Any.fromFunction1(setDockingAreaSpace))
  
    __obj.asInstanceOf[XDockingAreaAcceptor]
  }
}

