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

