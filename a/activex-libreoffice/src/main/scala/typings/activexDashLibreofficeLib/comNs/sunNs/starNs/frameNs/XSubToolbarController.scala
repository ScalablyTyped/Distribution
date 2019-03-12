package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * special interface to support sub-toolbars in a controller implementation.
  *
  * This interface is normally used to implement the toolbar button/sub- toolbar function feature. It exchanges the function of the toolbar button, that
  * opened the sub-toolbar, with the one that has been selected on the sub-toolbar.
  * @see com.sun.star.frame.ToolbarController
  * @since OOo 2.0
  */
trait XSubToolbarController
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * provides the resource URL of the sub-toolbar this controller opens.
    * @returns name of the sub-toolbar this controller offers. A empty string will be interpreted as if this controller offers no sub-toolbar.
    */
  val SubToolbarName: java.lang.String
  /**
    * gets called to notify a controller that a sub-toolbar function has been selected.
    * @param aCommand a string which identifies the function that has been selected by a user.
    */
  def functionSelected(aCommand: java.lang.String): scala.Unit
  /**
    * provides the resource URL of the sub-toolbar this controller opens.
    * @returns name of the sub-toolbar this controller offers. A empty string will be interpreted as if this controller offers no sub-toolbar.
    */
  def getSubToolbarName(): java.lang.String
  /**
    * if the controller features a sub-toolbar.
    * @returns `TRUE` if the controller offers a sub toolbar, otherwise `FALSE` .  Enables implementations to dynamically decide to support sub-toolbars or not.
    */
  def opensSubToolbar(): scala.Boolean
  /**
    * gets called to notify a controller that it should set an image which represents the current selected function.
    *
    * Only the controller instance is able to set the correct image for the current function. A toolbar implementation will ask sub-toolbar controllers to
    * update their image whenever it has to update the images of all its buttons.
    */
  def updateImage(): scala.Unit
}

object XSubToolbarController {
  @scala.inline
  def apply(
    SubToolbarName: java.lang.String,
    acquire: () => scala.Unit,
    functionSelected: java.lang.String => scala.Unit,
    getSubToolbarName: () => java.lang.String,
    opensSubToolbar: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    updateImage: () => scala.Unit
  ): XSubToolbarController = {
    val __obj = js.Dynamic.literal(SubToolbarName = SubToolbarName, acquire = js.Any.fromFunction0(acquire), functionSelected = js.Any.fromFunction1(functionSelected), getSubToolbarName = js.Any.fromFunction0(getSubToolbarName), opensSubToolbar = js.Any.fromFunction0(opensSubToolbar), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), updateImage = js.Any.fromFunction0(updateImage))
  
    __obj.asInstanceOf[XSubToolbarController]
  }
}

