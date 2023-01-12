package typings.activexLibreoffice.com_.sun.star.frame

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * special interface to support sub-toolbars in a controller implementation.
  *
  * This interface is normally used to implement the toolbar button/sub- toolbar function feature. It exchanges the function of the toolbar button, that
  * opened the sub-toolbar, with the one that has been selected on the sub-toolbar.
  * @see com.sun.star.frame.ToolbarController
  * @since OOo 2.0
  */
trait XSubToolbarController
  extends StObject
     with XInterface {
  
  /**
    * provides the resource URL of the sub-toolbar this controller opens.
    * @returns name of the sub-toolbar this controller offers. A empty string will be interpreted as if this controller offers no sub-toolbar.
    */
  val SubToolbarName: String
  
  /**
    * gets called to notify a controller that a sub-toolbar function has been selected.
    * @param aCommand a string which identifies the function that has been selected by a user.
    */
  def functionSelected(aCommand: String): Unit
  
  /**
    * provides the resource URL of the sub-toolbar this controller opens.
    * @returns name of the sub-toolbar this controller offers. A empty string will be interpreted as if this controller offers no sub-toolbar.
    */
  def getSubToolbarName(): String
  
  /**
    * if the controller features a sub-toolbar.
    * @returns `TRUE` if the controller offers a sub toolbar, otherwise `FALSE` .  Enables implementations to dynamically decide to support sub-toolbars or not.
    */
  def opensSubToolbar(): Boolean
  
  /**
    * gets called to notify a controller that it should set an image which represents the current selected function.
    *
    * Only the controller instance is able to set the correct image for the current function. A toolbar implementation will ask sub-toolbar controllers to
    * update their image whenever it has to update the images of all its buttons.
    */
  def updateImage(): Unit
}
object XSubToolbarController {
  
  inline def apply(
    SubToolbarName: String,
    acquire: () => Unit,
    functionSelected: String => Unit,
    getSubToolbarName: () => String,
    opensSubToolbar: () => Boolean,
    queryInterface: `type` => Any,
    release: () => Unit,
    updateImage: () => Unit
  ): XSubToolbarController = {
    val __obj = js.Dynamic.literal(SubToolbarName = SubToolbarName.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), functionSelected = js.Any.fromFunction1(functionSelected), getSubToolbarName = js.Any.fromFunction0(getSubToolbarName), opensSubToolbar = js.Any.fromFunction0(opensSubToolbar), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), updateImage = js.Any.fromFunction0(updateImage))
    __obj.asInstanceOf[XSubToolbarController]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XSubToolbarController] (val x: Self) extends AnyVal {
    
    inline def setFunctionSelected(value: String => Unit): Self = StObject.set(x, "functionSelected", js.Any.fromFunction1(value))
    
    inline def setGetSubToolbarName(value: () => String): Self = StObject.set(x, "getSubToolbarName", js.Any.fromFunction0(value))
    
    inline def setOpensSubToolbar(value: () => Boolean): Self = StObject.set(x, "opensSubToolbar", js.Any.fromFunction0(value))
    
    inline def setSubToolbarName(value: String): Self = StObject.set(x, "SubToolbarName", value.asInstanceOf[js.Any])
    
    inline def setUpdateImage(value: () => Unit): Self = StObject.set(x, "updateImage", js.Any.fromFunction0(value))
  }
}
