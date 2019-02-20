package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * With this interface, components viewed in a {@link Frame} can serve events (by supplying dispatches).
  * @see XFrame
  * @see com.sun.star.awt.XWindow
  * @see XModel
  */
trait XController
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent {
  /**
    * provides access to owner frame of this controller
    * @returns the frame containing this controller.
    */
  val Frame: XFrame
  /**
    * provides access to currently attached model
    * @returns the currently attached model.
    */
  val Model: XModel
  /**
    * provides access to current view status
    * @returns set of data that can be used to restore the current view status at later time by using {@link XController.restoreViewData()}
    */
  val ViewData: js.Any
  /**
    * is called to attach the controller with its managing frame.
    * @param Frame the new owner frame of this controller
    */
  def attachFrame(Frame: XFrame): scala.Unit
  /**
    * is called to attach the controller to a new model.
    * @param Model the new model for this controller
    * @returns `TRUE` if attach was successfully ; `FALSE` otherwise
    */
  def attachModel(Model: XModel): scala.Boolean
  /**
    * provides access to owner frame of this controller
    * @returns the frame containing this controller.
    */
  def getFrame(): XFrame
  /**
    * provides access to currently attached model
    * @returns the currently attached model.
    */
  def getModel(): XModel
  /**
    * provides access to current view status
    * @returns set of data that can be used to restore the current view status at later time by using {@link XController.restoreViewData()}
    */
  def getViewData(): js.Any
  /**
    * restores the view status using the data gotten from a previous call to {@link XController.getViewData()} .
    * @param Data set of data to restore it
    */
  def restoreViewData(Data: js.Any): scala.Unit
  /**
    * is called to prepare the controller for closing the view
    * @param Suspend `TRUE` force the controller to suspend his work `FALSE` try to reactivate the controller
    * @returns `TRUE` if request was accepted and of course successfully finished ; `FALSE` otherwise
    */
  def suspend(Suspend: scala.Boolean): scala.Boolean
}

