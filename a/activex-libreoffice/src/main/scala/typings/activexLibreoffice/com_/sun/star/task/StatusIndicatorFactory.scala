package typings.activexLibreoffice.com_.sun.star.task

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.XWindow
import typings.activexLibreoffice.com_.sun.star.frame.XFrame
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @since LibreOffice 4.1 */
trait StatusIndicatorFactory
  extends StObject
     with XStatusIndicatorFactory {
  
  def createWithFrame(Frame: XFrame, DisableReschedule: Boolean, AllowParentShow: Boolean): Unit
  
  def createWithWindow(ParentWindow: XWindow, DisableReschedule: Boolean, AllowParentShow: Boolean): Unit
}
object StatusIndicatorFactory {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    createStatusIndicator: () => XStatusIndicator,
    createWithFrame: (XFrame, Boolean, Boolean) => Unit,
    createWithWindow: (XWindow, Boolean, Boolean) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): StatusIndicatorFactory = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createStatusIndicator = js.Any.fromFunction0(createStatusIndicator), createWithFrame = js.Any.fromFunction3(createWithFrame), createWithWindow = js.Any.fromFunction3(createWithWindow), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[StatusIndicatorFactory]
  }
  
  @scala.inline
  implicit class StatusIndicatorFactoryMutableBuilder[Self <: StatusIndicatorFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateWithFrame(value: (XFrame, Boolean, Boolean) => Unit): Self = StObject.set(x, "createWithFrame", js.Any.fromFunction3(value))
    
    @scala.inline
    def setCreateWithWindow(value: (XWindow, Boolean, Boolean) => Unit): Self = StObject.set(x, "createWithWindow", js.Any.fromFunction3(value))
  }
}
