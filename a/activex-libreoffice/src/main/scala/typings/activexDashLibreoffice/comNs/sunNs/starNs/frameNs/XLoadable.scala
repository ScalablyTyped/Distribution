package typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * offers a simple way to initialize a component or load it from an URL.
  *
  * In case an object supports the interface the object must be initialized with either {@link initNew()} or {@link load()} call before any usage. In case
  * the object is already initialized the mentioned methods should throw {@link DoubleInitializationException} .
  * @since OOo 1.1.2
  */
trait XLoadable extends XInterface {
  /** creates a component from scratch */
  def initNew(): Unit
  /**
    * loads a component from an URL
    * @param lArguments parameters for saving (see {@link com.sun.star.document.MediaDescriptor} for further details) the FileName parameter must be specified
    */
  def load(lArguments: SeqEquiv[PropertyValue]): Unit
}

object XLoadable {
  @scala.inline
  def apply(
    acquire: () => Unit,
    initNew: () => Unit,
    load: SeqEquiv[PropertyValue] => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XLoadable = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), initNew = js.Any.fromFunction0(initNew), load = js.Any.fromFunction1(load), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XLoadable]
  }
}

