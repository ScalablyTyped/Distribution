package typings.activexDashLibreoffice.comNs.sunNs.starNs.presentationNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * enhances the {@link XPresentation} interface to give access to a {@link XSlideShowController} and to start a presentation with arguments.
  * @since OOo 3.0
  */
trait XPresentation2
  extends XPresentation
     with XPropertySet {
  /** if the slide show is running, this returns a controller object to control the running slide show. */
  val Controller: XSlideShowController
  /** if the slide show is running, this returns a controller object to control the running slide show. */
  def getController(): XSlideShowController
  /** returns true if the slide show is currently running */
  def isRunning(): Boolean
  /** start the slide show with the given arguments. All arguments override the values from {@link Presentation} . */
  def startWithArguments(Arguments: SeqEquiv[PropertyValue]): Unit
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
    val __obj = js.Dynamic.literal(Controller = Controller, PropertySetInfo = PropertySetInfo, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), end = js.Any.fromFunction0(end), getController = js.Any.fromFunction0(getController), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), isRunning = js.Any.fromFunction0(isRunning), queryInterface = js.Any.fromFunction1(queryInterface), rehearseTimings = js.Any.fromFunction0(rehearseTimings), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue), start = js.Any.fromFunction0(start), startWithArguments = js.Any.fromFunction1(startWithArguments))
  
    __obj.asInstanceOf[XPresentation2]
  }
}

