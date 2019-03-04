package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * enhances the {@link XPresentation} interface to give access to a {@link XSlideShowController} and to start a presentation with arguments.
  * @since OOo 3.0
  */
trait XPresentation2
  extends XPresentation
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet {
  /** if the slide show is running, this returns a controller object to control the running slide show. */
  val Controller: XSlideShowController
  /** if the slide show is running, this returns a controller object to control the running slide show. */
  def getController(): XSlideShowController
  /** returns true if the slide show is currently running */
  def isRunning(): scala.Boolean
  /** start the slide show with the given arguments. All arguments override the values from {@link Presentation} . */
  def startWithArguments(
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ): scala.Unit
}

object XPresentation2 {
  @scala.inline
  def apply(
    Controller: XSlideShowController,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    acquire: js.Function0[scala.Unit],
    addPropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    addVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    end: js.Function0[scala.Unit],
    getController: js.Function0[XSlideShowController],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    isRunning: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    rehearseTimings: js.Function0[scala.Unit],
    release: js.Function0[scala.Unit],
    removePropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    removeVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit],
    start: js.Function0[scala.Unit],
    startWithArguments: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      scala.Unit
    ]
  ): XPresentation2 = {
    val __obj = js.Dynamic.literal(Controller = Controller, PropertySetInfo = PropertySetInfo, acquire = acquire, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, end = end, getController = getController, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, isRunning = isRunning, queryInterface = queryInterface, rehearseTimings = rehearseTimings, release = release, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, setPropertyValue = setPropertyValue, start = start, startWithArguments = startWithArguments)
  
    __obj.asInstanceOf[XPresentation2]
  }
}

