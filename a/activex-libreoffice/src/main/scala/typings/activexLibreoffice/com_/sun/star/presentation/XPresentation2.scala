package typings.activexLibreoffice.com_.sun.star.presentation

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * enhances the {@link XPresentation} interface to give access to a {@link XSlideShowController} and to start a presentation with arguments.
  * @since OOo 3.0
  */
@js.native
trait XPresentation2
  extends XPresentation
     with XPropertySet {
  /** if the slide show is running, this returns a controller object to control the running slide show. */
  val Controller: XSlideShowController = js.native
  /** if the slide show is running, this returns a controller object to control the running slide show. */
  def getController(): XSlideShowController = js.native
  /** returns true if the slide show is currently running */
  def isRunning(): Boolean = js.native
  /** start the slide show with the given arguments. All arguments override the values from {@link Presentation} . */
  def startWithArguments(Arguments: SeqEquiv[PropertyValue]): Unit = js.native
}

object XPresentation2 {
  @scala.inline
  def apply(
    Controller: XSlideShowController,
    PropertySetInfo: XPropertySetInfo,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    end: () => Unit,
    getController: () => XSlideShowController,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    isRunning: () => Boolean,
    queryInterface: `type` => js.Any,
    rehearseTimings: () => Unit,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit,
    start: () => Unit,
    startWithArguments: SeqEquiv[PropertyValue] => Unit
  ): XPresentation2 = {
    val __obj = js.Dynamic.literal(Controller = Controller.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), end = js.Any.fromFunction0(end), getController = js.Any.fromFunction0(getController), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), isRunning = js.Any.fromFunction0(isRunning), queryInterface = js.Any.fromFunction1(queryInterface), rehearseTimings = js.Any.fromFunction0(rehearseTimings), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue), start = js.Any.fromFunction0(start), startWithArguments = js.Any.fromFunction1(startWithArguments))
    __obj.asInstanceOf[XPresentation2]
  }
  @scala.inline
  implicit class XPresentation2Ops[Self <: XPresentation2] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setController(value: XSlideShowController): Self = this.set("Controller", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetController(value: () => XSlideShowController): Self = this.set("getController", js.Any.fromFunction0(value))
    @scala.inline
    def setIsRunning(value: () => Boolean): Self = this.set("isRunning", js.Any.fromFunction0(value))
    @scala.inline
    def setStartWithArguments(value: SeqEquiv[PropertyValue] => Unit): Self = this.set("startWithArguments", js.Any.fromFunction1(value))
  }
  
}

